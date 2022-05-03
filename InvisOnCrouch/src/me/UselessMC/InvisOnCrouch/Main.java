package me.UselessMC.InvisOnCrouch;

import org.bukkit.plugin.java.JavaPlugin;

import me.UselessMC.InvisOnCrouch.InvisCommand.InvisCommand;

public class Main extends JavaPlugin{
	@Override
	public void onEnable() {
			new InvisCommand(this);
	}
}
