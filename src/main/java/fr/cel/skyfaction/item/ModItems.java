package fr.cel.skyfaction.item;

import fr.cel.skyfaction.SkyFactionMod;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SkyFactionMod.MOD_ID);

    // Fragments
    public static final RegistryObject<Item> NITRITE_FRAGMENT = ITEMS.register("nitrite_fragment", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ARTRITE_FRAGMENT = ITEMS.register("artrite_fragment", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TERRALIUM_FRAGMENT = ITEMS.register("terralium_fragment", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HORIUM_FRAGMENT = ITEMS.register("horium_fragment", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KOZALIUM_FRAGMENT = ITEMS.register("kozalium_fragment", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> XRAY_FRAGMENT = ITEMS.register("xray_fragment", () -> new Item(new Item.Properties()));

    // Ingots
    public static final RegistryObject<Item> NITRITE_INGOT = ITEMS.register("nitrite_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ARTRITE_INGOT = ITEMS.register("artrite_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TERRALIUM_INGOT = ITEMS.register("terralium_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HORIUM_INGOT = ITEMS.register("horium_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KOZALIUM_INGOT = ITEMS.register("kozalium_ingot", () -> new Item(new Item.Properties()));

    // Tools
    public static final RegistryObject<Item> NITRITE_SWORD = ITEMS.register("nitrite_sword",
            () -> new SwordItem(ModToolTiers.NITRITE, 4, -2.4F, new Item.Properties()));

    public static final RegistryObject<Item> NITRITE_PICKAXE = ITEMS.register("nitrite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.NITRITE, 1, -2.8F, new Item.Properties()));

    public static final RegistryObject<Item> NITRITE_AXE = ITEMS.register("nitrite_axe",
            () -> new AxeItem(ModToolTiers.NITRITE, 6.0F, -3.0F, new Item.Properties()));

    public static final RegistryObject<Item> NITRITE_SHOVEL = ITEMS.register("nitrite_shovel",
            () -> new ShovelItem(ModToolTiers.NITRITE, 1.5F, -3.0F, new Item.Properties()));

    public static final RegistryObject<Item> NITRITE_HOE = ITEMS.register("nitrite_hoe",
            () -> new HoeItem(ModToolTiers.NITRITE, -4, 0.0F, new Item.Properties()));


    public static final RegistryObject<Item> ARTRITE_SWORD = ITEMS.register("artrite_sword",
            () -> new SwordItem(ModToolTiers.ARTRITE, 4, -2.4F, new Item.Properties()));

    public static final RegistryObject<Item> ARTRITE_PICKAXE = ITEMS.register("artrite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ARTRITE, 1, -2.8F, new Item.Properties()));

    public static final RegistryObject<Item> ARTRITE_AXE = ITEMS.register("artrite_axe",
            () -> new AxeItem(ModToolTiers.ARTRITE, 7.0F, -3.0F, new Item.Properties()));

    public static final RegistryObject<Item> ARTRITE_SHOVEL = ITEMS.register("artrite_shovel",
            () -> new ShovelItem(ModToolTiers.ARTRITE, 1.5F, -3.0F, new Item.Properties()));

    public static final RegistryObject<Item> ARTRITE_HOE = ITEMS.register("artrite_hoe",
            () -> new HoeItem(ModToolTiers.ARTRITE, -4, 0.0F, new Item.Properties()));



    public static final RegistryObject<Item> TERRALIUM_SWORD = ITEMS.register("terralium_sword",
            () -> new SwordItem(ModToolTiers.TERRALIUM, 5, -2.4F, new Item.Properties()));

    public static final RegistryObject<Item> TERRALIUM_PICKAXE = ITEMS.register("terralium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.TERRALIUM, 1, -2.8F, new Item.Properties()));

    public static final RegistryObject<Item> TERRALIUM_AXE = ITEMS.register("terralium_axe",
            () -> new AxeItem(ModToolTiers.TERRALIUM, 8.0F, -3.0F, new Item.Properties()));

    public static final RegistryObject<Item> TERRALIUM_SHOVEL = ITEMS.register("terralium_shovel",
            () -> new ShovelItem(ModToolTiers.TERRALIUM, 1.5F, -3.0F, new Item.Properties()));

    public static final RegistryObject<Item> TERRALIUM_HOE = ITEMS.register("terralium_hoe",
            () -> new HoeItem(ModToolTiers.TERRALIUM, -4, 0.0F, new Item.Properties()));


    public static final RegistryObject<Item> HORIUM_SWORD = ITEMS.register("horium_sword",
            () -> new SwordItem(ModToolTiers.HORIUM, 6, -2.4F, new Item.Properties()));

    public static final RegistryObject<Item> HORIUM_PICKAXE = ITEMS.register("horium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.HORIUM, 1, -2.8F, new Item.Properties()));

    public static final RegistryObject<Item> HORIUM_AXE = ITEMS.register("horium_axe",
            () -> new AxeItem(ModToolTiers.HORIUM, 9.0F, -3.0F, new Item.Properties()));

    public static final RegistryObject<Item> HORIUM_SHOVEL = ITEMS.register("horium_shovel",
            () -> new ShovelItem(ModToolTiers.HORIUM, 1.5F, -3.0F, new Item.Properties()));

    public static final RegistryObject<Item> HORIUM_HOE = ITEMS.register("horium_hoe",
            () -> new HoeItem(ModToolTiers.HORIUM, -4, 0.0F, new Item.Properties()));


    public static final RegistryObject<Item> KOZALIUM_SWORD = ITEMS.register("kozalium_sword",
            () -> new SwordItem(ModToolTiers.KOZALIUM, 7, -2.4F, new Item.Properties()));

    public static final RegistryObject<Item> KOZALIUM_PICKAXE = ITEMS.register("kozalium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.KOZALIUM, 1, -2.8F, new Item.Properties()));

    public static final RegistryObject<Item> KOZALIUM_AXE = ITEMS.register("kozalium_axe",
            () -> new AxeItem(ModToolTiers.KOZALIUM, 10.0F, -3.0F, new Item.Properties()));

    public static final RegistryObject<Item> KOZALIUM_SHOVEL = ITEMS.register("kozalium_shovel",
            () -> new ShovelItem(ModToolTiers.KOZALIUM, 1.5F, -3.0F, new Item.Properties()));

    public static final RegistryObject<Item> KOZALIUM_HOE = ITEMS.register("kozalium_hoe",
            () -> new HoeItem(ModToolTiers.KOZALIUM, -4, 0.0F, new Item.Properties()));

    // Armors
    public static final RegistryObject<Item> NITRITE_HELMET = ITEMS.register("nitrite_helmet",
            () -> new ArmorItem(ModArmorMaterials.NITRITE, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> NITRITE_CHESTPLATE = ITEMS.register("nitrite_chestplate",
            () -> new ArmorItem(ModArmorMaterials.NITRITE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> NITRITE_LEGGINGS = ITEMS.register("nitrite_leggings",
            () -> new ArmorItem(ModArmorMaterials.NITRITE, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> NITRITE_BOOTS = ITEMS.register("nitrite_boots",
            () -> new ArmorItem(ModArmorMaterials.NITRITE, ArmorItem.Type.BOOTS, new Item.Properties()));


    public static final RegistryObject<Item> ARTRITE_HELMET = ITEMS.register("artrite_helmet",
            () -> new ArmorItem(ModArmorMaterials.ARTRITE, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> ARTRITE_CHESTPLATE = ITEMS.register("artrite_chestplate",
            () -> new ArmorItem(ModArmorMaterials.ARTRITE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> ARTRITE_LEGGINGS = ITEMS.register("artrite_leggings",
            () -> new ArmorItem(ModArmorMaterials.ARTRITE, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> ARTRITE_BOOTS = ITEMS.register("artrite_boots",
            () -> new ArmorItem(ModArmorMaterials.ARTRITE, ArmorItem.Type.BOOTS, new Item.Properties()));


    public static final RegistryObject<Item> TERRALIUM_HELMET = ITEMS.register("terralium_helmet",
            () -> new ArmorItem(ModArmorMaterials.TERRALIUM, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> TERRALIUM_CHESTPLATE = ITEMS.register("terralium_chestplate",
            () -> new ArmorItem(ModArmorMaterials.TERRALIUM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> TERRALIUM_LEGGINGS = ITEMS.register("terralium_leggings",
            () -> new ArmorItem(ModArmorMaterials.TERRALIUM, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> TERRALIUM_BOOTS = ITEMS.register("terralium_boots",
            () -> new ArmorItem(ModArmorMaterials.TERRALIUM, ArmorItem.Type.BOOTS, new Item.Properties()));


    public static final RegistryObject<Item> HORIUM_HELMET = ITEMS.register("horium_helmet",
            () -> new ArmorItem(ModArmorMaterials.HORIUM, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> HORIUM_CHESTPLATE = ITEMS.register("horium_chestplate",
            () -> new ArmorItem(ModArmorMaterials.HORIUM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> HORIUM_LEGGINGS = ITEMS.register("horium_leggings",
            () -> new ArmorItem(ModArmorMaterials.HORIUM, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> HORIUM_BOOTS = ITEMS.register("horium_boots",
            () -> new ArmorItem(ModArmorMaterials.HORIUM, ArmorItem.Type.BOOTS, new Item.Properties()));


    public static final RegistryObject<Item> KOZALIUM_HELMET = ITEMS.register("kozalium_helmet",
            () -> new ArmorItem(ModArmorMaterials.KOZALIUM, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> KOZALIUM_CHESTPLATE = ITEMS.register("kozalium_chestplate",
            () -> new ArmorItem(ModArmorMaterials.KOZALIUM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> KOZALIUM_LEGGINGS = ITEMS.register("kozalium_leggings",
            () -> new ArmorItem(ModArmorMaterials.KOZALIUM, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> KOZALIUM_BOOTS = ITEMS.register("kozalium_boots",
            () -> new ArmorItem(ModArmorMaterials.KOZALIUM, ArmorItem.Type.BOOTS, new Item.Properties()));

    // TODO faire des boucliers

    /**
     * Permet d'enregistrer tous les blocs de la classe
     * @param eventBus Interface qui permet d'enregistrer les items
     */
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}