package net.iceattack.dyablewoodmod.item;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.iceattack.dyablewoodmod.DyableWoodMod;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class ModItems {
    public static final Item FROZENITE = registerItem( "frozenite", Item::new);
    public static final Item DULL_FROZENITE = registerItem( "dull_frozenite", Item::new);
    public static final Item LIGHT_PURPLE_DYE = registerItem( "light_purple_dye", Item::new);



    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(DyableWoodMod.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(DyableWoodMod.MOD_ID, name)))));
    }

    public static void registerModItems() {
        DyableWoodMod.LOGGER.info("Registering Mod Items for " + DyableWoodMod.MOD_ID);

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register(output -> {
            output.accept(FROZENITE);
            output.accept(DULL_FROZENITE);
            output.accept(LIGHT_PURPLE_DYE);
        });
    }
}
