package net.iceattack.dyablewoodmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.iceattack.dyablewoodmod.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends FabricTagsProvider.ItemTagsProvider {
    public ModItemTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        tag(ItemTags.PLANKS)
                .add(getItemRK(ModBlocks.BLACK_PLANKS))
                .add(getItemRK(ModBlocks.BLUE_PLANKS))
                .add(getItemRK(ModBlocks.BROWN_PLANKS))
                .add(getItemRK(ModBlocks.CYAN_PLANKS))
                .add(getItemRK(ModBlocks.GRAY_PLANKS))
                .add(getItemRK(ModBlocks.GREEN_PLANKS))
                .add(getItemRK(ModBlocks.LIGHT_BLUE_PLANKS))
                .add(getItemRK(ModBlocks.LIGHT_GRAY_PLANKS))
                .add(getItemRK(ModBlocks.LIGHT_PURPLE_PLANKS))
                .add(getItemRK(ModBlocks.LIME_PLANKS))
                .add(getItemRK(ModBlocks.MAGENTA_PLANKS))
                .add(getItemRK(ModBlocks.ORANGE_PLANKS))
                .add(getItemRK(ModBlocks.PINK_PLANKS))
                .add(getItemRK(ModBlocks.PURPLE_PLANKS))
                .add(getItemRK(ModBlocks.RED_PLANKS))
                .add(getItemRK(ModBlocks.WHITE_PLANKS))
                .add(getItemRK(ModBlocks.YELLOW_PLANKS));

    }

    private ResourceKey<Item> getItemRK(Block block) {
        return ResourceKey.create(Registries.ITEM, BuiltInRegistries.BLOCK.getKey(block));
        }

    }
