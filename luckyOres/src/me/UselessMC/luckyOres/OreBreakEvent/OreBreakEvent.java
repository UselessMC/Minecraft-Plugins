package me.UselessMC.luckyOres.OreBreakEvent;

import java.util.Random;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import me.UselessMC.luckyOres.Main;

public class OreBreakEvent implements Listener{
	@EventHandler
	public void coalBreak(BlockBreakEvent e) {
		if (!(e.getPlayer().getInventory().getItemInMainHand().getItemMeta().hasEnchant(Enchantment.SILK_TOUCH))) { 
			if (e.getBlock().getType().equals(Material.COAL_ORE)) {
				Location loc = e.getBlock().getLocation();
				Random random = new Random();
				int rnd = random.nextInt(2);
				if (rnd == 0) {
					e.setDropItems(false);
					int rnd1 = random.nextInt(Main.coalitems.size());
					ItemStack item1 = Main.coalitems.get(rnd1);
					loc.getWorld().dropItemNaturally(loc, item1);
				}
			}
		}
	}
	@EventHandler
	public void goldBreak(BlockBreakEvent e) {
		if (!(e.getPlayer().getInventory().getItemInMainHand().getItemMeta().hasEnchant(Enchantment.SILK_TOUCH))) { 
			if (e.getBlock().getType().equals(Material.GOLD_ORE)) {
				Location loc = e.getBlock().getLocation();
				e.setDropItems(false);
				Random random = new Random();
				int rnd1 = random.nextInt(Main.golditems.size());
				ItemStack item1 = Main.golditems.get(rnd1);
				int rnd2 = random.nextInt(Main.golditems.size());
				ItemStack item2 = Main.golditems.get(rnd2);
				loc.getWorld().dropItemNaturally(loc, item1);
				int rnd = random.nextInt(2);
				if (rnd == 0) {
					loc.getWorld().dropItemNaturally(loc, item2);
				}
			}
		}
	}
	@EventHandler
	public void ironBreak(BlockBreakEvent e) {
		if (!(e.getPlayer().getInventory().getItemInMainHand().getItemMeta().hasEnchant(Enchantment.SILK_TOUCH))) { 
			if (e.getBlock().getType().equals(Material.IRON_ORE)) {
				Location loc = e.getBlock().getLocation();
				e.setDropItems(false);
				Random random = new Random();
				int rnd1 = random.nextInt(Main.ironitems.size());
				ItemStack item1 = Main.ironitems.get(rnd1);
				loc.getWorld().dropItemNaturally(loc, item1);
			}
		}
	}
	@EventHandler
	public void redstoneBreak(BlockBreakEvent e) {
		if (!(e.getPlayer().getInventory().getItemInMainHand().getItemMeta().hasEnchant(Enchantment.SILK_TOUCH))) { 	
			if (e.getBlock().getType().equals(Material.REDSTONE_ORE)) {
				Location loc = e.getBlock().getLocation();
				e.setDropItems(false);
				Random random = new Random();
				int rnd1 = random.nextInt(Main.redstoneitems.size());
				ItemStack item1 = Main.redstoneitems.get(rnd1);
				int rnd2 = random.nextInt(Main.redstoneitems.size());
				ItemStack item2 = Main.redstoneitems.get(rnd2);
				loc.getWorld().dropItemNaturally(loc, item1);
				loc.getWorld().dropItemNaturally(loc, item2);
			}
		}
	}
	@EventHandler
	public void diamondBreak(BlockBreakEvent e) {
		if (!(e.getPlayer().getInventory().getItemInMainHand().getItemMeta().hasEnchant(Enchantment.SILK_TOUCH))) { 
			if (e.getBlock().getType().equals(Material.DIAMOND_ORE)) {
				Location loc = e.getBlock().getLocation();
				e.setDropItems(false);
				Random random = new Random();
				int rnd1 = random.nextInt(Main.diamonditems.size());
				ItemStack item1 = Main.diamonditems.get(rnd1);
				int rnd2 = random.nextInt(Main.diamonditems.size());
				ItemStack item2 = Main.diamonditems.get(rnd2);
				int rnd3 = random.nextInt(Main.diamonditems.size());
				ItemStack item3 = Main.diamonditems.get(rnd3);
				loc.getWorld().dropItemNaturally(loc, new ItemStack(Material.DIAMOND, 1));
				loc.getWorld().dropItemNaturally(loc, item1);
				loc.getWorld().dropItemNaturally(loc, item2);
				loc.getWorld().dropItemNaturally(loc, item3);
			}
		}
	}
	@EventHandler
	public void netheriteBreak(BlockBreakEvent e) {
		if (!(e.getPlayer().getInventory().getItemInMainHand().getItemMeta().hasEnchant(Enchantment.SILK_TOUCH))) { 
			if (e.getBlock().getType().equals(Material.ANCIENT_DEBRIS)) {
				Location loc = e.getBlock().getLocation();
				e.setDropItems(false);
				Random random = new Random();
				int rnd1 = random.nextInt(Main.netheriteitems.size());
				ItemStack item1 = Main.netheriteitems.get(rnd1);
				int rnd2 = random.nextInt(Main.netheriteitems.size());
				ItemStack item2 = Main.netheriteitems.get(rnd2);
				int rnd3 = random.nextInt(Main.netheriteitems.size());
				ItemStack item3 = Main.netheriteitems.get(rnd3);
				int rnd4 = random.nextInt(Main.netheriteitems.size());
				ItemStack item4 = Main.netheriteitems.get(rnd4);
				int rnd5 = random.nextInt(6);
				if (rnd5 == 1) {
					loc.getWorld().dropItemNaturally(loc, new ItemStack(Material.ENCHANTED_GOLDEN_APPLE, 2));
				}
				loc.getWorld().dropItemNaturally(loc, new ItemStack(Material.NETHERITE_SCRAP, 2));
				loc.getWorld().dropItemNaturally(loc, item1);
				loc.getWorld().dropItemNaturally(loc, item2);
				loc.getWorld().dropItemNaturally(loc, item3);
				loc.getWorld().dropItemNaturally(loc, item4);
			}
		}
	}
	@EventHandler
	public void lapisBreak(BlockBreakEvent e) {
		if (!(e.getPlayer().getInventory().getItemInMainHand().getItemMeta().hasEnchant(Enchantment.SILK_TOUCH))) { 
			if (e.getBlock().getType().equals(Material.LAPIS_ORE)) {
				Location loc = e.getBlock().getLocation();
				e.setDropItems(false);
				Random random = new Random();
				int rnd1 = random.nextInt(Main.lapisitems.size());
				ItemStack item1 = Main.lapisitems.get(rnd1);
				int rnd2 = random.nextInt(Main.lapisitems.size());
				ItemStack item2 = Main.lapisitems.get(rnd2);
				int rnd3 = random.nextInt(Main.lapisitems.size());
				ItemStack item3 = Main.lapisitems.get(rnd3);
				loc.getWorld().dropItemNaturally(loc, item1);
				loc.getWorld().dropItemNaturally(loc, item2);
				int rnd = random.nextInt(2);
				if (rnd == 0) {
					loc.getWorld().dropItemNaturally(loc, item3);
				}
			}
		}
	}
	@EventHandler
	public void emeraldBreak(BlockBreakEvent e) {
		if (!(e.getPlayer().getInventory().getItemInMainHand().getItemMeta().hasEnchant(Enchantment.SILK_TOUCH))) { 
			if (e.getBlock().getType().equals(Material.EMERALD_ORE)) {
				Location loc = e.getBlock().getLocation();
				e.setDropItems(false);
				Random random = new Random();
				int rnd1 = random.nextInt(Main.emeralditems.size());
				ItemStack item1 = Main.emeralditems.get(rnd1);
				int rnd2 = random.nextInt(Main.emeralditems.size());
				ItemStack item2 = Main.emeralditems.get(rnd2);
				int rnd3 = random.nextInt(Main.emeralditems.size());
				ItemStack item3 = Main.emeralditems.get(rnd3);
				int rnd4 = random.nextInt(Main.emeralditems.size());
				ItemStack item4 = Main.emeralditems.get(rnd4);
				loc.getWorld().dropItemNaturally(loc, new ItemStack(Material.EMERALD, 2));
				loc.getWorld().dropItemNaturally(loc, item1);
				loc.getWorld().dropItemNaturally(loc, item2);
				loc.getWorld().dropItemNaturally(loc, item3);
				int rnd = random.nextInt(2);
				if (rnd == 0) {
					loc.getWorld().dropItemNaturally(loc, item4);
				}
			}
		}	
	}
}
