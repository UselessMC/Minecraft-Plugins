package me.UselessMC.elementalweapons.weaponEvents;

import java.util.Random;

import org.bukkit.attribute.Attribute;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.EntitySpawnEvent;

import me.UselessMC.elementalweapons.weaponInit.weaponInit;

public class obtainWeaponEvent implements Listener{
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
	public void tridentEvent(EntitySpawnEvent e) {
		if (e.getEntity().getType().equals(EntityType.DROWNED)) {
			LivingEntity d = (LivingEntity) e.getEntity();
			d.setCustomName("Drowned King");
			double health = 2*(d.getAttribute(Attribute.GENERIC_MAX_HEALTH).getDefaultValue());
			d.setHealth(health);
			d.getEquipment().setItemInMainHand(weaponInit.oceanicTrident);
		}
	}
	
	@EventHandler
	public void lifeEvent(EntityDeathEvent e) {
		EntityType t = e.getEntity().getType();
		if (t.equals(EntityType.BEE) || t.equals(EntityType.PIG) || t.equals(EntityType.COW) || t.equals(EntityType.SHEEP) || t.equals(EntityType.CHICKEN) ) {
			Random r = new Random();
			int rnd1 = r.nextInt(50);
			if (rnd1 == 25) {
				e.getDrops().add(weaponInit.lifeOrb);
			}
		}
	}
}
