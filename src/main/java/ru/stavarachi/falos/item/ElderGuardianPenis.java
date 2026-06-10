package ru.stavarachi.falos.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class ElderGuardianPenis extends Item {
    public static final int SELF_DURATION = 20;
    public static final int TARGET_DURATION = 6000;

    public ElderGuardianPenis() {
      super(new Properties().stacksTo(1));
    }

    @Override
    public void inventoryTick(ItemStack itemStack, Level level, Entity entity, int slotId, boolean isSelcted) {
        if (!level.isClientSide && entity instanceof Player player && isSelcted) {
            player.addEffect(new MobEffectInstance(
                    MobEffects.DIG_SLOWDOWN,
                    SELF_DURATION,
                    4,
                    false,
                    false,
                    false
            ));
        }
        super.inventoryTick(itemStack, level, entity, slotId, isSelcted);
    }

    @Override
    public boolean hurtEnemy(ItemStack itemStack, LivingEntity target, LivingEntity attacker) {
        if (!attacker.level().isClientSide && target instanceof Player player) {
            player.addEffect(new MobEffectInstance(
                    MobEffects.DIG_SLOWDOWN,
                    TARGET_DURATION,
                    4
            ));
        }
        return super.hurtEnemy(itemStack, target, attacker);
    }
}
