package net.iceattack.dyablewoodmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.iceattack.dyablewoodmod.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends FabricTagsProvider.BlockTagsProvider {
    public ModBlockTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        tag(BlockTags.MINEABLE_WITH_AXE)
                .add(ModBlocks.getRK(ModBlocks.BLACK_PLANKS))
                .add(ModBlocks.getRK(ModBlocks.BLUE_PLANKS))
                .add(ModBlocks.getRK(ModBlocks.BROWN_PLANKS))
                .add(ModBlocks.getRK(ModBlocks.CYAN_PLANKS))
                .add(ModBlocks.getRK(ModBlocks.GRAY_PLANKS))
                .add(ModBlocks.getRK(ModBlocks.GREEN_PLANKS))
                .add(ModBlocks.getRK(ModBlocks.LIGHT_BLUE_PLANKS))
                .add(ModBlocks.getRK(ModBlocks.LIGHT_GRAY_PLANKS))
                .add(ModBlocks.getRK(ModBlocks.LIGHT_PURPLE_PLANKS))
                .add(ModBlocks.getRK(ModBlocks.LIME_PLANKS))
                .add(ModBlocks.getRK(ModBlocks.MAGENTA_PLANKS))
                .add(ModBlocks.getRK(ModBlocks.ORANGE_PLANKS))
                .add(ModBlocks.getRK(ModBlocks.PINK_PLANKS))
                .add(ModBlocks.getRK(ModBlocks.PURPLE_PLANKS))
                .add(ModBlocks.getRK(ModBlocks.RED_PLANKS))
                .add(ModBlocks.getRK(ModBlocks.WHITE_PLANKS))
                .add(ModBlocks.getRK(ModBlocks.YELLOW_PLANKS))
                .add(ModBlocks.getRK(ModBlocks.BLUE_WOOD_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.BLUE_WOOD_SLAB))
                .add(ModBlocks.getRK(ModBlocks.BLACK_WOOD_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.BLACK_WOOD_SLAB))
                .add(ModBlocks.getRK(ModBlocks.BROWN_WOOD_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.BROWN_WOOD_SLAB))
                .add(ModBlocks.getRK(ModBlocks.CYAN_WOOD_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.CYAN_WOOD_SLAB))
                .add(ModBlocks.getRK(ModBlocks.GRAY_WOOD_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.GRAY_WOOD_SLAB))
                .add(ModBlocks.getRK(ModBlocks.GREEN_WOOD_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.GREEN_WOOD_SLAB))
                .add(ModBlocks.getRK(ModBlocks.LIGHT_BLUE_WOOD_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.LIGHT_BLUE_WOOD_SLAB))
                .add(ModBlocks.getRK(ModBlocks.LIGHT_GRAY_WOOD_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.LIGHT_GRAY_WOOD_SLAB))
                .add(ModBlocks.getRK(ModBlocks.LIGHT_PURPLE_WOOD_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.LIGHT_PURPLE_WOOD_SLAB))
                .add(ModBlocks.getRK(ModBlocks.LIME_WOOD_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.LIME_WOOD_SLAB))
                .add(ModBlocks.getRK(ModBlocks.MAGENTA_WOOD_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.MAGENTA_WOOD_SLAB))
                .add(ModBlocks.getRK(ModBlocks.ORANGE_WOOD_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.ORANGE_WOOD_SLAB))
                .add(ModBlocks.getRK(ModBlocks.PINK_WOOD_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.PINK_WOOD_SLAB))
                .add(ModBlocks.getRK(ModBlocks.PURPLE_WOOD_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.PURPLE_WOOD_SLAB))
                .add(ModBlocks.getRK(ModBlocks.RED_WOOD_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.RED_WOOD_SLAB))
                .add(ModBlocks.getRK(ModBlocks.WHITE_WOOD_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.WHITE_WOOD_SLAB))
                .add(ModBlocks.getRK(ModBlocks.YELLOW_WOOD_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.YELLOW_WOOD_SLAB))
                .add(ModBlocks.getRK(ModBlocks.BLUE_WOOD_BUTTON))
                .add(ModBlocks.getRK(ModBlocks.BLUE_WOOD_PRESSURE_PLATE))
                .add(ModBlocks.getRK(ModBlocks.BLACK_WOOD_BUTTON))
                .add(ModBlocks.getRK(ModBlocks.BLACK_WOOD_PRESSURE_PLATE))
                .add(ModBlocks.getRK(ModBlocks.BROWN_WOOD_BUTTON))
                .add(ModBlocks.getRK(ModBlocks.BROWN_WOOD_PRESSURE_PLATE))
                .add(ModBlocks.getRK(ModBlocks.CYAN_WOOD_BUTTON))
                .add(ModBlocks.getRK(ModBlocks.CYAN_WOOD_PRESSURE_PLATE))
                .add(ModBlocks.getRK(ModBlocks.GRAY_WOOD_BUTTON))
                .add(ModBlocks.getRK(ModBlocks.GRAY_WOOD_PRESSURE_PLATE))
                .add(ModBlocks.getRK(ModBlocks.GREEN_WOOD_BUTTON))
                .add(ModBlocks.getRK(ModBlocks.GREEN_WOOD_PRESSURE_PLATE))
                .add(ModBlocks.getRK(ModBlocks.LIGHT_BLUE_WOOD_BUTTON))
                .add(ModBlocks.getRK(ModBlocks.LIGHT_BLUE_WOOD_PRESSURE_PLATE))
                .add(ModBlocks.getRK(ModBlocks.LIGHT_GRAY_WOOD_BUTTON))
                .add(ModBlocks.getRK(ModBlocks.LIGHT_GRAY_WOOD_PRESSURE_PLATE))
                .add(ModBlocks.getRK(ModBlocks.LIGHT_PURPLE_WOOD_BUTTON))
                .add(ModBlocks.getRK(ModBlocks.LIGHT_PURPLE_WOOD_PRESSURE_PLATE))
                .add(ModBlocks.getRK(ModBlocks.LIME_WOOD_BUTTON))
                .add(ModBlocks.getRK(ModBlocks.LIME_WOOD_PRESSURE_PLATE))
                .add(ModBlocks.getRK(ModBlocks.MAGENTA_WOOD_BUTTON))
                .add(ModBlocks.getRK(ModBlocks.MAGENTA_WOOD_PRESSURE_PLATE))
                .add(ModBlocks.getRK(ModBlocks.ORANGE_WOOD_BUTTON))
                .add(ModBlocks.getRK(ModBlocks.ORANGE_WOOD_PRESSURE_PLATE))
                .add(ModBlocks.getRK(ModBlocks.PINK_WOOD_BUTTON))
                .add(ModBlocks.getRK(ModBlocks.PINK_WOOD_PRESSURE_PLATE))
                .add(ModBlocks.getRK(ModBlocks.PURPLE_WOOD_BUTTON))
                .add(ModBlocks.getRK(ModBlocks.PURPLE_WOOD_PRESSURE_PLATE))
                .add(ModBlocks.getRK(ModBlocks.RED_WOOD_BUTTON))
                .add(ModBlocks.getRK(ModBlocks.RED_WOOD_PRESSURE_PLATE))
                .add(ModBlocks.getRK(ModBlocks.WHITE_WOOD_BUTTON))
                .add(ModBlocks.getRK(ModBlocks.WHITE_WOOD_PRESSURE_PLATE))
                .add(ModBlocks.getRK(ModBlocks.YELLOW_WOOD_BUTTON))
                .add(ModBlocks.getRK(ModBlocks.YELLOW_WOOD_PRESSURE_PLATE));


        tag(BlockTags.PLANKS)
                .add(ModBlocks.getRK(ModBlocks.BLACK_PLANKS))
                .add(ModBlocks.getRK(ModBlocks.BLUE_PLANKS))
                .add(ModBlocks.getRK(ModBlocks.BROWN_PLANKS))
                .add(ModBlocks.getRK(ModBlocks.CYAN_PLANKS))
                .add(ModBlocks.getRK(ModBlocks.GRAY_PLANKS))
                .add(ModBlocks.getRK(ModBlocks.GREEN_PLANKS))
                .add(ModBlocks.getRK(ModBlocks.LIGHT_BLUE_PLANKS))
                .add(ModBlocks.getRK(ModBlocks.LIGHT_GRAY_PLANKS))
                .add(ModBlocks.getRK(ModBlocks.LIGHT_PURPLE_PLANKS))
                .add(ModBlocks.getRK(ModBlocks.LIME_PLANKS))
                .add(ModBlocks.getRK(ModBlocks.MAGENTA_PLANKS))
                .add(ModBlocks.getRK(ModBlocks.ORANGE_PLANKS))
                .add(ModBlocks.getRK(ModBlocks.PINK_PLANKS))
                .add(ModBlocks.getRK(ModBlocks.PURPLE_PLANKS))
                .add(ModBlocks.getRK(ModBlocks.RED_PLANKS))
                .add(ModBlocks.getRK(ModBlocks.WHITE_PLANKS))
                .add(ModBlocks.getRK(ModBlocks.YELLOW_PLANKS));

        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.BLUE_WOOD_STAIRS));
        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.BLUE_WOOD_SLAB));
        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.BLACK_WOOD_STAIRS));
        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.BLACK_WOOD_SLAB));
        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.BROWN_WOOD_STAIRS));
        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.BROWN_WOOD_SLAB));
        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.CYAN_WOOD_STAIRS));
        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.CYAN_WOOD_SLAB));
        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.GRAY_WOOD_STAIRS));
        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.GRAY_WOOD_SLAB));
        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.GREEN_WOOD_STAIRS));
        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.GREEN_WOOD_SLAB));
        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.LIGHT_BLUE_WOOD_STAIRS));
        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.LIGHT_BLUE_WOOD_SLAB));
        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.LIGHT_GRAY_WOOD_STAIRS));
        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.LIGHT_GRAY_WOOD_SLAB));
        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.LIGHT_PURPLE_WOOD_STAIRS));
        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.LIGHT_PURPLE_WOOD_SLAB));
        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.LIME_WOOD_STAIRS));
        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.LIME_WOOD_SLAB));
        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.MAGENTA_WOOD_STAIRS));
        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.MAGENTA_WOOD_SLAB));
        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.ORANGE_WOOD_STAIRS));
        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.ORANGE_WOOD_SLAB));
        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.PINK_WOOD_STAIRS));
        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.PINK_WOOD_SLAB));
        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.PURPLE_WOOD_STAIRS));
        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.PURPLE_WOOD_SLAB));
        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.RED_WOOD_STAIRS));
        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.RED_WOOD_SLAB));
        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.WHITE_WOOD_STAIRS));
        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.WHITE_WOOD_SLAB));
        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.YELLOW_WOOD_STAIRS));
        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.YELLOW_WOOD_SLAB));

        tag(BlockTags.BUTTONS).add(ModBlocks.getRK(ModBlocks.BLUE_WOOD_BUTTON));
        tag(BlockTags.WOODEN_PRESSURE_PLATES).add(ModBlocks.getRK(ModBlocks.BLUE_WOOD_PRESSURE_PLATE));
        tag(BlockTags.BUTTONS).add(ModBlocks.getRK(ModBlocks.BLACK_WOOD_BUTTON));
        tag(BlockTags.WOODEN_PRESSURE_PLATES).add(ModBlocks.getRK(ModBlocks.BLACK_WOOD_PRESSURE_PLATE));
        tag(BlockTags.BUTTONS).add(ModBlocks.getRK(ModBlocks.BROWN_WOOD_BUTTON));
        tag(BlockTags.WOODEN_PRESSURE_PLATES).add(ModBlocks.getRK(ModBlocks.BROWN_WOOD_PRESSURE_PLATE));
        tag(BlockTags.BUTTONS).add(ModBlocks.getRK(ModBlocks.CYAN_WOOD_BUTTON));
        tag(BlockTags.WOODEN_PRESSURE_PLATES).add(ModBlocks.getRK(ModBlocks.CYAN_WOOD_PRESSURE_PLATE));
        tag(BlockTags.BUTTONS).add(ModBlocks.getRK(ModBlocks.GRAY_WOOD_BUTTON));
        tag(BlockTags.WOODEN_PRESSURE_PLATES).add(ModBlocks.getRK(ModBlocks.GRAY_WOOD_PRESSURE_PLATE));
        tag(BlockTags.BUTTONS).add(ModBlocks.getRK(ModBlocks.GREEN_WOOD_BUTTON));
        tag(BlockTags.WOODEN_PRESSURE_PLATES).add(ModBlocks.getRK(ModBlocks.GREEN_WOOD_PRESSURE_PLATE));
        tag(BlockTags.BUTTONS).add(ModBlocks.getRK(ModBlocks.LIGHT_BLUE_WOOD_BUTTON));
        tag(BlockTags.WOODEN_PRESSURE_PLATES).add(ModBlocks.getRK(ModBlocks.LIGHT_BLUE_WOOD_PRESSURE_PLATE));
        tag(BlockTags.BUTTONS).add(ModBlocks.getRK(ModBlocks.LIGHT_GRAY_WOOD_BUTTON));
        tag(BlockTags.WOODEN_PRESSURE_PLATES).add(ModBlocks.getRK(ModBlocks.LIGHT_GRAY_WOOD_PRESSURE_PLATE));
        tag(BlockTags.BUTTONS).add(ModBlocks.getRK(ModBlocks.LIGHT_PURPLE_WOOD_BUTTON));
        tag(BlockTags.WOODEN_PRESSURE_PLATES).add(ModBlocks.getRK(ModBlocks.LIGHT_PURPLE_WOOD_PRESSURE_PLATE));
        tag(BlockTags.BUTTONS).add(ModBlocks.getRK(ModBlocks.LIME_WOOD_BUTTON));
        tag(BlockTags.WOODEN_PRESSURE_PLATES).add(ModBlocks.getRK(ModBlocks.LIME_WOOD_PRESSURE_PLATE));
        tag(BlockTags.BUTTONS).add(ModBlocks.getRK(ModBlocks.MAGENTA_WOOD_BUTTON));
        tag(BlockTags.WOODEN_PRESSURE_PLATES).add(ModBlocks.getRK(ModBlocks.MAGENTA_WOOD_PRESSURE_PLATE));
        tag(BlockTags.BUTTONS).add(ModBlocks.getRK(ModBlocks.ORANGE_WOOD_BUTTON));
        tag(BlockTags.WOODEN_PRESSURE_PLATES).add(ModBlocks.getRK(ModBlocks.ORANGE_WOOD_PRESSURE_PLATE));
        tag(BlockTags.BUTTONS).add(ModBlocks.getRK(ModBlocks.PINK_WOOD_BUTTON));
        tag(BlockTags.WOODEN_PRESSURE_PLATES).add(ModBlocks.getRK(ModBlocks.PINK_WOOD_PRESSURE_PLATE));
        tag(BlockTags.BUTTONS).add(ModBlocks.getRK(ModBlocks.PURPLE_WOOD_BUTTON));
        tag(BlockTags.WOODEN_PRESSURE_PLATES).add(ModBlocks.getRK(ModBlocks.PURPLE_WOOD_PRESSURE_PLATE));
        tag(BlockTags.BUTTONS).add(ModBlocks.getRK(ModBlocks.RED_WOOD_BUTTON));
        tag(BlockTags.WOODEN_PRESSURE_PLATES).add(ModBlocks.getRK(ModBlocks.RED_WOOD_PRESSURE_PLATE));
        tag(BlockTags.BUTTONS).add(ModBlocks.getRK(ModBlocks.WHITE_WOOD_BUTTON));
        tag(BlockTags.WOODEN_PRESSURE_PLATES).add(ModBlocks.getRK(ModBlocks.WHITE_WOOD_PRESSURE_PLATE));
        tag(BlockTags.BUTTONS).add(ModBlocks.getRK(ModBlocks.YELLOW_WOOD_BUTTON));
        tag(BlockTags.WOODEN_PRESSURE_PLATES).add(ModBlocks.getRK(ModBlocks.YELLOW_WOOD_PRESSURE_PLATE));

        tag(BlockTags.WOODEN_FENCES).add(ModBlocks.getRK(ModBlocks.BLUE_WOOD_FENCE));
        tag(BlockTags.FENCE_GATES).add(ModBlocks.getRK(ModBlocks.BLUE_WOOD_FENCE_GATE));


    }
}
