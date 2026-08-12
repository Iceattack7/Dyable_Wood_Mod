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
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
