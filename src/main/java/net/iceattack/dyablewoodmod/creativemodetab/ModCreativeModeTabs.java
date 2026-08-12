package net.iceattack.dyablewoodmod.creativemodetab;

import net.iceattack.dyablewoodmod.DyableWoodMod;
import net.iceattack.dyablewoodmod.block.ModBlocks;
import net.iceattack.dyablewoodmod.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DyableWoodMod.MOD_ID);

    public static final Supplier<CreativeModeTab> DYE_ITEM_TAB = CREATIVE_MODE_TABS.register("dye_items",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.LIGHT_PURPLE_DYE.get()))
                    .title(Component.translatable("creativetab.dyablewoodmod.dye_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.LIGHT_PURPLE_DYE);


                    }).build());


    public static final Supplier<CreativeModeTab> DYABLE_BLOCK_TAB = CREATIVE_MODE_TABS.register("dyable_blocks",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.BLUE_PLANKS.get()))
                    .title(Component.translatable("creativetab.dyablewoodmod.dyable_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.BLUE_PLANKS);
                        output.accept(ModBlocks.BLACK_PLANKS);
                        output.accept(ModBlocks.BROWN_PLANKS);
                        output.accept(ModBlocks.CYAN_PLANKS);
                        output.accept(ModBlocks.GRAY_PLANKS);
                        output.accept(ModBlocks.GREEN_PLANKS);
                        output.accept(ModBlocks.LIGHT_BLUE_PLANKS);
                        output.accept(ModBlocks.LIGHT_GRAY_PLANKS);
                        output.accept(ModBlocks.LIGHT_PURPLE_PLANKS);
                        output.accept(ModBlocks.LIME_PLANKS);
                        output.accept(ModBlocks.MAGENTA_PLANKS);
                        output.accept(ModBlocks.ORANGE_PLANKS);
                        output.accept(ModBlocks.PINK_PLANKS);
                        output.accept(ModBlocks.PURPLE_PLANKS);
                        output.accept(ModBlocks.RED_PLANKS);
                        output.accept(ModBlocks.WHITE_PLANKS);
                        output.accept(ModBlocks.YELLOW_PLANKS);


                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
