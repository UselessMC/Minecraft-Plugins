package me.UselessMC.elementalweapons.weaponEvents;

import java.util.Random;

import org.bukkit.entity.Drowned;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntityDeathEvent;

import me.UselessMC.elementalweapons.weaponInit.weaponInit;

public class obtainWeaponEvent implements Listener {
	@EventHandler
	public void fireOrbEvent(EntityDeathEvent e) {
		if (e.getEntity().getType().equals(EntityType.BLAZE) || e.getEntity().getType().equals(EntityType.MAGMA_CUBE)) {
			Random r = new Random();
			int rnd1 = r.nextInt(50);
			if (rnd1 == 25) {
				e.getDrops().add(weaponInit.fireOrb);
			}
		}
	}

	@EventHandler
	public void tridentEvent(CreatureSpawnEvent e) {
		if (e.getEntityType().equals(EntityType.DROWNED)) {
			Drowned d = (Drowned) e.getEntity();
			Random r = new Random();
			int rnd1 = r.nextInt(25);
			if (rnd1 == 12) {
				d.setCustomName("Drowned King");
				d.getEquipment().setItemInMainHand(weaponInit.oceanicTrident);
			}
		}
	}
	@EventHandler
	public void tridentGetEvent(EntityDeathEvent e) {
		EntityType t = e.getEntity().getType();
		if (t.equals(EntityType.DROWNED) && e.getEntity().getName().equals("Drowned King")) {
			e.getDrops().add(weaponInit.oceanicTrident);
		}
	}
	
	@EventHandler
	public void lifeEvent(EntityDeathEvent e) {
		EntityType t = e.getEntity().getType();
		if (t.equals(EntityType.BEE) || t.equals(EntityType.PIG) || t.equals(EntityType.COW)
				|| t.equals(EntityType.SHEEP) || t.equals(EntityType.CHICKEN)) {
			Random r = new Random();
			int rnd1 = r.nextInt(50);
			if (rnd1 == 25) {
				e.getDrops().add(weaponInit.lifeOrb);
			}
		}
	}
}
