package net.iceattack.dyablewoodmod.creativemodetab;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.iceattack.dyablewoodmod.DyableWoodMod;
import net.iceattack.dyablewoodmod.block.ModBlocks;
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
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.LIGHT_PURPLE_DYE))
                    .title(Component.translatable("creativemodetab.dyablewoodmod.dye_items"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.LIGHT_PURPLE_DYE);


                    }).build());

    public static final CreativeModeTab DYABLE_BLOCK_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(DyableWoodMod.MOD_ID, "dyable_blocks"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.BLUE_PLANKS))
                    .title(Component.translatable("creativemodetab.dyablewoodmod.dyable_blocks"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModBlocks.BLUE_PLANKS);
                        output.accept(ModBlocks.BLACK_PLANKS);
                        output.accept(ModBlocks.BROWN_PLANKS);
                        output.accept(ModBlocks.CYAN_PLANKS);
                        output.accept(ModBlocks.GRAY_PLANKS);
                        output.accept(ModBlocks.GREEN_PLANKS);
                        output.accept(ModBlocks.LIGHT_BLUE_PLANKS);
                        output.accept(ModBlocks.LIGHT_GRAY_PLANKS);
                        output.accept(ModBlocks.LIGHT_PURPLE_PLANKS);


                    }).build());




    public static void registerModCreativeModeTabs() {
        DyableWoodMod.LOGGER.info("Registering Creative Mode Tabs for " + DyableWoodMod.MOD_ID);
    }
}
