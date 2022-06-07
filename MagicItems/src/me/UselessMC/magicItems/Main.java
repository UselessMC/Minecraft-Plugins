package me.UselessMC.magicItems;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.plugin.java.JavaPlugin;

import me.UselessMC.magicItems.commands.itemCommands;
import me.UselessMC.magicItems.events.itemEvents;
import me.UselessMC.magicItems.items.basicItems;

public class Main extends JavaPlugin{
	public static ArrayList<Cooldown> ACDS;
	public static Main plugin;
	
	@Override
	public void onEnable() {
		basicItems.init();
		ACDS = new ArrayList<>();
		plugin = this;
		Cooldown grappleCD = new Cooldown();
		grappleCD.setupCooldown("Grapple");
		Cooldown transmuteCD = new Cooldown();
		transmuteCD.setupCooldown("Transmute");
		ACDS.add(transmuteCD);
		getServer().getPluginManager().registerEvents(new itemEvents(this), this);
		getCommand("giveteleporter").setExecutor(new itemCommands(this));
		getCommand("givelamp").setExecutor(new itemCommands(this));
		getCommand("wish").setExecutor(new itemCommands(this));
		getCommand("wishenchant").setExecutor(new itemCommands(this));
		Bukkit.getConsoleSender().sendMessage(Enchantment.getByKey(NamespacedKey.minecraft("unbreaking")).toString());
	}
}
