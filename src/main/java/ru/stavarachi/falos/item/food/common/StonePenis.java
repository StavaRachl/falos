package ru.stavarachi.falos.item.food.common;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class StonePenis extends Item {
    public StonePenis() {
        super(new Properties().stacksTo(67).food(new FoodProperties.Builder()
                .nutrition(3)
                .saturationMod(1.0F)
                .alwaysEat()
                .build()
        ));
    }

    @Override
    public ItemStack finishUsingItem(ItemStack itemStack, Level level, LivingEntity entity) {
        ItemStack result = super.finishUsingItem(itemStack, level, entity);

        if (!level.isClientSide && entity.getRandom().nextFloat() < 25F) {
            entity.addEffect(new MobEffectInstance(
                    MobEffects.CONFUSION,
                    200,
                    0
            ));

            entity.addEffect(new MobEffectInstance(
                    MobEffects.POISON,
                    200,
                    1
            ));
        }
        return result;
    }
}
