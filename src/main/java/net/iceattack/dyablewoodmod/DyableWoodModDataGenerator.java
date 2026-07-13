package net.iceattack.dyablewoodmod;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.iceattack.dyablewoodmod.datagen.ModBlockLootTableProvider;
import net.iceattack.dyablewoodmod.datagen.ModBlockTagsProvider;
import net.iceattack.dyablewoodmod.datagen.ModModelProvider;

public class DyableWoodModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		var pack = fabricDataGenerator.createPack();

		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModBlockTagsProvider::new);
		pack.addProvider(ModBlockLootTableProvider::new);
	}
}
