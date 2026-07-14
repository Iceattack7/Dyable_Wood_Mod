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

            }
        };
    }

    @Override
    public String getName() {
        return "Dyable Wood Mod Recipes";
    }
}
