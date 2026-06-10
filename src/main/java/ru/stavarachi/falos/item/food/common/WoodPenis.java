package ru.stavarachi.falos.item.food.common;

import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class WoodPenis extends Item {
    public WoodPenis() {
        super(new Properties().stacksTo(67).food(
                new FoodProperties.Builder()
                        .nutrition(4)
                        .saturationMod(0.8F)
                        .alwaysEat()
                        .build()
                )
        );
    }

    @Override
    public ItemStack finishUsingItem(ItemStack itemStack, Level level, LivingEntity livingEntity) {
        ItemStack result = super.finishUsingItem(itemStack, level, livingEntity);

        if (!level.isClientSide) {
            RandomSource randomSource = livingEntity.getRandom();

            if (randomSource.nextFloat() < 0.25F) {
                livingEntity.hurt(livingEntity.damageSources().generic(), 6.0F);
            }
        }

        return result;
    }
}
