package me.UselessMC.CobbleGenChange;

import org.bukkit.plugin.java.JavaPlugin;

import me.UselessMC.CobbleGenChange.GenEvent.ChangeBlock;

public class Main extends JavaPlugin{
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new ChangeBlock(), this);
	}
}
