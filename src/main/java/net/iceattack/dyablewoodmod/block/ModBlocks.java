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

    public static final Block LIGHT_GRAY_WOOD_FENCE = registerBlock("light_gray_wood_fence",
            properties -> new FenceBlock(properties.strength(2f, 3f)));
    public static final Block LIGHT_GRAY_WOOD_FENCE_GATE = registerBlock("light_gray_wood_fence_gate",
            properties -> new FenceGateBlock(WoodType.OAK, properties.strength(2f, 3f)));

    public static final Block LIGHT_PURPLE_WOOD_FENCE = registerBlock("light_purple_wood_fence",
            properties -> new FenceBlock(properties.strength(2f, 3f)));
    public static final Block LIGHT_PURPLE_WOOD_FENCE_GATE = registerBlock("light_purple_wood_fence_gate",
            properties -> new FenceGateBlock(WoodType.OAK, properties.strength(2f, 3f)));

    public static final Block LIME_WOOD_FENCE = registerBlock("lime_wood_fence",
            properties -> new FenceBlock(properties.strength(2f, 3f)));
    public static final Block LIME_WOOD_FENCE_GATE = registerBlock("lime_wood_fence_gate",
            properties -> new FenceGateBlock(WoodType.OAK, properties.strength(2f, 3f)));

    public static final Block MAGENTA_WOOD_FENCE = registerBlock("magenta_wood_fence",
            properties -> new FenceBlock(properties.strength(2f, 3f)));
    public static final Block MAGENTA_WOOD_FENCE_GATE = registerBlock("magenta_wood_fence_gate",
            properties -> new FenceGateBlock(WoodType.OAK, properties.strength(2f, 3f)));

    public static final Block ORANGE_WOOD_FENCE = registerBlock("orange_wood_fence",
            properties -> new FenceBlock(properties.strength(2f, 3f)));
    public static final Block ORANGE_WOOD_FENCE_GATE = registerBlock("orange_wood_fence_gate",
            properties -> new FenceGateBlock(WoodType.OAK, properties.strength(2f, 3f)));

    public static final Block PINK_WOOD_FENCE = registerBlock("pink_wood_fence",
            properties -> new FenceBlock(properties.strength(2f, 3f)));
    public static final Block PINK_WOOD_FENCE_GATE = registerBlock("pink_wood_fence_gate",
            properties -> new FenceGateBlock(WoodType.OAK, properties.strength(2f, 3f)));

    public static final Block PURPLE_WOOD_FENCE = registerBlock("purple_wood_fence",
            properties -> new FenceBlock(properties.strength(2f, 3f)));
    public static final Block PURPLE_WOOD_FENCE_GATE = registerBlock("purple_wood_fence_gate",
            properties -> new FenceGateBlock(WoodType.OAK, properties.strength(2f, 3f)));

    public static final Block RED_WOOD_FENCE = registerBlock("red_wood_fence",
            properties -> new FenceBlock(properties.strength(2f, 3f)));
    public static final Block RED_WOOD_FENCE_GATE = registerBlock("red_wood_fence_gate",
            properties -> new FenceGateBlock(WoodType.OAK, properties.strength(2f, 3f)));

    public static final Block WHITE_WOOD_FENCE = registerBlock("white_wood_fence",
            properties -> new FenceBlock(properties.strength(2f, 3f)));
    public static final Block WHITE_WOOD_FENCE_GATE = registerBlock("white_wood_fence_gate",
            properties -> new FenceGateBlock(WoodType.OAK, properties.strength(2f, 3f)));

    public static final Block YELLOW_WOOD_FENCE = registerBlock("yellow_wood_fence",
            properties -> new FenceBlock(properties.strength(2f, 3f)));
    public static final Block YELLOW_WOOD_FENCE_GATE = registerBlock("yellow_wood_fence_gate",
            properties -> new FenceGateBlock(WoodType.OAK, properties.strength(2f, 3f)));


    public static final Block BLUE_ACACIA_DOOR = registerBlock("blue_acacia_door",
            properties -> new DoorBlock(BlockSetType.ACACIA, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block BLUE_ACACIA_TRAPDOOR = registerBlock("blue_acacia_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.ACACIA, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block BLUE_BIRCH_DOOR = registerBlock("blue_birch_door",
            properties -> new DoorBlock(BlockSetType.BIRCH, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block BLUE_BIRCH_TRAPDOOR = registerBlock("blue_birch_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.BIRCH, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block BLUE_DARK_OAK_DOOR = registerBlock("blue_dark_oak_door",
            properties -> new DoorBlock(BlockSetType.DARK_OAK, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block BLUE_DARK_OAK_TRAPDOOR = registerBlock("blue_dark_oak_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.DARK_OAK, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block BLUE_JUNGLE_DOOR = registerBlock("blue_jungle_door",
            properties -> new DoorBlock(BlockSetType.JUNGLE, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block BLUE_JUNGLE_TRAPDOOR = registerBlock("blue_jungle_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.JUNGLE, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block BLUE_OAK_DOOR = registerBlock("blue_oak_door",
            properties -> new DoorBlock(BlockSetType.OAK, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block BLUE_OAK_TRAPDOOR = registerBlock("blue_oak_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.OAK, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block BLUE_SPRUCE_DOOR = registerBlock("blue_spruce_door",
            properties -> new DoorBlock(BlockSetType.SPRUCE, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block BLUE_SPRUCE_TRAPDOOR = registerBlock("blue_spruce_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.SPRUCE, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block BLACK_ACACIA_DOOR = registerBlock("black_acacia_door",
            properties -> new DoorBlock(BlockSetType.ACACIA, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block BLACK_ACACIA_TRAPDOOR = registerBlock("black_acacia_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.ACACIA, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block BLACK_BIRCH_DOOR = registerBlock("black_birch_door",
            properties -> new DoorBlock(BlockSetType.BIRCH, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block BLACK_BIRCH_TRAPDOOR = registerBlock("black_birch_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.BIRCH, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block BLACK_DARK_OAK_DOOR = registerBlock("black_dark_oak_door",
            properties -> new DoorBlock(BlockSetType.DARK_OAK, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block BLACK_DARK_OAK_TRAPDOOR = registerBlock("black_dark_oak_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.DARK_OAK, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block BLACK_JUNGLE_DOOR = registerBlock("black_jungle_door",
            properties -> new DoorBlock(BlockSetType.JUNGLE, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block BLACK_JUNGLE_TRAPDOOR = registerBlock("black_jungle_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.JUNGLE, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block BLACK_OAK_DOOR = registerBlock("black_oak_door",
            properties -> new DoorBlock(BlockSetType.OAK, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block BLACK_OAK_TRAPDOOR = registerBlock("black_oak_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.OAK, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block BLACK_SPRUCE_DOOR = registerBlock("black_spruce_door",
            properties -> new DoorBlock(BlockSetType.SPRUCE, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block BLACK_SPRUCE_TRAPDOOR = registerBlock("black_spruce_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.SPRUCE, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block BROWN_ACACIA_DOOR = registerBlock("brown_acacia_door",
            properties -> new DoorBlock(BlockSetType.ACACIA, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block BROWN_ACACIA_TRAPDOOR = registerBlock("brown_acacia_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.ACACIA, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block BROWN_BIRCH_DOOR = registerBlock("brown_birch_door",
            properties -> new DoorBlock(BlockSetType.BIRCH, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block BROWN_BIRCH_TRAPDOOR = registerBlock("brown_birch_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.BIRCH, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block BROWN_DARK_OAK_DOOR = registerBlock("brown_dark_oak_door",
            properties -> new DoorBlock(BlockSetType.DARK_OAK, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block BROWN_DARK_OAK_TRAPDOOR = registerBlock("brown_dark_oak_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.DARK_OAK, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block BROWN_JUNGLE_DOOR = registerBlock("brown_jungle_door",
            properties -> new DoorBlock(BlockSetType.JUNGLE, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block BROWN_JUNGLE_TRAPDOOR = registerBlock("brown_jungle_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.JUNGLE, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block BROWN_OAK_DOOR = registerBlock("brown_oak_door",
            properties -> new DoorBlock(BlockSetType.OAK, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block BROWN_OAK_TRAPDOOR = registerBlock("brown_oak_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.OAK, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block BROWN_SPRUCE_DOOR = registerBlock("brown_spruce_door",
            properties -> new DoorBlock(BlockSetType.SPRUCE, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block BROWN_SPRUCE_TRAPDOOR = registerBlock("brown_spruce_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.SPRUCE, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block CYAN_ACACIA_DOOR = registerBlock("cyan_acacia_door",
            properties -> new DoorBlock(BlockSetType.ACACIA, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block CYAN_ACACIA_TRAPDOOR = registerBlock("cyan_acacia_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.ACACIA, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block CYAN_BIRCH_DOOR = registerBlock("cyan_birch_door",
            properties -> new DoorBlock(BlockSetType.BIRCH, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block CYAN_BIRCH_TRAPDOOR = registerBlock("cyan_birch_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.BIRCH, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block CYAN_DARK_OAK_DOOR = registerBlock("cyan_dark_oak_door",
            properties -> new DoorBlock(BlockSetType.DARK_OAK, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block CYAN_DARK_OAK_TRAPDOOR = registerBlock("cyan_dark_oak_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.DARK_OAK, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block CYAN_JUNGLE_DOOR = registerBlock("cyan_jungle_door",
            properties -> new DoorBlock(BlockSetType.JUNGLE, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block CYAN_JUNGLE_TRAPDOOR = registerBlock("cyan_jungle_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.JUNGLE, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block CYAN_OAK_DOOR = registerBlock("cyan_oak_door",
            properties -> new DoorBlock(BlockSetType.OAK, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block CYAN_OAK_TRAPDOOR = registerBlock("cyan_oak_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.OAK, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block CYAN_SPRUCE_DOOR = registerBlock("cyan_spruce_door",
            properties -> new DoorBlock(BlockSetType.SPRUCE, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block CYAN_SPRUCE_TRAPDOOR = registerBlock("cyan_spruce_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.SPRUCE, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block GRAY_ACACIA_DOOR = registerBlock("gray_acacia_door",
            properties -> new DoorBlock(BlockSetType.ACACIA, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block GRAY_ACACIA_TRAPDOOR = registerBlock("gray_acacia_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.ACACIA, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block GRAY_BIRCH_DOOR = registerBlock("gray_birch_door",
            properties -> new DoorBlock(BlockSetType.BIRCH, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block GRAY_BIRCH_TRAPDOOR = registerBlock("gray_birch_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.BIRCH, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block GRAY_DARK_OAK_DOOR = registerBlock("gray_dark_oak_door",
            properties -> new DoorBlock(BlockSetType.DARK_OAK, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block GRAY_DARK_OAK_TRAPDOOR = registerBlock("gray_dark_oak_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.DARK_OAK, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block GRAY_JUNGLE_DOOR = registerBlock("gray_jungle_door",
            properties -> new DoorBlock(BlockSetType.JUNGLE, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block GRAY_JUNGLE_TRAPDOOR = registerBlock("gray_jungle_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.JUNGLE, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block GRAY_OAK_DOOR = registerBlock("gray_oak_door",
            properties -> new DoorBlock(BlockSetType.OAK, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block GRAY_OAK_TRAPDOOR = registerBlock("gray_oak_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.OAK, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block GRAY_SPRUCE_DOOR = registerBlock("gray_spruce_door",
            properties -> new DoorBlock(BlockSetType.SPRUCE, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block GRAY_SPRUCE_TRAPDOOR = registerBlock("gray_spruce_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.SPRUCE, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block GREEN_ACACIA_DOOR = registerBlock("green_acacia_door",
            properties -> new DoorBlock(BlockSetType.ACACIA, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block GREEN_ACACIA_TRAPDOOR = registerBlock("green_acacia_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.ACACIA, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block GREEN_BIRCH_DOOR = registerBlock("green_birch_door",
            properties -> new DoorBlock(BlockSetType.BIRCH, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block GREEN_BIRCH_TRAPDOOR = registerBlock("green_birch_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.BIRCH, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block GREEN_DARK_OAK_DOOR = registerBlock("green_dark_oak_door",
            properties -> new DoorBlock(BlockSetType.DARK_OAK, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block GREEN_DARK_OAK_TRAPDOOR = registerBlock("green_dark_oak_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.DARK_OAK, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block GREEN_JUNGLE_DOOR = registerBlock("green_jungle_door",
            properties -> new DoorBlock(BlockSetType.JUNGLE, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block GREEN_JUNGLE_TRAPDOOR = registerBlock("green_jungle_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.JUNGLE, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block GREEN_OAK_DOOR = registerBlock("green_oak_door",
            properties -> new DoorBlock(BlockSetType.OAK, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block GREEN_OAK_TRAPDOOR = registerBlock("green_oak_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.OAK, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block GREEN_SPRUCE_DOOR = registerBlock("green_spruce_door",
            properties -> new DoorBlock(BlockSetType.SPRUCE, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block GREEN_SPRUCE_TRAPDOOR = registerBlock("green_spruce_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.SPRUCE, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block LIGHT_BLUE_ACACIA_DOOR = registerBlock("light_blue_acacia_door",
            properties -> new DoorBlock(BlockSetType.ACACIA, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block LIGHT_BLUE_ACACIA_TRAPDOOR = registerBlock("light_blue_acacia_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.ACACIA, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block LIGHT_BLUE_BIRCH_DOOR = registerBlock("light_blue_birch_door",
            properties -> new DoorBlock(BlockSetType.BIRCH, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block LIGHT_BLUE_BIRCH_TRAPDOOR = registerBlock("light_blue_birch_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.BIRCH, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block LIGHT_BLUE_DARK_OAK_DOOR = registerBlock("light_blue_dark_oak_door",
            properties -> new DoorBlock(BlockSetType.DARK_OAK, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block LIGHT_BLUE_DARK_OAK_TRAPDOOR = registerBlock("light_blue_dark_oak_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.DARK_OAK, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block LIGHT_BLUE_JUNGLE_DOOR = registerBlock("light_blue_jungle_door",
            properties -> new DoorBlock(BlockSetType.JUNGLE, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block LIGHT_BLUE_JUNGLE_TRAPDOOR = registerBlock("light_blue_jungle_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.JUNGLE, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block LIGHT_BLUE_OAK_DOOR = registerBlock("light_blue_oak_door",
            properties -> new DoorBlock(BlockSetType.OAK, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block LIGHT_BLUE_OAK_TRAPDOOR = registerBlock("light_blue_oak_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.OAK, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block LIGHT_BLUE_SPRUCE_DOOR = registerBlock("light_blue_spruce_door",
            properties -> new DoorBlock(BlockSetType.SPRUCE, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block LIGHT_BLUE_SPRUCE_TRAPDOOR = registerBlock("light_blue_spruce_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.SPRUCE, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block LIGHT_GRAY_ACACIA_DOOR = registerBlock("light_gray_acacia_door",
            properties -> new DoorBlock(BlockSetType.ACACIA, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block LIGHT_GRAY_ACACIA_TRAPDOOR = registerBlock("light_gray_acacia_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.ACACIA, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block LIGHT_GRAY_BIRCH_DOOR = registerBlock("light_gray_birch_door",
            properties -> new DoorBlock(BlockSetType.BIRCH, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block LIGHT_GRAY_BIRCH_TRAPDOOR = registerBlock("light_gray_birch_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.BIRCH, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block LIGHT_GRAY_DARK_OAK_DOOR = registerBlock("light_gray_dark_oak_door",
            properties -> new DoorBlock(BlockSetType.DARK_OAK, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block LIGHT_GRAY_DARK_OAK_TRAPDOOR = registerBlock("light_gray_dark_oak_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.DARK_OAK, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block LIGHT_GRAY_JUNGLE_DOOR = registerBlock("light_gray_jungle_door",
            properties -> new DoorBlock(BlockSetType.JUNGLE, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block LIGHT_GRAY_JUNGLE_TRAPDOOR = registerBlock("light_gray_jungle_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.JUNGLE, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block LIGHT_GRAY_OAK_DOOR = registerBlock("light_gray_oak_door",
            properties -> new DoorBlock(BlockSetType.OAK, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block LIGHT_GRAY_OAK_TRAPDOOR = registerBlock("light_gray_oak_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.OAK, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block LIGHT_GRAY_SPRUCE_DOOR = registerBlock("light_gray_spruce_door",
            properties -> new DoorBlock(BlockSetType.SPRUCE, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block LIGHT_GRAY_SPRUCE_TRAPDOOR = registerBlock("light_gray_spruce_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.SPRUCE, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block LIGHT_PURPLE_ACACIA_DOOR = registerBlock("light_purple_acacia_door",
            properties -> new DoorBlock(BlockSetType.ACACIA, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block LIGHT_PURPLE_ACACIA_TRAPDOOR = registerBlock("light_purple_acacia_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.ACACIA, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block LIGHT_PURPLE_BIRCH_DOOR = registerBlock("light_purple_birch_door",
            properties -> new DoorBlock(BlockSetType.BIRCH, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block LIGHT_PURPLE_BIRCH_TRAPDOOR = registerBlock("light_purple_birch_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.BIRCH, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block LIGHT_PURPLE_DARK_OAK_DOOR = registerBlock("light_purple_dark_oak_door",
            properties -> new DoorBlock(BlockSetType.DARK_OAK, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block LIGHT_PURPLE_DARK_OAK_TRAPDOOR = registerBlock("light_purple_dark_oak_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.DARK_OAK, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block LIGHT_PURPLE_JUNGLE_DOOR = registerBlock("light_purple_jungle_door",
            properties -> new DoorBlock(BlockSetType.JUNGLE, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block LIGHT_PURPLE_JUNGLE_TRAPDOOR = registerBlock("light_purple_jungle_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.JUNGLE, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block LIGHT_PURPLE_OAK_DOOR = registerBlock("light_purple_oak_door",
            properties -> new DoorBlock(BlockSetType.OAK, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block LIGHT_PURPLE_OAK_TRAPDOOR = registerBlock("light_purple_oak_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.OAK, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block LIGHT_PURPLE_SPRUCE_DOOR = registerBlock("light_purple_spruce_door",
            properties -> new DoorBlock(BlockSetType.SPRUCE, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block LIGHT_PURPLE_SPRUCE_TRAPDOOR = registerBlock("light_purple_spruce_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.SPRUCE, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block LIME_ACACIA_DOOR = registerBlock("lime_acacia_door",
            properties -> new DoorBlock(BlockSetType.ACACIA, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block LIME_ACACIA_TRAPDOOR = registerBlock("lime_acacia_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.ACACIA, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block LIME_BIRCH_DOOR = registerBlock("lime_birch_door",
            properties -> new DoorBlock(BlockSetType.BIRCH, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block LIME_BIRCH_TRAPDOOR = registerBlock("lime_birch_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.BIRCH, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block LIME_DARK_OAK_DOOR = registerBlock("lime_dark_oak_door",
            properties -> new DoorBlock(BlockSetType.DARK_OAK, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block LIME_DARK_OAK_TRAPDOOR = registerBlock("lime_dark_oak_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.DARK_OAK, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block LIME_JUNGLE_DOOR = registerBlock("lime_jungle_door",
            properties -> new DoorBlock(BlockSetType.JUNGLE, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block LIME_JUNGLE_TRAPDOOR = registerBlock("lime_jungle_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.JUNGLE, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block LIME_OAK_DOOR = registerBlock("lime_oak_door",
            properties -> new DoorBlock(BlockSetType.OAK, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block LIME_OAK_TRAPDOOR = registerBlock("lime_oak_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.OAK, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block LIME_SPRUCE_DOOR = registerBlock("lime_spruce_door",
            properties -> new DoorBlock(BlockSetType.SPRUCE, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block LIME_SPRUCE_TRAPDOOR = registerBlock("lime_spruce_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.SPRUCE, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block MAGENTA_ACACIA_DOOR = registerBlock("magenta_acacia_door",
            properties -> new DoorBlock(BlockSetType.ACACIA, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block MAGENTA_ACACIA_TRAPDOOR = registerBlock("magenta_acacia_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.ACACIA, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block MAGENTA_BIRCH_DOOR = registerBlock("magenta_birch_door",
            properties -> new DoorBlock(BlockSetType.BIRCH, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block MAGENTA_BIRCH_TRAPDOOR = registerBlock("magenta_birch_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.BIRCH, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block MAGENTA_DARK_OAK_DOOR = registerBlock("magenta_dark_oak_door",
            properties -> new DoorBlock(BlockSetType.DARK_OAK, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block MAGENTA_DARK_OAK_TRAPDOOR = registerBlock("magenta_dark_oak_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.DARK_OAK, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block MAGENTA_JUNGLE_DOOR = registerBlock("magenta_jungle_door",
            properties -> new DoorBlock(BlockSetType.JUNGLE, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block MAGENTA_JUNGLE_TRAPDOOR = registerBlock("magenta_jungle_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.JUNGLE, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block MAGENTA_OAK_DOOR = registerBlock("magenta_oak_door",
            properties -> new DoorBlock(BlockSetType.OAK, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block MAGENTA_OAK_TRAPDOOR = registerBlock("magenta_oak_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.OAK, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block MAGENTA_SPRUCE_DOOR = registerBlock("magenta_spruce_door",
            properties -> new DoorBlock(BlockSetType.SPRUCE, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block MAGENTA_SPRUCE_TRAPDOOR = registerBlock("magenta_spruce_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.SPRUCE, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block ORANGE_ACACIA_DOOR = registerBlock("orange_acacia_door",
            properties -> new DoorBlock(BlockSetType.ACACIA, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block ORANGE_ACACIA_TRAPDOOR = registerBlock("orange_acacia_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.ACACIA, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block ORANGE_BIRCH_DOOR = registerBlock("orange_birch_door",
            properties -> new DoorBlock(BlockSetType.BIRCH, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block ORANGE_BIRCH_TRAPDOOR = registerBlock("orange_birch_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.BIRCH, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block ORANGE_DARK_OAK_DOOR = registerBlock("orange_dark_oak_door",
            properties -> new DoorBlock(BlockSetType.DARK_OAK, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block ORANGE_DARK_OAK_TRAPDOOR = registerBlock("orange_dark_oak_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.DARK_OAK, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block ORANGE_JUNGLE_DOOR = registerBlock("orange_jungle_door",
            properties -> new DoorBlock(BlockSetType.JUNGLE, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block ORANGE_JUNGLE_TRAPDOOR = registerBlock("orange_jungle_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.JUNGLE, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block ORANGE_OAK_DOOR = registerBlock("orange_oak_door",
            properties -> new DoorBlock(BlockSetType.OAK, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block ORANGE_OAK_TRAPDOOR = registerBlock("orange_oak_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.OAK, properties.strength(2f, 3f)
                    .noOcclusion()));

    public static final Block ORANGE_SPRUCE_DOOR = registerBlock("orange_spruce_door",
            properties -> new DoorBlock(BlockSetType.SPRUCE, properties.strength(2f, 3f)
                    .noOcclusion()));
    public static final Block ORANGE_SPRUCE_TRAPDOOR = registerBlock("orange_spruce_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.SPRUCE, properties.strength(2f, 3f)
                    .noOcclusion()));


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
