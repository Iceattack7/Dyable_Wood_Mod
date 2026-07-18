package net.iceattack.dyablewoodmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.iceattack.dyablewoodmod.block.ModBlocks;
import net.iceattack.dyablewoodmod.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        return new RecipeProvider(registries, output) {
            @Override
            public void buildRecipes() {


                shapeless(RecipeCategory.MISC, ModBlocks.LIGHT_PURPLE_PLANKS, 1)
                        .requires(ModItems.LIGHT_PURPLE_DYE)
                        .requires(ItemTags.PLANKS)
                        .unlockedBy(getHasName(ModItems.LIGHT_PURPLE_DYE), has(ModItems.LIGHT_PURPLE_DYE))
                        .save(output);

                shapeless(RecipeCategory.MISC, ModBlocks.BLACK_PLANKS, 1)
                        .requires(ConventionalItemTags.BLACK_DYES)
                        .requires(ItemTags.PLANKS)
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);

                shapeless(RecipeCategory.MISC, ModBlocks.BLUE_PLANKS, 1)
                        .requires(ConventionalItemTags.BLUE_DYES)
                        .requires(ItemTags.PLANKS)
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);

                shapeless(RecipeCategory.MISC, ModBlocks.BROWN_PLANKS, 1)
                        .requires(ConventionalItemTags.BROWN_DYES)
                        .requires(ItemTags.PLANKS)
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);

                shapeless(RecipeCategory.MISC, ModBlocks.CYAN_PLANKS, 1)
                        .requires(ConventionalItemTags.CYAN_DYES)
                        .requires(ItemTags.PLANKS)
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);

                shapeless(RecipeCategory.MISC, ModBlocks.GRAY_PLANKS, 1)
                        .requires(ConventionalItemTags.GRAY_DYES)
                        .requires(ItemTags.PLANKS)
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);

                shapeless(RecipeCategory.MISC, ModBlocks.GREEN_PLANKS, 1)
                        .requires(ConventionalItemTags.GREEN_DYES)
                        .requires(ItemTags.PLANKS)
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);

                shapeless(RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_PLANKS, 1)
                        .requires(ConventionalItemTags.LIGHT_BLUE_DYES)
                        .requires(ItemTags.PLANKS)
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);

                shapeless(RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_PLANKS, 1)
                        .requires(ConventionalItemTags.LIGHT_GRAY_DYES)
                        .requires(ItemTags.PLANKS)
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);

                shapeless(RecipeCategory.MISC, ModBlocks.LIME_PLANKS, 1)
                        .requires(ConventionalItemTags.LIME_DYES)
                        .requires(ItemTags.PLANKS)
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);

                shapeless(RecipeCategory.MISC, ModBlocks.MAGENTA_PLANKS, 1)
                        .requires(ConventionalItemTags.MAGENTA_DYES)
                        .requires(ItemTags.PLANKS)
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);

                shapeless(RecipeCategory.MISC, ModBlocks.ORANGE_PLANKS, 1)
                        .requires(ConventionalItemTags.ORANGE_DYES)
                        .requires(ItemTags.PLANKS)
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);

                shapeless(RecipeCategory.MISC, ModBlocks.PINK_PLANKS, 1)
                        .requires(ConventionalItemTags.PINK_DYES)
                        .requires(ItemTags.PLANKS)
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);

                shapeless(RecipeCategory.MISC, ModBlocks.PURPLE_PLANKS, 1)
                        .requires(ConventionalItemTags.PURPLE_DYES)
                        .requires(ItemTags.PLANKS)
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);

                shapeless(RecipeCategory.MISC, ModBlocks.RED_PLANKS, 1)
                        .requires(ConventionalItemTags.RED_DYES)
                        .requires(ItemTags.PLANKS)
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);

                shapeless(RecipeCategory.MISC, ModBlocks.WHITE_PLANKS, 1)
                        .requires(ConventionalItemTags.WHITE_DYES)
                        .requires(ItemTags.PLANKS)
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);

                shapeless(RecipeCategory.MISC, ModBlocks.YELLOW_PLANKS, 1)
                        .requires(ConventionalItemTags.YELLOW_DYES)
                        .requires(ItemTags.PLANKS)
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);

                stairBuilder(ModBlocks.BLUE_WOOD_STAIRS, Ingredient.of(ModBlocks.BLUE_PLANKS))
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

            }
        };
    }

    @Override
    public String getName() {
        return "Dyable Wood Mod Recipes";
    }
}
