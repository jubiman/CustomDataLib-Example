package com.jubiman.customdatalibexample.player;

import com.jubiman.customdatalib.api.ClientTickable;
import com.jubiman.customdatalib.api.HUDDrawable;
import com.jubiman.customdatalib.api.Savable;
import com.jubiman.customdatalib.api.Syncable;
import com.jubiman.customdatalib.player.CustomPlayer;
import com.jubiman.customdatalibexample.packet.PacketSyncExamplePlayer;
import necesse.engine.network.Packet;
import necesse.engine.network.client.Client;
import necesse.engine.save.LoadData;
import necesse.engine.save.SaveData;
import necesse.engine.tickManager.TickManager;
import necesse.entity.mobs.PlayerMob;

import java.awt.Rectangle;

/**
 * Example player that implements all currently available modules
 */
public class ExamplePlayer extends CustomPlayer implements HUDDrawable, ClientTickable, Savable, Syncable {
	public ExamplePlayer(long auth) {
		super(auth);
	}

	@Override
	public void clientTick(Client client) {
		// Do client side ticking logic here (e.g. mana regeneration simulation)
	}

	@Override
	public void drawHUD(TickManager tickManager, PlayerMob playerMob, Rectangle renderBox) {
		// Draw HUD elements here (e.g. mana bar)
	}

	@Override
	public void addSaveData(SaveData save) {
		// Add save data here (e.g. mana or any other custom data)
	}

	@Override
	public void loadEnter(LoadData data) {
		// Load data here that needs to be loaded before the rest of the player is loaded
		// (e.g. mana or any other custom data)
	}

	@Override
	public void loadExit(LoadData data) {
		// Load data here that needs to be loaded after the rest of the player is loaded
		// (e.g. mana or any other custom data)
	}

	@Override
	public Packet getSyncPacket() {
		return new PacketSyncExamplePlayer(this);
	}
}
