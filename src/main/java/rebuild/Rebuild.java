package rebuild;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import rebuild.core.config.ConfigHandler;
import rebuild.core.logging.RebuildLog;
import rebuild.core.proxy.Proxy;

@Mod(
    modid = Rebuild.MOD_ID,
    name = Rebuild.MOD_NAME,
    version = Rebuild.VERSION,
    updateJSON = Rebuild.UPDATE_URL
)
public class Rebuild {
  // Mod details
  @SuppressWarnings("WeakerAccess")
  public static final String MOD_ID = "rebuild";
  @SuppressWarnings("WeakerAccess")
  public static final String MOD_NAME = "Rebuild Framework";
  @SuppressWarnings("WeakerAccess")
  public static final String VERSION = "0.0.2";
  @SuppressWarnings("WeakerAccess")
  public static final String VERSION_MAX = "0.0.3";
  public static final String VERSION_GROUP = "required-after:" + MOD_ID + "@[" + VERSION + "," + VERSION_MAX + ");";
  @SuppressWarnings("WeakerAccess")
  public static final String UPDATE_URL = "https://raw.github.com/acaeris/" + MOD_ID + "/master/update.json";
  public static final String DEPENDENCIES = "";

  // Logger
  public static final RebuildLog LOG = RebuildLog.getLogger(MOD_ID);

  // Config
  public static final ConfigHandler CONFIG_CORE = new ConfigHandler(VERSION);

  @Mod.Instance(MOD_ID)
  public static Rebuild instance;

  @SuppressWarnings("WeakerAccess")
  @SidedProxy(
      clientSide = "rebuild.core.proxy.ProxyClient",
      serverSide = "rebuild.core.proxy.Proxy"
  )
  public static Proxy proxy;

  /**
   * Set up everything in the library that needs to be active before main initialization
   *
   * @param event Event data
   */
  @Mod.EventHandler
  public void preInit(FMLPreInitializationEvent event) {
    proxy.preInit(event);
  }

  /**
   * Initialize the mod
   *
   * @param event Event data
   */
  @Mod.EventHandler
  public void initialize(FMLInitializationEvent event) {
    proxy.initialize(event);
  }

  /**
   * All tasks required to be handle post initialization
   *
   * @param event Event data
   */
  @Mod.EventHandler
  public void postInit(FMLPostInitializationEvent event) {
    proxy.postInit(event);
  }
}