package ru.stavarachi.falos.item.food.magic;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class FirePenis extends Item {
    public FirePenis() {
        super(new Properties().stacksTo(67).food(new FoodProperties.Builder()
                .nutrition(10)
                .saturationMod(1.0F)
                .alwaysEat()
                .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1200, 0), 1.0F)
                .build()
        ));
    }
}
