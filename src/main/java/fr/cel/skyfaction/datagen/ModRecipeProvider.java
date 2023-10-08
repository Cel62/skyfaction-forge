package fr.cel.skyfaction.datagen;

import fr.cel.skyfaction.SkyFactionMod;
import fr.cel.skyfaction.block.ModBlocks;
import fr.cel.skyfaction.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    private static final List<ItemLike> NITRITE_SMELTABLES = List.of(ModItems.NITRITE_FRAGMENT.get(), ModBlocks.NITRITE_ORE.get(), ModBlocks.DEEPSLATE_NITRITE_ORE.get());
    private static final List<ItemLike> ARTRITE_SMELTABLES = List.of(ModItems.ARTRITE_FRAGMENT.get(), ModBlocks.ARTRITE_ORE.get(), ModBlocks.DEEPSLATE_ARTRITE_ORE.get());
    private static final List<ItemLike> TERRALIUM_SMELTABLES = List.of(ModItems.TERRALIUM_FRAGMENT.get(), ModBlocks.TERRALIUM_ORE.get(), ModBlocks.DEEPSLATE_TERRALIUM_ORE.get());
    private static final List<ItemLike> HORIUM_SMELTABLES = List.of(ModItems.HORIUM_FRAGMENT.get(), ModBlocks.HORIUM_ORE.get(), ModBlocks.DEEPSLATE_HORIUM_ORE.get());
    private static final List<ItemLike> KOZALIUM_SMELTABLES = List.of(ModItems.KOZALIUM_FRAGMENT.get(), ModBlocks.KOZALIUM_ORE.get(), ModBlocks.DEEPSLATE_KOZALIUM_ORE.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        // Ingot to Block
        allToSomething(ModItems.NITRITE_INGOT.get(), ModBlocks.NITRITE_BLOCK.get(), pWriter);
        allToSomething(ModItems.ARTRITE_INGOT.get(), ModBlocks.ARTRITE_BLOCK.get(), pWriter);
        allToSomething(ModItems.TERRALIUM_INGOT.get(), ModBlocks.TERRALIUM_BLOCK.get(), pWriter);
        allToSomething(ModItems.HORIUM_INGOT.get(), ModBlocks.HORIUM_BLOCK.get(), pWriter);
        allToSomething(ModItems.KOZALIUM_INGOT.get(), ModBlocks.KOZALIUM_BLOCK.get(), pWriter);

        // Block to Ingot
        blockToItem(ModBlocks.NITRITE_BLOCK, ModItems.NITRITE_INGOT, pWriter);
        blockToItem(ModBlocks.ARTRITE_BLOCK, ModItems.ARTRITE_INGOT, pWriter);
        blockToItem(ModBlocks.TERRALIUM_BLOCK, ModItems.TERRALIUM_INGOT, pWriter);
        blockToItem(ModBlocks.HORIUM_BLOCK, ModItems.HORIUM_INGOT, pWriter);
        blockToItem(ModBlocks.KOZALIUM_BLOCK, ModItems.KOZALIUM_INGOT, pWriter);

        // Burn Ores
        oreSmelting(pWriter, NITRITE_SMELTABLES, RecipeCategory.MISC, ModItems.NITRITE_INGOT.get(), 0.25f, 200, "nitrite");
        oreBlasting(pWriter, NITRITE_SMELTABLES, RecipeCategory.MISC, ModItems.NITRITE_INGOT.get(), 0.25f, 100, "nitrite");

        oreSmelting(pWriter, ARTRITE_SMELTABLES, RecipeCategory.MISC, ModItems.ARTRITE_INGOT.get(), 0.25f, 200, "artrite");
        oreBlasting(pWriter, ARTRITE_SMELTABLES, RecipeCategory.MISC, ModItems.ARTRITE_INGOT.get(), 0.25f, 100, "artrite");

        oreSmelting(pWriter, TERRALIUM_SMELTABLES, RecipeCategory.MISC, ModItems.TERRALIUM_INGOT.get(), 0.25f, 200, "terralium");
        oreBlasting(pWriter, TERRALIUM_SMELTABLES, RecipeCategory.MISC, ModItems.TERRALIUM_INGOT.get(), 0.25f, 100, "terralium");

        oreSmelting(pWriter, HORIUM_SMELTABLES, RecipeCategory.MISC, ModItems.HORIUM_INGOT.get(), 0.25f, 200, "horium");
        oreBlasting(pWriter, HORIUM_SMELTABLES, RecipeCategory.MISC, ModItems.HORIUM_INGOT.get(), 0.25f, 100, "horium");

        oreSmelting(pWriter, KOZALIUM_SMELTABLES, RecipeCategory.MISC, ModItems.KOZALIUM_INGOT.get(), 0.25f, 200, "kozalium");
        oreBlasting(pWriter, KOZALIUM_SMELTABLES, RecipeCategory.MISC, ModItems.KOZALIUM_INGOT.get(), 0.25f, 100, "kozalium");

        colorBlock(Items.WHITE_DYE, ModBlocks.WHITE_COLORBLOCK, pWriter);
        colorBlock(Items.ORANGE_DYE, ModBlocks.ORANGE_COLORBLOCK, pWriter);
        colorBlock(Items.MAGENTA_DYE, ModBlocks.MAGENTA_COLORBLOCK, pWriter);
        colorBlock(Items.LIGHT_BLUE_DYE, ModBlocks.LIGHT_BLUE_COLORBLOCK, pWriter);
        colorBlock(Items.YELLOW_DYE, ModBlocks.YELLOW_COLORBLOCK, pWriter);
        colorBlock(Items.LIME_DYE, ModBlocks.LIME_COLORBLOCK, pWriter);
        colorBlock(Items.PINK_DYE, ModBlocks.PINK_COLORBLOCK, pWriter);
        colorBlock(Items.GRAY_DYE, ModBlocks.GRAY_COLORBLOCK, pWriter);
        colorBlock(Items.LIGHT_GRAY_DYE, ModBlocks.LIGHT_GRAY_COLORBLOCK, pWriter);
        colorBlock(Items.CYAN_DYE, ModBlocks.CYAN_COLORBLOCK, pWriter);
        colorBlock(Items.PURPLE_DYE, ModBlocks.PURPLE_COLORBLOCK, pWriter);
        colorBlock(Items.BLUE_DYE, ModBlocks.BLUE_COLORBLOCK, pWriter);
        colorBlock(Items.BROWN_DYE, ModBlocks.BROWN_COLORBLOCK, pWriter);
        colorBlock(Items.GREEN_DYE, ModBlocks.GREEN_COLORBLOCK, pWriter);
        colorBlock(Items.RED_DYE, ModBlocks.RED_COLORBLOCK, pWriter);
        colorBlock(Items.BLACK_DYE, ModBlocks.BLACK_COLORBLOCK, pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CAVE_BLOCK.get())
                .pattern("GXG")
                .pattern("XGX")
                .pattern("GXG")
                .define('G', Blocks.GLASS)
                .define('X', ModItems.XRAY_FRAGMENT.get())
                .unlockedBy(getHasName(ModItems.XRAY_FRAGMENT.get()), has(ModItems.XRAY_FRAGMENT.get()))
                .save(pWriter);

        stairBuilder(ModBlocks.OBSIDIAN_STAIRS.get(), Ingredient.of(Blocks.OBSIDIAN)).unlockedBy(getHasName(Blocks.OBSIDIAN), has(Blocks.OBSIDIAN)).save(pWriter);
        doorBuilder(ModBlocks.OBSIDIAN_DOOR.get(), Ingredient.of(Blocks.OBSIDIAN)).unlockedBy(getHasName(Blocks.OBSIDIAN), has(Blocks.OBSIDIAN)).save(pWriter);
        slab(pWriter, RecipeCategory.MISC, ModBlocks.OBSIDIAN_SLAB.get(), Blocks.OBSIDIAN);
        trapdoorBuilder(ModBlocks.OBSIDIAN_TRAPDOOR.get(), Ingredient.of(Blocks.OBSIDIAN)).unlockedBy(getHasName(Blocks.OBSIDIAN), has(Blocks.OBSIDIAN)).save(pWriter);
    }

    private void colorBlock(ItemLike item, RegistryObject<Block> block, Consumer<FinishedRecipe> pWriter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, block.get())
                .pattern("DDD")
                .pattern("DGD")
                .pattern("DDD")
                .define('D', item)
                .define('G', Items.GLOWSTONE)
                .unlockedBy(getHasName(item), has(item))
                .save(pWriter);
    }

    private void allToSomething(ItemLike item, ItemLike itemLike, Consumer<FinishedRecipe> pWriter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, itemLike)
                .pattern("III")
                .pattern("III")
                .pattern("III")
                .define('I', item)
                .unlockedBy(getHasName(item), has(item))
                .save(pWriter);
    }

    private void blockToItem(RegistryObject<Block> block, RegistryObject<Item> item, Consumer<FinishedRecipe> pWriter) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, item.get(), 9)
                .requires(block.get())
                .unlockedBy(getHasName(block.get()), has(block.get()))
                .save(pWriter);
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                    pExperience, pCookingTime, pCookingSerializer).group(pGroup).unlockedBy(getHasName(itemlike),
                    has(itemlike)).save(pFinishedRecipeConsumer, SkyFactionMod.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }

    }

}