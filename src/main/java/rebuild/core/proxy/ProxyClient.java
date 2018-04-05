package rebuild.core.proxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(Side.CLIENT)
public class ProxyClient extends Proxy {
  /**
   * Pre-initialization handling for client side only.
   * @param event Pre-initialization event
   */
  @Override
  public void preInit(FMLPreInitializationEvent event) {
    super.preInit(event);
  }

  /**
   * Initialization handling for client side only.
   * @param event Initialization event
   */
  @Override
  public void initialize(FMLInitializationEvent event) {
    super.initialize(event);
  }

  /**
   * Post-initialization handling for client side only.
   * @param event Post-initialization event
   */
  @Override
  public void postInit(FMLPostInitializationEvent event) {
    super.postInit(event);
  }
}
