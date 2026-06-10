package ru.stavarachi.falos.item.food.magic;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class BloodPenis extends Item {
    public BloodPenis() {
        super(new Properties().stacksTo(67).food(new FoodProperties.Builder()
                .nutrition(10)
                .saturationMod(1.0F)
                .alwaysEat()
                .build()
        ));
    }
}
