package net.iceattack.dyablewoodmod.block;

import net.iceattack.dyablewoodmod.DyableWoodMod;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

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

    public static final Block BLACK_WOOD_STAIRS = registerBlock("black_wood_stairs",
            properties -> new StairBlock(ModBlocks.BLACK_PLANKS.defaultBlockState(),
                    properties.strength(2.0f, 3.0f)));
    public static final Block BLACK_WOOD_SLAB = registerBlock("black_wood_slab",
            properties -> new SlabBlock(properties.strength(2.0f, 3.0f)));

    public static final Block BROWN_WOOD_STAIRS = registerBlock("brown_wood_stairs",
            properties -> new StairBlock(ModBlocks.BROWN_PLANKS.defaultBlockState(),
                    properties.strength(2.0f, 3.0f)));
    public static final Block BROWN_WOOD_SLAB = registerBlock("brown_wood_slab",
            properties -> new SlabBlock(properties.strength(2.0f, 3.0f)));

    public static final Block CYAN_WOOD_STAIRS = registerBlock("cyan_wood_stairs",
            properties -> new StairBlock(ModBlocks.CYAN_PLANKS.defaultBlockState(),
                    properties.strength(2.0f, 3.0f)));
    public static final Block CYAN_WOOD_SLAB = registerBlock("cyan_wood_slab",
            properties -> new SlabBlock(properties.strength(2.0f, 3.0f)));

    public static final Block GRAY_WOOD_STAIRS = registerBlock("gray_wood_stairs",
            properties -> new StairBlock(ModBlocks.GRAY_PLANKS.defaultBlockState(),
                    properties.strength(2.0f, 3.0f)));
    public static final Block GRAY_WOOD_SLAB = registerBlock("gray_wood_slab",
            properties -> new SlabBlock(properties.strength(2.0f, 3.0f)));

    public static final Block GREEN_WOOD_STAIRS = registerBlock("green_wood_stairs",
            properties -> new StairBlock(ModBlocks.GREEN_PLANKS.defaultBlockState(),
                    properties.strength(2.0f, 3.0f)));
    public static final Block GREEN_WOOD_SLAB = registerBlock("green_wood_slab",
            properties -> new SlabBlock(properties.strength(2.0f, 3.0f)));

    public static final Block LIGHT_BLUE_WOOD_STAIRS = registerBlock("light_blue_wood_stairs",
            properties -> new StairBlock(ModBlocks.LIGHT_BLUE_PLANKS.defaultBlockState(),
                    properties.strength(2.0f, 3.0f)));
    public static final Block LIGHT_BLUE_WOOD_SLAB = registerBlock("light_blue_wood_slab",
            properties -> new SlabBlock(properties.strength(2.0f, 3.0f)));

    public static final Block LIGHT_GRAY_WOOD_STAIRS = registerBlock("light_gray_wood_stairs",
            properties -> new StairBlock(ModBlocks.LIGHT_GRAY_PLANKS.defaultBlockState(),
                    properties.strength(2.0f, 3.0f)));
    public static final Block LIGHT_GRAY_WOOD_SLAB = registerBlock("light_gray_wood_slab",
            properties -> new SlabBlock(properties.strength(2.0f, 3.0f)));

    public static final Block LIGHT_PURPLE_WOOD_STAIRS = registerBlock("light_purple_wood_stairs",
            properties -> new StairBlock(ModBlocks.LIGHT_PURPLE_PLANKS.defaultBlockState(),
                    properties.strength(2.0f, 3.0f)));
    public static final Block LIGHT_PURPLE_WOOD_SLAB = registerBlock("light_purple_wood_slab",
            properties -> new SlabBlock(properties.strength(2.0f, 3.0f)));

    public static final Block LIME_WOOD_STAIRS = registerBlock("lime_wood_stairs",
            properties -> new StairBlock(ModBlocks.LIME_PLANKS.defaultBlockState(),
                    properties.strength(2.0f, 3.0f)));
    public static final Block LIME_WOOD_SLAB = registerBlock("lime_wood_slab",
            properties -> new SlabBlock(properties.strength(2.0f, 3.0f)));

    public static final Block MAGENTA_WOOD_STAIRS = registerBlock("magenta_wood_stairs",
            properties -> new StairBlock(ModBlocks.MAGENTA_PLANKS.defaultBlockState(),
                    properties.strength(2.0f, 3.0f)));
    public static final Block MAGENTA_WOOD_SLAB = registerBlock("magenta_wood_slab",
            properties -> new SlabBlock(properties.strength(2.0f, 3.0f)));

    public static final Block ORANGE_WOOD_STAIRS = registerBlock("orange_wood_stairs",
            properties -> new StairBlock(ModBlocks.ORANGE_PLANKS.defaultBlockState(),
                    properties.strength(2.0f, 3.0f)));
    public static final Block ORANGE_WOOD_SLAB = registerBlock("orange_wood_slab",
            properties -> new SlabBlock(properties.strength(2.0f, 3.0f)));

    public static final Block PINK_WOOD_STAIRS = registerBlock("pink_wood_stairs",
            properties -> new StairBlock(ModBlocks.PINK_PLANKS.defaultBlockState(),
                    properties.strength(2.0f, 3.0f)));
    public static final Block PINK_WOOD_SLAB = registerBlock("pink_wood_slab",
            properties -> new SlabBlock(properties.strength(2.0f, 3.0f)));

    public static final Block PURPLE_WOOD_STAIRS = registerBlock("purple_wood_stairs",
            properties -> new StairBlock(ModBlocks.PURPLE_PLANKS.defaultBlockState(),
                    properties.strength(2.0f, 3.0f)));
    public static final Block PURPLE_WOOD_SLAB = registerBlock("purple_wood_slab",
            properties -> new SlabBlock(properties.strength(2.0f, 3.0f)));

    public static final Block RED_WOOD_STAIRS = registerBlock("red_wood_stairs",
            properties -> new StairBlock(ModBlocks.RED_PLANKS.defaultBlockState(),
                    properties.strength(2.0f, 3.0f)));
    public static final Block RED_WOOD_SLAB = registerBlock("red_wood_slab",
            properties -> new SlabBlock(properties.strength(2.0f, 3.0f)));

    public static final Block WHITE_WOOD_STAIRS = registerBlock("white_wood_stairs",
            properties -> new StairBlock(ModBlocks.WHITE_PLANKS.defaultBlockState(),
                    properties.strength(2.0f, 3.0f)));
    public static final Block WHITE_WOOD_SLAB = registerBlock("white_wood_slab",
            properties -> new SlabBlock(properties.strength(2.0f, 3.0f)));

    public static final Block YELLOW_WOOD_STAIRS = registerBlock("yellow_wood_stairs",
            properties -> new StairBlock(ModBlocks.YELLOW_PLANKS.defaultBlockState(),
                    properties.strength(2.0f, 3.0f)));
    public static final Block YELLOW_WOOD_SLAB = registerBlock("yellow_wood_slab",
            properties -> new SlabBlock(properties.strength(2.0f, 3.0f)));


    public static final Block BLUE_WOOD_BUTTON = registerBlock("blue_wood_button",
            properties -> new ButtonBlock(BlockSetType.OAK, 30,
                    properties.strength(0.5f, 0.5f).noCollision()));
    public static final Block BLUE_WOOD_PRESSURE_PLATE = registerBlock("blue_wood_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.OAK,
                    properties.mapColor(MapColor.COLOR_BLUE).forceSolidOn().instrument(NoteBlockInstrument.BASS)
                            .noCollision().strength(0.5f, 0.5f).pushReaction(PushReaction.DESTROY)));

    public static final Block BLACK_WOOD_BUTTON = registerBlock("black_wood_button",
            properties -> new ButtonBlock(BlockSetType.OAK, 30,
                    properties.strength(0.5f, 0.5f).noCollision()));
    public static final Block BLACK_WOOD_PRESSURE_PLATE = registerBlock("black_wood_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.OAK,
                    properties.mapColor(MapColor.COLOR_BLACK).forceSolidOn().instrument(NoteBlockInstrument.BASS)
                            .noCollision().strength(0.5f, 0.5f).pushReaction(PushReaction.DESTROY)));

    public static final Block BROWN_WOOD_BUTTON = registerBlock("brown_wood_button",
            properties -> new ButtonBlock(BlockSetType.OAK, 30,
                    properties.strength(0.5f, 0.5f).noCollision()));
    public static final Block BROWN_WOOD_PRESSURE_PLATE = registerBlock("brown_wood_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.OAK,
                    properties.mapColor(MapColor.COLOR_BROWN).forceSolidOn().instrument(NoteBlockInstrument.BASS)
                            .noCollision().strength(0.5f, 0.5f).pushReaction(PushReaction.DESTROY)));

    public static final Block CYAN_WOOD_BUTTON = registerBlock("cyan_wood_button",
            properties -> new ButtonBlock(BlockSetType.OAK, 30,
                    properties.strength(0.5f, 0.5f).noCollision()));
    public static final Block CYAN_WOOD_PRESSURE_PLATE = registerBlock("cyan_wood_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.OAK,
                    properties.mapColor(MapColor.COLOR_CYAN).forceSolidOn().instrument(NoteBlockInstrument.BASS)
                            .noCollision().strength(0.5f, 0.5f).pushReaction(PushReaction.DESTROY)));

    public static final Block GRAY_WOOD_BUTTON = registerBlock("gray_wood_button",
            properties -> new ButtonBlock(BlockSetType.OAK, 30,
                    properties.strength(0.5f, 0.5f).noCollision()));
    public static final Block GRAY_WOOD_PRESSURE_PLATE = registerBlock("gray_wood_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.OAK,
                    properties.mapColor(MapColor.COLOR_GRAY).forceSolidOn().instrument(NoteBlockInstrument.BASS)
                            .noCollision().strength(0.5f, 0.5f).pushReaction(PushReaction.DESTROY)));

    public static final Block GREEN_WOOD_BUTTON = registerBlock("green_wood_button",
            properties -> new ButtonBlock(BlockSetType.OAK, 30,
                    properties.strength(0.5f, 0.5f).noCollision()));
    public static final Block GREEN_WOOD_PRESSURE_PLATE = registerBlock("green_wood_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.OAK,
                    properties.mapColor(MapColor.COLOR_GREEN).forceSolidOn().instrument(NoteBlockInstrument.BASS)
                            .noCollision().strength(0.5f, 0.5f).pushReaction(PushReaction.DESTROY)));

    public static final Block LIGHT_BLUE_WOOD_BUTTON = registerBlock("light_blue_wood_button",
            properties -> new ButtonBlock(BlockSetType.OAK, 30,
                    properties.strength(0.5f, 0.5f).noCollision()));
    public static final Block LIGHT_BLUE_WOOD_PRESSURE_PLATE = registerBlock("light_blue_wood_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.OAK,
                    properties.mapColor(MapColor.COLOR_LIGHT_BLUE).forceSolidOn().instrument(NoteBlockInstrument.BASS)
                            .noCollision().strength(0.5f, 0.5f).pushReaction(PushReaction.DESTROY)));

    public static final Block LIGHT_GRAY_WOOD_BUTTON = registerBlock("light_gray_wood_button",
            properties -> new ButtonBlock(BlockSetType.OAK, 30,
                    properties.strength(0.5f, 0.5f).noCollision()));
    public static final Block LIGHT_GRAY_WOOD_PRESSURE_PLATE = registerBlock("light_gray_wood_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.OAK,
                    properties.mapColor(MapColor.COLOR_LIGHT_GRAY).forceSolidOn().instrument(NoteBlockInstrument.BASS)
                            .noCollision().strength(0.5f, 0.5f).pushReaction(PushReaction.DESTROY)));

    public static final Block LIGHT_PURPLE_WOOD_BUTTON = registerBlock("light_purple_wood_button",
            properties -> new ButtonBlock(BlockSetType.OAK, 30,
                    properties.strength(0.5f, 0.5f).noCollision()));
    public static final Block LIGHT_PURPLE_WOOD_PRESSURE_PLATE = registerBlock("light_purple_wood_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.OAK,
                    properties.mapColor(MapColor.COLOR_PURPLE).forceSolidOn().instrument(NoteBlockInstrument.BASS)
                            .noCollision().strength(0.5f, 0.5f).pushReaction(PushReaction.DESTROY)));

    public static final Block LIME_WOOD_BUTTON = registerBlock("lime_wood_button",
            properties -> new ButtonBlock(BlockSetType.OAK, 30,
                    properties.strength(0.5f, 0.5f).noCollision()));
    public static final Block LIME_WOOD_PRESSURE_PLATE = registerBlock("lime_wood_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.OAK,
                    properties.mapColor(MapColor.COLOR_LIGHT_GREEN).forceSolidOn().instrument(NoteBlockInstrument.BASS)
                            .noCollision().strength(0.5f, 0.5f).pushReaction(PushReaction.DESTROY)));

    public static final Block MAGENTA_WOOD_BUTTON = registerBlock("magenta_wood_button",
            properties -> new ButtonBlock(BlockSetType.OAK, 30,
                    properties.strength(0.5f, 0.5f).noCollision()));
    public static final Block MAGENTA_WOOD_PRESSURE_PLATE = registerBlock("magenta_wood_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.OAK,
                    properties.mapColor(MapColor.COLOR_MAGENTA).forceSolidOn().instrument(NoteBlockInstrument.BASS)
                            .noCollision().strength(0.5f, 0.5f).pushReaction(PushReaction.DESTROY)));

    public static final Block ORANGE_WOOD_BUTTON = registerBlock("orange_wood_button",
            properties -> new ButtonBlock(BlockSetType.OAK, 30,
                    properties.strength(0.5f, 0.5f).noCollision()));
    public static final Block ORANGE_WOOD_PRESSURE_PLATE = registerBlock("orange_wood_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.OAK,
                    properties.mapColor(MapColor.COLOR_ORANGE).forceSolidOn().instrument(NoteBlockInstrument.BASS)
                            .noCollision().strength(0.5f, 0.5f).pushReaction(PushReaction.DESTROY)));

    public static final Block PINK_WOOD_BUTTON = registerBlock("pink_wood_button",
            properties -> new ButtonBlock(BlockSetType.OAK, 30,
                    properties.strength(0.5f, 0.5f).noCollision()));
    public static final Block PINK_WOOD_PRESSURE_PLATE = registerBlock("pink_wood_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.OAK,
                    properties.mapColor(MapColor.COLOR_PINK).forceSolidOn().instrument(NoteBlockInstrument.BASS)
                            .noCollision().strength(0.5f, 0.5f).pushReaction(PushReaction.DESTROY)));

    public static final Block PURPLE_WOOD_BUTTON = registerBlock("purple_wood_button",
            properties -> new ButtonBlock(BlockSetType.OAK, 30,
                    properties.strength(0.5f, 0.5f).noCollision()));
    public static final Block PURPLE_WOOD_PRESSURE_PLATE = registerBlock("purple_wood_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.OAK,
                    properties.mapColor(MapColor.COLOR_PURPLE).forceSolidOn().instrument(NoteBlockInstrument.BASS)
                            .noCollision().strength(0.5f, 0.5f).pushReaction(PushReaction.DESTROY)));

    public static final Block RED_WOOD_BUTTON = registerBlock("red_wood_button",
            properties -> new ButtonBlock(BlockSetType.OAK, 30,
                    properties.strength(0.5f, 0.5f).noCollision()));
    public static final Block RED_WOOD_PRESSURE_PLATE = registerBlock("red_wood_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.OAK,
                    properties.mapColor(MapColor.COLOR_RED).forceSolidOn().instrument(NoteBlockInstrument.BASS)
                            .noCollision().strength(0.5f, 0.5f).pushReaction(PushReaction.DESTROY)));

    public static final Block WHITE_WOOD_BUTTON = registerBlock("white_wood_button",
            properties -> new ButtonBlock(BlockSetType.OAK, 30,
                    properties.strength(0.5f, 0.5f).noCollision()));
    public static final Block WHITE_WOOD_PRESSURE_PLATE = registerBlock("white_wood_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.OAK,
                    properties.mapColor(MapColor.COLOR_LIGHT_GRAY).forceSolidOn().instrument(NoteBlockInstrument.BASS)
                            .noCollision().strength(0.5f, 0.5f).pushReaction(PushReaction.DESTROY)));

    public static final Block YELLOW_WOOD_BUTTON = registerBlock("yellow_wood_button",
            properties -> new ButtonBlock(BlockSetType.OAK, 30,
                    properties.strength(0.5f, 0.5f).noCollision()));
    public static final Block YELLOW_WOOD_PRESSURE_PLATE = registerBlock("yellow_wood_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.OAK,
                    properties.mapColor(MapColor.COLOR_YELLOW).forceSolidOn().instrument(NoteBlockInstrument.BASS)
                            .noCollision().strength(0.5f, 0.5f).pushReaction(PushReaction.DESTROY)));

    public static final Block BLUE_WOOD_FENCE = registerBlock("blue_wood_fence",
            properties -> new FenceBlock(properties.strength(2f, 3f)));
    public static final Block BLUE_WOOD_FENCE_GATE = registerBlock("blue_wood_fence_gate",
            properties -> new FenceGateBlock(WoodType.OAK, properties.strength(2f, 3f)));

    public static final Block BLACK_WOOD_FENCE = registerBlock("black_wood_fence",
            properties -> new FenceBlock(properties.strength(2f, 3f)));
    public static final Block BLACK_WOOD_FENCE_GATE = registerBlock("black_wood_fence_gate",
            properties -> new FenceGateBlock(WoodType.OAK, properties.strength(2f, 3f)));

    public static final Block BROWN_WOOD_FENCE = registerBlock("brown_wood_fence",
            properties -> new FenceBlock(properties.strength(2f, 3f)));
    public static final Block BROWN_WOOD_FENCE_GATE = registerBlock("brown_wood_fence_gate",
            properties -> new FenceGateBlock(WoodType.OAK, properties.strength(2f, 3f)));

    public static final Block CYAN_WOOD_FENCE = registerBlock("cyan_wood_fence",
            properties -> new FenceBlock(properties.strength(2f, 3f)));
    public static final Block CYAN_WOOD_FENCE_GATE = registerBlock("cyan_wood_fence_gate",
            properties -> new FenceGateBlock(WoodType.OAK, properties.strength(2f, 3f)));

    public static final Block GRAY_WOOD_FENCE = registerBlock("gray_wood_fence",
            properties -> new FenceBlock(properties.strength(2f, 3f)));
    public static final Block GRAY_WOOD_FENCE_GATE = registerBlock("gray_wood_fence_gate",
            properties -> new FenceGateBlock(WoodType.OAK, properties.strength(2f, 3f)));

    public static final Block GREEN_WOOD_FENCE = registerBlock("green_wood_fence",
            properties -> new FenceBlock(properties.strength(2f, 3f)));
    public static final Block GREEN_WOOD_FENCE_GATE = registerBlock("green_wood_fence_gate",
            properties -> new FenceGateBlock(WoodType.OAK, properties.strength(2f, 3f)));

    public static final Block LIGHT_BLUE_WOOD_FENCE = registerBlock("light_blue_wood_fence",
            properties -> new FenceBlock(properties.strength(2f, 3f)));
    public static final Block LIGHT_BLUE_WOOD_FENCE_GATE = registerBlock("light_blue_wood_fence_gate",
            properties -> new FenceGateBlock(WoodType.OAK, properties.strength(2f, 3f)));

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
