package ru.stavarachi.falos.item.food.common;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class IronPenis extends Item {
    public IronPenis() {
        super(new Properties().stacksTo(67).food(new FoodProperties.Builder()
                .nutrition(4)
                .saturationMod(0.8F)
                .alwaysEat()
                .build()
        ));
    }

    @Override
    public ItemStack finishUsingItem(ItemStack itemStack, Level level, LivingEntity entity) {
        ItemStack result = super.finishUsingItem(itemStack, level, entity);

        if (!level.isClientSide && entity.getRandom().nextFloat() < 25F) {
            entity.addEffect(
                    new MobEffectInstance(
                            MobEffects.DAMAGE_RESISTANCE,
                            300,
                            1
                    )
            );

            entity.addEffect(new MobEffectInstance(
                    MobEffects.MOVEMENT_SLOWDOWN,
                    300,
                    1
            ));
        }
        return  result;
    }
}
