package me.UselessMC.CustomEnchants;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Container;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.inventory.PrepareAnvilEvent;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import me.UselessMC.CustomEnchants.Enchantments.InitializeEnchants;
import me.UselessMC.CustomEnchants.enchantEvents.enchantmentCommands;

public class Main extends JavaPlugin implements Listener{
	@Override
	public void onEnable() {
		enchantmentCommands command = new enchantmentCommands();
		this.getCommand("telekinesisbook").setExecutor(command);
		this.getCommand("autosmeltbook").setExecutor(command);
		InitializeEnchants.createTelekinesis();
		InitializeEnchants.createAutoSmelt();
		InitializeEnchants.register();
		this.getServer().getPluginManager().registerEvents(this, this);
	}
	@EventHandler
	public void anvilEnchant(PrepareAnvilEvent e) {
		int cost = 5;
		ItemStack item1 = e.getInventory().getItem(0);
		ItemStack item2 = e.getInventory().getItem(1);
		ItemStack result = e.getInventory().getItem(2);
		if (item1 != null) {
			result = item1;
			if (item2 != null) {
				if (item2.equals(InitializeEnchants.telekinesisBook)) {
					result.addUnsafeEnchantment(InitializeEnchants.TELEKINESIS, 1);
					ItemMeta m = result.getItemMeta();
					if (result.getItemMeta().hasLore()) {
						List<String> lore = new ArrayList<>();
						lore.add(ChatColor.GRAY + "Telekinesis I");
						m.getLore().add(getName());
					} else {
						List<String> lore = new ArrayList<>();
						lore.add(ChatColor.GRAY + "Telekinesis I");
						m.setLore(lore);
						result.setItemMeta(m);
					}
					this.getServer().getScheduler().runTask(this, () -> e.getInventory().setRepairCost(cost));
					e.setResult(result);
				}
				else if (item2.equals(InitializeEnchants.autoSmeltBook)) {
					result.addUnsafeEnchantment(InitializeEnchants.AUTOSMELT, 1);
					ItemMeta m = result.getItemMeta();
					if (result.getItemMeta().hasLore()) {
						m.getLore().add(ChatColor.GRAY + "AutoSmelt I");
						result.setItemMeta(m);
					} else {
						List<String> lore = new ArrayList<>();
						lore.add(ChatColor.GRAY + "AutoSmelt I");
						m.setLore(lore);
						result.setItemMeta(m);
					}
					this.getServer().getScheduler().runTask(this, () -> e.getInventory().setRepairCost(cost));
					e.setResult(result);
				}
			}
		}
	}
	@EventHandler
	public void telkineticBreak(BlockBreakEvent e) {
		Player p = e.getPlayer();
		ItemStack i = p.getInventory().getItemInMainHand();
		Block b = e.getBlock();
		if (p.getInventory().getItemInMainHand() == null) {
			Bukkit.getServer().getConsoleSender().sendMessage("Does not have item");
			return;
		}
		if (!i.hasItemMeta()) {
			Bukkit.getServer().getConsoleSender().sendMessage("Does not have itemmeta");
			return;
		}
		if (!i.getItemMeta().hasEnchant(InitializeEnchants.TELEKINESIS)) {
			Bukkit.getServer().getConsoleSender().sendMessage("Does not have enchantment");
			return;
		}
		if (p.getGameMode().equals(GameMode.CREATIVE) || p.getGameMode().equals(GameMode.SPECTATOR)) {
			Bukkit.getServer().getConsoleSender().sendMessage("Wrong gamemode");
			return;
		} 
		if (p.getInventory().firstEmpty() == -1) {
			Bukkit.getServer().getConsoleSender().sendMessage("No inventory space");
		}
		if (e.getBlock().getState() instanceof Container) {
			Bukkit.getServer().getConsoleSender().sendMessage("Cannot be used on container");
			return;
		}
		
		e.setDropItems(false);
		
		Collection<ItemStack> drops = b.getDrops(i);
		if (drops.isEmpty()) {
			return;
		}
		if (p.getInventory().getItemInMainHand().getItemMeta().hasEnchant(InitializeEnchants.AUTOSMELT)) {
			p.getInventory().addItem(drops.iterator().next());
		}
	}
	@EventHandler
	public void smeltingBreak(BlockBreakEvent e) {
		Player p = e.getPlayer();
		ItemStack i = p.getInventory().getItemInMainHand();
		Block b = e.getBlock();
		if (p.getInventory().getItemInMainHand() == null) {
			Bukkit.getServer().getConsoleSender().sendMessage("Does not have item");
			return;
		}
		if (!i.hasItemMeta()) {
			Bukkit.getServer().getConsoleSender().sendMessage("Does not have itemmeta");
			return;
		}
		if (!i.getItemMeta().hasEnchant(InitializeEnchants.AUTOSMELT)) {
			Bukkit.getServer().getConsoleSender().sendMessage("Does not have enchantment");
			return;
		}
		if (p.getGameMode().equals(GameMode.CREATIVE) || p.getGameMode().equals(GameMode.SPECTATOR)) {
			Bukkit.getServer().getConsoleSender().sendMessage("Wrong gamemode");
			return;
		} 
		if (p.getInventory().firstEmpty() == -1) {
			Bukkit.getServer().getConsoleSender().sendMessage("No inventory space");
		}
		if (e.getBlock().getState() instanceof Container) {
			Bukkit.getServer().getConsoleSender().sendMessage("Cannot be used on container");
			return;
		}
		if (e.getBlock().getType().equals(Material.STONE) || e.getBlock().getType().equals(Material.COBBLESTONE)) {
			
		}
		e.setDropItems(false);
		
		Collection<ItemStack> drops = b.getDrops(i);
		if (drops.isEmpty()) {
			return;
		}
		for (ItemStack item : drops) {
			ItemStack result = null;
			Iterator<Recipe> iter = Bukkit.recipeIterator();
			while (iter.hasNext()) {
				Recipe recipe = iter.next();
				if (!(recipe instanceof FurnaceRecipe)) continue;
				if (((FurnaceRecipe) recipe).getInput().getType() != item.getType()) continue;
				result = recipe.getResult();
				break;
			}
			if (result != null) {
				result.setAmount(item.getAmount());
				if (p.getInventory().getItemInMainHand().getItemMeta().hasEnchant(InitializeEnchants.TELEKINESIS)) {
					p.getInventory().addItem(result);
				}
				else {
					e.getBlock().getLocation().getWorld().dropItemNaturally(e.getBlock().getLocation(), result);
				}
			}
		}
	}
}
