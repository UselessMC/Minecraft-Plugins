package me.UselessMC.custominv.Inventories;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class TeleportInventory implements InventoryHolder, Listener {

	private Inventory teleInv;
	private Player owner;
	private Location homLoc;
	private Location mineLoc;
	private Location farm1Loc;
	private Location farm2Loc;
	private Location farm3Loc;
	
	public TeleportInventory(Player player) {
		owner = player;
		teleInv = Bukkit.createInventory(this, 5, "Teleport Locations");
	}
	
	private void init() {
		List<String> lore = new ArrayList<>();
		lore.add("Click to Teleport Home");
		ItemStack item = createItem("Home", Material.GRASS_BLOCK, lore, 1);
		teleInv.setItem(teleInv.firstEmpty(), item);
		List<String> lore1 = new ArrayList<>();
		lore1.add("Click to Teleport to Mines");
		ItemStack item1 = createItem("Mines", Material.DIAMOND_PICKAXE, lore, 1);
		teleInv.setItem(teleInv.firstEmpty(), item1);
		List<String> lore2 = new ArrayList<>();
		lore2.add("Click to Teleport to Farm 1");
		ItemStack item2 = createItem("Farm 1", Material.WHEAT, lore, 1);
		teleInv.setItem(teleInv.firstEmpty(), item2);
		List<String> lore3 = new ArrayList<>();
		lore3.add("Click to Teleport to Farm 2");
		ItemStack item3 = createItem("Farm 2", Material.POTATO, lore, 1);
		teleInv.setItem(teleInv.firstEmpty(), item3);
		List<String> lore4 = new ArrayList<>();
		lore4.add("Click to Teleport to Farm 3");
		ItemStack item4 = createItem("Farm 3", Material.CARROT, lore, 1);
		teleInv.setItem(teleInv.firstEmpty(), item4);
	}
	
	private ItemStack createItem(String name, Material mat, List<String> lore, int count) {
		ItemStack item = new ItemStack(mat, count);
		ItemMeta meta = item.getItemMeta();
		meta.setLore(lore);
		meta.setDisplayName(name);
		item.setItemMeta(meta);
		
		return item;
	}
	
	public Inventory getInventory() {
		return teleInv;
	} 
	
	public Player getOwner() {
		return owner;
	}
	
	@EventHandler
	public void teleportClick(InventoryClickEvent e) {
		if (e.getClickedInventory() == null) {return; }
		if (e.getClickedInventory().getHolder() == this) {
			
		}
	}
}
