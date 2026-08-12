package net.iceattack.dyablewoodmod.datagen;

import net.iceattack.dyablewoodmod.DyableWoodMod;
import net.iceattack.dyablewoodmod.block.ModBlocks;
import net.iceattack.dyablewoodmod.item.ModItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.PackOutput;

public class ModModelProvider extends ModelProvider {
    public ModModelProvider(PackOutput output) {
        super(output, DyableWoodMod.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        itemModels.generateFlatItem(ModItems.LIGHT_PURPLE_DYE.get(), ModelTemplates.FLAT_ITEM);

        blockModels.createTrivialCube(ModBlocks.BLUE_PLANKS.get());
        blockModels.createTrivialCube(ModBlocks.BLACK_PLANKS.get());
        blockModels.createTrivialCube(ModBlocks.BROWN_PLANKS.get());
        blockModels.createTrivialCube(ModBlocks.CYAN_PLANKS.get());
        blockModels.createTrivialCube(ModBlocks.GRAY_PLANKS.get());
        blockModels.createTrivialCube(ModBlocks.GREEN_PLANKS.get());
        blockModels.createTrivialCube(ModBlocks.LIGHT_BLUE_PLANKS.get());
        blockModels.createTrivialCube(ModBlocks.LIGHT_GRAY_PLANKS.get());
        blockModels.createTrivialCube(ModBlocks.LIGHT_PURPLE_PLANKS.get());
        blockModels.createTrivialCube(ModBlocks.LIME_PLANKS.get());
        blockModels.createTrivialCube(ModBlocks.MAGENTA_PLANKS.get());
        blockModels.createTrivialCube(ModBlocks.ORANGE_PLANKS.get());
        blockModels.createTrivialCube(ModBlocks.PINK_PLANKS.get());
        blockModels.createTrivialCube(ModBlocks.PURPLE_PLANKS.get());
        blockModels.createTrivialCube(ModBlocks.RED_PLANKS.get());
        blockModels.createTrivialCube(ModBlocks.WHITE_PLANKS.get());
        blockModels.createTrivialCube(ModBlocks.YELLOW_PLANKS.get());
    }
}
