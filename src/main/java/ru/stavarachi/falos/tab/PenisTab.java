package ru.stavarachi.falos.tab;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import ru.stavarachi.falos.register.ItemRegister;

import static ru.stavarachi.falos.config.Config.MODID;

public class PenisTab {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(
            Registries.CREATIVE_MODE_TAB,
            MODID
    );

    public static final RegistryObject<CreativeModeTab> FALOS_TAB = TABS.register("falos-tab", () ->
        CreativeModeTab.builder()
                .title(Component.literal("Falos"))
                .icon(() -> new ItemStack(ItemRegister.WOOD_PENIS.get()))
                .displayItems((parameters, output) -> {
                    Items.addItems(output);
                })
                .build()
    );
}
