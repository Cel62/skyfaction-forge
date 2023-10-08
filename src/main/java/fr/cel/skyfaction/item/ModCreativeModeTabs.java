package fr.cel.skyfaction.item;

import fr.cel.skyfaction.SkyFactionMod;
import fr.cel.skyfaction.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SkyFactionMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SKYFACTION = CREATIVE_MODE_TABS.register(
            "skyfaction",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.NITRITE_BLOCK.get()))
                    .title(Component.translatable("itemGroup.skyfaction"))
                    .displayItems(((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.NITRITE_ORE.get());
                        pOutput.accept(ModBlocks.ARTRITE_ORE.get());
                        pOutput.accept(ModBlocks.TERRALIUM_ORE.get());
                        pOutput.accept(ModBlocks.HORIUM_ORE.get());
                        pOutput.accept(ModBlocks.KOZALIUM_ORE.get());
                        pOutput.accept(ModBlocks.XRAY_ORE.get());

                        pOutput.accept(ModBlocks.DEEPSLATE_NITRITE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_ARTRITE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_TERRALIUM_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_HORIUM_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_KOZALIUM_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_XRAY_ORE.get());

                        pOutput.accept(ModBlocks.NITRITE_BLOCK.get());
                        pOutput.accept(ModBlocks.ARTRITE_BLOCK.get());
                        pOutput.accept(ModBlocks.TERRALIUM_BLOCK.get());
                        pOutput.accept(ModBlocks.HORIUM_BLOCK.get());
                        pOutput.accept(ModBlocks.KOZALIUM_BLOCK.get());

                        pOutput.accept(ModItems.NITRITE_FRAGMENT.get());
                        pOutput.accept(ModItems.ARTRITE_FRAGMENT.get());
                        pOutput.accept(ModItems.TERRALIUM_FRAGMENT.get());
                        pOutput.accept(ModItems.HORIUM_FRAGMENT.get());
                        pOutput.accept(ModItems.KOZALIUM_FRAGMENT.get());
                        pOutput.accept(ModItems.XRAY_FRAGMENT.get());

                        pOutput.accept(ModItems.NITRITE_INGOT.get());
                        pOutput.accept(ModItems.ARTRITE_INGOT.get());
                        pOutput.accept(ModItems.TERRALIUM_INGOT.get());
                        pOutput.accept(ModItems.HORIUM_INGOT.get());
                        pOutput.accept(ModItems.KOZALIUM_INGOT.get());

                        pOutput.accept(ModBlocks.WHITE_COLORBLOCK.get());
                        pOutput.accept(ModBlocks.ORANGE_COLORBLOCK.get());
                        pOutput.accept(ModBlocks.MAGENTA_COLORBLOCK.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_COLORBLOCK.get());
                        pOutput.accept(ModBlocks.YELLOW_COLORBLOCK.get());
                        pOutput.accept(ModBlocks.LIME_COLORBLOCK.get());
                        pOutput.accept(ModBlocks.PINK_COLORBLOCK.get());
                        pOutput.accept(ModBlocks.GRAY_COLORBLOCK.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_COLORBLOCK.get());
                        pOutput.accept(ModBlocks.CYAN_COLORBLOCK.get());
                        pOutput.accept(ModBlocks.PURPLE_COLORBLOCK.get());
                        pOutput.accept(ModBlocks.BLUE_COLORBLOCK.get());
                        pOutput.accept(ModBlocks.BROWN_COLORBLOCK.get());
                        pOutput.accept(ModBlocks.GREEN_COLORBLOCK.get());
                        pOutput.accept(ModBlocks.RED_COLORBLOCK.get());
                        pOutput.accept(ModBlocks.BLACK_COLORBLOCK.get());

                        pOutput.accept(ModBlocks.CAVE_BLOCK.get());

                        pOutput.accept(ModBlocks.OBSIDIAN_DOOR.get());
                        pOutput.accept(ModBlocks.OBSIDIAN_SLAB.get());
                        pOutput.accept(ModBlocks.OBSIDIAN_STAIRS.get());
                        pOutput.accept(ModBlocks.OBSIDIAN_TRAPDOOR.get());
                    }))
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
