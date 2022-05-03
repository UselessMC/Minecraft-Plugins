package me.UselessMC.ElementalArmor.ArmorEvents;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitScheduler;

import me.UselessMC.ElementalArmor.Main;
import me.UselessMC.ElementalArmor.ArmorSets.Armor;

public class ArmorEffects implements CommandExecutor{
	private Main plugin;
	
	public ArmorEffects(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("activateea").setExecutor(this);
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
			Player p = (Player) sender;
			BukkitScheduler sched = p.getServer().getScheduler();
			sched.scheduleSyncRepeatingTask(this.plugin, new Runnable() {
				@Override
				public void run() {
					for (Player onlinePlayers : Bukkit.getOnlinePlayers()) {
						if (!(onlinePlayers.getPlayer().getInventory().getHelmet().getItemMeta().getDisplayName().equals(null))) {
							if (onlinePlayers.getPlayer().getInventory().getHelmet().getItemMeta().getDisplayName().equals(Armor.FireHelm.getItemMeta().getDisplayName())) {
								if (onlinePlayers.getPlayer().getInventory().getChestplate().getItemMeta().getDisplayName().equals(Armor.FireChest.getItemMeta().getDisplayName())) {
									if (onlinePlayers.getPlayer().getInventory().getLeggings().getItemMeta().getDisplayName().equals(Armor.FireLegs.getItemMeta().getDisplayName())) {
										if (onlinePlayers.getPlayer().getInventory().getBoots().getItemMeta().getDisplayName().equals(Armor.FireBoots.getItemMeta().getDisplayName())) {
											onlinePlayers.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE,2,1));
										}
									}
								}
							}
							if (onlinePlayers.getPlayer().getInventory().getHelmet().getItemMeta().getDisplayName().equals(Armor.WaterHelm.getItemMeta().getDisplayName())) {
								if (onlinePlayers.getPlayer().getInventory().getHelmet().getItemMeta().getDisplayName().equals(Armor.WaterChest.getItemMeta().getDisplayName())) {
									if (onlinePlayers.getPlayer().getInventory().getHelmet().getItemMeta().getDisplayName().equals(Armor.WaterLegs.getItemMeta().getDisplayName())) {
										if (onlinePlayers.getPlayer().getInventory().getHelmet().getItemMeta().getDisplayName().equals(Armor.WaterBoots.getItemMeta().getDisplayName())) {
											onlinePlayers.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING,2,1));
											onlinePlayers.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE,2,2));
										}
									}
								}
							}
							if (onlinePlayers.getPlayer().getInventory().getHelmet().getItemMeta().getDisplayName().equals(Armor.SpeedHelm.getItemMeta().getDisplayName())) {
								if (onlinePlayers.getPlayer().getInventory().getHelmet().getItemMeta().getDisplayName().equals(Armor.SpeedChest.getItemMeta().getDisplayName())) {
									if (onlinePlayers.getPlayer().getInventory().getHelmet().getItemMeta().getDisplayName().equals(Armor.SpeedLegs.getItemMeta().getDisplayName())) {
										if (onlinePlayers.getPlayer().getInventory().getHelmet().getItemMeta().getDisplayName().equals(Armor.SpeedBoots.getItemMeta().getDisplayName())) {
											onlinePlayers.addPotionEffect(new PotionEffect(PotionEffectType.SPEED,2,4));
										}
									}
								}
							}
							if (onlinePlayers.getPlayer().getInventory().getHelmet().getItemMeta().getDisplayName().equals(Armor.ResisHelm.getItemMeta().getDisplayName())) {
								if (onlinePlayers.getPlayer().getInventory().getHelmet().getItemMeta().getDisplayName().equals(Armor.ResisHelm.getItemMeta().getDisplayName())) {
									if (onlinePlayers.getPlayer().getInventory().getHelmet().getItemMeta().getDisplayName().equals(Armor.ResisHelm.getItemMeta().getDisplayName())) {
										if (onlinePlayers.getPlayer().getInventory().getHelmet().getItemMeta().getDisplayName().equals(Armor.ResisHelm.getItemMeta().getDisplayName())) {
											onlinePlayers.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE,2,2));
											onlinePlayers.addPotionEffect(new PotionEffect(PotionEffectType.SLOW,2,1));
										}
									}
								}
							}
							if (onlinePlayers.getPlayer().getInventory().getHelmet().getItemMeta().getDisplayName().equals(Armor.CombatHelm.getItemMeta().getDisplayName())) {
								if (onlinePlayers.getPlayer().getInventory().getChestplate().getItemMeta().getDisplayName().equals(Armor.CombatChest.getItemMeta().getDisplayName())) {
									if (onlinePlayers.getPlayer().getInventory().getLeggings().getItemMeta().getDisplayName().equals(Armor.CombatLegs.getItemMeta().getDisplayName())) {
										if (onlinePlayers.getPlayer().getInventory().getBoots().getItemMeta().getDisplayName().equals(Armor.CombatBoots.getItemMeta().getDisplayName())) {
											onlinePlayers.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE,2,2));
											onlinePlayers.addPotionEffect(new PotionEffect(PotionEffectType.SPEED,2,0));
										}
									}
								}
							}
						}
					}
				}
				
			}, 0L, 2L);
		return true;
	}

}
