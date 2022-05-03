package me.UselessMC.elementalweapons;

import org.bukkit.plugin.java.JavaPlugin;

import me.UselessMC.elementalweapons.weaponEvents.abilityEvents;
import me.UselessMC.elementalweapons.weaponEvents.obtainWeaponEvent;
import me.UselessMC.elementalweapons.weaponInit.weaponInit;

public class Main extends JavaPlugin{
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new abilityEvents(), this);
		getServer().getPluginManager().registerEvents(new obtainWeaponEvent(), this);
		weaponInit.init();
	}
}
