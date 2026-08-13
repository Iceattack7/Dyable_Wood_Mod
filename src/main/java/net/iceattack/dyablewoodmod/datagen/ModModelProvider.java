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

        // blockModels.createTrivialCube(ModBlocks.BLUE_PLANKS.get());
        // blockModels.createTrivialCube(ModBlocks.BLACK_PLANKS.get());
        // blockModels.createTrivialCube(ModBlocks.BROWN_PLANKS.get());
        // blockModels.createTrivialCube(ModBlocks.CYAN_PLANKS.get());
        //blockModels.createTrivialCube(ModBlocks.GRAY_PLANKS.get());
        // blockModels.createTrivialCube(ModBlocks.GREEN_PLANKS.get());
        // blockModels.createTrivialCube(ModBlocks.LIGHT_BLUE_PLANKS.get());
        // blockModels.createTrivialCube(ModBlocks.LIGHT_GRAY_PLANKS.get());
        // blockModels.createTrivialCube(ModBlocks.LIGHT_PURPLE_PLANKS.get());
        // blockModels.createTrivialCube(ModBlocks.LIME_PLANKS.get());
        // blockModels.createTrivialCube(ModBlocks.MAGENTA_PLANKS.get());
        // blockModels.createTrivialCube(ModBlocks.ORANGE_PLANKS.get());
        // blockModels.createTrivialCube(ModBlocks.PINK_PLANKS.get());
        //blockModels.createTrivialCube(ModBlocks.PURPLE_PLANKS.get());
        // blockModels.createTrivialCube(ModBlocks.RED_PLANKS.get());
        // blockModels.createTrivialCube(ModBlocks.WHITE_PLANKS.get());
        //blockModels.createTrivialCube(ModBlocks.YELLOW_PLANKS.get());

        blockModels.family(ModBlocks.BLUE_PLANKS.get())
                .stairs(ModBlocks.BLUE_WOOD_STAIRS.get())
                .slab(ModBlocks.BLUE_WOOD_SLAB.get())
                .button(ModBlocks.BLUE_WOOD_BUTTON.get())
                .pressurePlate(ModBlocks.BLUE_WOOD_PRESSURE_PLATE.get());

        blockModels.family(ModBlocks.BLACK_PLANKS.get())
                .stairs(ModBlocks.BLACK_WOOD_STAIRS.get())
                .slab(ModBlocks.BLACK_WOOD_SLAB.get());

        blockModels.family(ModBlocks.BROWN_PLANKS.get())
                .stairs(ModBlocks.BROWN_WOOD_STAIRS.get())
                .slab(ModBlocks.BROWN_WOOD_SLAB.get());

        blockModels.family(ModBlocks.CYAN_PLANKS.get())
                .stairs(ModBlocks.CYAN_WOOD_STAIRS.get())
                .slab(ModBlocks.CYAN_WOOD_SLAB.get());

        blockModels.family(ModBlocks.GRAY_PLANKS.get())
                .stairs(ModBlocks.GRAY_WOOD_STAIRS.get())
                .slab(ModBlocks.GRAY_WOOD_SLAB.get());

        blockModels.family(ModBlocks.GREEN_PLANKS.get())
                .stairs(ModBlocks.GREEN_WOOD_STAIRS.get())
                .slab(ModBlocks.GREEN_WOOD_SLAB.get());

        blockModels.family(ModBlocks.LIGHT_BLUE_PLANKS.get())
                .stairs(ModBlocks.LIGHT_BLUE_WOOD_STAIRS.get())
                .slab(ModBlocks.LIGHT_BLUE_WOOD_SLAB.get());

        blockModels.family(ModBlocks.LIGHT_GRAY_PLANKS.get())
                .stairs(ModBlocks.LIGHT_GRAY_WOOD_STAIRS.get())
                .slab(ModBlocks.LIGHT_GRAY_WOOD_SLAB.get());

        blockModels.family(ModBlocks.LIGHT_PURPLE_PLANKS.get())
                .stairs(ModBlocks.LIGHT_PURPLE_WOOD_STAIRS.get())
                .slab(ModBlocks.LIGHT_PURPLE_WOOD_SLAB.get());

        blockModels.family(ModBlocks.LIME_PLANKS.get())
                .stairs(ModBlocks.LIME_WOOD_STAIRS.get())
                .slab(ModBlocks.LIME_WOOD_SLAB.get());

        blockModels.family(ModBlocks.MAGENTA_PLANKS.get())
                .stairs(ModBlocks.MAGENTA_WOOD_STAIRS.get())
                .slab(ModBlocks.MAGENTA_WOOD_SLAB.get());

        blockModels.family(ModBlocks.ORANGE_PLANKS.get())
                .stairs(ModBlocks.ORANGE_WOOD_STAIRS.get())
                .slab(ModBlocks.ORANGE_WOOD_SLAB.get());

        blockModels.family(ModBlocks.PINK_PLANKS.get())
                .stairs(ModBlocks.PINK_WOOD_STAIRS.get())
                .slab(ModBlocks.PINK_WOOD_SLAB.get());

        blockModels.family(ModBlocks.PURPLE_PLANKS.get())
                .stairs(ModBlocks.PURPLE_WOOD_STAIRS.get())
                .slab(ModBlocks.PURPLE_WOOD_SLAB.get());

        blockModels.family(ModBlocks.RED_PLANKS.get())
                .stairs(ModBlocks.RED_WOOD_STAIRS.get())
                .slab(ModBlocks.RED_WOOD_SLAB.get());

        blockModels.family(ModBlocks.WHITE_PLANKS.get())
                .stairs(ModBlocks.WHITE_WOOD_STAIRS.get())
                .slab(ModBlocks.WHITE_WOOD_SLAB.get());

        blockModels.family(ModBlocks.YELLOW_PLANKS.get())
                .stairs(ModBlocks.YELLOW_WOOD_STAIRS.get())
                .slab(ModBlocks.YELLOW_WOOD_SLAB.get());
    }
}
