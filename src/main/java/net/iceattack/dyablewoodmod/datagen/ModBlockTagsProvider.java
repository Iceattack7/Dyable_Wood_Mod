package net.iceattack.dyablewoodmod.datagen;

import net.iceattack.dyablewoodmod.DyableWoodMod;
import net.iceattack.dyablewoodmod.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, DyableWoodMod.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_AXE)
                .add(ModBlocks.getRK(ModBlocks.BLUE_PLANKS.get()))
                .add(ModBlocks.getRK(ModBlocks.BLACK_PLANKS.get()))
                .add(ModBlocks.getRK(ModBlocks.BROWN_PLANKS.get()))
                .add(ModBlocks.getRK(ModBlocks.CYAN_PLANKS.get()))
                .add(ModBlocks.getRK(ModBlocks.GRAY_PLANKS.get()))
                .add(ModBlocks.getRK(ModBlocks.GREEN_PLANKS.get()))
                .add(ModBlocks.getRK(ModBlocks.LIGHT_BLUE_PLANKS.get()))
                .add(ModBlocks.getRK(ModBlocks.LIGHT_GRAY_PLANKS.get()))
                .add(ModBlocks.getRK(ModBlocks.LIGHT_PURPLE_PLANKS.get()))
                .add(ModBlocks.getRK(ModBlocks.LIME_PLANKS.get()))
                .add(ModBlocks.getRK(ModBlocks.MAGENTA_PLANKS.get()))
                .add(ModBlocks.getRK(ModBlocks.ORANGE_PLANKS.get()))
                .add(ModBlocks.getRK(ModBlocks.PINK_PLANKS.get()))
                .add(ModBlocks.getRK(ModBlocks.PURPLE_PLANKS.get()))
                .add(ModBlocks.getRK(ModBlocks.RED_PLANKS.get()))
                .add(ModBlocks.getRK(ModBlocks.WHITE_PLANKS.get()))
                .add(ModBlocks.getRK(ModBlocks.YELLOW_PLANKS.get()))
                .add(ModBlocks.getRK(ModBlocks.BLUE_WOOD_STAIRS.get()))
                .add(ModBlocks.getRK(ModBlocks.BLUE_WOOD_SLAB.get()))
                .add(ModBlocks.getRK(ModBlocks.BLACK_WOOD_STAIRS.get()))
                .add(ModBlocks.getRK(ModBlocks.BLACK_WOOD_SLAB.get()))
                .add(ModBlocks.getRK(ModBlocks.BROWN_WOOD_STAIRS.get()))
                .add(ModBlocks.getRK(ModBlocks.BROWN_WOOD_SLAB.get()))
                .add(ModBlocks.getRK(ModBlocks.CYAN_WOOD_STAIRS.get()))
                .add(ModBlocks.getRK(ModBlocks.CYAN_WOOD_SLAB.get()))
                .add(ModBlocks.getRK(ModBlocks.GRAY_WOOD_STAIRS.get()))
                .add(ModBlocks.getRK(ModBlocks.GRAY_WOOD_SLAB.get()))
                .add(ModBlocks.getRK(ModBlocks.GREEN_WOOD_STAIRS.get()))
                .add(ModBlocks.getRK(ModBlocks.GREEN_WOOD_SLAB.get()))
                .add(ModBlocks.getRK(ModBlocks.LIGHT_BLUE_WOOD_STAIRS.get()))
                .add(ModBlocks.getRK(ModBlocks.LIGHT_BLUE_WOOD_SLAB.get()))
                .add(ModBlocks.getRK(ModBlocks.LIGHT_GRAY_WOOD_STAIRS.get()))
                .add(ModBlocks.getRK(ModBlocks.LIGHT_GRAY_WOOD_SLAB.get()))
                .add(ModBlocks.getRK(ModBlocks.LIGHT_PURPLE_WOOD_STAIRS.get()))
                .add(ModBlocks.getRK(ModBlocks.LIGHT_PURPLE_WOOD_SLAB.get()))
                .add(ModBlocks.getRK(ModBlocks.LIME_WOOD_STAIRS.get()))
                .add(ModBlocks.getRK(ModBlocks.LIME_WOOD_SLAB.get()))
                .add(ModBlocks.getRK(ModBlocks.MAGENTA_WOOD_STAIRS.get()))
                .add(ModBlocks.getRK(ModBlocks.MAGENTA_WOOD_SLAB.get()))
                .add(ModBlocks.getRK(ModBlocks.ORANGE_WOOD_STAIRS.get()))
                .add(ModBlocks.getRK(ModBlocks.ORANGE_WOOD_SLAB.get()))
                .add(ModBlocks.getRK(ModBlocks.PINK_WOOD_STAIRS.get()))
                .add(ModBlocks.getRK(ModBlocks.PINK_WOOD_SLAB.get()))
                .add(ModBlocks.getRK(ModBlocks.PURPLE_WOOD_STAIRS.get()))
                .add(ModBlocks.getRK(ModBlocks.PURPLE_WOOD_SLAB.get()))
                .add(ModBlocks.getRK(ModBlocks.RED_WOOD_STAIRS.get()))
                .add(ModBlocks.getRK(ModBlocks.RED_WOOD_SLAB.get()))
                .add(ModBlocks.getRK(ModBlocks.WHITE_WOOD_STAIRS.get()))
                .add(ModBlocks.getRK(ModBlocks.WHITE_WOOD_SLAB.get()))
                .add(ModBlocks.getRK(ModBlocks.YELLOW_WOOD_STAIRS.get()))
                .add(ModBlocks.getRK(ModBlocks.YELLOW_WOOD_SLAB.get()))
                .add(ModBlocks.getRK(ModBlocks.BLUE_WOOD_PRESSURE_PLATE.get()))
                .add(ModBlocks.getRK(ModBlocks.BLUE_WOOD_BUTTON.get()));

        tag(BlockTags.STAIRS)
                .add(ModBlocks.getRK(ModBlocks.BLUE_WOOD_STAIRS.get()));
        tag(BlockTags.SLABS)
                .add(ModBlocks.getRK(ModBlocks.BLUE_WOOD_SLAB.get()));
        tag(BlockTags.STAIRS)
                .add(ModBlocks.getRK(ModBlocks.BLACK_WOOD_STAIRS.get()));
        tag(BlockTags.SLABS)
                .add(ModBlocks.getRK(ModBlocks.BLACK_WOOD_SLAB.get()));
        tag(BlockTags.STAIRS)
                .add(ModBlocks.getRK(ModBlocks.BROWN_WOOD_STAIRS.get()));
        tag(BlockTags.SLABS)
                .add(ModBlocks.getRK(ModBlocks.BROWN_WOOD_SLAB.get()));
        tag(BlockTags.STAIRS)
                .add(ModBlocks.getRK(ModBlocks.CYAN_WOOD_STAIRS.get()));
        tag(BlockTags.SLABS)
                .add(ModBlocks.getRK(ModBlocks.CYAN_WOOD_SLAB.get()));
        tag(BlockTags.STAIRS)
                .add(ModBlocks.getRK(ModBlocks.GRAY_WOOD_STAIRS.get()));
        tag(BlockTags.SLABS)
                .add(ModBlocks.getRK(ModBlocks.GRAY_WOOD_SLAB.get()));
        tag(BlockTags.STAIRS)
                .add(ModBlocks.getRK(ModBlocks.GREEN_WOOD_STAIRS.get()));
        tag(BlockTags.SLABS)
                .add(ModBlocks.getRK(ModBlocks.GREEN_WOOD_SLAB.get()));
        tag(BlockTags.STAIRS)
                .add(ModBlocks.getRK(ModBlocks.LIGHT_BLUE_WOOD_STAIRS.get()));
        tag(BlockTags.SLABS)
                .add(ModBlocks.getRK(ModBlocks.LIGHT_BLUE_WOOD_SLAB.get()));
        tag(BlockTags.STAIRS)
                .add(ModBlocks.getRK(ModBlocks.LIGHT_GRAY_WOOD_STAIRS.get()));
        tag(BlockTags.SLABS)
                .add(ModBlocks.getRK(ModBlocks.LIGHT_GRAY_WOOD_SLAB.get()));
        tag(BlockTags.STAIRS)
                .add(ModBlocks.getRK(ModBlocks.LIGHT_PURPLE_WOOD_STAIRS.get()));
        tag(BlockTags.SLABS)
                .add(ModBlocks.getRK(ModBlocks.LIGHT_PURPLE_WOOD_SLAB.get()));
        tag(BlockTags.STAIRS)
                .add(ModBlocks.getRK(ModBlocks.LIME_WOOD_STAIRS.get()));
        tag(BlockTags.SLABS)
                .add(ModBlocks.getRK(ModBlocks.LIME_WOOD_SLAB.get()));
        tag(BlockTags.STAIRS)
                .add(ModBlocks.getRK(ModBlocks.MAGENTA_WOOD_STAIRS.get()));
        tag(BlockTags.SLABS)
                .add(ModBlocks.getRK(ModBlocks.MAGENTA_WOOD_SLAB.get()));
        tag(BlockTags.STAIRS)
                .add(ModBlocks.getRK(ModBlocks.ORANGE_WOOD_STAIRS.get()));
        tag(BlockTags.SLABS)
                .add(ModBlocks.getRK(ModBlocks.ORANGE_WOOD_SLAB.get()));
        tag(BlockTags.STAIRS)
                .add(ModBlocks.getRK(ModBlocks.PINK_WOOD_STAIRS.get()));
        tag(BlockTags.SLABS)
                .add(ModBlocks.getRK(ModBlocks.PINK_WOOD_SLAB.get()));
        tag(BlockTags.STAIRS)
                .add(ModBlocks.getRK(ModBlocks.PURPLE_WOOD_STAIRS.get()));
        tag(BlockTags.SLABS)
                .add(ModBlocks.getRK(ModBlocks.PURPLE_WOOD_SLAB.get()));
        tag(BlockTags.STAIRS)
                .add(ModBlocks.getRK(ModBlocks.RED_WOOD_STAIRS.get()));
        tag(BlockTags.SLABS)
                .add(ModBlocks.getRK(ModBlocks.RED_WOOD_SLAB.get()));
        tag(BlockTags.STAIRS)
                .add(ModBlocks.getRK(ModBlocks.WHITE_WOOD_STAIRS.get()));
        tag(BlockTags.SLABS)
                .add(ModBlocks.getRK(ModBlocks.WHITE_WOOD_SLAB.get()));
        tag(BlockTags.STAIRS)
                .add(ModBlocks.getRK(ModBlocks.YELLOW_WOOD_STAIRS.get()));
        tag(BlockTags.SLABS)
                .add(ModBlocks.getRK(ModBlocks.YELLOW_WOOD_SLAB.get()));

        tag(BlockTags.BUTTONS).add(ModBlocks.getRK(ModBlocks.BLUE_WOOD_BUTTON.get()));
        tag(BlockTags.WOODEN_PRESSURE_PLATES).add(ModBlocks.getRK(ModBlocks.BLUE_WOOD_PRESSURE_PLATE.get()));
        tag(BlockTags.BUTTONS).add(ModBlocks.getRK(ModBlocks.BLACK_WOOD_BUTTON.get()));
        tag(BlockTags.WOODEN_PRESSURE_PLATES).add(ModBlocks.getRK(ModBlocks.BLACK_WOOD_PRESSURE_PLATE.get()));
        tag(BlockTags.BUTTONS).add(ModBlocks.getRK(ModBlocks.BROWN_WOOD_BUTTON.get()));
        tag(BlockTags.WOODEN_PRESSURE_PLATES).add(ModBlocks.getRK(ModBlocks.BROWN_WOOD_PRESSURE_PLATE.get()));
        tag(BlockTags.BUTTONS).add(ModBlocks.getRK(ModBlocks.CYAN_WOOD_BUTTON.get()));
        tag(BlockTags.WOODEN_PRESSURE_PLATES).add(ModBlocks.getRK(ModBlocks.CYAN_WOOD_PRESSURE_PLATE.get()));
        tag(BlockTags.BUTTONS).add(ModBlocks.getRK(ModBlocks.GRAY_WOOD_BUTTON.get()));
        tag(BlockTags.WOODEN_PRESSURE_PLATES).add(ModBlocks.getRK(ModBlocks.GRAY_WOOD_PRESSURE_PLATE.get()));
        tag(BlockTags.BUTTONS).add(ModBlocks.getRK(ModBlocks.GREEN_WOOD_BUTTON.get()));
        tag(BlockTags.WOODEN_PRESSURE_PLATES).add(ModBlocks.getRK(ModBlocks.GREEN_WOOD_PRESSURE_PLATE.get()));
        tag(BlockTags.BUTTONS).add(ModBlocks.getRK(ModBlocks.LIGHT_BLUE_WOOD_BUTTON.get()));
        tag(BlockTags.WOODEN_PRESSURE_PLATES).add(ModBlocks.getRK(ModBlocks.LIGHT_BLUE_WOOD_PRESSURE_PLATE.get()));
        tag(BlockTags.BUTTONS).add(ModBlocks.getRK(ModBlocks.LIGHT_GRAY_WOOD_BUTTON.get()));
        tag(BlockTags.WOODEN_PRESSURE_PLATES).add(ModBlocks.getRK(ModBlocks.LIGHT_GRAY_WOOD_PRESSURE_PLATE.get()));
        tag(BlockTags.BUTTONS).add(ModBlocks.getRK(ModBlocks.LIGHT_PURPLE_WOOD_BUTTON.get()));
        tag(BlockTags.WOODEN_PRESSURE_PLATES).add(ModBlocks.getRK(ModBlocks.LIGHT_PURPLE_WOOD_PRESSURE_PLATE.get()));
        tag(BlockTags.BUTTONS).add(ModBlocks.getRK(ModBlocks.LIME_WOOD_BUTTON.get()));
        tag(BlockTags.WOODEN_PRESSURE_PLATES).add(ModBlocks.getRK(ModBlocks.LIME_WOOD_PRESSURE_PLATE.get()));
        tag(BlockTags.BUTTONS).add(ModBlocks.getRK(ModBlocks.MAGENTA_WOOD_BUTTON.get()));
        tag(BlockTags.WOODEN_PRESSURE_PLATES).add(ModBlocks.getRK(ModBlocks.MAGENTA_WOOD_PRESSURE_PLATE.get()));
        tag(BlockTags.BUTTONS).add(ModBlocks.getRK(ModBlocks.ORANGE_WOOD_BUTTON.get()));
        tag(BlockTags.WOODEN_PRESSURE_PLATES).add(ModBlocks.getRK(ModBlocks.ORANGE_WOOD_PRESSURE_PLATE.get()));
        tag(BlockTags.BUTTONS).add(ModBlocks.getRK(ModBlocks.PINK_WOOD_BUTTON.get()));
        tag(BlockTags.WOODEN_PRESSURE_PLATES).add(ModBlocks.getRK(ModBlocks.PINK_WOOD_PRESSURE_PLATE.get()));
        tag(BlockTags.BUTTONS).add(ModBlocks.getRK(ModBlocks.PURPLE_WOOD_BUTTON.get()));
        tag(BlockTags.WOODEN_PRESSURE_PLATES).add(ModBlocks.getRK(ModBlocks.PURPLE_WOOD_PRESSURE_PLATE.get()));
        tag(BlockTags.BUTTONS).add(ModBlocks.getRK(ModBlocks.RED_WOOD_BUTTON.get()));
        tag(BlockTags.WOODEN_PRESSURE_PLATES).add(ModBlocks.getRK(ModBlocks.RED_WOOD_PRESSURE_PLATE.get()));
        tag(BlockTags.BUTTONS).add(ModBlocks.getRK(ModBlocks.WHITE_WOOD_BUTTON.get()));
        tag(BlockTags.WOODEN_PRESSURE_PLATES).add(ModBlocks.getRK(ModBlocks.WHITE_WOOD_PRESSURE_PLATE.get()));
        tag(BlockTags.BUTTONS).add(ModBlocks.getRK(ModBlocks.YELLOW_WOOD_BUTTON.get()));
        tag(BlockTags.WOODEN_PRESSURE_PLATES).add(ModBlocks.getRK(ModBlocks.YELLOW_WOOD_PRESSURE_PLATE.get()));



    }
}
