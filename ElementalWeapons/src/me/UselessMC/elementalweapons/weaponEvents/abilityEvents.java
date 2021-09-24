package me.UselessMC.elementalweapons.weaponEvents;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.entity.LargeFireball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import me.UselessMC.elementalweapons.weaponInit.weaponInit;
import net.md_5.bungee.api.ChatColor;

public class abilityEvents implements Listener {
	private HashMap<UUID, Long> cooldown = new HashMap<UUID, Long>();
	private HashMap<UUID, Long> cooldown1 = new HashMap<UUID, Long>();

	@EventHandler
	public void fireStaffEvent(PlayerInteractEvent e) {
		if (e.getItem() != null) {
			if (e.getItem().equals(weaponInit.fireStaff)) {
				if (e.getAction() == Action.RIGHT_CLICK_AIR) {
					if (cooldown1.containsKey(e.getPlayer().getUniqueId())
							&& cooldown1.get(e.getPlayer().getUniqueId()) > System.currentTimeMillis()) {
						long secondsleft = cooldown1.get(e.getPlayer().getUniqueId()) - System.currentTimeMillis();
						if (secondsleft > 0) {
							e.setCancelled(true);
							e.getPlayer().updateInventory();
							e.getPlayer().sendMessage(
									ChatColor.RED + "<!> You cannot shoot for " + secondsleft / 1000 + " seconds.");
						}
					} else {
						e.getPlayer().launchProjectile(LargeFireball.class)
								.setVelocity(e.getPlayer().getLocation().getDirection().multiply(0.5));
						cooldown1.put(e.getPlayer().getUniqueId(), System.currentTimeMillis() + (2 * 1000));
					}
				}
			}
		}
	}

	@EventHandler
	public void lifeStaffEvent(PlayerInteractEvent e) {
		if (e.getItem() != null) {
			if (e.getItem().equals(weaponInit.lifeStaff)) {
				if (e.getAction() == Action.RIGHT_CLICK_AIR) {
					if (cooldown.containsKey(e.getPlayer().getUniqueId())
							&& cooldown.get(e.getPlayer().getUniqueId()) > System.currentTimeMillis()) {
						long secondsleft = cooldown.get(e.getPlayer().getUniqueId()) - System.currentTimeMillis();
						if (secondsleft > 0) {
							e.setCancelled(true);
							e.getPlayer().updateInventory();
							e.getPlayer().sendMessage(
									ChatColor.RED + "<!> You cannot heal for " + secondsleft / 1000 + " seconds.");
						}
					} else {
						e.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 60, 1));
						e.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, 60, 1));
						cooldown.put(e.getPlayer().getUniqueId(), System.currentTimeMillis() + (10 * 1000));
					}
				}
			}
		}
	}
}
