package me.UselessMC.ElementalArmor.ArmorEvents;

import org.bukkit.Sound;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import me.UselessMC.ElementalArmor.ArmorSets.Armor;

public class UsageEvents implements Listener{
	@EventHandler
	public static void fireArmorDmg(EntityDamageByEntityEvent event) {
		if (event.getDamager() instanceof Player) {
			Player p = (Player) event.getDamager();
			if (p.getInventory().getHelmet().getItemMeta().getDisplayName().equals(Armor.FireHelm.getItemMeta().getDisplayName())) {
				if (p.getInventory().getChestplate().getItemMeta().getDisplayName().equals(Armor.FireChest.getItemMeta().getDisplayName())) {
					if (p.getInventory().getLeggings().getItemMeta().getDisplayName().equals(Armor.FireLegs.getItemMeta().getDisplayName())) {
						if (p.getInventory().getBoots().getItemMeta().getDisplayName().equals(Armor.FireBoots.getItemMeta().getDisplayName())) {
							event.getEntity().setFireTicks(100);
							p.playSound(p.getLocation(), Sound.ENTITY_BLAZE_SHOOT, 10, 10);
						}
					}
				}
			}
		}
	}
	@EventHandler
	public static void resistanceArmorDmg(EntityDamageByEntityEvent event) {
		if (event.getDamager() instanceof Player) {
			Player p = (Player) event.getDamager();
			if (p.getInventory().getHelmet().getItemMeta().getDisplayName().equals(Armor.ResisHelm.getItemMeta().getDisplayName())) {
				if (p.getInventory().getChestplate().getItemMeta().getDisplayName().equals(Armor.ResisChest.getItemMeta().getDisplayName())) {
					if (p.getInventory().getLeggings().getItemMeta().getDisplayName().equals(Armor.ResisLegs.getItemMeta().getDisplayName())) {
						if (p.getInventory().getBoots().getItemMeta().getDisplayName().equals(Armor.ResisBoots.getItemMeta().getDisplayName())) {
							if (event.getEntity() instanceof LivingEntity)
								((LivingEntity)event.getEntity()).addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 40, 0));						}
					}
				}
			}
		}
	}
	@EventHandler
	public static void speedArmorDmg(EntityDamageByEntityEvent event) {
		if (event.getDamager() instanceof Player) {
			Player p = (Player) event.getDamager();
			if (p.getInventory().getHelmet().getItemMeta().getDisplayName().equals(Armor.SpeedHelm.getItemMeta().getDisplayName())) {
				if (p.getInventory().getChestplate().getItemMeta().getDisplayName().equals(Armor.SpeedChest.getItemMeta().getDisplayName())) {
					if (p.getInventory().getLeggings().getItemMeta().getDisplayName().equals(Armor.SpeedLegs.getItemMeta().getDisplayName())) {
						if (p.getInventory().getBoots().getItemMeta().getDisplayName().equals(Armor.SpeedBoots.getItemMeta().getDisplayName())) {
							if (event.getEntity() instanceof LivingEntity)
								((LivingEntity)event.getEntity()).addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 40, 0));
						}
					}
				}
			}
		}
	}
	@EventHandler
	public static void combatArmorDmg(EntityDamageByEntityEvent event) {
		if (event.getDamager() instanceof Player) {
			Player p = (Player) event.getDamager();
			if (p.getInventory().getHelmet().getItemMeta().getDisplayName().equals(Armor.CombatHelm.getItemMeta().getDisplayName())) {
				if (p.getInventory().getChestplate().getItemMeta().getDisplayName().equals(Armor.CombatChest.getItemMeta().getDisplayName())) {
					if (p.getInventory().getLeggings().getItemMeta().getDisplayName().equals(Armor.CombatLegs.getItemMeta().getDisplayName())) {
						if (p.getInventory().getBoots().getItemMeta().getDisplayName().equals(Armor.CombatBoots.getItemMeta().getDisplayName())) {
							if (event.getEntity() instanceof LivingEntity)
								((LivingEntity)event.getEntity()).addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 40, 0));
						}
					}
				}
			}
		}
	}
}
