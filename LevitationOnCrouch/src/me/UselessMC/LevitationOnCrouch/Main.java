package me.UselessMC.LevitationOnCrouch;

import org.bukkit.plugin.java.JavaPlugin;

import me.UselessMC.LevitationOnCrouch.LevitationCommand.LevitationCommand;

public class Main extends JavaPlugin{
	@Override
	public void onEnable() {
			new LevitationCommand(this);
	}
}
