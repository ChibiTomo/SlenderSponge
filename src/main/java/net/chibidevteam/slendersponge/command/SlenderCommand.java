package net.chibidevteam.slendersponge.command;

import org.spongepowered.api.command.CommandException;
import org.spongepowered.api.command.CommandResult;
import org.spongepowered.api.command.CommandSource;
import org.spongepowered.api.command.args.CommandContext;

import net.chibidevteam.chibispongeplugin.command.AbstractCommand;
import net.chibidevteam.slendersponge.command.game.GameCommand;

public class SlenderCommand extends AbstractCommand {

    public SlenderCommand() {
        aliases = new String[] { "slender" };
        children = new AbstractCommand[] { new GameCommand() };
    }

    @Override
    public CommandResult execute(CommandSource src, CommandContext args) throws CommandException {
        return CommandResult.empty();
    }

}
