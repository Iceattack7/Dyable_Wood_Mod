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
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Function;

public class ModBlocks {
    public static final Block BLUE_PLANKS = registerBlock("blue_planks",
            properties -> new Block(properties.strength(0.6f)
                    .requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final Block BLACK_PLANKS = registerBlock("black_planks",
            properties -> new Block(properties.strength(0.6f)
                    .requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final Block BROWN_PLANKS = registerBlock("brown_planks",
            properties -> new Block(properties.strength(0.6f)
                    .requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final Block CYAN_PLANKS = registerBlock("cyan_planks",
            properties -> new Block(properties.strength(0.6f)
                    .requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final Block GRAY_PLANKS = registerBlock("gray_planks",
            properties -> new Block(properties.strength(0.6f)
                    .requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final Block GREEN_PLANKS = registerBlock("green_planks",
            properties -> new Block(properties.strength(0.6f)
                    .requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final Block LIGHT_BLUE_PLANKS = registerBlock("light_blue_planks",
            properties -> new Block(properties.strength(0.6f)
                    .requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final Block LIGHT_GRAY_PLANKS = registerBlock("light_gray_planks",
            properties -> new Block(properties.strength(0.6f)
                    .requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final Block LIGHT_PURPLE_PLANKS = registerBlock("light_purple_planks",
            properties -> new Block(properties.strength(0.6f)
                    .requiresCorrectToolForDrops().sound(SoundType.WOOD)));



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
