package me.UselessMC.EnderPickUpHands;

import java.util.ArrayList;

import org.bukkit.plugin.java.JavaPlugin;

import me.UselessMC.EnderPickUpHands.AddUser.AddUser;
import me.UselessMC.EnderPickUpHands.runPickUpBlock.PickUpBlock;

public class Main extends JavaPlugin{
	public static ArrayList<String> addedPlayers = new ArrayList<String>();
	@Override
	public void onEnable() {
		getCommand("addenderhands").setExecutor(new AddUser());
		getServer().getPluginManager().registerEvents(new PickUpBlock(), this);
	}
}
