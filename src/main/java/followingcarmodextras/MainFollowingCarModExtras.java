package followingcarmodextras;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
// The value here should match an entry in the META-INF/mods.toml file
@Mod("followingcarmodextras")
public class MainFollowingCarModExtras
{
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "followingcarmodextras";

    public MainFollowingCarModExtras() {
    	LOGGER.info("Car Pets Mod Extras loaded! Let's have some cool models and epic fun!");
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }
}
