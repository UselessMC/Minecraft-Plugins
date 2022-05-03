package me.UselessMC.luckyOres.lapisBooks;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;

public class lapisBooks {
	public static ItemStack opsharp;
	public static ItemStack opefficiency;
	public static ItemStack opknockback;
	public static ItemStack oplooting;
	public static ItemStack opprotection;
	public static ItemStack opthorns;
	public static ItemStack oppower;
	public static ItemStack opflame;
	public static ItemStack oppunch;
	public static ItemStack opinfinity;
	public static ItemStack opfalling;
	public static ItemStack opfortune;
	public static ItemStack opfire;
	
	public static void init() {
		createopsharp();
		createopefficiency();
		createopknockback();
		createoplooting();
		createopthorns();
		createopfalling();
		createoppower();
		createoppunch();
		createopflame();
		createopinfinity();
		createopprotection();
		createopfortune();
		createopfire();
	}
	private static void createopsharp() {
		ItemStack i = new ItemStack(Material.ENCHANTED_BOOK); 
		EnchantmentStorageMeta m = (EnchantmentStorageMeta) i.getItemMeta();
		m.addStoredEnchant(Enchantment.DAMAGE_ALL, 5, true);
		i.setItemMeta(m);
		opsharp = i;
	}
	private static void createopefficiency() {
		ItemStack i = new ItemStack(Material.ENCHANTED_BOOK); 
		EnchantmentStorageMeta m = (EnchantmentStorageMeta) i.getItemMeta();
		m.addStoredEnchant(Enchantment.DIG_SPEED, 5, true);
		i.setItemMeta(m);
		opefficiency = i;
	}
	private static void createopknockback() {
		ItemStack i = new ItemStack(Material.ENCHANTED_BOOK); 
		EnchantmentStorageMeta m = (EnchantmentStorageMeta) i.getItemMeta();
		m.addStoredEnchant(Enchantment.KNOCKBACK, 2, true);
		i.setItemMeta(m);
		opknockback = i;
	}
	private static void createoplooting() {
		ItemStack i = new ItemStack(Material.ENCHANTED_BOOK); 
		EnchantmentStorageMeta m = (EnchantmentStorageMeta) i.getItemMeta();
		m.addStoredEnchant(Enchantment.LOOT_BONUS_MOBS, 3, true);
		i.setItemMeta(m);
		oplooting = i;
	}
	private static void createopthorns() {
		ItemStack i = new ItemStack(Material.ENCHANTED_BOOK); 
		EnchantmentStorageMeta m = (EnchantmentStorageMeta) i.getItemMeta();
		m.addStoredEnchant(Enchantment.THORNS, 3, true);
		i.setItemMeta(m);
		opthorns = i;
	}
	private static void createopfalling() {
		ItemStack i = new ItemStack(Material.ENCHANTED_BOOK); 
		EnchantmentStorageMeta m = (EnchantmentStorageMeta) i.getItemMeta();
		m.addStoredEnchant(Enchantment.PROTECTION_FALL, 4, true);
		i.setItemMeta(m);
		opfalling = i;
	}
	private static void createoppower() {
		ItemStack i = new ItemStack(Material.ENCHANTED_BOOK); 
		EnchantmentStorageMeta m = (EnchantmentStorageMeta) i.getItemMeta();
		m.addStoredEnchant(Enchantment.ARROW_DAMAGE, 5, true);
		i.setItemMeta(m);
		oppower = i;
	}
	private static void createoppunch() {
		ItemStack i = new ItemStack(Material.ENCHANTED_BOOK); 
		EnchantmentStorageMeta m = (EnchantmentStorageMeta) i.getItemMeta();
		m.addStoredEnchant(Enchantment.ARROW_KNOCKBACK, 2, true);
		i.setItemMeta(m);
		oppunch = i;
	}
	private static void createopinfinity() {
		ItemStack i = new ItemStack(Material.ENCHANTED_BOOK); 
		EnchantmentStorageMeta m = (EnchantmentStorageMeta) i.getItemMeta();
		m.addStoredEnchant(Enchantment.ARROW_INFINITE, 1, true);
		i.setItemMeta(m);
		opinfinity = i;
	}
	private static void createopflame() {
		ItemStack i = new ItemStack(Material.ENCHANTED_BOOK); 
		EnchantmentStorageMeta m = (EnchantmentStorageMeta) i.getItemMeta();
		m.addStoredEnchant(Enchantment.ARROW_FIRE, 1, true);
		i.setItemMeta(m);
		opflame = i;
	}
	private static void createopprotection() {
		ItemStack i = new ItemStack(Material.ENCHANTED_BOOK); 
		EnchantmentStorageMeta m = (EnchantmentStorageMeta) i.getItemMeta();
		m.addStoredEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
		i.setItemMeta(m);
		opprotection = i;
	}
	private static void createopfortune() {
		ItemStack i = new ItemStack(Material.ENCHANTED_BOOK); 
		EnchantmentStorageMeta m = (EnchantmentStorageMeta) i.getItemMeta();
		m.addStoredEnchant(Enchantment.LOOT_BONUS_BLOCKS, 3, true);
		i.setItemMeta(m);
		opfortune = i;
	}
	private static void createopfire() {
		ItemStack i = new ItemStack(Material.ENCHANTED_BOOK); 
		EnchantmentStorageMeta m = (EnchantmentStorageMeta) i.getItemMeta();
		m.addStoredEnchant(Enchantment.FIRE_ASPECT, 2, true);
		i.setItemMeta(m);
		opfire = i;
	}
}
