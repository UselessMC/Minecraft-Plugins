package me.UselessMC.elementalweapons.weaponInit;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

public class weaponInit {
	public static ItemStack fireStaff;
	public static ItemStack lifeStaff;
	public static ItemStack oceanicTrident;
	public static ItemStack fireOrb; 
	public static ItemStack lifeOrb; 
	
	public static void init() {
		lifeOrb();
		fireOrb();
		fireStaff();
		lifeStaff();
		oceanicTrident();
	}
	public static void fireStaff() {
		ItemStack i = new ItemStack(Material.STICK); 
		ItemMeta m = i.getItemMeta();
		m.setDisplayName("§6Fire Staff");
		List<String> lore = new ArrayList<>();
		lore.add("§9A magic staff infused with ");
		lore.add("§9a stone forged in hell");
		
		m.setLore(lore);
		m.addEnchant(Enchantment.DAMAGE_ALL, 9, true);
		m.addEnchant(Enchantment.FIRE_ASPECT, 5, true);
		m.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		i.setItemMeta(m);
		fireStaff = i;
		
		ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("firestaff"),i);
		sr.shape(" O "," S "," S ");
		sr.setIngredient('O', new RecipeChoice.ExactChoice(weaponInit.fireOrb));
		sr.setIngredient('S', Material.STICK);
		Bukkit.getServer().addRecipe(sr);
	}
	public static void lifeStaff() {
		ItemStack i = new ItemStack(Material.STICK); 
		ItemMeta m = i.getItemMeta();
		m.setDisplayName("§2Life Staff");
		List<String> lore = new ArrayList<>();
		lore.add("§9A magic staff infused with ");
		lore.add("§9the power of life");
		m.setLore(lore);
		m.addEnchant(Enchantment.LUCK, 1, true);
		m.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		i.setItemMeta(m);
		lifeStaff = i;
		
		ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("lifestaff"),i);
		sr.shape(" O "," S "," S ");
		sr.setIngredient('O', new RecipeChoice.ExactChoice(weaponInit.lifeOrb));
		sr.setIngredient('S', Material.STICK);
		Bukkit.getServer().addRecipe(sr);
	}
	public static void oceanicTrident() {
		ItemStack i = new ItemStack(Material.TRIDENT); 
		ItemMeta m = i.getItemMeta();
		m.setDisplayName("§3Oceanic Trident");
		List<String> lore = new ArrayList<>();
		lore.add("§9A magic trident obtained by killing ");
		lore.add("§9the mighty lord of the drowned");
		m.setLore(lore);
		m.addEnchant(Enchantment.RIPTIDE, 5, true);
		m.addEnchant(Enchantment.IMPALING, 10, true);
		m.addEnchant(Enchantment.CHANNELING, 1, true);
		m.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		m.setUnbreakable(true);
		i.setItemMeta(m);
		oceanicTrident = i;
		
		ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("ocean_staff"),i);
		sr.shape(" O "," S "," S ");
		sr.setIngredient('O', Material.DIAMOND);
		sr.setIngredient('S', Material.STICK);
		Bukkit.getServer().addRecipe(sr);
	}
	public static void fireOrb () {
		ItemStack i = new ItemStack(Material.MAGMA_CREAM);
		ItemMeta m = i.getItemMeta();
		m.setDisplayName("§6Fire Orb");
		m.addEnchant(Enchantment.FIRE_ASPECT, 5, true);
		m.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		i.setItemMeta(m);
		fireOrb = i;
	}
	public static void lifeOrb () {
		ItemStack i = new ItemStack(Material.LIME_DYE);
		ItemMeta m = i.getItemMeta();
		m.setDisplayName("§2Life Orb");
		m.addEnchant(Enchantment.LUCK, 5, true);
		m.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		i.setItemMeta(m);
		lifeOrb = i;
	}
}
