package me.UselessMC.SaplingIsOp;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import me.UselessMC.SaplingIsOp.OpItems.OpItems;
import me.UselessMC.SaplingIsOp.saplingbreak.SaplingEvents;

public class Main extends JavaPlugin{
	public static ArrayList<ItemStack> items = new ArrayList<ItemStack>();
	@Override
	public void onEnable() {
			OpItems.init();
	        items.add(new ItemStack(Material.DIAMOND_BLOCK));
	        items.add(new ItemStack(Material.DIAMOND_BLOCK));
	        items.add(OpItems.ophelmet);
	        items.add(OpItems.opchestplate);
	        items.add(OpItems.opleggings);
	        items.add(OpItems.ophelmet);
	        items.add(OpItems.opchestplate);
	        items.add(OpItems.opleggings);
	        items.add(OpItems.opboots);
	        items.add(OpItems.opboots);
	        items.add(OpItems.opsword);
	        items.add(OpItems.opsword);
	        items.add(OpItems.opknockback);
	        items.add(OpItems.opefficiency);
	        items.add(OpItems.opsharp);
	        items.add(OpItems.opfortune);
	        items.add(OpItems.opfortune);
	        items.add(OpItems.opthorns);
	        items.add(OpItems.oplooting);
	        items.add(OpItems.oppower);
	        items.add(OpItems.opflame);
	        items.add(OpItems.oppunch);
	        items.add(OpItems.opinfinity);
	        items.add(OpItems.opfalling);
	        items.add(OpItems.opprotection);
	        items.add(OpItems.ophelmet);
	        items.add(OpItems.opchestplate);
	        items.add(OpItems.opleggings);
	        items.add(OpItems.ophelmet);
	        items.add(OpItems.opchestplate);
	        items.add(OpItems.opleggings);
	        items.add(OpItems.opboots);
	        items.add(OpItems.opboots);
	        items.add(OpItems.opsword);
	        items.add(OpItems.opsword);
	        items.add(OpItems.opknockback);
	        items.add(OpItems.opefficiency);
	        items.add(OpItems.opsharp);
	        items.add(OpItems.oplooting);
	        items.add(OpItems.oppower);
	        items.add(OpItems.opflame);
	        items.add(OpItems.oppunch);
	        items.add(OpItems.opfalling);
	        items.add(OpItems.opprotection);
	        items.add(new ItemStack(Material.NETHERITE_INGOT));
	        items.add(new ItemStack(Material.GOLDEN_APPLE));
	        items.add(new ItemStack(Material.ENDER_PEARL));
	        items.add(new ItemStack(Material.BLAZE_ROD));
	        items.add(new ItemStack(Material.IRON_BLOCK));
	        items.add(new ItemStack(Material.IRON_INGOT));
	        items.add(new ItemStack(Material.DIAMOND));
	        items.add(new ItemStack(Material.GOLD_INGOT));
	        items.add(new ItemStack(Material.GOLD_BLOCK));
	        items.add(new ItemStack(Material.GOLDEN_APPLE));
	        items.add(new ItemStack(Material.ENDER_PEARL));
	        items.add(new ItemStack(Material.BLAZE_ROD));
	        items.add(new ItemStack(Material.IRON_BLOCK));
	        items.add(new ItemStack(Material.IRON_INGOT));
	        items.add(new ItemStack(Material.DIAMOND));
	        items.add(new ItemStack(Material.GOLD_INGOT));
	        items.add(new ItemStack(Material.GOLD_BLOCK));
	        items.add(new ItemStack(Material.GOLDEN_APPLE));
	        items.add(new ItemStack(Material.ENDER_PEARL));
	        items.add(new ItemStack(Material.IRON_BLOCK));
	        items.add(new ItemStack(Material.IRON_BLOCK));
	        items.add(new ItemStack(Material.IRON_INGOT));
	        items.add(new ItemStack(Material.DIAMOND));
	        items.add(new ItemStack(Material.GOLD_INGOT));
	        items.add(new ItemStack(Material.GOLDEN_APPLE));
	        items.add(new ItemStack(Material.BLAZE_ROD));
	        items.add(new ItemStack(Material.IRON_INGOT));
	        items.add(new ItemStack(Material.DIAMOND));
	        items.add(new ItemStack(Material.GOLD_INGOT));
	        items.add(new ItemStack(Material.GOLDEN_APPLE));
	        items.add(new ItemStack(Material.IRON_INGOT));
	        items.add(new ItemStack(Material.GOLD_INGOT));
	        items.add(new ItemStack(Material.NETHERITE_INGOT));
	        items.add(new ItemStack(Material.GOLDEN_APPLE));
	        items.add(new ItemStack(Material.ENDER_PEARL));
	        items.add(new ItemStack(Material.BLAZE_ROD));
	        items.add(new ItemStack(Material.IRON_BLOCK));
	        items.add(new ItemStack(Material.IRON_INGOT));
	        items.add(new ItemStack(Material.DIAMOND));
	        items.add(new ItemStack(Material.GOLD_INGOT));
	        items.add(new ItemStack(Material.GOLD_BLOCK));
	        items.add(new ItemStack(Material.GOLDEN_APPLE));
	        items.add(new ItemStack(Material.ENDER_PEARL));
	        items.add(new ItemStack(Material.BLAZE_ROD));
	        items.add(new ItemStack(Material.IRON_BLOCK));
	        items.add(new ItemStack(Material.IRON_INGOT));
	        items.add(new ItemStack(Material.DIAMOND));
	        items.add(new ItemStack(Material.GOLD_INGOT));
	        items.add(new ItemStack(Material.GOLD_BLOCK));
	        items.add(new ItemStack(Material.GOLDEN_APPLE));
	        items.add(new ItemStack(Material.ENDER_PEARL));
	        items.add(new ItemStack(Material.IRON_BLOCK));
	        items.add(new ItemStack(Material.IRON_INGOT));
	        items.add(new ItemStack(Material.DIAMOND));
	        items.add(new ItemStack(Material.GOLD_INGOT));
	        items.add(new ItemStack(Material.ENCHANTED_GOLDEN_APPLE));
	        items.add(new ItemStack(Material.GOLDEN_APPLE));
	        items.add(new ItemStack(Material.BLAZE_ROD));
	        items.add(new ItemStack(Material.IRON_INGOT));
	        items.add(new ItemStack(Material.DIAMOND));
	        items.add(new ItemStack(Material.GOLD_INGOT));
	        items.add(new ItemStack(Material.GOLDEN_APPLE));
	        items.add(new ItemStack(Material.IRON_INGOT));
	        items.add(new ItemStack(Material.GOLD_INGOT));
	        items.add(new ItemStack(Material.EXPERIENCE_BOTTLE, 16));
	        items.add(new ItemStack(Material.EXPERIENCE_BOTTLE, 16));
	        items.add(new ItemStack(Material.EXPERIENCE_BOTTLE, 16));
	        items.add(new ItemStack(Material.EXPERIENCE_BOTTLE, 16));
	        items.add(new ItemStack(Material.EXPERIENCE_BOTTLE, 16));
	        items.add(new ItemStack(Material.EXPERIENCE_BOTTLE, 16));
	        getServer().getPluginManager().registerEvents(new SaplingEvents(), this);
	    }
	}
