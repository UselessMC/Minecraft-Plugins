package me.UselessMC.ElementalArmor;

import org.bukkit.plugin.java.JavaPlugin;

import me.UselessMC.ElementalArmor.ArmorEvents.UsageEvents;
import me.UselessMC.ElementalArmor.ArmorSets.Armor;

public class Main extends JavaPlugin{
	@Override
	public void onEnable() {
		Armor.enableArmorSets();
		getServer().getPluginManager().registerEvents(new UsageEvents(), this);
	}
	@Override
	public void onDisable() {
		
	}
}
