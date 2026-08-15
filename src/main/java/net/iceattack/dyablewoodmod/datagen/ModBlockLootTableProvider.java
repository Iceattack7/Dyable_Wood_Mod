package net.iceattack.dyablewoodmod.datagen;

import net.iceattack.dyablewoodmod.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    public ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.BLUE_PLANKS.get());
        dropSelf(ModBlocks.BLACK_PLANKS.get());
        dropSelf(ModBlocks.BROWN_PLANKS.get());
        dropSelf(ModBlocks.CYAN_PLANKS.get());
        dropSelf(ModBlocks.GRAY_PLANKS.get());
        dropSelf(ModBlocks.GREEN_PLANKS.get());
        dropSelf(ModBlocks.LIGHT_BLUE_PLANKS.get());
        dropSelf(ModBlocks.LIGHT_GRAY_PLANKS.get());
        dropSelf(ModBlocks.LIGHT_PURPLE_PLANKS.get());
        dropSelf(ModBlocks.LIME_PLANKS.get());
        dropSelf(ModBlocks.MAGENTA_PLANKS.get());
        dropSelf(ModBlocks.ORANGE_PLANKS.get());
        dropSelf(ModBlocks.PINK_PLANKS.get());
        dropSelf(ModBlocks.PURPLE_PLANKS.get());
        dropSelf(ModBlocks.RED_PLANKS.get());
        dropSelf(ModBlocks.WHITE_PLANKS.get());
        dropSelf(ModBlocks.YELLOW_PLANKS.get());

        dropSelf(ModBlocks.BLUE_WOOD_STAIRS.get());
        add(ModBlocks.BLUE_WOOD_SLAB.get(), this::createSlabItemTable);
        dropSelf(ModBlocks.BLACK_WOOD_STAIRS.get());
        add(ModBlocks.BLACK_WOOD_SLAB.get(), this::createSlabItemTable);
        dropSelf(ModBlocks.BROWN_WOOD_STAIRS.get());
        add(ModBlocks.BROWN_WOOD_SLAB.get(), this::createSlabItemTable);
        dropSelf(ModBlocks.CYAN_WOOD_STAIRS.get());
        add(ModBlocks.CYAN_WOOD_SLAB.get(), this::createSlabItemTable);
        dropSelf(ModBlocks.GRAY_WOOD_STAIRS.get());
        add(ModBlocks.GRAY_WOOD_SLAB.get(), this::createSlabItemTable);
        dropSelf(ModBlocks.GREEN_WOOD_STAIRS.get());
        add(ModBlocks.GREEN_WOOD_SLAB.get(), this::createSlabItemTable);
        dropSelf(ModBlocks.LIGHT_BLUE_WOOD_STAIRS.get());
        add(ModBlocks.LIGHT_BLUE_WOOD_SLAB.get(), this::createSlabItemTable);
        dropSelf(ModBlocks.LIGHT_GRAY_WOOD_STAIRS.get());
        add(ModBlocks.LIGHT_GRAY_WOOD_SLAB.get(), this::createSlabItemTable);
        dropSelf(ModBlocks.LIGHT_PURPLE_WOOD_STAIRS.get());
        add(ModBlocks.LIGHT_PURPLE_WOOD_SLAB.get(), this::createSlabItemTable);
        dropSelf(ModBlocks.LIME_WOOD_STAIRS.get());
        add(ModBlocks.LIME_WOOD_SLAB.get(), this::createSlabItemTable);
        dropSelf(ModBlocks.MAGENTA_WOOD_STAIRS.get());
        add(ModBlocks.MAGENTA_WOOD_SLAB.get(), this::createSlabItemTable);
        dropSelf(ModBlocks.ORANGE_WOOD_STAIRS.get());
        add(ModBlocks.ORANGE_WOOD_SLAB.get(), this::createSlabItemTable);
        dropSelf(ModBlocks.PINK_WOOD_STAIRS.get());
        add(ModBlocks.PINK_WOOD_SLAB.get(), this::createSlabItemTable);
        dropSelf(ModBlocks.PURPLE_WOOD_STAIRS.get());
        add(ModBlocks.PURPLE_WOOD_SLAB.get(), this::createSlabItemTable);
        dropSelf(ModBlocks.RED_WOOD_STAIRS.get());
        add(ModBlocks.RED_WOOD_SLAB.get(), this::createSlabItemTable);
        dropSelf(ModBlocks.WHITE_WOOD_STAIRS.get());
        add(ModBlocks.WHITE_WOOD_SLAB.get(), this::createSlabItemTable);
        dropSelf(ModBlocks.YELLOW_WOOD_STAIRS.get());
        add(ModBlocks.YELLOW_WOOD_SLAB.get(), this::createSlabItemTable);

        dropSelf(ModBlocks.BLUE_WOOD_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.BLUE_WOOD_BUTTON.get());
        dropSelf(ModBlocks.BLACK_WOOD_BUTTON.get());
        dropSelf(ModBlocks.BLACK_WOOD_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.BROWN_WOOD_BUTTON.get());
        dropSelf(ModBlocks.BROWN_WOOD_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.CYAN_WOOD_BUTTON.get());
        dropSelf(ModBlocks.CYAN_WOOD_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.GRAY_WOOD_BUTTON.get());
        dropSelf(ModBlocks.GRAY_WOOD_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.GREEN_WOOD_BUTTON.get());
        dropSelf(ModBlocks.GREEN_WOOD_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.LIGHT_BLUE_WOOD_BUTTON.get());
        dropSelf(ModBlocks.LIGHT_BLUE_WOOD_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.LIGHT_GRAY_WOOD_BUTTON.get());
        dropSelf(ModBlocks.LIGHT_GRAY_WOOD_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.LIGHT_PURPLE_WOOD_BUTTON.get());
        dropSelf(ModBlocks.LIGHT_PURPLE_WOOD_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.LIME_WOOD_BUTTON.get());
        dropSelf(ModBlocks.LIME_WOOD_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.MAGENTA_WOOD_BUTTON.get());
        dropSelf(ModBlocks.MAGENTA_WOOD_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.ORANGE_WOOD_BUTTON.get());
        dropSelf(ModBlocks.ORANGE_WOOD_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.PINK_WOOD_BUTTON.get());
        dropSelf(ModBlocks.PINK_WOOD_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.PURPLE_WOOD_BUTTON.get());
        dropSelf(ModBlocks.PURPLE_WOOD_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.RED_WOOD_BUTTON.get());
        dropSelf(ModBlocks.RED_WOOD_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.WHITE_WOOD_BUTTON.get());
        dropSelf(ModBlocks.WHITE_WOOD_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.YELLOW_WOOD_BUTTON.get());
        dropSelf(ModBlocks.YELLOW_WOOD_PRESSURE_PLATE.get());

        dropSelf(ModBlocks.BLUE_WOOD_FENCE.get());
        dropSelf(ModBlocks.BLUE_WOOD_FENCE_GATE.get());
        dropSelf(ModBlocks.BLACK_WOOD_FENCE.get());
        dropSelf(ModBlocks.BLACK_WOOD_FENCE_GATE.get());
        dropSelf(ModBlocks.BROWN_WOOD_FENCE.get());
        dropSelf(ModBlocks.BROWN_WOOD_FENCE_GATE.get());
        dropSelf(ModBlocks.CYAN_WOOD_FENCE.get());
        dropSelf(ModBlocks.CYAN_WOOD_FENCE_GATE.get());
        dropSelf(ModBlocks.GRAY_WOOD_FENCE.get());
        dropSelf(ModBlocks.GRAY_WOOD_FENCE_GATE.get());
        dropSelf(ModBlocks.GREEN_WOOD_FENCE.get());
        dropSelf(ModBlocks.GREEN_WOOD_FENCE_GATE.get());
        dropSelf(ModBlocks.LIGHT_BLUE_WOOD_FENCE.get());
        dropSelf(ModBlocks.LIGHT_BLUE_WOOD_FENCE_GATE.get());
        dropSelf(ModBlocks.LIGHT_GRAY_WOOD_FENCE.get());
        dropSelf(ModBlocks.LIGHT_GRAY_WOOD_FENCE_GATE.get());
        dropSelf(ModBlocks.LIGHT_PURPLE_WOOD_FENCE.get());
        dropSelf(ModBlocks.LIGHT_PURPLE_WOOD_FENCE_GATE.get());
        dropSelf(ModBlocks.LIME_WOOD_FENCE.get());
        dropSelf(ModBlocks.LIME_WOOD_FENCE_GATE.get());
        dropSelf(ModBlocks.MAGENTA_WOOD_FENCE.get());
        dropSelf(ModBlocks.MAGENTA_WOOD_FENCE_GATE.get());
        dropSelf(ModBlocks.ORANGE_WOOD_FENCE.get());
        dropSelf(ModBlocks.ORANGE_WOOD_FENCE_GATE.get());
        dropSelf(ModBlocks.PINK_WOOD_FENCE.get());
        dropSelf(ModBlocks.PINK_WOOD_FENCE_GATE.get());
        dropSelf(ModBlocks.PURPLE_WOOD_FENCE.get());
        dropSelf(ModBlocks.PURPLE_WOOD_FENCE_GATE.get());
        dropSelf(ModBlocks.RED_WOOD_FENCE.get());
        dropSelf(ModBlocks.RED_WOOD_FENCE_GATE.get());
        dropSelf(ModBlocks.WHITE_WOOD_FENCE.get());
        dropSelf(ModBlocks.WHITE_WOOD_FENCE_GATE.get());
        dropSelf(ModBlocks.YELLOW_WOOD_FENCE.get());
        dropSelf(ModBlocks.YELLOW_WOOD_FENCE_GATE.get());

        add(ModBlocks.BLUE_ACACIA_DOOR.get(), this::createDoorTable);
        dropSelf(ModBlocks.BLUE_ACACIA_TRAPDOOR.get());
        add(ModBlocks.BLUE_BIRCH_DOOR.get(), this::createDoorTable);
        dropSelf(ModBlocks.BLUE_BIRCH_TRAPDOOR.get());
        add(ModBlocks.BLUE_DARK_OAK_DOOR.get(), this::createDoorTable);
        dropSelf(ModBlocks.BLUE_DARK_OAK_TRAPDOOR.get());
        add(ModBlocks.BLUE_JUNGLE_DOOR.get(), this::createDoorTable);
        dropSelf(ModBlocks.BLUE_JUNGLE_TRAPDOOR.get());
        add(ModBlocks.BLUE_OAK_DOOR.get(), this::createDoorTable);
        dropSelf(ModBlocks.BLUE_OAK_TRAPDOOR.get());
        add(ModBlocks.BLUE_SPRUCE_DOOR.get(), this::createDoorTable);
        dropSelf(ModBlocks.BLUE_SPRUCE_TRAPDOOR.get());


    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
