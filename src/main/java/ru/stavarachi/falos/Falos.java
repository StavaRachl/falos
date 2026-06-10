package ru.stavarachi.falos;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import ru.stavarachi.falos.register.ItemRegister;
import ru.stavarachi.falos.tab.PenisTab;

import static ru.stavarachi.falos.config.Config.MODID;

@Mod(MODID)
public class Falos {
    public Falos() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        PenisTab.TABS.register(bus);
        ItemRegister.register(bus);
    }
}
