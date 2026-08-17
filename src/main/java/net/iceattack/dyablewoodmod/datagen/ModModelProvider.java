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
                .pressurePlate(ModBlocks.BLUE_WOOD_PRESSURE_PLATE.get())
                .fence(ModBlocks.BLUE_WOOD_FENCE.get())
                .fenceGate(ModBlocks.BLUE_WOOD_FENCE_GATE.get());

        blockModels.createDoor(ModBlocks.BLUE_ACACIA_DOOR.get());
        blockModels.createOrientableTrapdoor(ModBlocks.BLUE_ACACIA_TRAPDOOR.get());
        blockModels.createDoor(ModBlocks.BLUE_BIRCH_DOOR.get());
        blockModels.createOrientableTrapdoor(ModBlocks.BLUE_BIRCH_TRAPDOOR.get());
        blockModels.createDoor(ModBlocks.BLUE_DARK_OAK_DOOR.get());
        blockModels.createTrapdoor(ModBlocks.BLUE_DARK_OAK_TRAPDOOR.get());
        blockModels.createDoor(ModBlocks.BLUE_JUNGLE_DOOR.get());
        blockModels.createOrientableTrapdoor(ModBlocks.BLUE_JUNGLE_TRAPDOOR.get());
        blockModels.createDoor(ModBlocks.BLUE_OAK_DOOR.get());
        blockModels.createTrapdoor(ModBlocks.BLUE_OAK_TRAPDOOR.get());
        blockModels.createDoor(ModBlocks.BLUE_SPRUCE_DOOR.get());
        blockModels.createOrientableTrapdoor(ModBlocks.BLUE_SPRUCE_TRAPDOOR.get());

        blockModels.family(ModBlocks.BLACK_PLANKS.get())
                .stairs(ModBlocks.BLACK_WOOD_STAIRS.get())
                .slab(ModBlocks.BLACK_WOOD_SLAB.get())
                .button(ModBlocks.BLACK_WOOD_BUTTON.get())
                .pressurePlate(ModBlocks.BLACK_WOOD_PRESSURE_PLATE.get())
                .fence(ModBlocks.BLACK_WOOD_FENCE.get())
                .fenceGate(ModBlocks.BLACK_WOOD_FENCE_GATE.get());

        blockModels.createDoor(ModBlocks.BLACK_ACACIA_DOOR.get());
        blockModels.createOrientableTrapdoor(ModBlocks.BLACK_ACACIA_TRAPDOOR.get());
        blockModels.createDoor(ModBlocks.BLACK_BIRCH_DOOR.get());
        blockModels.createOrientableTrapdoor(ModBlocks.BLACK_BIRCH_TRAPDOOR.get());
        blockModels.createDoor(ModBlocks.BLACK_DARK_OAK_DOOR.get());
        blockModels.createTrapdoor(ModBlocks.BLACK_DARK_OAK_TRAPDOOR.get());
        blockModels.createDoor(ModBlocks.BLACK_JUNGLE_DOOR.get());
        blockModels.createOrientableTrapdoor(ModBlocks.BLACK_JUNGLE_TRAPDOOR.get());
        blockModels.createDoor(ModBlocks.BLACK_OAK_DOOR.get());
        blockModels.createTrapdoor(ModBlocks.BLACK_OAK_TRAPDOOR.get());
        blockModels.createDoor(ModBlocks.BLACK_SPRUCE_DOOR.get());
        blockModels.createOrientableTrapdoor(ModBlocks.BLACK_SPRUCE_TRAPDOOR.get());

        blockModels.family(ModBlocks.BROWN_PLANKS.get())
                .stairs(ModBlocks.BROWN_WOOD_STAIRS.get())
                .slab(ModBlocks.BROWN_WOOD_SLAB.get())
                .button(ModBlocks.BROWN_WOOD_BUTTON.get())
                .pressurePlate(ModBlocks.BROWN_WOOD_PRESSURE_PLATE.get())
                .fence(ModBlocks.BROWN_WOOD_FENCE.get())
                .fenceGate(ModBlocks.BROWN_WOOD_FENCE_GATE.get());

        blockModels.createDoor(ModBlocks.BROWN_ACACIA_DOOR.get());
        blockModels.createOrientableTrapdoor(ModBlocks.BROWN_ACACIA_TRAPDOOR.get());
        blockModels.createDoor(ModBlocks.BROWN_BIRCH_DOOR.get());
        blockModels.createOrientableTrapdoor(ModBlocks.BROWN_BIRCH_TRAPDOOR.get());
        blockModels.createDoor(ModBlocks.BROWN_DARK_OAK_DOOR.get());
        blockModels.createTrapdoor(ModBlocks.BROWN_DARK_OAK_TRAPDOOR.get());
        blockModels.createDoor(ModBlocks.BROWN_JUNGLE_DOOR.get());
        blockModels.createOrientableTrapdoor(ModBlocks.BROWN_JUNGLE_TRAPDOOR.get());
        blockModels.createDoor(ModBlocks.BROWN_OAK_DOOR.get());
        blockModels.createTrapdoor(ModBlocks.BROWN_OAK_TRAPDOOR.get());
        blockModels.createDoor(ModBlocks.BROWN_SPRUCE_DOOR.get());
        blockModels.createOrientableTrapdoor(ModBlocks.BROWN_SPRUCE_TRAPDOOR.get());

        blockModels.family(ModBlocks.CYAN_PLANKS.get())
                .stairs(ModBlocks.CYAN_WOOD_STAIRS.get())
                .slab(ModBlocks.CYAN_WOOD_SLAB.get())
                .button(ModBlocks.CYAN_WOOD_BUTTON.get())
                .pressurePlate(ModBlocks.CYAN_WOOD_PRESSURE_PLATE.get())
                .fence(ModBlocks.CYAN_WOOD_FENCE.get())
                .fenceGate(ModBlocks.CYAN_WOOD_FENCE_GATE.get());

        blockModels.createDoor(ModBlocks.CYAN_ACACIA_DOOR.get());
        blockModels.createOrientableTrapdoor(ModBlocks.CYAN_ACACIA_TRAPDOOR.get());
        blockModels.createDoor(ModBlocks.CYAN_BIRCH_DOOR.get());
        blockModels.createOrientableTrapdoor(ModBlocks.CYAN_BIRCH_TRAPDOOR.get());
        blockModels.createDoor(ModBlocks.CYAN_DARK_OAK_DOOR.get());
        blockModels.createTrapdoor(ModBlocks.CYAN_DARK_OAK_TRAPDOOR.get());
        blockModels.createDoor(ModBlocks.CYAN_JUNGLE_DOOR.get());
        blockModels.createOrientableTrapdoor(ModBlocks.CYAN_JUNGLE_TRAPDOOR.get());
        blockModels.createDoor(ModBlocks.CYAN_OAK_DOOR.get());
        blockModels.createTrapdoor(ModBlocks.CYAN_OAK_TRAPDOOR.get());
        blockModels.createDoor(ModBlocks.CYAN_SPRUCE_DOOR.get());
        blockModels.createOrientableTrapdoor(ModBlocks.CYAN_SPRUCE_TRAPDOOR.get());

        blockModels.family(ModBlocks.GRAY_PLANKS.get())
                .stairs(ModBlocks.GRAY_WOOD_STAIRS.get())
                .slab(ModBlocks.GRAY_WOOD_SLAB.get())
                .button(ModBlocks.GRAY_WOOD_BUTTON.get())
                .pressurePlate(ModBlocks.GRAY_WOOD_PRESSURE_PLATE.get())
                .fence(ModBlocks.GRAY_WOOD_FENCE.get())
                .fenceGate(ModBlocks.GRAY_WOOD_FENCE_GATE.get());

        blockModels.createDoor(ModBlocks.GRAY_ACACIA_DOOR.get());
        blockModels.createOrientableTrapdoor(ModBlocks.GRAY_ACACIA_TRAPDOOR.get());
        blockModels.createDoor(ModBlocks.GRAY_BIRCH_DOOR.get());
        blockModels.createOrientableTrapdoor(ModBlocks.GRAY_BIRCH_TRAPDOOR.get());
        blockModels.createDoor(ModBlocks.GRAY_DARK_OAK_DOOR.get());
        blockModels.createTrapdoor(ModBlocks.GRAY_DARK_OAK_TRAPDOOR.get());
        blockModels.createDoor(ModBlocks.GRAY_JUNGLE_DOOR.get());
        blockModels.createOrientableTrapdoor(ModBlocks.GRAY_JUNGLE_TRAPDOOR.get());
        blockModels.createDoor(ModBlocks.GRAY_OAK_DOOR.get());
        blockModels.createTrapdoor(ModBlocks.GRAY_OAK_TRAPDOOR.get());
        blockModels.createDoor(ModBlocks.GRAY_SPRUCE_DOOR.get());
        blockModels.createOrientableTrapdoor(ModBlocks.GRAY_SPRUCE_TRAPDOOR.get());

        blockModels.family(ModBlocks.GREEN_PLANKS.get())
                .stairs(ModBlocks.GREEN_WOOD_STAIRS.get())
                .slab(ModBlocks.GREEN_WOOD_SLAB.get())
                .button(ModBlocks.GREEN_WOOD_BUTTON.get())
                .pressurePlate(ModBlocks.GREEN_WOOD_PRESSURE_PLATE.get())
                .fence(ModBlocks.GREEN_WOOD_FENCE.get())
                .fenceGate(ModBlocks.GREEN_WOOD_FENCE_GATE.get());

        blockModels.family(ModBlocks.LIGHT_BLUE_PLANKS.get())
                .stairs(ModBlocks.LIGHT_BLUE_WOOD_STAIRS.get())
                .slab(ModBlocks.LIGHT_BLUE_WOOD_SLAB.get())
                .button(ModBlocks.LIGHT_BLUE_WOOD_BUTTON.get())
                .pressurePlate(ModBlocks.LIGHT_BLUE_WOOD_PRESSURE_PLATE.get())
                .fence(ModBlocks.LIGHT_BLUE_WOOD_FENCE.get())
                .fenceGate(ModBlocks.LIGHT_BLUE_WOOD_FENCE_GATE.get());

        blockModels.family(ModBlocks.LIGHT_GRAY_PLANKS.get())
                .stairs(ModBlocks.LIGHT_GRAY_WOOD_STAIRS.get())
                .slab(ModBlocks.LIGHT_GRAY_WOOD_SLAB.get())
                .button(ModBlocks.LIGHT_GRAY_WOOD_BUTTON.get())
                .pressurePlate(ModBlocks.LIGHT_GRAY_WOOD_PRESSURE_PLATE.get())
                .fence(ModBlocks.LIGHT_GRAY_WOOD_FENCE.get())
                .fenceGate(ModBlocks.LIGHT_GRAY_WOOD_FENCE_GATE.get());

        blockModels.family(ModBlocks.LIGHT_PURPLE_PLANKS.get())
                .stairs(ModBlocks.LIGHT_PURPLE_WOOD_STAIRS.get())
                .slab(ModBlocks.LIGHT_PURPLE_WOOD_SLAB.get())
                .button(ModBlocks.LIGHT_PURPLE_WOOD_BUTTON.get())
                .pressurePlate(ModBlocks.LIGHT_PURPLE_WOOD_PRESSURE_PLATE.get())
                .fence(ModBlocks.LIGHT_PURPLE_WOOD_FENCE.get())
                .fenceGate(ModBlocks.LIGHT_PURPLE_WOOD_FENCE_GATE.get());

        blockModels.family(ModBlocks.LIME_PLANKS.get())
                .stairs(ModBlocks.LIME_WOOD_STAIRS.get())
                .slab(ModBlocks.LIME_WOOD_SLAB.get())
                .button(ModBlocks.LIME_WOOD_BUTTON.get())
                .pressurePlate(ModBlocks.LIME_WOOD_PRESSURE_PLATE.get())
                .fence(ModBlocks.LIME_WOOD_FENCE.get())
                .fenceGate(ModBlocks.LIME_WOOD_FENCE_GATE.get());

        blockModels.family(ModBlocks.MAGENTA_PLANKS.get())
                .stairs(ModBlocks.MAGENTA_WOOD_STAIRS.get())
                .slab(ModBlocks.MAGENTA_WOOD_SLAB.get())
                .button(ModBlocks.MAGENTA_WOOD_BUTTON.get())
                .pressurePlate(ModBlocks.MAGENTA_WOOD_PRESSURE_PLATE.get())
                .fence(ModBlocks.MAGENTA_WOOD_FENCE.get())
                .fenceGate(ModBlocks.MAGENTA_WOOD_FENCE_GATE.get());

        blockModels.family(ModBlocks.ORANGE_PLANKS.get())
                .stairs(ModBlocks.ORANGE_WOOD_STAIRS.get())
                .slab(ModBlocks.ORANGE_WOOD_SLAB.get())
                .button(ModBlocks.ORANGE_WOOD_BUTTON.get())
                .pressurePlate(ModBlocks.ORANGE_WOOD_PRESSURE_PLATE.get())
                .fence(ModBlocks.ORANGE_WOOD_FENCE.get())
                .fenceGate(ModBlocks.ORANGE_WOOD_FENCE_GATE.get());

        blockModels.family(ModBlocks.PINK_PLANKS.get())
                .stairs(ModBlocks.PINK_WOOD_STAIRS.get())
                .slab(ModBlocks.PINK_WOOD_SLAB.get())
                .button(ModBlocks.PINK_WOOD_BUTTON.get())
                .pressurePlate(ModBlocks.PINK_WOOD_PRESSURE_PLATE.get())
                .fence(ModBlocks.PINK_WOOD_FENCE.get())
                .fenceGate(ModBlocks.PINK_WOOD_FENCE_GATE.get());

        blockModels.family(ModBlocks.PURPLE_PLANKS.get())
                .stairs(ModBlocks.PURPLE_WOOD_STAIRS.get())
                .slab(ModBlocks.PURPLE_WOOD_SLAB.get())
                .button(ModBlocks.PURPLE_WOOD_BUTTON.get())
                .pressurePlate(ModBlocks.PURPLE_WOOD_PRESSURE_PLATE.get())
                .fence(ModBlocks.PURPLE_WOOD_FENCE.get())
                .fenceGate(ModBlocks.PURPLE_WOOD_FENCE_GATE.get());

        blockModels.family(ModBlocks.RED_PLANKS.get())
                .stairs(ModBlocks.RED_WOOD_STAIRS.get())
                .slab(ModBlocks.RED_WOOD_SLAB.get())
                .button(ModBlocks.RED_WOOD_BUTTON.get())
                .pressurePlate(ModBlocks.RED_WOOD_PRESSURE_PLATE.get())
                .fence(ModBlocks.RED_WOOD_FENCE.get())
                .fenceGate(ModBlocks.RED_WOOD_FENCE_GATE.get());

        blockModels.family(ModBlocks.WHITE_PLANKS.get())
                .stairs(ModBlocks.WHITE_WOOD_STAIRS.get())
                .slab(ModBlocks.WHITE_WOOD_SLAB.get())
                .button(ModBlocks.WHITE_WOOD_BUTTON.get())
                .pressurePlate(ModBlocks.WHITE_WOOD_PRESSURE_PLATE.get())
                .fence(ModBlocks.WHITE_WOOD_FENCE.get())
                .fenceGate(ModBlocks.WHITE_WOOD_FENCE_GATE.get());

        blockModels.family(ModBlocks.YELLOW_PLANKS.get())
                .stairs(ModBlocks.YELLOW_WOOD_STAIRS.get())
                .slab(ModBlocks.YELLOW_WOOD_SLAB.get())
                .button(ModBlocks.YELLOW_WOOD_BUTTON.get())
                .pressurePlate(ModBlocks.YELLOW_WOOD_PRESSURE_PLATE.get())
                .fence(ModBlocks.YELLOW_WOOD_FENCE.get())
                .fenceGate(ModBlocks.YELLOW_WOOD_FENCE_GATE.get());
    }
}
