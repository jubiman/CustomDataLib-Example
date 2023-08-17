package com.jubiman.customdatalibexample;

import com.jubiman.customdatalib.player.CustomPlayerRegistry;
import com.jubiman.customdatalibexample.packet.PacketSyncExamplePlayer;
import com.jubiman.customdatalibexample.player.ExamplePlayersHandler;
import necesse.engine.modLoader.annotations.ModEntry;
import necesse.engine.registries.PacketRegistry;

@ModEntry
public class ModEntryClass {
	public void init() {
		CustomPlayerRegistry.registerClass(ExamplePlayersHandler.name, SanityPlayersHandler.class);

		PacketRegistry.registerPacket(PacketSyncExamplePlayer.class);
	}
}
