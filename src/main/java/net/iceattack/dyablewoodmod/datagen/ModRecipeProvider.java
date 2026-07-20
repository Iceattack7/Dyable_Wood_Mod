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

                buttonBuilder(ModBlocks.BLUE_WOOD_BUTTON, Ingredient.of(ModBlocks.BLUE_PLANKS))
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);
                pressurePlate(ModBlocks.BLUE_WOOD_PRESSURE_PLATE, ModBlocks.BLUE_PLANKS);

                fenceBuilder(ModBlocks.BLUE_WOOD_FENCE, Ingredient.of(ModBlocks.BLUE_PLANKS))
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);

                fenceGateBuilder(ModBlocks.BLUE_WOOD_FENCE_GATE, Ingredient.of(ModBlocks.BLUE_PLANKS))
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);

                stairBuilder(ModBlocks.BLACK_WOOD_STAIRS, Ingredient.of(ModBlocks.BLACK_PLANKS))
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_WOOD_SLAB, ModBlocks.BLACK_PLANKS);

                buttonBuilder(ModBlocks.BLACK_WOOD_BUTTON, Ingredient.of(ModBlocks.BLACK_PLANKS))
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);
                pressurePlate(ModBlocks.BLACK_WOOD_PRESSURE_PLATE, ModBlocks.BLACK_PLANKS);

                fenceBuilder(ModBlocks.BLACK_WOOD_FENCE, Ingredient.of(ModBlocks.BLACK_PLANKS))
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);

                fenceGateBuilder(ModBlocks.BLACK_WOOD_FENCE_GATE, Ingredient.of(ModBlocks.BLACK_PLANKS))
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);

                stairBuilder(ModBlocks.BROWN_WOOD_STAIRS, Ingredient.of(ModBlocks.BROWN_PLANKS))
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_WOOD_SLAB, ModBlocks.BROWN_PLANKS);

                buttonBuilder(ModBlocks.BROWN_WOOD_BUTTON, Ingredient.of(ModBlocks.BROWN_PLANKS))
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);
                pressurePlate(ModBlocks.BROWN_WOOD_PRESSURE_PLATE, ModBlocks.BROWN_PLANKS);

                fenceBuilder(ModBlocks.BROWN_WOOD_FENCE, Ingredient.of(ModBlocks.BROWN_PLANKS))
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);

                fenceGateBuilder(ModBlocks.BROWN_WOOD_FENCE_GATE, Ingredient.of(ModBlocks.BROWN_PLANKS))
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);

                stairBuilder(ModBlocks.CYAN_WOOD_STAIRS, Ingredient.of(ModBlocks.CYAN_PLANKS))
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_WOOD_SLAB, ModBlocks.CYAN_PLANKS);

                buttonBuilder(ModBlocks.CYAN_WOOD_BUTTON, Ingredient.of(ModBlocks.CYAN_PLANKS))
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);
                pressurePlate(ModBlocks.CYAN_WOOD_PRESSURE_PLATE, ModBlocks.CYAN_PLANKS);

                fenceBuilder(ModBlocks.CYAN_WOOD_FENCE, Ingredient.of(ModBlocks.CYAN_PLANKS))
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);

                fenceGateBuilder(ModBlocks.CYAN_WOOD_FENCE_GATE, Ingredient.of(ModBlocks.CYAN_PLANKS))
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);

                stairBuilder(ModBlocks.GRAY_WOOD_STAIRS, Ingredient.of(ModBlocks.GRAY_PLANKS))
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_WOOD_SLAB, ModBlocks.GRAY_PLANKS);

                buttonBuilder(ModBlocks.GRAY_WOOD_BUTTON, Ingredient.of(ModBlocks.GRAY_PLANKS))
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);
                pressurePlate(ModBlocks.GRAY_WOOD_PRESSURE_PLATE, ModBlocks.GRAY_PLANKS);

                fenceBuilder(ModBlocks.GRAY_WOOD_FENCE, Ingredient.of(ModBlocks.GRAY_PLANKS))
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);

                fenceGateBuilder(ModBlocks.GRAY_WOOD_FENCE_GATE, Ingredient.of(ModBlocks.GRAY_PLANKS))
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);

                stairBuilder(ModBlocks.GREEN_WOOD_STAIRS, Ingredient.of(ModBlocks.GREEN_PLANKS))
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_WOOD_SLAB, ModBlocks.GREEN_PLANKS);

                buttonBuilder(ModBlocks.GREEN_WOOD_BUTTON, Ingredient.of(ModBlocks.GREEN_PLANKS))
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);
                pressurePlate(ModBlocks.GREEN_WOOD_PRESSURE_PLATE, ModBlocks.GREEN_PLANKS);

                fenceBuilder(ModBlocks.GREEN_WOOD_FENCE, Ingredient.of(ModBlocks.GREEN_PLANKS))
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);

                fenceGateBuilder(ModBlocks.GREEN_WOOD_FENCE_GATE, Ingredient.of(ModBlocks.GREEN_PLANKS))
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);

                stairBuilder(ModBlocks.LIGHT_BLUE_WOOD_STAIRS, Ingredient.of(ModBlocks.LIGHT_BLUE_PLANKS))
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_WOOD_SLAB, ModBlocks.LIGHT_BLUE_PLANKS);

                buttonBuilder(ModBlocks.LIGHT_BLUE_WOOD_BUTTON, Ingredient.of(ModBlocks.LIGHT_BLUE_PLANKS))
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);
                pressurePlate(ModBlocks.LIGHT_BLUE_WOOD_PRESSURE_PLATE, ModBlocks.LIGHT_BLUE_PLANKS);

                fenceBuilder(ModBlocks.LIGHT_BLUE_WOOD_FENCE, Ingredient.of(ModBlocks.LIGHT_BLUE_PLANKS))
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);

                fenceGateBuilder(ModBlocks.LIGHT_BLUE_WOOD_FENCE_GATE, Ingredient.of(ModBlocks.LIGHT_BLUE_PLANKS))
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);

                stairBuilder(ModBlocks.LIGHT_GRAY_WOOD_STAIRS, Ingredient.of(ModBlocks.LIGHT_GRAY_PLANKS))
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_WOOD_SLAB, ModBlocks.LIGHT_GRAY_PLANKS);

                buttonBuilder(ModBlocks.LIGHT_GRAY_WOOD_BUTTON, Ingredient.of(ModBlocks.LIGHT_GRAY_PLANKS))
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);
                pressurePlate(ModBlocks.LIGHT_GRAY_WOOD_PRESSURE_PLATE, ModBlocks.LIGHT_GRAY_PLANKS);

                fenceBuilder(ModBlocks.LIGHT_GRAY_WOOD_FENCE, Ingredient.of(ModBlocks.LIGHT_GRAY_PLANKS))
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);

                fenceGateBuilder(ModBlocks.LIGHT_GRAY_WOOD_FENCE_GATE, Ingredient.of(ModBlocks.LIGHT_GRAY_PLANKS))
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);

                stairBuilder(ModBlocks.LIGHT_PURPLE_WOOD_STAIRS, Ingredient.of(ModBlocks.LIGHT_PURPLE_PLANKS))
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_PURPLE_WOOD_SLAB, ModBlocks.LIGHT_PURPLE_PLANKS);

                buttonBuilder(ModBlocks.LIGHT_PURPLE_WOOD_BUTTON, Ingredient.of(ModBlocks.LIGHT_PURPLE_PLANKS))
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);
                pressurePlate(ModBlocks.LIGHT_PURPLE_WOOD_PRESSURE_PLATE, ModBlocks.LIGHT_PURPLE_PLANKS);

                fenceBuilder(ModBlocks.LIGHT_PURPLE_WOOD_FENCE, Ingredient.of(ModBlocks.LIGHT_PURPLE_PLANKS))
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);

                fenceGateBuilder(ModBlocks.LIGHT_PURPLE_WOOD_FENCE_GATE, Ingredient.of(ModBlocks.LIGHT_PURPLE_PLANKS))
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);

                stairBuilder(ModBlocks.LIME_WOOD_STAIRS, Ingredient.of(ModBlocks.LIME_PLANKS))
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_WOOD_SLAB, ModBlocks.LIME_PLANKS);

                buttonBuilder(ModBlocks.LIME_WOOD_BUTTON, Ingredient.of(ModBlocks.LIME_PLANKS))
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);
                pressurePlate(ModBlocks.LIME_WOOD_PRESSURE_PLATE, ModBlocks.LIME_PLANKS);

                fenceBuilder(ModBlocks.LIME_WOOD_FENCE, Ingredient.of(ModBlocks.LIME_PLANKS))
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);

                fenceGateBuilder(ModBlocks.LIME_WOOD_FENCE_GATE, Ingredient.of(ModBlocks.LIME_PLANKS))
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);

                stairBuilder(ModBlocks.MAGENTA_WOOD_STAIRS, Ingredient.of(ModBlocks.MAGENTA_PLANKS))
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_WOOD_SLAB, ModBlocks.MAGENTA_PLANKS);

                buttonBuilder(ModBlocks.MAGENTA_WOOD_BUTTON, Ingredient.of(ModBlocks.MAGENTA_PLANKS))
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);
                pressurePlate(ModBlocks.MAGENTA_WOOD_PRESSURE_PLATE, ModBlocks.MAGENTA_PLANKS);

                stairBuilder(ModBlocks.ORANGE_WOOD_STAIRS, Ingredient.of(ModBlocks.ORANGE_PLANKS))
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_WOOD_SLAB, ModBlocks.ORANGE_PLANKS);

                buttonBuilder(ModBlocks.ORANGE_WOOD_BUTTON, Ingredient.of(ModBlocks.ORANGE_PLANKS))
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);
                pressurePlate(ModBlocks.ORANGE_WOOD_PRESSURE_PLATE, ModBlocks.ORANGE_PLANKS);

                stairBuilder(ModBlocks.PINK_WOOD_STAIRS, Ingredient.of(ModBlocks.PINK_PLANKS))
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_WOOD_SLAB, ModBlocks.PINK_PLANKS);

                buttonBuilder(ModBlocks.PINK_WOOD_BUTTON, Ingredient.of(ModBlocks.PINK_PLANKS))
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);
                pressurePlate(ModBlocks.PINK_WOOD_PRESSURE_PLATE, ModBlocks.PINK_PLANKS);

                stairBuilder(ModBlocks.PURPLE_WOOD_STAIRS, Ingredient.of(ModBlocks.PURPLE_PLANKS))
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_WOOD_SLAB, ModBlocks.PURPLE_PLANKS);

                buttonBuilder(ModBlocks.PURPLE_WOOD_BUTTON, Ingredient.of(ModBlocks.PURPLE_PLANKS))
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);
                pressurePlate(ModBlocks.PURPLE_WOOD_PRESSURE_PLATE, ModBlocks.PURPLE_PLANKS);

                stairBuilder(ModBlocks.RED_WOOD_STAIRS, Ingredient.of(ModBlocks.RED_PLANKS))
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_WOOD_SLAB, ModBlocks.RED_PLANKS);

                buttonBuilder(ModBlocks.RED_WOOD_BUTTON, Ingredient.of(ModBlocks.RED_PLANKS))
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);
                pressurePlate(ModBlocks.RED_WOOD_PRESSURE_PLATE, ModBlocks.RED_PLANKS);

                stairBuilder(ModBlocks.WHITE_WOOD_STAIRS, Ingredient.of(ModBlocks.WHITE_PLANKS))
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_WOOD_SLAB, ModBlocks.WHITE_PLANKS);

                buttonBuilder(ModBlocks.WHITE_WOOD_BUTTON, Ingredient.of(ModBlocks.WHITE_PLANKS))
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);
                pressurePlate(ModBlocks.WHITE_WOOD_PRESSURE_PLATE, ModBlocks.WHITE_PLANKS);

                stairBuilder(ModBlocks.YELLOW_WOOD_STAIRS, Ingredient.of(ModBlocks.YELLOW_PLANKS))
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_WOOD_SLAB, ModBlocks.YELLOW_PLANKS);

                buttonBuilder(ModBlocks.YELLOW_WOOD_BUTTON, Ingredient.of(ModBlocks.YELLOW_PLANKS))
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);
                pressurePlate(ModBlocks.YELLOW_WOOD_PRESSURE_PLATE, ModBlocks.YELLOW_PLANKS);

            }
        };
    }

    @Override
    public String getName() {
        return "Dyable Wood Mod Recipes";
    }
}
