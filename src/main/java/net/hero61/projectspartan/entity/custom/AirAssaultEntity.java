
package net.hero61.projectspartan.entity.custom;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.OwnerHurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.OwnerHurtTargetGoal;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import javax.annotation.Nullable;

public class AirAssaultEntity extends TamableAnimal {
    private boolean followingPlayer = false;

    public AirAssaultEntity(EntityType<? extends TamableAnimal> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new FloatGoal(this));
        this.goalSelector.addGoal(5, new FollowPlayerGoal(this, 1.5D, 5.0F, 2.0F, true));
        this.goalSelector.addGoal(2, new StandStillGoal(this));
        this.goalSelector.addGoal(3, new LookAtPlayerGoal(this, Player.class, 3f));
        this.goalSelector.addGoal(6, new RandomLookAroundGoal(this));
        this.targetSelector.addGoal(1, new OwnerHurtByTargetGoal(this));
        this.targetSelector.addGoal(2, new OwnerHurtTargetGoal(this));
        this.targetSelector.addGoal(3, (new HurtByTargetGoal(this)).setAlertOthers());
        this.goalSelector.addGoal(5, new MeleeAttackGoal(this, 1.0D, true));
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Animal.createLivingAttributes()
                .add(Attributes.MAX_HEALTH, 20D)
                .add(Attributes.FOLLOW_RANGE, 24D)
                .add(Attributes.MOVEMENT_SPEED, 0.25D)
                .add(Attributes.ARMOR_TOUGHNESS, 0.1f)
                .add(Attributes.ATTACK_KNOCKBACK, 0.5f)
                .add(Attributes.ATTACK_DAMAGE, 2f);
    }

    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel pLevel, AgeableMob pOtherParent) {
        return null;
    }

    @Override
    public boolean isFood(ItemStack pStack) {
        return pStack.is(Items.COOKED_BEEF);
    }

    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.PLAYER_BREATH;
    }

    @Nullable
    @Override
    protected SoundEvent getHurtSound(DamageSource pDamageSource) {
        return SoundEvents.PLAYER_HURT;
    }

    @Nullable
    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.PLAYER_DEATH;
    }

    @Override
    public InteractionResult mobInteract(Player player, InteractionHand hand) {
        ItemStack itemstack = player.getItemInHand(hand);
        if (itemstack.is(Items.COOKED_BEEF)) {
            if (!player.level().isClientSide) {
                this.usePlayerItem(player, hand, itemstack);
                this.tame(player);
                this.navigation.recomputePath();
                return InteractionResult.SUCCESS;
            }
        } else if (this.isTame()) {
            this.followingPlayer = !this.followingPlayer;
            this.navigation.recomputePath();
            return InteractionResult.SUCCESS;
        }
        return super.mobInteract(player, hand);
    }

    public boolean isFollowingPlayer() {
        return this.followingPlayer;
    }

    public void tame(Player player) {
        this.setTame(true);
        this.setOwnerUUID(player.getUUID());
    }

    public void setAttackTarget(LivingEntity target) {
        this.setTarget(target);
    }
}

class FollowPlayerGoal extends FollowOwnerGoal {
    private final AirAssaultEntity airAssaultEntity;

    public FollowPlayerGoal(AirAssaultEntity entity, double speed, float minDist, float maxDist, boolean teleportToLeaves) {
        super(entity, speed, minDist, maxDist, teleportToLeaves);
        this.airAssaultEntity = entity;
    }

    @Override
    public boolean canUse() {
        return this.airAssaultEntity.isFollowingPlayer() && super.canUse();
    }

    @Override
    public boolean canContinueToUse() {
        return this.airAssaultEntity.isFollowingPlayer() && super.canContinueToUse();
    }
}

class StandStillGoal extends Goal {
    private final AirAssaultEntity airAssaultEntity;

    public StandStillGoal(AirAssaultEntity airAssaultEntity) {
        this.airAssaultEntity = airAssaultEntity;
    }

    @Override
    public boolean canUse() {
        return !this.airAssaultEntity.isFollowingPlayer();
    }

    @Override
    public boolean canContinueToUse() {
        return !this.airAssaultEntity.isFollowingPlayer();
    }

    @Override
    public void start() {
        this.airAssaultEntity.getNavigation().stop();
    }

    @Override
    public void tick() {
        this.airAssaultEntity.getNavigation().stop();
    }
}

class AttackWhenOwnerAttacksGoal extends Goal {
    private final AirAssaultEntity airAssaultEntity;

    public AttackWhenOwnerAttacksGoal(AirAssaultEntity airAssaultEntity) {
        this.airAssaultEntity = airAssaultEntity;
    }

    @Override
    public boolean canUse() {
        return this.airAssaultEntity.isTame() && this.airAssaultEntity.getOwner() != null;
    }

    @SubscribeEvent
    public void onOwnerAttack(LivingAttackEvent event) {
        if (event.getSource().getEntity() instanceof Player player) {
            if (player.equals(this.airAssaultEntity.getOwner())) {
                this.airAssaultEntity.setAttackTarget(event.getEntity());
            }
        }
    }
}