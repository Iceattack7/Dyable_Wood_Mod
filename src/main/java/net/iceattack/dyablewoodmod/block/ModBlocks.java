package net.iceattack.dyablewoodmod.block;

import net.iceattack.dyablewoodmod.DyableWoodMod;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Function;

public class ModBlocks {
    public static final Block BLUE_PLANKS = registerBlock("blue_planks",
            properties -> new Block(properties.strength(2.0f, 3.0f)
                    .sound(SoundType.WOOD)));
    public static final Block BLACK_PLANKS = registerBlock("black_planks",
            properties -> new Block(properties.strength(2.0f, 3.0f)
                    .sound(SoundType.WOOD)));
    public static final Block BROWN_PLANKS = registerBlock("brown_planks",
            properties -> new Block(properties.strength(2.0f, 3.0f)
                    .sound(SoundType.WOOD)));
    public static final Block CYAN_PLANKS = registerBlock("cyan_planks",
            properties -> new Block(properties.strength(2.0f, 3.0f)
                    .sound(SoundType.WOOD)));
    public static final Block GRAY_PLANKS = registerBlock("gray_planks",
            properties -> new Block(properties.strength(2.0f, 3.0f)
                    .sound(SoundType.WOOD)));
    public static final Block GREEN_PLANKS = registerBlock("green_planks",
            properties -> new Block(properties.strength(2.0f, 3.0f)
                    .sound(SoundType.WOOD)));
    public static final Block LIGHT_BLUE_PLANKS = registerBlock("light_blue_planks",
            properties -> new Block(properties.strength(2.0f, 3.0f)
                    .sound(SoundType.WOOD)));
    public static final Block LIGHT_GRAY_PLANKS = registerBlock("light_gray_planks",
            properties -> new Block(properties.strength(2.0f, 3.0f)
                    .sound(SoundType.WOOD)));
    public static final Block LIGHT_PURPLE_PLANKS = registerBlock("light_purple_planks",
            properties -> new Block(properties.strength(2.0f, 3.0f)
                    .sound(SoundType.WOOD)));
    public static final Block LIME_PLANKS = registerBlock("lime_planks",
            properties -> new Block(properties.strength(2.0f, 3.0f)
                    .sound(SoundType.WOOD)));
    public static final Block MAGENTA_PLANKS = registerBlock("magenta_planks",
            properties -> new Block(properties.strength(2.0f, 3.0f)
                    .sound(SoundType.WOOD)));
    public static final Block ORANGE_PLANKS = registerBlock("orange_planks",
            properties -> new Block(properties.strength(2.0f, 3.0f)
                    .sound(SoundType.WOOD)));
    public static final Block PINK_PLANKS = registerBlock("pink_planks",
            properties -> new Block(properties.strength(2.0f, 3.0f)
                    .sound(SoundType.WOOD)));
    public static final Block PURPLE_PLANKS = registerBlock("purple_planks",
            properties -> new Block(properties.strength(2.0f, 3.0f)
                    .sound(SoundType.WOOD)));
    public static final Block RED_PLANKS = registerBlock("red_planks",
            properties -> new Block(properties.strength(2.0f, 3.0f)
                    .sound(SoundType.WOOD)));
    public static final Block WHITE_PLANKS = registerBlock("white_planks",
            properties -> new Block(properties.strength(2.0f, 3.0f)
                    .sound(SoundType.WOOD)));
    public static final Block YELLOW_PLANKS = registerBlock("yellow_planks",
            properties -> new Block(properties.strength(2.0f, 3.0f)
                    .sound(SoundType.WOOD)));

    public static final Block BLUE_WOOD_STAIRS = registerBlock("blue_wood_stairs",
            properties -> new StairBlock(ModBlocks.BLUE_PLANKS.defaultBlockState(),
                    properties.strength(2.0f, 3.0f)));
    public static final Block BLUE_WOOD_SLAB = registerBlock("blue_wood_slab",
            properties -> new SlabBlock(properties.strength(2.0f, 3.0f)));

    public static ResourceKey<Block> getRK(Block block) {

        return BuiltInRegistries.BLOCK.getResourceKey(block).get();
    }

    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(DyableWoodMod.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(DyableWoodMod.MOD_ID, name), toRegister);
    }

    public static void  registerBlockItem(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(DyableWoodMod.MOD_ID, name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(DyableWoodMod.MOD_ID, name)))));
    }

    public static void registerModBlocks() {
        DyableWoodMod.LOGGER.info("Registering Mod Blocks for " + DyableWoodMod.MOD_ID);
    }
}
