package ru.stavarachi.falos.item.food.common;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class DiamondPenis extends Item {
    public DiamondPenis() {
        super(new Properties().stacksTo(67).food(new FoodProperties.Builder()
                .alwaysEat()
                .nutrition(10)
                .saturationMod(1.0F)
                .build()
        ));
    }

    public ItemStack finishUsingItem(ItemStack itemStack, Level level, LivingEntity entity) {
        ItemStack result = super.finishUsingItem(itemStack, level, entity);

        if (!level.isClientSide) {
            entity.addEffect(new MobEffectInstance(
                    MobEffects.ABSORPTION,
                    1200,
                    2
            ));
        }

        return result;
    }
}
