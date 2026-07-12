package net.iceattack.dyablewoodmod;

import net.fabricmc.api.ModInitializer;

import net.iceattack.dyablewoodmod.creativemodetab.ModCreativeModeTabs;
import net.iceattack.dyablewoodmod.item.ModItems;
import net.minecraft.resources.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DyableWoodMod implements ModInitializer {
	public static final String MOD_ID = "dyablewoodmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModCreativeModeTabs.registerModCreativeModeTabs();

		ModItems.registerModItems();

	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
