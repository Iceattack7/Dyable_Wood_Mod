package net.iceattack.dyablewoodmod.creativemodetab;

import net.iceattack.dyablewoodmod.DyableWoodMod;
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
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.LIGHT_PURPLE_DYE.get()))
                    .title(Component.translatable("creativetab.dyablewoodmod.dyable_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {



                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
