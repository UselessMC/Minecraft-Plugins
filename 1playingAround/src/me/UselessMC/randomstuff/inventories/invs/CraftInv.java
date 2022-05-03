package me.UselessMC.randomstuff.inventories.invs;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CraftInv implements InventoryHolder, Listener, CommandExecutor {

	private Inventory craftInventory;

	public CraftInv() {
		craftInventory = Bukkit.createInventory(this, 54, "Custom Crafting Table");
		init();
	}

	private void init() {
		ItemStack item = createItem("", Material.GRAY_STAINED_GLASS_PANE, 1);
		ItemStack air = createItem("", Material.AIR, 1);
		ItemStack book = createItem("Custom Recipes", Material.KNOWLEDGE_BOOK, 1);
		ItemStack bar = createItem("Close", Material.BARRIER, 1);
		ItemStack[] craftInv = {item, item, item, item, item, item, item, item, item, 
								item, item, air, air, air, item, item, item, item, 
								item, book, air, air, air, item, air, item, item, 
								item, item, air, air, air, item, item, item, item, 
								item, item, item, item, item, item, item, item, item, 
								item, item, item, item, bar, item, item, item, item };
		craftInventory.setContents(craftInv);
	}

	private ItemStack createItem(String name, Material mat, int count) {
		ItemStack item = new ItemStack(mat, count);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(name);
		item.setItemMeta(meta);

		return item;
	}

	@Override
	public Inventory getInventory() {
		return craftInventory;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("customcraft")) {
			if (!(sender instanceof Player)) {
				return false;
			}
			Player p = (Player) sender;
			p.openInventory(craftInventory);
		}
		return true;
	}

	@EventHandler
	public void onClick(InventoryClickEvent e) {
		if (e.getInventory() == craftInventory) {
			if (e.getSlot() == 12 || e.getSlot() == 13 || e.getSlot() == 14 || 
					e.getSlot() == 20 || e.getSlot() == 21 || e.getSlot() == 22 || e.getSlot() == 23 || 
					e.getSlot() == 30 || e.getSlot() == 31 || e.getSlot() == 32) {
				e.setCancelled(true);
			}
		}
	}

}
