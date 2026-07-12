package net.iceattack.dyablewoodmod.creativemodetab;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.iceattack.dyablewoodmod.DyableWoodMod;
import net.iceattack.dyablewoodmod.item.ModItems;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {
    public static final CreativeModeTab DYE_ITEM_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(DyableWoodMod.MOD_ID, "dye_items"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.FROZENITE))
                    .title(Component.translatable("creativemodetab.dyablewoodmod.dye_items"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.FROZENITE);
                        output.accept(ModItems.DULL_FROZENITE);


                    }).build());

    public static final CreativeModeTab DYABLE_BLOCK_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(DyableWoodMod.MOD_ID, "dyable_blocks"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DULL_FROZENITE))
                    .title(Component.translatable("creativemodetab.dyablewoodmod.dyable_blocks"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.DULL_FROZENITE);


                    }).build());




    public static void registerModCreativeModeTabs() {
        DyableWoodMod.LOGGER.info("Registering Creative Mode Tabs for " + DyableWoodMod.MOD_ID);
    }
}
