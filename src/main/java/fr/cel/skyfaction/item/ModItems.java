package fr.cel.skyfaction.item;

import fr.cel.skyfaction.SkyFactionMod;
import net.minecraft.world.item.Item;
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

    /**
     * Permet d'enregistrer tous les blocs de la classe
     * @param eventBus Interface qui permet d'enregistrer les items
     */
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}