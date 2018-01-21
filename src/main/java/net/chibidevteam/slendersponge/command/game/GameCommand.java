package net.chibidevteam.slendersponge.command.game;

import org.spongepowered.api.command.CommandException;
import org.spongepowered.api.command.CommandResult;
import org.spongepowered.api.command.CommandSource;
import org.spongepowered.api.command.args.CommandContext;

import net.chibidevteam.chibispongeplugin.command.AbstractCommand;

public class GameCommand extends AbstractCommand {

    public GameCommand() {
        aliases = new String[] { "game" };
        children = new AbstractCommand[] { new StartCommand() };
    }

    @Override
    public CommandResult execute(CommandSource src, CommandContext args) throws CommandException {
        return CommandResult.empty();
    }

}
