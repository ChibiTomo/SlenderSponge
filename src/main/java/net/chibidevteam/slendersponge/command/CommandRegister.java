package net.chibidevteam.slendersponge.command;

import net.chibidevteam.chibispongeplugin.command.AbstractCommandRegister;

public class CommandRegister extends AbstractCommandRegister {

    @Override
    protected void setCommands() {
        addCommand(SlenderCommand.class);
    }

}
