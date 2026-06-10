package ru.stavarachi.falos.item.food.common;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class GoldPenis extends Item {
    public GoldPenis() {
        super(new Properties().stacksTo(67).food(new FoodProperties.Builder()
                .alwaysEat()
                .nutrition(10)
                .saturationMod(1.0F)
                .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 2400, 2), 0.75F)
                .build()
        ));
    }
}
