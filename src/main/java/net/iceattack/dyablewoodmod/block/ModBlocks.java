package net.iceattack.dyablewoodmod.block;

import net.iceattack.dyablewoodmod.DyableWoodMod;
import net.iceattack.dyablewoodmod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(DyableWoodMod.MOD_ID);

    public static final DeferredBlock<Block> BLUE_PLANKS = registerBlock("blue_planks",
            properties -> new Block(properties.strength(2.0f, 3.0f)
                    .sound(SoundType.WOOD)));

    public static final DeferredBlock<Block> BLACK_PLANKS = registerBlock("black_planks",
            properties -> new Block(properties.strength(2.0f, 3.0f)
                    .sound(SoundType.WOOD)));

    public static final DeferredBlock<Block> BROWN_PLANKS = registerBlock("brown_planks",
            properties -> new Block(properties.strength(2.0f, 3.0f)
                    .sound(SoundType.WOOD)));

    public static final DeferredBlock<Block> CYAN_PLANKS = registerBlock("cyan_planks",
            properties -> new Block(properties.strength(2.0f, 3.0f)
                    .sound(SoundType.WOOD)));

    public static final DeferredBlock<Block> GRAY_PLANKS = registerBlock("gray_planks",
            properties -> new Block(properties.strength(2.0f, 3.0f)
                    .sound(SoundType.WOOD)));

    public static final DeferredBlock<Block> GREEN_PLANKS = registerBlock("green_planks",
            properties -> new Block(properties.strength(2.0f, 3.0f)
                    .sound(SoundType.WOOD)));

    public static final DeferredBlock<Block> LIGHT_BLUE_PLANKS = registerBlock("light_blue_planks",
            properties -> new Block(properties.strength(2.0f, 3.0f)
                    .sound(SoundType.WOOD)));

    public static final DeferredBlock<Block> LIGHT_GRAY_PLANKS = registerBlock("light_gray_planks",
            properties -> new Block(properties.strength(2.0f, 3.0f)
                    .sound(SoundType.WOOD)));

    public static final DeferredBlock<Block> LIGHT_PURPLE_PLANKS = registerBlock("light_purple_planks",
            properties -> new Block(properties.strength(2.0f, 3.0f)
                    .sound(SoundType.WOOD)));

    public static final DeferredBlock<Block> LIME_PLANKS = registerBlock("lime_planks",
            properties -> new Block(properties.strength(2.0f, 3.0f)
                    .sound(SoundType.WOOD)));

    public static final DeferredBlock<Block> MAGENTA_PLANKS = registerBlock("magenta_planks",
            properties -> new Block(properties.strength(2.0f, 3.0f)
                    .sound(SoundType.WOOD)));

    public static final DeferredBlock<Block> ORANGE_PLANKS = registerBlock("orange_planks",
            properties -> new Block(properties.strength(2.0f, 3.0f)
                    .sound(SoundType.WOOD)));

    public static final DeferredBlock<Block> PINK_PLANKS = registerBlock("pink_planks",
            properties -> new Block(properties.strength(2.0f, 3.0f)
                    .sound(SoundType.WOOD)));

    public static final DeferredBlock<Block> PURPLE_PLANKS = registerBlock("purple_planks",
            properties -> new Block(properties.strength(2.0f, 3.0f)
                    .sound(SoundType.WOOD)));

    public static final DeferredBlock<Block> RED_PLANKS = registerBlock("red_planks",
            properties -> new Block(properties.strength(2.0f, 3.0f)
                    .sound(SoundType.WOOD)));

    public static final DeferredBlock<Block> WHITE_PLANKS = registerBlock("white_planks",
            properties -> new Block(properties.strength(2.0f, 3.0f)
                    .sound(SoundType.WOOD)));

    public static final DeferredBlock<Block> YELLOW_PLANKS = registerBlock("yellow_planks",
            properties -> new Block(properties.strength(2.0f, 3.0f)
                    .sound(SoundType.WOOD)));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Function<BlockBehaviour.Properties, T> function) {
        DeferredBlock<T> toReturn = BLOCKS.registerBlock(name, function);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.registerItem(name,properties -> new BlockItem(block.get(), properties.useBlockDescriptionPrefix()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
