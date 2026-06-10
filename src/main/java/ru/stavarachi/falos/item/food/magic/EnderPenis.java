package ru.stavarachi.falos.item.food.magic;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class EnderPenis extends Item {
    public EnderPenis() {
        super(new Properties().stacksTo(67).food(new FoodProperties.Builder()
                .nutrition(10)
                .saturationMod(1.0F)
                .alwaysEat()
                .effect(() -> new MobEffectInstance(MobEffects.INVISIBILITY, 1200, 0), 1.0F)
                .build()
        ));
    }

    @Override
    public ItemStack finishUsingItem(ItemStack itemStack, Level level, LivingEntity entity) {
        ItemStack result = super.finishUsingItem(itemStack, level, entity);

        if (!level.isClientSide) {
            for (int i = 0; i < 16; i++) {
                double x = entity.getX() + (entity.getRandom().nextDouble() - 0.5D) * 32.0D;
                double y = entity.getY() + (double)(entity.getRandom().nextInt(16) - 8);
                double z = entity.getZ() + (entity.getRandom().nextDouble() - 0.5D) * 32.0D;

                if (entity.randomTeleport(x, y, z, true)) {
                    break;
                }
            }
        }

        return result;
    }
}
