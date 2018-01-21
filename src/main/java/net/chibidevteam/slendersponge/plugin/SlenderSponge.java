package net.chibidevteam.slendersponge.plugin;

import org.spongepowered.api.plugin.Plugin;

import net.chibidevteam.chibispongeplugin.ChibiSpongePlugin;
import net.chibidevteam.chibispongeplugin.command.AbstractCommandRegister;
import net.chibidevteam.slendersponge.command.CommandRegister;
import net.chibidevteam.slendersponge.gamemode.GameManager;

@Plugin(id = PomData.ARTIFACT_ID, name = PomData.NAME, version = PomData.VERSION)
public class SlenderSponge extends ChibiSpongePlugin {

    private GameManager gameManager;

    public SlenderSponge() {
        super();

        this.gameManager = new GameManager();
    }

    @Override
    protected AbstractCommandRegister getCommandRegister() {
        return new CommandRegister();
    }

    @Override
    protected void addConfigurations() {
        // addConfiguration(PAGE_CONFIGURATION_NAME, getConfigDir() +
        // PAGE_CONFIGURATION_FILE);
    }
}
