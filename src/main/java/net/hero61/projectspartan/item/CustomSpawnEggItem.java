package net.hero61.projectspartan.item;

import net.hero61.projectspartan.entity.ProjectSpartanEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;

import java.util.Random;

public class CustomSpawnEggItem extends Item {

    public CustomSpawnEggItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level world = context.getLevel();
        if (!(world instanceof ServerLevel)) {
            return InteractionResult.SUCCESS;
        }

        BlockPos pos = context.getClickedPos().relative(context.getClickedFace());
        ItemStack itemstack = context.getItemInHand();
        Player player = context.getPlayer();
        InteractionHand hand = context.getHand();

        if (!world.isClientSide) {
            Entity entity = getRandomEntity(world);
            if (entity != null) {
                entity.moveTo(pos.getX() + 0.5, pos.getY(), pos.getZ() + 0.5, 0, 0);
                world.addFreshEntity(entity);

                itemstack.shrink(1);
                //world.playSound(null, pos, SoundEvents.BEACON_ACTIVATE, player.getSoundSource(), 0F, 1.0F);
            }
        }

        return InteractionResult.sidedSuccess(world.isClientSide);
    }

    private Entity getRandomEntity(Level world) {
        Random random = new Random();
        EntityType<?>[] entities = new EntityType<?>[]{
                ProjectSpartanEntities.AIRASSAULT_ENTITY.get(),
                ProjectSpartanEntities.ACHILLES_ENTITY.get(),
                ProjectSpartanEntities.BUCCANEER_ENTITY.get(),
                ProjectSpartanEntities.OCEANIN_ENTITY.get(),
        };

        int index = random.nextInt(entities.length);
        EntityType<?> entityType = entities[index];

        return entityType.create(world);
    }
}