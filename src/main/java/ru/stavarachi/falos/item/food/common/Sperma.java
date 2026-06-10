package ru.stavarachi.falos.item.food.common;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class Sperma extends Item {
    public static int COUNT = 0;

    public Sperma() {
        super(new Properties().stacksTo(16).food(new FoodProperties.Builder()
                .nutrition(1)
                .saturationMod(0.1F)
                .alwaysEat()
                .build()
        ));
    }

    @Override
    public ItemStack finishUsingItem(ItemStack itemStack, Level  level, LivingEntity entity) {
        ItemStack result = super.finishUsingItem(itemStack, level, entity);

        if (!level.isClientSide) {
            COUNT++;
            if (COUNT >= 5) {
                entity.addEffect(new MobEffectInstance(
                        MobEffects.CONFUSION,
                        600,
                        3
                ));
                entity.addEffect(new MobEffectInstance(
                        MobEffects.POISON,
                        600,
                        2
                ));
                COUNT = 0;
            }
        }
        return result;
    }
}
