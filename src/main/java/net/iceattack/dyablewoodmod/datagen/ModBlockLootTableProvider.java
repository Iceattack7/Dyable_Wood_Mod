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

    }
}
