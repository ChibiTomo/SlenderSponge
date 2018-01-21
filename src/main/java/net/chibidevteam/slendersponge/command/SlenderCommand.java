package net.chibidevteam.slendersponge.command;

import net.chibidevteam.chibispongeplugin.command.AbstractCommand;
import net.chibidevteam.chibispongeplugin.command.AbstractNamespaceCommand;
import net.chibidevteam.chibispongeplugin.util.MessageUtils;
import net.chibidevteam.slendersponge.command.game.GameCommand;

public class SlenderCommand extends AbstractNamespaceCommand {

    public SlenderCommand() {
        aliases = new String[] { "slender" };
        permission = "slendersponge.slender";
        children = new AbstractCommand[] { new GameCommand() };
    }

    @Override
    protected String getHelp() {
        return MessageUtils.get("command.slender.help");
    }
}
