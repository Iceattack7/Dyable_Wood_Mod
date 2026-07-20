package net.iceattack.dyablewoodmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.iceattack.dyablewoodmod.block.ModBlocks;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class ModBlockLootTableProvider extends FabricBlockLootSubProvider {
    public ModBlockLootTableProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(packOutput, registriesFuture);
    }

    @Override
    public void generate() {

        dropSelf(ModBlocks.BLACK_PLANKS);
        dropSelf(ModBlocks.BLUE_PLANKS);
        dropSelf(ModBlocks.BROWN_PLANKS);
        dropSelf(ModBlocks.CYAN_PLANKS);
        dropSelf(ModBlocks.GRAY_PLANKS);
        dropSelf(ModBlocks.GREEN_PLANKS);
        dropSelf(ModBlocks.LIGHT_BLUE_PLANKS);
        dropSelf(ModBlocks.LIGHT_GRAY_PLANKS);
        dropSelf(ModBlocks.LIGHT_PURPLE_PLANKS);
        dropSelf(ModBlocks.LIME_PLANKS);
        dropSelf(ModBlocks.MAGENTA_PLANKS);
        dropSelf(ModBlocks.ORANGE_PLANKS);
        dropSelf(ModBlocks.PINK_PLANKS);
        dropSelf(ModBlocks.PURPLE_PLANKS);
        dropSelf(ModBlocks.RED_PLANKS);
        dropSelf(ModBlocks.WHITE_PLANKS);
        dropSelf(ModBlocks.YELLOW_PLANKS);

        dropSelf(ModBlocks.BLUE_WOOD_STAIRS);
        add(ModBlocks.BLUE_WOOD_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.BLACK_WOOD_STAIRS);
        add(ModBlocks.BLACK_WOOD_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.BROWN_WOOD_STAIRS);
        add(ModBlocks.BROWN_WOOD_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.CYAN_WOOD_STAIRS);
        add(ModBlocks.CYAN_WOOD_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.GRAY_WOOD_STAIRS);
        add(ModBlocks.GRAY_WOOD_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.GREEN_WOOD_STAIRS);
        add(ModBlocks.GREEN_WOOD_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.LIGHT_BLUE_WOOD_STAIRS);
        add(ModBlocks.LIGHT_BLUE_WOOD_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.LIGHT_GRAY_WOOD_STAIRS);
        add(ModBlocks.LIGHT_GRAY_WOOD_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.LIGHT_PURPLE_WOOD_STAIRS);
        add(ModBlocks.LIGHT_PURPLE_WOOD_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.LIME_WOOD_STAIRS);
        add(ModBlocks.LIME_WOOD_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.MAGENTA_WOOD_STAIRS);
        add(ModBlocks.MAGENTA_WOOD_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.ORANGE_WOOD_STAIRS);
        add(ModBlocks.ORANGE_WOOD_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.PINK_WOOD_STAIRS);
        add(ModBlocks.PINK_WOOD_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.PURPLE_WOOD_STAIRS);
        add(ModBlocks.PURPLE_WOOD_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.RED_WOOD_STAIRS);
        add(ModBlocks.RED_WOOD_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.WHITE_WOOD_STAIRS);
        add(ModBlocks.WHITE_WOOD_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.YELLOW_WOOD_STAIRS);
        add(ModBlocks.YELLOW_WOOD_SLAB, this::createSlabItemTable);

        dropSelf(ModBlocks.BLUE_WOOD_BUTTON);
        dropSelf(ModBlocks.BLUE_WOOD_PRESSURE_PLATE);
        dropSelf(ModBlocks.BLACK_WOOD_BUTTON);
        dropSelf(ModBlocks.BLACK_WOOD_PRESSURE_PLATE);
        dropSelf(ModBlocks.BROWN_WOOD_BUTTON);
        dropSelf(ModBlocks.BROWN_WOOD_PRESSURE_PLATE);
        dropSelf(ModBlocks.CYAN_WOOD_BUTTON);
        dropSelf(ModBlocks.CYAN_WOOD_PRESSURE_PLATE);
        dropSelf(ModBlocks.GRAY_WOOD_BUTTON);
        dropSelf(ModBlocks.GRAY_WOOD_PRESSURE_PLATE);
        dropSelf(ModBlocks.GREEN_WOOD_BUTTON);
        dropSelf(ModBlocks.GREEN_WOOD_PRESSURE_PLATE);
        dropSelf(ModBlocks.LIGHT_BLUE_WOOD_BUTTON);
        dropSelf(ModBlocks.LIGHT_BLUE_WOOD_PRESSURE_PLATE);
        dropSelf(ModBlocks.LIGHT_GRAY_WOOD_BUTTON);
        dropSelf(ModBlocks.LIGHT_GRAY_WOOD_PRESSURE_PLATE);
        dropSelf(ModBlocks.LIGHT_PURPLE_WOOD_BUTTON);
        dropSelf(ModBlocks.LIGHT_PURPLE_WOOD_PRESSURE_PLATE);
        dropSelf(ModBlocks.LIME_WOOD_BUTTON);
        dropSelf(ModBlocks.LIME_WOOD_PRESSURE_PLATE);
        dropSelf(ModBlocks.MAGENTA_WOOD_BUTTON);
        dropSelf(ModBlocks.MAGENTA_WOOD_PRESSURE_PLATE);
        dropSelf(ModBlocks.ORANGE_WOOD_BUTTON);
        dropSelf(ModBlocks.ORANGE_WOOD_PRESSURE_PLATE);
        dropSelf(ModBlocks.PINK_WOOD_BUTTON);
        dropSelf(ModBlocks.PINK_WOOD_PRESSURE_PLATE);
        dropSelf(ModBlocks.PURPLE_WOOD_BUTTON);
        dropSelf(ModBlocks.PURPLE_WOOD_PRESSURE_PLATE);
        dropSelf(ModBlocks.RED_WOOD_BUTTON);
        dropSelf(ModBlocks.RED_WOOD_PRESSURE_PLATE);
        dropSelf(ModBlocks.WHITE_WOOD_BUTTON);
        dropSelf(ModBlocks.WHITE_WOOD_PRESSURE_PLATE);
        dropSelf(ModBlocks.YELLOW_WOOD_BUTTON);
        dropSelf(ModBlocks.YELLOW_WOOD_PRESSURE_PLATE);

        dropSelf(ModBlocks.BLUE_WOOD_FENCE);
        dropSelf(ModBlocks.BLUE_WOOD_FENCE_GATE);
        dropSelf(ModBlocks.BLACK_WOOD_FENCE);
        dropSelf(ModBlocks.BLACK_WOOD_FENCE_GATE);
        dropSelf(ModBlocks.BROWN_WOOD_FENCE);
        dropSelf(ModBlocks.BROWN_WOOD_FENCE_GATE);
        dropSelf(ModBlocks.CYAN_WOOD_FENCE);
        dropSelf(ModBlocks.CYAN_WOOD_FENCE_GATE);
        dropSelf(ModBlocks.GRAY_WOOD_FENCE);
        dropSelf(ModBlocks.GRAY_WOOD_FENCE_GATE);
        dropSelf(ModBlocks.GREEN_WOOD_FENCE);
        dropSelf(ModBlocks.GREEN_WOOD_FENCE_GATE);
        dropSelf(ModBlocks.LIGHT_BLUE_WOOD_FENCE);
        dropSelf(ModBlocks.LIGHT_BLUE_WOOD_FENCE_GATE);
        dropSelf(ModBlocks.LIGHT_GRAY_WOOD_FENCE);
        dropSelf(ModBlocks.LIGHT_GRAY_WOOD_FENCE_GATE);

    }
}
