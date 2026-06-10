package ru.stavarachi.falos.item.food.common;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class CopperPenis extends Item {
    public CopperPenis() {
        super(new Properties().stacksTo(67).food(new FoodProperties.Builder()
                .nutrition(10)
                .saturationMod(1.2F)
                .effect(() -> new MobEffectInstance(MobEffects.JUMP, 600, 1), 0.25F)
                .alwaysEat()
                .build()
        ));
    }
}
