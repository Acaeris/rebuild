package rebuild.core.config;

import net.minecraftforge.common.config.Configuration;

public class ConfigHandler {
  private final String modVersion;
  private Configuration modConfiguration;

  /**
   * Constructor.
   * @param version Mod version
   */
  public ConfigHandler(String version) {
    modVersion = version;
  }

  /**
   * Set the configuration data for this object.
   * @param config Configuration file
   */
  public void setConfiguration(Configuration config) {
    modConfiguration = config;
    modConfiguration.load();
  }
}
