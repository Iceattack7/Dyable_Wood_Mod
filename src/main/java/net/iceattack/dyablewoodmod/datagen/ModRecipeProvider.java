package net.iceattack.dyablewoodmod.datagen;

import net.iceattack.dyablewoodmod.block.ModBlocks;
import net.iceattack.dyablewoodmod.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.Tags;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
    }

    public static class Runner extends RecipeProvider.Runner {


        public Runner(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> registries) {
            super(packOutput, registries);
        }

        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
            return new ModRecipeProvider(registries, output);
        }

        @Override
        public String getName() {
            return "Dyable Wood Mod Recipes";
        }
    }

    @Override
    protected void buildRecipes() {

        shapeless(RecipeCategory.MISC, ModItems.LIGHT_PURPLE_DYE.get(), 9)
                .requires(Tags.Items.DYES_PURPLE)
                .requires(Tags.Items.DYES_WHITE)
                .unlockedBy(getHasName(Items.RED_TULIP), has(Items.RED_TULIP))
                .save(output);

        shapeless(RecipeCategory.MISC, ModBlocks.LIGHT_PURPLE_PLANKS, 1)
                .requires(ModItems.LIGHT_PURPLE_DYE)
                .requires(ItemTags.PLANKS)
                .unlockedBy(getHasName(ModItems.LIGHT_PURPLE_DYE), has(ModItems.LIGHT_PURPLE_DYE))
                .save(output);

        shapeless(RecipeCategory.MISC, ModBlocks.BLACK_PLANKS, 1)
                .requires(Tags.Items.DYES_BLACK)
                .requires(ItemTags.PLANKS)
                .unlockedBy("has_planks", has(ItemTags.PLANKS))
                .save(output);

        shapeless(RecipeCategory.MISC, ModBlocks.BLUE_PLANKS, 1)
                .requires(Tags.Items.DYES_BLUE)
                .requires(ItemTags.PLANKS)
                .unlockedBy("has_planks", has(ItemTags.PLANKS))
                .save(output);

        shapeless(RecipeCategory.MISC, ModBlocks.BROWN_PLANKS, 1)
                .requires(Tags.Items.DYES_BROWN)
                .requires(ItemTags.PLANKS)
                .unlockedBy("has_planks", has(ItemTags.PLANKS))
                .save(output);

        shapeless(RecipeCategory.MISC, ModBlocks.CYAN_PLANKS, 1)
                .requires(Tags.Items.DYES_CYAN)
                .requires(ItemTags.PLANKS)
                .unlockedBy("has_planks", has(ItemTags.PLANKS))
                .save(output);

        shapeless(RecipeCategory.MISC, ModBlocks.GRAY_PLANKS, 1)
                .requires(Tags.Items.DYES_GRAY)
                .requires(ItemTags.PLANKS)
                .unlockedBy("has_planks", has(ItemTags.PLANKS))
                .save(output);

        shapeless(RecipeCategory.MISC, ModBlocks.GREEN_PLANKS, 1)
                .requires(Tags.Items.DYES_GREEN)
                .requires(ItemTags.PLANKS)
                .unlockedBy("has_planks", has(ItemTags.PLANKS))
                .save(output);

        shapeless(RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_PLANKS, 1)
                .requires(Tags.Items.DYES_LIGHT_BLUE)
                .requires(ItemTags.PLANKS)
                .unlockedBy("has_planks", has(ItemTags.PLANKS))
                .save(output);

        shapeless(RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_PLANKS, 1)
                .requires(Tags.Items.DYES_LIGHT_GRAY)
                .requires(ItemTags.PLANKS)
                .unlockedBy("has_planks", has(ItemTags.PLANKS))
                .save(output);

        shapeless(RecipeCategory.MISC, ModBlocks.LIME_PLANKS, 1)
                .requires(Tags.Items.DYES_LIME)
                .requires(ItemTags.PLANKS)
                .unlockedBy("has_planks", has(ItemTags.PLANKS))
                .save(output);

        shapeless(RecipeCategory.MISC, ModBlocks.MAGENTA_PLANKS, 1)
                .requires(Tags.Items.DYES_MAGENTA)
                .requires(ItemTags.PLANKS)
                .unlockedBy("has_planks", has(ItemTags.PLANKS))
                .save(output);

        shapeless(RecipeCategory.MISC, ModBlocks.ORANGE_PLANKS, 1)
                .requires(Tags.Items.DYES_ORANGE)
                .requires(ItemTags.PLANKS)
                .unlockedBy("has_planks", has(ItemTags.PLANKS))
                .save(output);

        shapeless(RecipeCategory.MISC, ModBlocks.PINK_PLANKS, 1)
                .requires(Tags.Items.DYES_PINK)
                .requires(ItemTags.PLANKS)
                .unlockedBy("has_planks", has(ItemTags.PLANKS))
                .save(output);

        shapeless(RecipeCategory.MISC, ModBlocks.PURPLE_PLANKS, 1)
                .requires(Tags.Items.DYES_PURPLE)
                .requires(ItemTags.PLANKS)
                .unlockedBy("has_planks", has(ItemTags.PLANKS))
                .save(output);

        shapeless(RecipeCategory.MISC, ModBlocks.RED_PLANKS, 1)
                .requires(Tags.Items.DYES_RED)
                .requires(ItemTags.PLANKS)
                .unlockedBy("has_planks", has(ItemTags.PLANKS))
                .save(output);

        shapeless(RecipeCategory.MISC, ModBlocks.WHITE_PLANKS, 1)
                .requires(Tags.Items.DYES_WHITE)
                .requires(ItemTags.PLANKS)
                .unlockedBy("has_planks", has(ItemTags.PLANKS))
                .save(output);

        shapeless(RecipeCategory.MISC, ModBlocks.YELLOW_PLANKS, 1)
                .requires(Tags.Items.DYES_YELLOW)
                .requires(ItemTags.PLANKS)
                .unlockedBy("has_planks", has(ItemTags.PLANKS))
                .save(output);

        stairBuilder(ModBlocks.BLUE_WOOD_STAIRS.get(), Ingredient.of(ModBlocks.BLUE_PLANKS))
                .unlockedBy("has_planks", has(ItemTags.PLANKS))
                .save(output);

        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_WOOD_SLAB, ModBlocks.BLUE_PLANKS);

        stairBuilder(ModBlocks.BLACK_WOOD_STAIRS, Ingredient.of(ModBlocks.BLACK_PLANKS))
                .unlockedBy("has_planks", has(ItemTags.PLANKS))
                .save(output);

        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_WOOD_SLAB, ModBlocks.BLACK_PLANKS);

        stairBuilder(ModBlocks.BROWN_WOOD_STAIRS, Ingredient.of(ModBlocks.BROWN_PLANKS))
                .unlockedBy("has_planks", has(ItemTags.PLANKS))
                .save(output);

        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_WOOD_SLAB, ModBlocks.BROWN_PLANKS);

        stairBuilder(ModBlocks.CYAN_WOOD_STAIRS, Ingredient.of(ModBlocks.CYAN_PLANKS))
                .unlockedBy("has_planks", has(ItemTags.PLANKS))
                .save(output);

        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_WOOD_SLAB, ModBlocks.CYAN_PLANKS);

        stairBuilder(ModBlocks.GRAY_WOOD_STAIRS, Ingredient.of(ModBlocks.GRAY_PLANKS))
                .unlockedBy("has_planks", has(ItemTags.PLANKS))
                .save(output);

        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_WOOD_SLAB, ModBlocks.GRAY_PLANKS);

        stairBuilder(ModBlocks.GREEN_WOOD_STAIRS, Ingredient.of(ModBlocks.GREEN_PLANKS))
                .unlockedBy("has_planks", has(ItemTags.PLANKS))
                .save(output);

        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_WOOD_SLAB, ModBlocks.GREEN_PLANKS);

        stairBuilder(ModBlocks.LIGHT_BLUE_WOOD_STAIRS, Ingredient.of(ModBlocks.LIGHT_BLUE_PLANKS))
                .unlockedBy("has_planks", has(ItemTags.PLANKS))
                .save(output);

        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_WOOD_SLAB, ModBlocks.LIGHT_BLUE_PLANKS);

        stairBuilder(ModBlocks.LIGHT_GRAY_WOOD_STAIRS, Ingredient.of(ModBlocks.LIGHT_GRAY_PLANKS))
                .unlockedBy("has_planks", has(ItemTags.PLANKS))
                .save(output);

        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_WOOD_SLAB, ModBlocks.LIGHT_GRAY_PLANKS);

        stairBuilder(ModBlocks.LIGHT_PURPLE_WOOD_STAIRS, Ingredient.of(ModBlocks.LIGHT_PURPLE_PLANKS))
                .unlockedBy("has_planks", has(ItemTags.PLANKS))
                .save(output);

        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_PURPLE_WOOD_SLAB, ModBlocks.LIGHT_PURPLE_PLANKS);

        stairBuilder(ModBlocks.LIME_WOOD_STAIRS, Ingredient.of(ModBlocks.LIME_PLANKS))
                .unlockedBy("has_planks", has(ItemTags.PLANKS))
                .save(output);

        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_WOOD_SLAB, ModBlocks.LIME_PLANKS);

        stairBuilder(ModBlocks.MAGENTA_WOOD_STAIRS, Ingredient.of(ModBlocks.MAGENTA_PLANKS))
                .unlockedBy("has_planks", has(ItemTags.PLANKS))
                .save(output);

        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_WOOD_SLAB, ModBlocks.MAGENTA_PLANKS);

        stairBuilder(ModBlocks.ORANGE_WOOD_STAIRS, Ingredient.of(ModBlocks.ORANGE_PLANKS))
                .unlockedBy("has_planks", has(ItemTags.PLANKS))
                .save(output);

        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_WOOD_SLAB, ModBlocks.ORANGE_PLANKS);

        stairBuilder(ModBlocks.PINK_WOOD_STAIRS, Ingredient.of(ModBlocks.PINK_PLANKS))
                .unlockedBy("has_planks", has(ItemTags.PLANKS))
                .save(output);

        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_WOOD_SLAB, ModBlocks.PINK_PLANKS);

        stairBuilder(ModBlocks.PURPLE_WOOD_STAIRS, Ingredient.of(ModBlocks.PURPLE_PLANKS))
                .unlockedBy("has_planks", has(ItemTags.PLANKS))
                .save(output);

        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_WOOD_SLAB, ModBlocks.PURPLE_PLANKS);

        stairBuilder(ModBlocks.RED_WOOD_STAIRS, Ingredient.of(ModBlocks.RED_PLANKS))
                .unlockedBy("has_planks", has(ItemTags.PLANKS))
                .save(output);

        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_WOOD_SLAB, ModBlocks.RED_PLANKS);

        stairBuilder(ModBlocks.WHITE_WOOD_STAIRS, Ingredient.of(ModBlocks.WHITE_PLANKS))
                .unlockedBy("has_planks", has(ItemTags.PLANKS))
                .save(output);

        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_WOOD_SLAB, ModBlocks.WHITE_PLANKS);

        stairBuilder(ModBlocks.YELLOW_WOOD_STAIRS, Ingredient.of(ModBlocks.YELLOW_PLANKS))
                .unlockedBy("has_planks", has(ItemTags.PLANKS))
                .save(output);

        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_WOOD_SLAB, ModBlocks.YELLOW_PLANKS);

    }
}
