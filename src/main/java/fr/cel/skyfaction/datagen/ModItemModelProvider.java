package fr.cel.skyfaction.datagen;

import fr.cel.skyfaction.SkyFactionMod;
import fr.cel.skyfaction.block.ModBlocks;
import fr.cel.skyfaction.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, SkyFactionMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.NITRITE_FRAGMENT);
        simpleItem(ModItems.ARTRITE_FRAGMENT);
        simpleItem(ModItems.TERRALIUM_FRAGMENT);
        simpleItem(ModItems.HORIUM_FRAGMENT);
        simpleItem(ModItems.KOZALIUM_FRAGMENT);
        simpleItem(ModItems.XRAY_FRAGMENT);

        simpleItem(ModItems.NITRITE_INGOT);
        simpleItem(ModItems.ARTRITE_INGOT);
        simpleItem(ModItems.TERRALIUM_INGOT);
        simpleItem(ModItems.HORIUM_INGOT);
        simpleItem(ModItems.KOZALIUM_INGOT);

        simpleBlockItem(ModBlocks.OBSIDIAN_DOOR);
        evenSimplerBlockItem(ModBlocks.OBSIDIAN_SLAB);
        evenSimplerBlockItem(ModBlocks.OBSIDIAN_STAIRS);
        trapdoorItem(ModBlocks.OBSIDIAN_TRAPDOOR);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(SkyFactionMod.MOD_ID, "item/" + item.getId().getPath()));
    }

    public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(SkyFactionMod.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    public void trapdoorItem(RegistryObject<Block> block) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath() + "_bottom"));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(SkyFactionMod.MOD_ID, "item/" + item.getId().getPath()));
    }

}
