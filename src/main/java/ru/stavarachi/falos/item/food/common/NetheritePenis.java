package ru.stavarachi.falos.item.food.common;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class NetheritePenis extends Item {
    public NetheritePenis() {
        super(new Properties().stacksTo(67).food(new FoodProperties.Builder()
                .nutrition(10)
                .saturationMod(1.0F)
                .alwaysEat()
                .build()
        ));
    }

    @Override
    public ItemStack finishUsingItem(ItemStack itemStack, Level level, LivingEntity entity) {
        ItemStack result = super.finishUsingItem(itemStack, level, entity);

        if (!level.isClientSide) {
            entity.addEffect(new MobEffectInstance(
                    MobEffects.FIRE_RESISTANCE,
                    1200,
                    0
            ));
            entity.addEffect(new MobEffectInstance(
                    MobEffects.WATER_BREATHING,
                    1200,
                    0
            ));
            entity.addEffect(new MobEffectInstance(
                    MobEffects.ABSORPTION,
                    1200,
                    4
            ));
            entity.addEffect(new MobEffectInstance(
                    MobEffects.DAMAGE_BOOST,
                    1200,
                    2
            ));
            entity.addEffect(new MobEffectInstance(
                    MobEffects.MOVEMENT_SLOWDOWN,
                    1200,
                    2
            ));
        }
        return result;
    }
}
