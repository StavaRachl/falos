package ru.stavarachi.falos.command;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.server.level.ServerPlayer;

public class HungerCommand {
    public static void register(CommandDispatcher<CommandSourceStack> dispatcher) {
        dispatcher.register(
                Commands.literal("hungry")
                        .requires(source -> source.hasPermission(2))
                        .then(Commands.argument("player", EntityArgument.player())
                                .then(Commands.argument("level", IntegerArgumentType.integer(0))
                                        .executes(context -> {
                                            ServerPlayer player = EntityArgument.getPlayer(
                                                    context,
                                                    "player"
                                            );
                                            int level = IntegerArgumentType.getInteger(
                                                    context,
                                                    "level"
                                            );
                                            player.getFoodData().setFoodLevel(
                                                    Math.max(0, player.getFoodData().getFoodLevel() - level)
                                            );
                                            return 1;
                                        })
                                )
                        )
        );
    }
}
