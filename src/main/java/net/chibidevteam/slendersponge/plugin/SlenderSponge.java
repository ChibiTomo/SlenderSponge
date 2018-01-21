package net.chibidevteam.slendersponge.plugin;

import java.util.Optional;

import org.spongepowered.api.plugin.Plugin;

import net.chibidevteam.chibispongeplugin.ChibiSpongePlugin;
import net.chibidevteam.chibispongeplugin.command.AbstractCommandRegister;
import net.chibidevteam.chibispongeplugin.exceptions.IOConfigurationException;
import net.chibidevteam.slendersponge.command.SlenderSpongeCommandRegister;
import net.chibidevteam.slendersponge.gamemode.SlenderSpongeGameManager;

@Plugin(id = PomData.ARTIFACT_ID, name = PomData.NAME, version = PomData.VERSION)
public class SlenderSponge extends ChibiSpongePlugin {

    private static final String      PAGE_CONFIGURATION_NAME = "pages";
    private static final String      PAGE_CONFIGURATION_FILE = "pages.conf";

    private SlenderSpongeGameManager gameManager;

    public SlenderSponge() {
        super();

        this.gameManager = new SlenderSpongeGameManager();
    }

    @Override
    protected Optional<AbstractCommandRegister> getCommandRegister() {
        return Optional.of(new SlenderSpongeCommandRegister());
    }

    @Override
    protected void addConfigurations() throws IOConfigurationException {
        addConfiguration(PAGE_CONFIGURATION_NAME, getConfigDir() + "/" + PAGE_CONFIGURATION_FILE,
                PAGE_CONFIGURATION_FILE);
    }
}
