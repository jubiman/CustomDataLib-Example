package com.jubiman.customdatalibexample;

import com.jubiman.celtest.sanity.SanityPlayersHandler;
import com.jubiman.customdatalib.player.CustomPlayerRegistry;
import com.jubiman.customdatalibexample.player.ExamplePlayersHandler;
import necesse.engine.modLoader.annotations.ModEntry;

@ModEntry
public class ModEntryClass {
	public void init() {
		CustomPlayerRegistry.registerClass(ExamplePlayersHandler.name, SanityPlayersHandler.class);

	}
}
