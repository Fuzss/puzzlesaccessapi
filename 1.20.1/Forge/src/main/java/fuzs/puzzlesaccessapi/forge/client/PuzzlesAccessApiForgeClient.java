package fuzs.puzzlesaccessapi.forge.client;

import fuzs.puzzlesaccessapi.PuzzlesAccessApi;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;

@Mod.EventBusSubscriber(modid = PuzzlesAccessApi.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PuzzlesAccessApiForgeClient {

    @SubscribeEvent
    public static void onConstructMod(final FMLConstructModEvent evt) {
//        ClientModConstructor.construct(PuzzlesAccessApi.MOD_ID, PuzzlesAccessApiClient::new);
    }
}
