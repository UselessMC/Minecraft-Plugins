package me.UselessMC.SaplingIsOp.saplingbreak;

import java.util.Random;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import me.UselessMC.SaplingIsOp.Main;

public class SaplingEvents implements Listener{
	@EventHandler
	public void oakBreak(BlockBreakEvent event) {
			if (event.getBlock().getType().equals(Material.OAK_SAPLING)) {
				Location loc = event.getBlock().getLocation();
				event.setDropItems(false);
				Random random = new Random();
				int rnd = random.nextInt(Main.items.size());
				ItemStack finalitem = Main.items.get(rnd);
				loc.getWorld().dropItemNaturally(loc,finalitem);
			}
	}
	@EventHandler
	public void birchBreak(BlockBreakEvent event) {
			if (event.getBlock().getType().equals(Material.BIRCH_SAPLING)) {
				Location loc = event.getBlock().getLocation();
				event.setDropItems(false);
				Random random = new Random();
				int rnd = random.nextInt(Main.items.size());
				ItemStack finalitem = Main.items.get(rnd);
				loc.getWorld().dropItemNaturally(loc,finalitem);
			}
	}
	@EventHandler
	public void spruceBreak(BlockBreakEvent event) {
			if (event.getBlock().getType().equals(Material.SPRUCE_SAPLING)) {
				Location loc = event.getBlock().getLocation();
				event.setDropItems(false);
				Random random = new Random();
				int rnd = random.nextInt(Main.items.size());
				ItemStack finalitem = Main.items.get(rnd);
				loc.getWorld().dropItemNaturally(loc,finalitem);
			}
	}
	@EventHandler
	public void jungleBreak(BlockBreakEvent event) {
			if (event.getBlock().getType().equals(Material.JUNGLE_SAPLING)) {
				Location loc = event.getBlock().getLocation();
				event.setDropItems(false);
				Random random = new Random();
				int rnd = random.nextInt(Main.items.size());
				ItemStack finalitem = Main.items.get(rnd);
				loc.getWorld().dropItemNaturally(loc,finalitem);
			}
	}
	@EventHandler
	public void acaciaBreak(BlockBreakEvent event) {
			if (event.getBlock().getType().equals(Material.ACACIA_SAPLING)) {
				Location loc = event.getBlock().getLocation();
				event.setDropItems(false);
				Random random = new Random();
				int rnd = random.nextInt(Main.items.size());
				ItemStack finalitem = Main.items.get(rnd);
				loc.getWorld().dropItemNaturally(loc,finalitem);
			}
	}
	@EventHandler
	public void darkOakBreak(BlockBreakEvent event) {
			if (event.getBlock().getType().equals(Material.DARK_OAK_SAPLING)) {
				Location loc = event.getBlock().getLocation();
				event.setDropItems(false);
				Random random = new Random();
				int rnd = random.nextInt(Main.items.size());
				ItemStack finalitem = Main.items.get(rnd);
				loc.getWorld().dropItemNaturally(loc,finalitem);
			}
	}
}
