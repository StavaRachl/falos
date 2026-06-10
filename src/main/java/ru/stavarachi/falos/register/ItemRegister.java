package ru.stavarachi.falos.register;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import ru.stavarachi.falos.item.food.common.Sperma;
import ru.stavarachi.falos.item.food.common.*;
import ru.stavarachi.falos.item.food.magic.BloodPenis;
import ru.stavarachi.falos.item.ElderGuardianPenis;
import ru.stavarachi.falos.item.food.magic.EnderPenis;
import ru.stavarachi.falos.item.food.magic.FirePenis;
import ru.stavarachi.falos.item.food.other.IvanPenis;

import static ru.stavarachi.falos.config.Config.MODID;

public class ItemRegister {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static final RegistryObject<Item> WOOD_PENIS = ITEMS.register("wood-penis", WoodPenis::new);
    public static final RegistryObject<Item> STONE_PENIS = ITEMS.register("stone-penis", StonePenis::new);
    public static final RegistryObject<Item> COPPER_PENIS = ITEMS.register("copper-penis", CopperPenis::new);
    public static final RegistryObject<Item> IRON_PENIS = ITEMS.register("iron-penis", IronPenis::new);
    public static final RegistryObject<Item> GOLD_PENIS = ITEMS.register("gold-penis", GoldPenis::new);
    public static final RegistryObject<Item> DIAMOND_PENIS = ITEMS.register("diamond-penis", DiamondPenis::new);
    public static final RegistryObject<Item> EMERALD_PENIS = ITEMS.register("emerald-penis", EmeraldPenis::new);
    public static final RegistryObject<Item> FIRE_PENIS = ITEMS.register("fire-penis", FirePenis::new);
    public static final RegistryObject<Item> BLOOD_PENIS = ITEMS.register("blood-penis", BloodPenis::new);
    public static final RegistryObject<Item> NETHERITE_PENIS = ITEMS.register("netherite-penis", NetheritePenis::new);
    public static final RegistryObject<Item> ENDER_PENIS = ITEMS.register("ender-penis", EnderPenis::new);
    public static final RegistryObject<Item> IVAN_PENIS = ITEMS.register("ivan-penis", IvanPenis::new);

    public static final RegistryObject<Item> SPERMA = ITEMS.register("sperma", Sperma::new);

    public static final RegistryObject<Item> ELDER_GUARDIAN_PENIS = ITEMS.register("elder-guardian-penis", ElderGuardianPenis::new);

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}
