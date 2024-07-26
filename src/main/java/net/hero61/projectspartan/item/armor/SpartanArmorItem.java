package net.hero61.projectspartan.item.armor;

import com.google.common.collect.ImmutableMap;
import net.hero61.projectspartan.ProjectSpartan;
import net.hero61.projectspartan.client.renderer.SpartanRenderEvents;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;


public class SpartanArmorItem extends ArmorItem {
    private static final Map<ArmorMaterial, List<MobEffectInstance>> MATERIAL_TO_EFFECT_MAP =
            (new ImmutableMap.Builder<ArmorMaterial, List<MobEffectInstance>>())
                    .put(SpartanArmorMaterial.MJOLNIR,List.of(
                            new MobEffectInstance(MobEffects.MOVEMENT_SPEED, Integer.MAX_VALUE, 2,
                            true, false, false),
                            new MobEffectInstance(MobEffects.WATER_BREATHING, Integer.MAX_VALUE, 2,
                                    true,false, false),
                            new MobEffectInstance(MobEffects.HEAL, Integer.MAX_VALUE, 1,
                                    true,false, false),
                            new MobEffectInstance(MobEffects.JUMP, Integer.MAX_VALUE, 2,
                            true,false, false))).build();

    private HumanoidModel armorModel = null;
    private String armorTexture = null;


    public SpartanArmorItem(ArmorMaterial armorMaterial, ArmorItem.Type type, Item.Properties properties) {
        super(armorMaterial, type, properties);
    }
    @Override
    public void onArmorTick(ItemStack stack, Level world, Player player) {
        if(!world.isClientSide()) {
            if(hasFullSuitOfArmorOn(player)) {
                evaluateArmorEffects(player);
            }
        }
    }

    private void evaluateArmorEffects(Player player) {
        for (Map.Entry<ArmorMaterial, List<MobEffectInstance>> entry : MATERIAL_TO_EFFECT_MAP.entrySet()) {
            ArmorMaterial mapArmorMaterial = entry.getKey();
            List<MobEffectInstance> mapStatusEffects = entry.getValue();

            if(hasCorrectArmorOn(mapArmorMaterial, player)) {
                addStatusEffectForMaterial(player, mapArmorMaterial, mapStatusEffects);
            }
        }
    }

    private void addStatusEffectForMaterial(Player player, ArmorMaterial mapArmorMaterial,
                                            List<MobEffectInstance> mapStatusEffect) {
        boolean hasPlayerEffect = mapStatusEffect.stream().anyMatch(effect -> player.hasEffect(effect.getEffect()));

        if(hasCorrectArmorOn(mapArmorMaterial, player) && !hasPlayerEffect) {
            mapStatusEffect.stream().forEach(effect -> player.addEffect(new MobEffectInstance(effect)));
        }
    }

    private boolean hasFullSuitOfArmorOn(Player player) {
        //ItemStack boots = player.getInventory().getArmor(0);
       // ItemStack leggings = player.getInventory().getArmor(1);
        ItemStack breastplate = player.getInventory().getArmor(2);
        ItemStack helmet = player.getInventory().getArmor(3);

        return !helmet.isEmpty() && !breastplate.isEmpty();
               //&& !leggings.isEmpty() && !boots.isEmpty();
    }

    private boolean hasCorrectArmorOn(ArmorMaterial material, Player player) {
       // ItemStack boots = player.getInventory().getArmor(0);
       // ItemStack leggings = player.getInventory().getArmor(1);
        ItemStack breastplate = player.getInventory().getArmor(2);
        ItemStack helmet = player.getInventory().getArmor(3);

        return breastplate.getItem() instanceof ArmorItem && helmet.getItem() instanceof ArmorItem &&
                ((ArmorItem) breastplate.getItem()).getMaterial() == material &&
                ((ArmorItem) helmet.getItem()).getMaterial() == material;
    }

    @Nullable
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
        return armorTexture;
    }

    public SpartanArmorItem setArmorModel(HumanoidModel<? extends LivingEntity> armorModel) {
        this.armorModel = armorModel;
        return this;
    }

    public SpartanArmorItem setArmorTexture(String armorTexture) {
        this.armorTexture = ProjectSpartan.MOD_ID + ":" + armorTexture;
        return this;
    }
    @Override
    public void initializeClient(Consumer<IClientItemExtensions> consumer) {
        super.initializeClient(consumer);
        consumer.accept(new IClientItemExtensions() {

            @Override
            public BlockEntityWithoutLevelRenderer getCustomRenderer() {
                return SpartanRenderEvents.SPARTAN_RENDERER;
            }

            @Override
            public HumanoidModel getHumanoidArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlot armorSlot, HumanoidModel _default) {
                return armorModel;
            }
        });

    }
}
