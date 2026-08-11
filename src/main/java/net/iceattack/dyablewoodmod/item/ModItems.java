package net.iceattack.dyablewoodmod.item;


import net.iceattack.dyablewoodmod.DyableWoodMod;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(DyableWoodMod.MOD_ID);

    public static final DeferredItem<Item> LIGHT_PURPLE_DYE = ITEMS.registerSimpleItem("light_purple_dye");


    public static ResourceKey<Item> getRK(Item item) {
        return BuiltInRegistries.ITEM.getResourceKey(item).orElseThrow();
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
