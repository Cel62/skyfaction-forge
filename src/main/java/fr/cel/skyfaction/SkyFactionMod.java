package fr.cel.skyfaction;

import com.mojang.logging.LogUtils;
import fr.cel.skyfaction.block.ModBlocks;
import fr.cel.skyfaction.fluid.ModFluidTypes;
import fr.cel.skyfaction.fluid.ModFluids;
import fr.cel.skyfaction.item.ModCreativeModeTabs;
import fr.cel.skyfaction.item.ModItems;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.LogicalSide;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(SkyFactionMod.MOD_ID)
@Mod.EventBusSubscriber(modid = SkyFactionMod.MOD_ID)
public class SkyFactionMod {

    public static final String MOD_ID = "skyfaction";
    private static final Logger LOGGER = LogUtils.getLogger();

    public SkyFactionMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        ModFluidTypes.register(modEventBus);
        ModFluids.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        Player player = event.player;
        if (event.side == LogicalSide.SERVER) {
            if (player.isInFluidType(ModFluidTypes.FAKE_WATER_FLUID_TYPE.get())) {
                player.hurt(player.damageSources().generic(), 1.0f);
            }
        }
    }

}
