package patrolin.litefps;

import net.fabricmc.api.ModInitializer;
import com.mojang.blaze3d.platform.WindowEventHandler;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.concurrent.*;

public class LiteFPS implements ModInitializer {
	@Override
	public void onInitialize() {}
	public static final String MOD_ID = "litefps";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);
}