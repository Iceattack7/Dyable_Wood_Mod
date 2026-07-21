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
                        output.accept(ModBlocks.LIME_PLANKS);
                        output.accept(ModBlocks.MAGENTA_PLANKS);
                        output.accept(ModBlocks.ORANGE_PLANKS);
                        output.accept(ModBlocks.PINK_PLANKS);
                        output.accept(ModBlocks.PURPLE_PLANKS);
                        output.accept(ModBlocks.RED_PLANKS);
                        output.accept(ModBlocks.WHITE_PLANKS);
                        output.accept(ModBlocks.YELLOW_PLANKS);

                        output.accept(ModBlocks.BLUE_WOOD_STAIRS);
                        output.accept(ModBlocks.BLUE_WOOD_SLAB);
                        output.accept(ModBlocks.BLACK_WOOD_STAIRS);
                        output.accept(ModBlocks.BLACK_WOOD_SLAB);
                        output.accept(ModBlocks.BROWN_WOOD_STAIRS);
                        output.accept(ModBlocks.BROWN_WOOD_SLAB);
                        output.accept(ModBlocks.CYAN_WOOD_STAIRS);
                        output.accept(ModBlocks.CYAN_WOOD_SLAB);
                        output.accept(ModBlocks.GRAY_WOOD_STAIRS);
                        output.accept(ModBlocks.GRAY_WOOD_SLAB);
                        output.accept(ModBlocks.GREEN_WOOD_STAIRS);
                        output.accept(ModBlocks.GREEN_WOOD_SLAB);
                        output.accept(ModBlocks.LIGHT_BLUE_WOOD_STAIRS);
                        output.accept(ModBlocks.LIGHT_BLUE_WOOD_SLAB);
                        output.accept(ModBlocks.LIGHT_GRAY_WOOD_STAIRS);
                        output.accept(ModBlocks.LIGHT_GRAY_WOOD_SLAB);
                        output.accept(ModBlocks.LIGHT_PURPLE_WOOD_STAIRS);
                        output.accept(ModBlocks.LIGHT_PURPLE_WOOD_SLAB);
                        output.accept(ModBlocks.LIME_WOOD_STAIRS);
                        output.accept(ModBlocks.LIME_WOOD_SLAB);
                        output.accept(ModBlocks.MAGENTA_WOOD_STAIRS);
                        output.accept(ModBlocks.MAGENTA_WOOD_SLAB);
                        output.accept(ModBlocks.ORANGE_WOOD_STAIRS);
                        output.accept(ModBlocks.ORANGE_WOOD_SLAB);
                        output.accept(ModBlocks.PINK_WOOD_STAIRS);
                        output.accept(ModBlocks.PINK_WOOD_SLAB);
                        output.accept(ModBlocks.PURPLE_WOOD_STAIRS);
                        output.accept(ModBlocks.PURPLE_WOOD_SLAB);
                        output.accept(ModBlocks.RED_WOOD_STAIRS);
                        output.accept(ModBlocks.RED_WOOD_SLAB);
                        output.accept(ModBlocks.WHITE_WOOD_STAIRS);
                        output.accept(ModBlocks.WHITE_WOOD_SLAB);
                        output.accept(ModBlocks.YELLOW_WOOD_STAIRS);
                        output.accept(ModBlocks.YELLOW_WOOD_SLAB);

                        output.accept(ModBlocks.BLUE_WOOD_BUTTON);
                        output.accept(ModBlocks.BLUE_WOOD_PRESSURE_PLATE);
                        output.accept(ModBlocks.BLACK_WOOD_BUTTON);
                        output.accept(ModBlocks.BLACK_WOOD_PRESSURE_PLATE);
                        output.accept(ModBlocks.BROWN_WOOD_BUTTON);
                        output.accept(ModBlocks.BROWN_WOOD_PRESSURE_PLATE);
                        output.accept(ModBlocks.CYAN_WOOD_BUTTON);
                        output.accept(ModBlocks.CYAN_WOOD_PRESSURE_PLATE);
                        output.accept(ModBlocks.GRAY_WOOD_BUTTON);
                        output.accept(ModBlocks.GRAY_WOOD_PRESSURE_PLATE);
                        output.accept(ModBlocks.GREEN_WOOD_BUTTON);
                        output.accept(ModBlocks.GREEN_WOOD_PRESSURE_PLATE);
                        output.accept(ModBlocks.LIGHT_BLUE_WOOD_BUTTON);
                        output.accept(ModBlocks.LIGHT_BLUE_WOOD_PRESSURE_PLATE);
                        output.accept(ModBlocks.LIGHT_GRAY_WOOD_BUTTON);
                        output.accept(ModBlocks.LIGHT_GRAY_WOOD_PRESSURE_PLATE);
                        output.accept(ModBlocks.LIGHT_PURPLE_WOOD_BUTTON);
                        output.accept(ModBlocks.LIGHT_PURPLE_WOOD_PRESSURE_PLATE);
                        output.accept(ModBlocks.LIME_WOOD_BUTTON);
                        output.accept(ModBlocks.LIME_WOOD_PRESSURE_PLATE);
                        output.accept(ModBlocks.MAGENTA_WOOD_BUTTON);
                        output.accept(ModBlocks.MAGENTA_WOOD_PRESSURE_PLATE);
                        output.accept(ModBlocks.ORANGE_WOOD_BUTTON);
                        output.accept(ModBlocks.ORANGE_WOOD_PRESSURE_PLATE);
                        output.accept(ModBlocks.PINK_WOOD_BUTTON);
                        output.accept(ModBlocks.PINK_WOOD_PRESSURE_PLATE);
                        output.accept(ModBlocks.PURPLE_WOOD_BUTTON);
                        output.accept(ModBlocks.PURPLE_WOOD_PRESSURE_PLATE);
                        output.accept(ModBlocks.RED_WOOD_BUTTON);
                        output.accept(ModBlocks.RED_WOOD_PRESSURE_PLATE);
                        output.accept(ModBlocks.WHITE_WOOD_BUTTON);
                        output.accept(ModBlocks.WHITE_WOOD_PRESSURE_PLATE);
                        output.accept(ModBlocks.YELLOW_WOOD_BUTTON);
                        output.accept(ModBlocks.YELLOW_WOOD_PRESSURE_PLATE);

                        output.accept(ModBlocks.BLUE_WOOD_FENCE);
                        output.accept(ModBlocks.BLUE_WOOD_FENCE_GATE);
                        output.accept(ModBlocks.BLACK_WOOD_FENCE);
                        output.accept(ModBlocks.BLACK_WOOD_FENCE_GATE);
                        output.accept(ModBlocks.BROWN_WOOD_FENCE);
                        output.accept(ModBlocks.BROWN_WOOD_FENCE_GATE);
                        output.accept(ModBlocks.CYAN_WOOD_FENCE);
                        output.accept(ModBlocks.CYAN_WOOD_FENCE_GATE);
                        output.accept(ModBlocks.GRAY_WOOD_FENCE);
                        output.accept(ModBlocks.GRAY_WOOD_FENCE_GATE);
                        output.accept(ModBlocks.GREEN_WOOD_FENCE);
                        output.accept(ModBlocks.GREEN_WOOD_FENCE_GATE);
                        output.accept(ModBlocks.LIGHT_BLUE_WOOD_FENCE);
                        output.accept(ModBlocks.LIGHT_BLUE_WOOD_FENCE_GATE);
                        output.accept(ModBlocks.LIGHT_GRAY_WOOD_FENCE);
                        output.accept(ModBlocks.LIGHT_GRAY_WOOD_FENCE_GATE);
                        output.accept(ModBlocks.LIGHT_PURPLE_WOOD_FENCE);
                        output.accept(ModBlocks.LIGHT_PURPLE_WOOD_FENCE_GATE);
                        output.accept(ModBlocks.LIME_WOOD_FENCE);
                        output.accept(ModBlocks.LIME_WOOD_FENCE_GATE);
                        output.accept(ModBlocks.MAGENTA_WOOD_FENCE);
                        output.accept(ModBlocks.MAGENTA_WOOD_FENCE_GATE);
                        output.accept(ModBlocks.ORANGE_WOOD_FENCE);
                        output.accept(ModBlocks.ORANGE_WOOD_FENCE_GATE);
                        output.accept(ModBlocks.PINK_WOOD_FENCE);
                        output.accept(ModBlocks.PINK_WOOD_FENCE_GATE);
                        output.accept(ModBlocks.PURPLE_WOOD_FENCE);
                        output.accept(ModBlocks.PURPLE_WOOD_FENCE_GATE);


                    }).build());




    public static void registerModCreativeModeTabs() {
        DyableWoodMod.LOGGER.info("Registering Creative Mode Tabs for " + DyableWoodMod.MOD_ID);
    }
}
