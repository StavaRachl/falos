package ru.stavarachi.falos.command;

import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.Component;

public class HelloCommand {
    public static void register(CommandDispatcher<CommandSourceStack> dispatcher) {
        dispatcher.register(
                Commands.literal("hello")
                        .executes(context -> {
                            context.getSource().sendSystemMessage(
                                    Component.literal("Привет!")
                            );
                            return 1;
                        })
        );
    }
}
