package fuzs.puzzlesaccessapi;

import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PuzzlesAccessApi {
    public static final String MOD_ID = "puzzlesaccessapi";
    public static final String MOD_NAME = "Puzzles Access Api";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

    public static ResourceLocation id(String path) {
        return new ResourceLocation(MOD_ID, path);
    }
}
