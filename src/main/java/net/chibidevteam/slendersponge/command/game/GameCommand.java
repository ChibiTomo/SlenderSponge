package net.chibidevteam.slendersponge.command.game;

import net.chibidevteam.chibispongeplugin.command.AbstractCommand;
import net.chibidevteam.chibispongeplugin.command.AbstractNamespaceCommand;
import net.chibidevteam.chibispongeplugin.util.MessageUtils;

public class GameCommand extends AbstractNamespaceCommand {

    public GameCommand() {
        aliases = new String[] { "game" };
        permission = "slendersponge.slender.game";
        children = new AbstractCommand[] { new StartCommand() };
    }

    @Override
    protected String getHelp() {
        return MessageUtils.get("command.slender.game.help");
    }

}
