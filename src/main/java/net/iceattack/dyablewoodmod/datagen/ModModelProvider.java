package net.iceattack.dyablewoodmod.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.iceattack.dyablewoodmod.block.ModBlocks;
import net.iceattack.dyablewoodmod.item.ModItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        // blockModelGenerators.createTrivialCube(ModBlocks.BLUE_PLANKS);
        // blockModelGenerators.createTrivialCube(ModBlocks.BLACK_PLANKS);
        // blockModelGenerators.createTrivialCube(ModBlocks.BROWN_PLANKS);
        // blockModelGenerators.createTrivialCube(ModBlocks.CYAN_PLANKS);
        // blockModelGenerators.createTrivialCube(ModBlocks.GRAY_PLANKS);
        // blockModelGenerators.createTrivialCube(ModBlocks.GREEN_PLANKS);
        // blockModelGenerators.createTrivialCube(ModBlocks.LIGHT_BLUE_PLANKS);
        // blockModelGenerators.createTrivialCube(ModBlocks.LIGHT_GRAY_PLANKS);
        // blockModelGenerators.createTrivialCube(ModBlocks.LIGHT_PURPLE_PLANKS);
        // blockModelGenerators.createTrivialCube(ModBlocks.LIME_PLANKS);
        // blockModelGenerators.createTrivialCube(ModBlocks.MAGENTA_PLANKS);
        // blockModelGenerators.createTrivialCube(ModBlocks.ORANGE_PLANKS);
        // blockModelGenerators.createTrivialCube(ModBlocks.PINK_PLANKS);
        // blockModelGenerators.createTrivialCube(ModBlocks.PURPLE_PLANKS);
        // blockModelGenerators.createTrivialCube(ModBlocks.RED_PLANKS);
        // blockModelGenerators.createTrivialCube(ModBlocks.WHITE_PLANKS);
        // blockModelGenerators.createTrivialCube(ModBlocks.YELLOW_PLANKS);

        blockModelGenerators.family(ModBlocks.BLUE_PLANKS)
                .stairs(ModBlocks.BLUE_WOOD_STAIRS)
                .slab(ModBlocks.BLUE_WOOD_SLAB)
                .button(ModBlocks.BLUE_WOOD_BUTTON)
                .pressurePlate(ModBlocks.BLUE_WOOD_PRESSURE_PLATE)
                .fence(ModBlocks.BLUE_WOOD_FENCE)
                .fenceGate(ModBlocks.BLUE_WOOD_FENCE_GATE);
        blockModelGenerators.family(ModBlocks.BLACK_PLANKS)
                .stairs(ModBlocks.BLACK_WOOD_STAIRS)
                .slab(ModBlocks.BLACK_WOOD_SLAB)
                .button(ModBlocks.BLACK_WOOD_BUTTON)
                .pressurePlate(ModBlocks.BLACK_WOOD_PRESSURE_PLATE)
                .fence(ModBlocks.BLACK_WOOD_FENCE)
                .fenceGate(ModBlocks.BLACK_WOOD_FENCE_GATE);
        blockModelGenerators.family(ModBlocks.BROWN_PLANKS)
                .stairs(ModBlocks.BROWN_WOOD_STAIRS)
                .slab(ModBlocks.BROWN_WOOD_SLAB)
                .button(ModBlocks.BROWN_WOOD_BUTTON)
                .pressurePlate(ModBlocks.BROWN_WOOD_PRESSURE_PLATE)
                .fence(ModBlocks.BROWN_WOOD_FENCE)
                .fenceGate(ModBlocks.BROWN_WOOD_FENCE_GATE);
        blockModelGenerators.family(ModBlocks.CYAN_PLANKS)
                .stairs(ModBlocks.CYAN_WOOD_STAIRS)
                .slab(ModBlocks.CYAN_WOOD_SLAB)
                .button(ModBlocks.CYAN_WOOD_BUTTON)
                .pressurePlate(ModBlocks.CYAN_WOOD_PRESSURE_PLATE)
                .fence(ModBlocks.CYAN_WOOD_FENCE)
                .fenceGate(ModBlocks.CYAN_WOOD_FENCE_GATE);
        blockModelGenerators.family(ModBlocks.GRAY_PLANKS)
                .stairs(ModBlocks.GRAY_WOOD_STAIRS)
                .slab(ModBlocks.GRAY_WOOD_SLAB)
                .button(ModBlocks.GRAY_WOOD_BUTTON)
                .pressurePlate(ModBlocks.GRAY_WOOD_PRESSURE_PLATE)
                .fence(ModBlocks.GRAY_WOOD_FENCE)
                .fenceGate(ModBlocks.GRAY_WOOD_FENCE_GATE);
        blockModelGenerators.family(ModBlocks.GREEN_PLANKS)
                .stairs(ModBlocks.GREEN_WOOD_STAIRS)
                .slab(ModBlocks.GREEN_WOOD_SLAB)
                .button(ModBlocks.GREEN_WOOD_BUTTON)
                .pressurePlate(ModBlocks.GREEN_WOOD_PRESSURE_PLATE)
                .fence(ModBlocks.GREEN_WOOD_FENCE)
                .fenceGate(ModBlocks.GREEN_WOOD_FENCE_GATE);
        blockModelGenerators.family(ModBlocks.LIGHT_BLUE_PLANKS)
                .stairs(ModBlocks.LIGHT_BLUE_WOOD_STAIRS)
                .slab(ModBlocks.LIGHT_BLUE_WOOD_SLAB)
                .button(ModBlocks.LIGHT_BLUE_WOOD_BUTTON)
                .pressurePlate(ModBlocks.LIGHT_BLUE_WOOD_PRESSURE_PLATE)
                .fence(ModBlocks.LIGHT_BLUE_WOOD_FENCE)
                .fenceGate(ModBlocks.LIGHT_BLUE_WOOD_FENCE_GATE);
        blockModelGenerators.family(ModBlocks.LIGHT_GRAY_PLANKS)
                .stairs(ModBlocks.LIGHT_GRAY_WOOD_STAIRS)
                .slab(ModBlocks.LIGHT_GRAY_WOOD_SLAB)
                .button(ModBlocks.LIGHT_GRAY_WOOD_BUTTON)
                .pressurePlate(ModBlocks.LIGHT_GRAY_WOOD_PRESSURE_PLATE)
                .fence(ModBlocks.LIGHT_GRAY_WOOD_FENCE)
                .fenceGate(ModBlocks.LIGHT_GRAY_WOOD_FENCE_GATE);
        blockModelGenerators.family(ModBlocks.LIGHT_PURPLE_PLANKS)
                .stairs(ModBlocks.LIGHT_PURPLE_WOOD_STAIRS)
                .slab(ModBlocks.LIGHT_PURPLE_WOOD_SLAB)
                .button(ModBlocks.LIGHT_PURPLE_WOOD_BUTTON)
                .pressurePlate(ModBlocks.LIGHT_PURPLE_WOOD_PRESSURE_PLATE)
                .fence(ModBlocks.LIGHT_PURPLE_WOOD_FENCE)
                .fenceGate(ModBlocks.LIGHT_PURPLE_WOOD_FENCE_GATE);
        blockModelGenerators.family(ModBlocks.LIME_PLANKS)
                .stairs(ModBlocks.LIME_WOOD_STAIRS)
                .slab(ModBlocks.LIME_WOOD_SLAB)
                .button(ModBlocks.LIME_WOOD_BUTTON)
                .pressurePlate(ModBlocks.LIME_WOOD_PRESSURE_PLATE)
                .fence(ModBlocks.LIME_WOOD_FENCE)
                .fenceGate(ModBlocks.LIME_WOOD_FENCE_GATE);
        blockModelGenerators.family(ModBlocks.MAGENTA_PLANKS)
                .stairs(ModBlocks.MAGENTA_WOOD_STAIRS)
                .slab(ModBlocks.MAGENTA_WOOD_SLAB)
                .button(ModBlocks.MAGENTA_WOOD_BUTTON)
                .pressurePlate(ModBlocks.MAGENTA_WOOD_PRESSURE_PLATE);
        blockModelGenerators.family(ModBlocks.ORANGE_PLANKS)
                .stairs(ModBlocks.ORANGE_WOOD_STAIRS)
                .slab(ModBlocks.ORANGE_WOOD_SLAB)
                .button(ModBlocks.ORANGE_WOOD_BUTTON)
                .pressurePlate(ModBlocks.ORANGE_WOOD_PRESSURE_PLATE);
        blockModelGenerators.family(ModBlocks.PINK_PLANKS)
                .stairs(ModBlocks.PINK_WOOD_STAIRS)
                .slab(ModBlocks.PINK_WOOD_SLAB)
                .button(ModBlocks.PINK_WOOD_BUTTON)
                .pressurePlate(ModBlocks.PINK_WOOD_PRESSURE_PLATE);
        blockModelGenerators.family(ModBlocks.PURPLE_PLANKS)
                .stairs(ModBlocks.PURPLE_WOOD_STAIRS)
                .slab(ModBlocks.PURPLE_WOOD_SLAB)
                .button(ModBlocks.PURPLE_WOOD_BUTTON)
                .pressurePlate(ModBlocks.PURPLE_WOOD_PRESSURE_PLATE);
        blockModelGenerators.family(ModBlocks.RED_PLANKS)
                .stairs(ModBlocks.RED_WOOD_STAIRS)
                .slab(ModBlocks.RED_WOOD_SLAB)
                .button(ModBlocks.RED_WOOD_BUTTON)
                .pressurePlate(ModBlocks.RED_WOOD_PRESSURE_PLATE);
        blockModelGenerators.family(ModBlocks.WHITE_PLANKS)
                .stairs(ModBlocks.WHITE_WOOD_STAIRS)
                .slab(ModBlocks.WHITE_WOOD_SLAB)
                .button(ModBlocks.WHITE_WOOD_BUTTON)
                .pressurePlate(ModBlocks.WHITE_WOOD_PRESSURE_PLATE);
        blockModelGenerators.family(ModBlocks.YELLOW_PLANKS)
                .stairs(ModBlocks.YELLOW_WOOD_STAIRS)
                .slab(ModBlocks.YELLOW_WOOD_SLAB)
                .button(ModBlocks.YELLOW_WOOD_BUTTON)
                .pressurePlate(ModBlocks.YELLOW_WOOD_PRESSURE_PLATE);

    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(ModItems.LIGHT_PURPLE_DYE, ModelTemplates.FLAT_ITEM);

    }
}
