package net.chibidevteam.slendersponge.command;

import net.chibidevteam.chibispongeplugin.command.AbstractCommandRegister;

public class SlenderSpongeCommandRegister extends AbstractCommandRegister {

    @Override
    protected void setCommands() {
        addCommand(SlenderCommand.class);
    }

}
