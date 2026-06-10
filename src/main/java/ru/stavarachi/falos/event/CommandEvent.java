package ru.stavarachi.falos.event;

import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import ru.stavarachi.falos.command.HelloCommand;
import ru.stavarachi.falos.command.HungerCommand;

import static ru.stavarachi.falos.config.Config.MODID;

@Mod.EventBusSubscriber(modid = MODID)
public class CommandEvent {
    @SubscribeEvent
    public static void onRegisterCommand(RegisterCommandsEvent event) {
        HelloCommand.register(event.getDispatcher());
        HungerCommand.register(event.getDispatcher());
    }
}
