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

        blockModelGenerators.createDoor(ModBlocks.BLUE_ACACIA_DOOR);
        blockModelGenerators.createOrientableTrapdoor(ModBlocks.BLUE_ACACIA_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.BLUE_BIRCH_DOOR);
        blockModelGenerators.createOrientableTrapdoor(ModBlocks.BLUE_BIRCH_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.BLUE_DARK_OAK_DOOR);
        blockModelGenerators.createTrapdoor(ModBlocks.BLUE_DARK_OAK_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.BLUE_JUNGLE_DOOR);
        blockModelGenerators.createOrientableTrapdoor(ModBlocks.BLUE_JUNGLE_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.BLUE_OAK_DOOR);
        blockModelGenerators.createTrapdoor(ModBlocks.BLUE_OAK_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.BLUE_SPRUCE_DOOR);
        blockModelGenerators.createOrientableTrapdoor(ModBlocks.BLUE_SPRUCE_TRAPDOOR);

        blockModelGenerators.family(ModBlocks.BLACK_PLANKS)
                .stairs(ModBlocks.BLACK_WOOD_STAIRS)
                .slab(ModBlocks.BLACK_WOOD_SLAB)
                .button(ModBlocks.BLACK_WOOD_BUTTON)
                .pressurePlate(ModBlocks.BLACK_WOOD_PRESSURE_PLATE)
                .fence(ModBlocks.BLACK_WOOD_FENCE)
                .fenceGate(ModBlocks.BLACK_WOOD_FENCE_GATE);

        blockModelGenerators.createDoor(ModBlocks.BLACK_ACACIA_DOOR);
        blockModelGenerators.createOrientableTrapdoor(ModBlocks.BLACK_ACACIA_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.BLACK_BIRCH_DOOR);
        blockModelGenerators.createOrientableTrapdoor(ModBlocks.BLACK_BIRCH_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.BLACK_DARK_OAK_DOOR);
        blockModelGenerators.createTrapdoor(ModBlocks.BLACK_DARK_OAK_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.BLACK_JUNGLE_DOOR);
        blockModelGenerators.createOrientableTrapdoor(ModBlocks.BLACK_JUNGLE_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.BLACK_OAK_DOOR);
        blockModelGenerators.createTrapdoor(ModBlocks.BLACK_OAK_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.BLACK_SPRUCE_DOOR);

        blockModelGenerators.family(ModBlocks.BROWN_PLANKS)
                .stairs(ModBlocks.BROWN_WOOD_STAIRS)
                .slab(ModBlocks.BROWN_WOOD_SLAB)
                .button(ModBlocks.BROWN_WOOD_BUTTON)
                .pressurePlate(ModBlocks.BROWN_WOOD_PRESSURE_PLATE)
                .fence(ModBlocks.BROWN_WOOD_FENCE)
                .fenceGate(ModBlocks.BROWN_WOOD_FENCE_GATE);

        blockModelGenerators.createOrientableTrapdoor(ModBlocks.BLACK_SPRUCE_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.BROWN_ACACIA_DOOR);
        blockModelGenerators.createOrientableTrapdoor(ModBlocks.BROWN_ACACIA_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.BROWN_BIRCH_DOOR);
        blockModelGenerators.createOrientableTrapdoor(ModBlocks.BROWN_BIRCH_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.BROWN_DARK_OAK_DOOR);
        blockModelGenerators.createTrapdoor(ModBlocks.BROWN_DARK_OAK_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.BROWN_JUNGLE_DOOR);
        blockModelGenerators.createOrientableTrapdoor(ModBlocks.BROWN_JUNGLE_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.BROWN_OAK_DOOR);
        blockModelGenerators.createTrapdoor(ModBlocks.BROWN_OAK_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.BROWN_SPRUCE_DOOR);
        blockModelGenerators.createOrientableTrapdoor(ModBlocks.BROWN_SPRUCE_TRAPDOOR);

        blockModelGenerators.family(ModBlocks.CYAN_PLANKS)
                .stairs(ModBlocks.CYAN_WOOD_STAIRS)
                .slab(ModBlocks.CYAN_WOOD_SLAB)
                .button(ModBlocks.CYAN_WOOD_BUTTON)
                .pressurePlate(ModBlocks.CYAN_WOOD_PRESSURE_PLATE)
                .fence(ModBlocks.CYAN_WOOD_FENCE)
                .fenceGate(ModBlocks.CYAN_WOOD_FENCE_GATE);

        blockModelGenerators.createDoor(ModBlocks.CYAN_ACACIA_DOOR);
        blockModelGenerators.createOrientableTrapdoor(ModBlocks.CYAN_ACACIA_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.CYAN_BIRCH_DOOR);
        blockModelGenerators.createOrientableTrapdoor(ModBlocks.CYAN_BIRCH_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.CYAN_DARK_OAK_DOOR);
        blockModelGenerators.createTrapdoor(ModBlocks.CYAN_DARK_OAK_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.CYAN_JUNGLE_DOOR);
        blockModelGenerators.createOrientableTrapdoor(ModBlocks.CYAN_JUNGLE_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.CYAN_OAK_DOOR);
        blockModelGenerators.createTrapdoor(ModBlocks.CYAN_OAK_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.CYAN_SPRUCE_DOOR);
        blockModelGenerators.createOrientableTrapdoor(ModBlocks.CYAN_SPRUCE_TRAPDOOR);

        blockModelGenerators.family(ModBlocks.GRAY_PLANKS)
                .stairs(ModBlocks.GRAY_WOOD_STAIRS)
                .slab(ModBlocks.GRAY_WOOD_SLAB)
                .button(ModBlocks.GRAY_WOOD_BUTTON)
                .pressurePlate(ModBlocks.GRAY_WOOD_PRESSURE_PLATE)
                .fence(ModBlocks.GRAY_WOOD_FENCE)
                .fenceGate(ModBlocks.GRAY_WOOD_FENCE_GATE);

        blockModelGenerators.createDoor(ModBlocks.GRAY_ACACIA_DOOR);
        blockModelGenerators.createOrientableTrapdoor(ModBlocks.GRAY_ACACIA_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.GRAY_BIRCH_DOOR);
        blockModelGenerators.createOrientableTrapdoor(ModBlocks.GRAY_BIRCH_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.GRAY_DARK_OAK_DOOR);
        blockModelGenerators.createTrapdoor(ModBlocks.GRAY_DARK_OAK_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.GRAY_JUNGLE_DOOR);
        blockModelGenerators.createOrientableTrapdoor(ModBlocks.GRAY_JUNGLE_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.GRAY_OAK_DOOR);
        blockModelGenerators.createTrapdoor(ModBlocks.GRAY_OAK_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.GRAY_SPRUCE_DOOR);
        blockModelGenerators.createOrientableTrapdoor(ModBlocks.GRAY_SPRUCE_TRAPDOOR);

        blockModelGenerators.family(ModBlocks.GREEN_PLANKS)
                .stairs(ModBlocks.GREEN_WOOD_STAIRS)
                .slab(ModBlocks.GREEN_WOOD_SLAB)
                .button(ModBlocks.GREEN_WOOD_BUTTON)
                .pressurePlate(ModBlocks.GREEN_WOOD_PRESSURE_PLATE)
                .fence(ModBlocks.GREEN_WOOD_FENCE)
                .fenceGate(ModBlocks.GREEN_WOOD_FENCE_GATE);

        blockModelGenerators.createDoor(ModBlocks.GREEN_ACACIA_DOOR);
        blockModelGenerators.createOrientableTrapdoor(ModBlocks.GREEN_ACACIA_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.GREEN_BIRCH_DOOR);
        blockModelGenerators.createOrientableTrapdoor(ModBlocks.GREEN_BIRCH_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.GREEN_DARK_OAK_DOOR);
        blockModelGenerators.createTrapdoor(ModBlocks.GREEN_DARK_OAK_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.GREEN_JUNGLE_DOOR);
        blockModelGenerators.createOrientableTrapdoor(ModBlocks.GREEN_JUNGLE_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.GREEN_OAK_DOOR);
        blockModelGenerators.createTrapdoor(ModBlocks.GREEN_OAK_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.GREEN_SPRUCE_DOOR);
        blockModelGenerators.createOrientableTrapdoor(ModBlocks.GREEN_SPRUCE_TRAPDOOR);

        blockModelGenerators.family(ModBlocks.LIGHT_BLUE_PLANKS)
                .stairs(ModBlocks.LIGHT_BLUE_WOOD_STAIRS)
                .slab(ModBlocks.LIGHT_BLUE_WOOD_SLAB)
                .button(ModBlocks.LIGHT_BLUE_WOOD_BUTTON)
                .pressurePlate(ModBlocks.LIGHT_BLUE_WOOD_PRESSURE_PLATE)
                .fence(ModBlocks.LIGHT_BLUE_WOOD_FENCE)
                .fenceGate(ModBlocks.LIGHT_BLUE_WOOD_FENCE_GATE);

        blockModelGenerators.createDoor(ModBlocks.LIGHT_BLUE_ACACIA_DOOR);
        blockModelGenerators.createOrientableTrapdoor(ModBlocks.LIGHT_BLUE_ACACIA_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.LIGHT_BLUE_BIRCH_DOOR);
        blockModelGenerators.createOrientableTrapdoor(ModBlocks.LIGHT_BLUE_BIRCH_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.LIGHT_BLUE_DARK_OAK_DOOR);
        blockModelGenerators.createTrapdoor(ModBlocks.LIGHT_BLUE_DARK_OAK_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.LIGHT_BLUE_JUNGLE_DOOR);
        blockModelGenerators.createOrientableTrapdoor(ModBlocks.LIGHT_BLUE_JUNGLE_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.LIGHT_BLUE_OAK_DOOR);
        blockModelGenerators.createTrapdoor(ModBlocks.LIGHT_BLUE_OAK_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.LIGHT_BLUE_SPRUCE_DOOR);
        blockModelGenerators.createOrientableTrapdoor(ModBlocks.LIGHT_BLUE_SPRUCE_TRAPDOOR);

        blockModelGenerators.family(ModBlocks.LIGHT_GRAY_PLANKS)
                .stairs(ModBlocks.LIGHT_GRAY_WOOD_STAIRS)
                .slab(ModBlocks.LIGHT_GRAY_WOOD_SLAB)
                .button(ModBlocks.LIGHT_GRAY_WOOD_BUTTON)
                .pressurePlate(ModBlocks.LIGHT_GRAY_WOOD_PRESSURE_PLATE)
                .fence(ModBlocks.LIGHT_GRAY_WOOD_FENCE)
                .fenceGate(ModBlocks.LIGHT_GRAY_WOOD_FENCE_GATE);

        blockModelGenerators.createDoor(ModBlocks.LIGHT_GRAY_ACACIA_DOOR);
        blockModelGenerators.createOrientableTrapdoor(ModBlocks.LIGHT_GRAY_ACACIA_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.LIGHT_GRAY_BIRCH_DOOR);
        blockModelGenerators.createOrientableTrapdoor(ModBlocks.LIGHT_GRAY_BIRCH_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.LIGHT_GRAY_DARK_OAK_DOOR);
        blockModelGenerators.createTrapdoor(ModBlocks.LIGHT_GRAY_DARK_OAK_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.LIGHT_GRAY_JUNGLE_DOOR);
        blockModelGenerators.createOrientableTrapdoor(ModBlocks.LIGHT_GRAY_JUNGLE_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.LIGHT_GRAY_OAK_DOOR);
        blockModelGenerators.createTrapdoor(ModBlocks.LIGHT_GRAY_OAK_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.LIGHT_GRAY_SPRUCE_DOOR);
        blockModelGenerators.createOrientableTrapdoor(ModBlocks.LIGHT_GRAY_SPRUCE_TRAPDOOR);

        blockModelGenerators.family(ModBlocks.LIGHT_PURPLE_PLANKS)
                .stairs(ModBlocks.LIGHT_PURPLE_WOOD_STAIRS)
                .slab(ModBlocks.LIGHT_PURPLE_WOOD_SLAB)
                .button(ModBlocks.LIGHT_PURPLE_WOOD_BUTTON)
                .pressurePlate(ModBlocks.LIGHT_PURPLE_WOOD_PRESSURE_PLATE)
                .fence(ModBlocks.LIGHT_PURPLE_WOOD_FENCE)
                .fenceGate(ModBlocks.LIGHT_PURPLE_WOOD_FENCE_GATE);

        blockModelGenerators.createDoor(ModBlocks.LIGHT_PURPLE_ACACIA_DOOR);
        blockModelGenerators.createOrientableTrapdoor(ModBlocks.LIGHT_PURPLE_ACACIA_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.LIGHT_PURPLE_BIRCH_DOOR);
        blockModelGenerators.createOrientableTrapdoor(ModBlocks.LIGHT_PURPLE_BIRCH_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.LIGHT_PURPLE_DARK_OAK_DOOR);
        blockModelGenerators.createTrapdoor(ModBlocks.LIGHT_PURPLE_DARK_OAK_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.LIGHT_PURPLE_JUNGLE_DOOR);
        blockModelGenerators.createOrientableTrapdoor(ModBlocks.LIGHT_PURPLE_JUNGLE_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.LIGHT_PURPLE_OAK_DOOR);
        blockModelGenerators.createTrapdoor(ModBlocks.LIGHT_PURPLE_OAK_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.LIGHT_PURPLE_SPRUCE_DOOR);
        blockModelGenerators.createOrientableTrapdoor(ModBlocks.LIGHT_PURPLE_SPRUCE_TRAPDOOR);

        blockModelGenerators.family(ModBlocks.LIME_PLANKS)
                .stairs(ModBlocks.LIME_WOOD_STAIRS)
                .slab(ModBlocks.LIME_WOOD_SLAB)
                .button(ModBlocks.LIME_WOOD_BUTTON)
                .pressurePlate(ModBlocks.LIME_WOOD_PRESSURE_PLATE)
                .fence(ModBlocks.LIME_WOOD_FENCE)
                .fenceGate(ModBlocks.LIME_WOOD_FENCE_GATE);

        blockModelGenerators.createDoor(ModBlocks.LIME_ACACIA_DOOR);
        blockModelGenerators.createOrientableTrapdoor(ModBlocks.LIME_ACACIA_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.LIME_BIRCH_DOOR);
        blockModelGenerators.createOrientableTrapdoor(ModBlocks.LIME_BIRCH_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.LIME_DARK_OAK_DOOR);
        blockModelGenerators.createTrapdoor(ModBlocks.LIME_DARK_OAK_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.LIME_JUNGLE_DOOR);
        blockModelGenerators.createOrientableTrapdoor(ModBlocks.LIME_JUNGLE_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.LIME_OAK_DOOR);
        blockModelGenerators.createTrapdoor(ModBlocks.LIME_OAK_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.LIME_SPRUCE_DOOR);
        blockModelGenerators.createOrientableTrapdoor(ModBlocks.LIME_SPRUCE_TRAPDOOR);

        blockModelGenerators.family(ModBlocks.MAGENTA_PLANKS)
                .stairs(ModBlocks.MAGENTA_WOOD_STAIRS)
                .slab(ModBlocks.MAGENTA_WOOD_SLAB)
                .button(ModBlocks.MAGENTA_WOOD_BUTTON)
                .pressurePlate(ModBlocks.MAGENTA_WOOD_PRESSURE_PLATE)
                .fence(ModBlocks.MAGENTA_WOOD_FENCE)
                .fenceGate(ModBlocks.MAGENTA_WOOD_FENCE_GATE);

        blockModelGenerators.createDoor(ModBlocks.MAGENTA_ACACIA_DOOR);
        blockModelGenerators.createOrientableTrapdoor(ModBlocks.MAGENTA_ACACIA_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.MAGENTA_BIRCH_DOOR);
        blockModelGenerators.createOrientableTrapdoor(ModBlocks.MAGENTA_BIRCH_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.MAGENTA_DARK_OAK_DOOR);
        blockModelGenerators.createTrapdoor(ModBlocks.MAGENTA_DARK_OAK_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.MAGENTA_JUNGLE_DOOR);
        blockModelGenerators.createOrientableTrapdoor(ModBlocks.MAGENTA_JUNGLE_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.MAGENTA_OAK_DOOR);
        blockModelGenerators.createTrapdoor(ModBlocks.MAGENTA_OAK_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.MAGENTA_SPRUCE_DOOR);
        blockModelGenerators.createOrientableTrapdoor(ModBlocks.MAGENTA_SPRUCE_TRAPDOOR);

        blockModelGenerators.family(ModBlocks.ORANGE_PLANKS)
                .stairs(ModBlocks.ORANGE_WOOD_STAIRS)
                .slab(ModBlocks.ORANGE_WOOD_SLAB)
                .button(ModBlocks.ORANGE_WOOD_BUTTON)
                .pressurePlate(ModBlocks.ORANGE_WOOD_PRESSURE_PLATE)
                .fence(ModBlocks.ORANGE_WOOD_FENCE)
                .fenceGate(ModBlocks.ORANGE_WOOD_FENCE_GATE);

        blockModelGenerators.createDoor(ModBlocks.ORANGE_ACACIA_DOOR);
        blockModelGenerators.createOrientableTrapdoor(ModBlocks.ORANGE_ACACIA_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.ORANGE_BIRCH_DOOR);
        blockModelGenerators.createOrientableTrapdoor(ModBlocks.ORANGE_BIRCH_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.ORANGE_DARK_OAK_DOOR);
        blockModelGenerators.createTrapdoor(ModBlocks.ORANGE_DARK_OAK_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.ORANGE_JUNGLE_DOOR);
        blockModelGenerators.createOrientableTrapdoor(ModBlocks.ORANGE_JUNGLE_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.ORANGE_OAK_DOOR);
        blockModelGenerators.createTrapdoor(ModBlocks.ORANGE_OAK_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.ORANGE_SPRUCE_DOOR);
        blockModelGenerators.createOrientableTrapdoor(ModBlocks.ORANGE_SPRUCE_TRAPDOOR);

        blockModelGenerators.family(ModBlocks.PINK_PLANKS)
                .stairs(ModBlocks.PINK_WOOD_STAIRS)
                .slab(ModBlocks.PINK_WOOD_SLAB)
                .button(ModBlocks.PINK_WOOD_BUTTON)
                .pressurePlate(ModBlocks.PINK_WOOD_PRESSURE_PLATE)
                .fence(ModBlocks.PINK_WOOD_FENCE)
                .fenceGate(ModBlocks.PINK_WOOD_FENCE_GATE);

        blockModelGenerators.createDoor(ModBlocks.PINK_ACACIA_DOOR);
        blockModelGenerators.createOrientableTrapdoor(ModBlocks.PINK_ACACIA_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.PINK_BIRCH_DOOR);
        blockModelGenerators.createOrientableTrapdoor(ModBlocks.PINK_BIRCH_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.PINK_DARK_OAK_DOOR);
        blockModelGenerators.createTrapdoor(ModBlocks.PINK_DARK_OAK_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.PINK_JUNGLE_DOOR);
        blockModelGenerators.createOrientableTrapdoor(ModBlocks.PINK_JUNGLE_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.PINK_OAK_DOOR);
        blockModelGenerators.createTrapdoor(ModBlocks.PINK_OAK_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.PINK_SPRUCE_DOOR);
        blockModelGenerators.createOrientableTrapdoor(ModBlocks.PINK_SPRUCE_TRAPDOOR);

        blockModelGenerators.family(ModBlocks.PURPLE_PLANKS)
                .stairs(ModBlocks.PURPLE_WOOD_STAIRS)
                .slab(ModBlocks.PURPLE_WOOD_SLAB)
                .button(ModBlocks.PURPLE_WOOD_BUTTON)
                .pressurePlate(ModBlocks.PURPLE_WOOD_PRESSURE_PLATE)
                .fence(ModBlocks.PURPLE_WOOD_FENCE)
                .fenceGate(ModBlocks.PURPLE_WOOD_FENCE_GATE);

        blockModelGenerators.createDoor(ModBlocks.PURPLE_ACACIA_DOOR);
        blockModelGenerators.createOrientableTrapdoor(ModBlocks.PURPLE_ACACIA_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.PURPLE_BIRCH_DOOR);
        blockModelGenerators.createOrientableTrapdoor(ModBlocks.PURPLE_BIRCH_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.PURPLE_DARK_OAK_DOOR);
        blockModelGenerators.createTrapdoor(ModBlocks.PURPLE_DARK_OAK_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.PURPLE_JUNGLE_DOOR);
        blockModelGenerators.createOrientableTrapdoor(ModBlocks.PURPLE_JUNGLE_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.PURPLE_OAK_DOOR);
        blockModelGenerators.createTrapdoor(ModBlocks.PURPLE_OAK_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.PURPLE_SPRUCE_DOOR);
        blockModelGenerators.createOrientableTrapdoor(ModBlocks.PURPLE_SPRUCE_TRAPDOOR);

        blockModelGenerators.family(ModBlocks.RED_PLANKS)
                .stairs(ModBlocks.RED_WOOD_STAIRS)
                .slab(ModBlocks.RED_WOOD_SLAB)
                .button(ModBlocks.RED_WOOD_BUTTON)
                .pressurePlate(ModBlocks.RED_WOOD_PRESSURE_PLATE)
                .fence(ModBlocks.RED_WOOD_FENCE)
                .fenceGate(ModBlocks.RED_WOOD_FENCE_GATE);
        blockModelGenerators.family(ModBlocks.WHITE_PLANKS)
                .stairs(ModBlocks.WHITE_WOOD_STAIRS)
                .slab(ModBlocks.WHITE_WOOD_SLAB)
                .button(ModBlocks.WHITE_WOOD_BUTTON)
                .pressurePlate(ModBlocks.WHITE_WOOD_PRESSURE_PLATE)
                .fence(ModBlocks.WHITE_WOOD_FENCE)
                .fenceGate(ModBlocks.WHITE_WOOD_FENCE_GATE);
        blockModelGenerators.family(ModBlocks.YELLOW_PLANKS)
                .stairs(ModBlocks.YELLOW_WOOD_STAIRS)
                .slab(ModBlocks.YELLOW_WOOD_SLAB)
                .button(ModBlocks.YELLOW_WOOD_BUTTON)
                .pressurePlate(ModBlocks.YELLOW_WOOD_PRESSURE_PLATE)
                .fence(ModBlocks.YELLOW_WOOD_FENCE)
                .fenceGate(ModBlocks.YELLOW_WOOD_FENCE_GATE);

    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(ModItems.LIGHT_PURPLE_DYE, ModelTemplates.FLAT_ITEM);

    }
}
