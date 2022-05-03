package me.UselessMC.magicItems;

import org.bukkit.plugin.java.JavaPlugin;

import me.UselessMC.magicItems.commands.itemCommands;
import me.UselessMC.magicItems.events.Cooldown;
import me.UselessMC.magicItems.events.itemEvents;
import me.UselessMC.magicItems.items.basicItems;

public class Main extends JavaPlugin{
	@Override
	public void onEnable() {
		basicItems.init();
		Cooldown.setupCooldown();
		getServer().getPluginManager().registerEvents(new itemEvents(this), this);
		getCommand("giveteleporter").setExecutor(new itemCommands());
	}
}
