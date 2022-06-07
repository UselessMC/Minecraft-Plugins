package me.UselessMC.magicItems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

import org.bukkit.entity.Player;

public class Cooldown {
	public static ArrayList<Cooldown> cooldownTypes;
	public static ArrayList<String> cooldownNames;
	public HashMap<UUID, Double> cooldowns;
	public String name;
	
	public void setupCooldown(String name) {
		cooldowns = new HashMap<>();
		cooldownTypes = new ArrayList<>();
		cooldownNames = new ArrayList<>();
		this.name = name;
		Cooldown.cooldownTypes.add(this);
		Cooldown.cooldownNames.add(name);
	}
	
	public void setCooldown(Player player, int seconds) {
		double delay = System.currentTimeMillis() + (seconds * 1000);
		cooldowns.put(player.getUniqueId(), delay);
	}
	
	public static boolean checkCooldown(Player player, String name) {
		if (Cooldown.cooldownNames.contains(name)) {
			int index = Cooldown.cooldownNames.indexOf(name);
			Cooldown c = Cooldown.cooldownTypes.get(index);
			if (!c.cooldowns.containsKey(player.getUniqueId()) || c.cooldowns.get(player.getUniqueId()) < System.currentTimeMillis()) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return true;
		}
	}
}
