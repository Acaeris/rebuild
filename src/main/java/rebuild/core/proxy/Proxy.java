package rebuild.core.proxy;

import java.io.File;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import rebuild.Rebuild;

public class Proxy {
  /**
   * Pre-initialization handling for both client and server.
   * @param event Pre-initialization event
   */
  public void preInit(FMLPreInitializationEvent event) {
    // Initialize Config.
    Rebuild.CONFIG.setConfiguration(
        new Configuration(
            new File(event.getModConfigurationDirectory(), "core.cfg"),
            true
        )
    );
  }

  /**
   * Initialization handling for both client and server.
   * @param event Initialization event
   */
  public void initialize(FMLInitializationEvent event) {
  }

  /**
   * Post-initialization handling for both client and server.
   * @param event Post-initialization event
   */
  public void postInit(FMLPostInitializationEvent event) {
  }
}
