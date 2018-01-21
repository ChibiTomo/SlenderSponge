package net.chibidevteam.slendersponge.command.game;

import org.spongepowered.api.command.CommandException;
import org.spongepowered.api.command.CommandResult;
import org.spongepowered.api.command.CommandSource;
import org.spongepowered.api.command.args.CommandContext;

import net.chibidevteam.chibispongeplugin.command.AbstractCommand;
import net.chibidevteam.chibispongeplugin.util.MessageUtils;

public class StartCommand extends AbstractCommand {

    public StartCommand() {
        aliases = new String[] { "start" };
    }

    @Override
    public CommandResult execute(CommandSource src, CommandContext args) throws CommandException {
        src.sendMessage(MessageUtils.getText("command.game.start"));
        return CommandResult.success();
    }

}
