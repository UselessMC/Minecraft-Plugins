package me.UselessMC.ElementalArmor.ArmorSets;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

public class Armor {
	public static ItemStack FireHelm;
	public static ItemStack FireChest;
	public static ItemStack FireLegs;
	public static ItemStack FireBoots;
	public static ItemStack WaterHelm;
	public static ItemStack WaterChest;
	public static ItemStack WaterLegs;
	public static ItemStack WaterBoots;
	public static ItemStack SpeedHelm;
	public static ItemStack SpeedChest;
	public static ItemStack SpeedLegs;
	public static ItemStack SpeedBoots;
	public static ItemStack ResisHelm;
	public static ItemStack ResisChest;
	public static ItemStack ResisLegs;
	public static ItemStack ResisBoots;
	public static ItemStack CombatHelm;
	public static ItemStack CombatChest;
	public static ItemStack CombatLegs;
	public static ItemStack CombatBoots;
	public static void enableArmorSets() {
		createFireHelm();
		createFireChestplate();
		createFireLeggings();
		createFireBoots();
		createWaterHelm();
		createWaterChestplate();
		createWaterLeggings();
		createWaterBoots();
		createSpeedHelm();
		createSpeedChestplate();
		createSpeedLeggings();
		createSpeedBoots();
		createResistanceHelm();
		createResistanceChestplate();
		createResistanceLeggings();
		createResistanceBoots();
		createCombatHelm();
		createCombatChestplate();
		createCombatLeggings();
		createCombatBoots();
	}
	private static void createFireHelm() {
		ItemStack i = new ItemStack(Material.DIAMOND_HELMET); 
		ItemMeta m = i.getItemMeta();
		m.setDisplayName("§4Fire Helmet");
		List<String> lore = new ArrayList<>();
		lore.add("§6§lFull Set Bonus: ");
		lore.add("§l§4Permanent Fire Resistance");
		m.setLore(lore);
		i.setItemMeta(m);
		FireHelm = i;
		
		ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("fire_helm"),i);
		sr.shape("BBB","BDB","BBB");
		sr.setIngredient('D', Material.DIAMOND_HELMET);
		sr.setIngredient('B', Material.BLAZE_POWDER);
		Bukkit.getServer().addRecipe(sr);
	}
	private static void createFireChestplate() {
		ItemStack i = new ItemStack(Material.DIAMOND_CHESTPLATE); 
		ItemMeta m = i.getItemMeta();
		m.setDisplayName("§4Fire Chestplate");
		List<String> lore = new ArrayList<>();
		lore.add("§6§lFull Set Bonus: ");
		lore.add("§l§4Permanent Fire Resistance");
		m.setLore(lore);
		i.setItemMeta(m);
		FireChest = i;
		
		ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("fire_chestplate"),i);
		sr.shape("BBB","BDB","BBB");
		sr.setIngredient('D', Material.DIAMOND_CHESTPLATE);
		sr.setIngredient('B', Material.BLAZE_POWDER);
		Bukkit.getServer().addRecipe(sr);
	}
	private static void createFireLeggings() {
		ItemStack i = new ItemStack(Material.DIAMOND_LEGGINGS); 
		ItemMeta m = i.getItemMeta();
		m.setDisplayName("§4Fire Leggings");
		List<String> lore = new ArrayList<>();
		lore.add("§6§lFull Set Bonus: ");
		lore.add("§l§4Permanent Fire Resistance");
		m.setLore(lore);
		i.setItemMeta(m);
		FireLegs = i;
		
		ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("fire_leggings"),i);
		sr.shape("BBB","BDB","BBB");
		sr.setIngredient('D', Material.DIAMOND_LEGGINGS);
		sr.setIngredient('B', Material.BLAZE_POWDER);
		Bukkit.getServer().addRecipe(sr);
	}
	private static void createFireBoots() {
		ItemStack i = new ItemStack(Material.DIAMOND_BOOTS); 
		ItemMeta m = i.getItemMeta();
		m.setDisplayName("§4Fire Boots");
		List<String> lore = new ArrayList<>();
		lore.add("§6§lFull Set Bonus: ");
		lore.add("§l§4Permanent Fire Resistance");
		m.setLore(lore);
		i.setItemMeta(m);
		FireBoots = i;
		
		ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("fire_boots"),i);
		sr.shape("BBB","BDB","BBB");
		sr.setIngredient('D', Material.DIAMOND_BOOTS);
		sr.setIngredient('B', Material.BLAZE_POWDER);
		Bukkit.getServer().addRecipe(sr);
	}
	private static void createWaterHelm() {
		ItemStack i = new ItemStack(Material.DIAMOND_HELMET); 
		ItemMeta m = i.getItemMeta();
		m.setDisplayName("§4Water Helmet");
		List<String> lore = new ArrayList<>();
		lore.add("§6§lFull Set Bonus: ");
		lore.add("§l§9Permanent Water Breathing and");
		lore.add("§l§bPermanent Dolphin's Grace");
		m.setLore(lore);
		i.setItemMeta(m);
		WaterHelm = i;
		
		ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("water_helm"),i);
		sr.shape("WWW","WDW","WWW");
		sr.setIngredient('D', Material.DIAMOND_HELMET);
		sr.setIngredient('W', Material.WATER_BUCKET);
		Bukkit.getServer().addRecipe(sr);
	}
	private static void createWaterChestplate() {
		ItemStack i = new ItemStack(Material.DIAMOND_CHESTPLATE); 
		ItemMeta m = i.getItemMeta();
		m.setDisplayName("§4Water Chestplate");
		List<String> lore = new ArrayList<>();
		lore.add("§6§lFull Set Bonus: ");
		lore.add("§l§9Permanent Water Breathing and");
		lore.add("§l§bPermanent Dolphin's Grace");
		m.setLore(lore);
		i.setItemMeta(m);
		WaterChest = i;
		
		ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("water_chestplate"),i);
		sr.shape("WWW","WDW","WWW");
		sr.setIngredient('D', Material.DIAMOND_CHESTPLATE);
		sr.setIngredient('W', Material.WATER_BUCKET);
		Bukkit.getServer().addRecipe(sr);
	}
	private static void createWaterLeggings() {
		ItemStack i = new ItemStack(Material.DIAMOND_LEGGINGS); 
		ItemMeta m = i.getItemMeta();
		m.setDisplayName("§4Water Leggings");
		List<String> lore = new ArrayList<>();
		lore.add("§6§lFull Set Bonus: ");
		lore.add("§l§9Permanent Water Breathing and");
		lore.add("§l§bPermanent Dolphin's Grace");
		m.setLore(lore);
		i.setItemMeta(m);
		WaterLegs = i;
		
		ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("water_leggings"),i);
		sr.shape("WWW","WDW","WWW");
		sr.setIngredient('D', Material.DIAMOND_LEGGINGS);
		sr.setIngredient('W', Material.WATER_BUCKET);
		Bukkit.getServer().addRecipe(sr);
	}
	private static void createWaterBoots() {
		ItemStack i = new ItemStack(Material.DIAMOND_BOOTS); 
		ItemMeta m = i.getItemMeta();
		m.setDisplayName("§4Water Boots");
		List<String> lore = new ArrayList<>();
		lore.add("§6§lFull Set Bonus: ");
		lore.add("§l§9Permanent Water Breathing and");
		lore.add("§l§bPermanent Dolphin's Grace");
		m.setLore(lore);
		i.setItemMeta(m);
		WaterBoots = i;
		
		ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("water_boots"),i);
		sr.shape("WWW","WDW","WWW");
		sr.setIngredient('D', Material.DIAMOND_BOOTS);
		sr.setIngredient('W', Material.WATER_BUCKET);
		Bukkit.getServer().addRecipe(sr);
	}
	private static void createSpeedHelm() {
		ItemStack i = new ItemStack(Material.DIAMOND_HELMET); 
		ItemMeta m = i.getItemMeta();
		m.setDisplayName("§4Speed Helmet");
		List<String> lore = new ArrayList<>();
		lore.add("§6§lFull Set Bonus: ");
		lore.add("§l§fPermanent Speed 5");
		m.setLore(lore);
		i.setItemMeta(m);
		SpeedHelm = i;
		
		ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("speed_helm"),i);
		sr.shape("SSS","SDS","SSS");
		sr.setIngredient('D', Material.DIAMOND_HELMET);
		sr.setIngredient('S', Material.SUGAR);
		Bukkit.getServer().addRecipe(sr);
	}
	private static void createSpeedChestplate() {
		ItemStack i = new ItemStack(Material.DIAMOND_CHESTPLATE); 
		ItemMeta m = i.getItemMeta();
		m.setDisplayName("§4Speed Chestplate");
		List<String> lore = new ArrayList<>();
		lore.add("§6§lFull Set Bonus: ");
		lore.add("§l§fPermanent Speed 5");
		m.setLore(lore);
		i.setItemMeta(m);
		SpeedChest = i;
		
		ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("speed_chestplate"),i);
		sr.shape("SSS","SDS","SSS");
		sr.setIngredient('D', Material.DIAMOND_CHESTPLATE);
		sr.setIngredient('S', Material.SUGAR);
		Bukkit.getServer().addRecipe(sr);
	}
	private static void createSpeedLeggings() {
		ItemStack i = new ItemStack(Material.DIAMOND_LEGGINGS); 
		ItemMeta m = i.getItemMeta();
		m.setDisplayName("§4Speed Leggings");
		List<String> lore = new ArrayList<>();
		lore.add("§6§lFull Set Bonus: ");
		lore.add("§l§fPermanent Speed 5");
		m.setLore(lore);
		i.setItemMeta(m);
		SpeedLegs = i;
		
		ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("speed_leggings"),i);
		sr.shape("SSS","SDS","SSS");
		sr.setIngredient('D', Material.DIAMOND_LEGGINGS);
		sr.setIngredient('S', Material.SUGAR);
		Bukkit.getServer().addRecipe(sr);
	}
	private static void createSpeedBoots() {
		ItemStack i = new ItemStack(Material.DIAMOND_BOOTS); 
		ItemMeta m = i.getItemMeta();
		m.setDisplayName("§4Speed Boots");
		List<String> lore = new ArrayList<>();
		lore.add("§6§lFull Set Bonus: ");
		lore.add("§l§fPermanent Speed 5");
		m.setLore(lore);
		i.setItemMeta(m);
		SpeedBoots = i;
		
		ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("speed_boots"),i);
		sr.shape("SSS","SDS","SSS");
		sr.setIngredient('D', Material.DIAMOND_BOOTS);
		sr.setIngredient('S', Material.SUGAR);
		Bukkit.getServer().addRecipe(sr);
	}
	private static void createResistanceHelm() {
		ItemStack i = new ItemStack(Material.DIAMOND_HELMET); 
		ItemMeta m = i.getItemMeta();
		m.setDisplayName("§4Resistance Helmet");
		List<String> lore = new ArrayList<>();
		lore.add("§6§lFull Set Bonus: ");
		lore.add("§l7Permanent Resistance 3");
		lore.add("§0§lFull Set Drawback: ");
		lore.add("§8§lPermanent Slowness 2");
		m.setLore(lore);
		i.setItemMeta(m);
		ResisHelm = i;
		
		ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("resistance_helm"),i);
		sr.shape("SIS","IDI","SIS");
		sr.setIngredient('D', Material.DIAMOND_HELMET);
		sr.setIngredient('S', Material.SHIELD);
		sr.setIngredient('I', Material.IRON_BLOCK);
		Bukkit.getServer().addRecipe(sr);
	}
	private static void createResistanceChestplate() {
		ItemStack i = new ItemStack(Material.DIAMOND_CHESTPLATE); 
		ItemMeta m = i.getItemMeta();
		m.setDisplayName("§4Resistance Chestplate");
		List<String> lore = new ArrayList<>();
		lore.add("§6§lFull Set Bonus: ");
		lore.add("§l7Permanent Resistance 3");
		lore.add("§0§lFull Set Drawback: ");
		lore.add("§8§lPermanent Slowness 2");
		m.setLore(lore);
		i.setItemMeta(m);
		ResisChest = i;
		
		ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("resistance_chest"),i);
		sr.shape("SIS","IDI","SIS");
		sr.setIngredient('D', Material.DIAMOND_CHESTPLATE);
		sr.setIngredient('S', Material.SHIELD);
		sr.setIngredient('I', Material.IRON_BLOCK);
		Bukkit.getServer().addRecipe(sr);
	}
	private static void createResistanceLeggings() {
		ItemStack i = new ItemStack(Material.DIAMOND_LEGGINGS); 
		ItemMeta m = i.getItemMeta();
		m.setDisplayName("§4Resistance Leggings");
		List<String> lore = new ArrayList<>();
		lore.add("§6§lFull Set Bonus: ");
		lore.add("§l7Permanent Resistance 3");
		lore.add("§0§lFull Set Drawback: ");
		lore.add("§8§lPermanent Slowness 2");
		m.setLore(lore);
		i.setItemMeta(m);
		ResisLegs = i;
		
		ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("resistance_legs"),i);
		sr.shape("SIS","IDI","SIS");
		sr.setIngredient('D', Material.DIAMOND_LEGGINGS);
		sr.setIngredient('S', Material.SHIELD);
		sr.setIngredient('I', Material.IRON_BLOCK);
		Bukkit.getServer().addRecipe(sr);
	}
	private static void createResistanceBoots() {
		ItemStack i = new ItemStack(Material.DIAMOND_BOOTS); 
		ItemMeta m = i.getItemMeta();
		m.setDisplayName("§4Resistance Boots");
		List<String> lore = new ArrayList<>();
		lore.add("§6§lFull Set Bonus: ");
		lore.add("§l7Permanent Resistance 3");
		lore.add("§0§lFull Set Drawback: ");
		lore.add("§8§lPermanent Slowness 2");
		m.setLore(lore);
		i.setItemMeta(m);
		ResisBoots = i;
		
		ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("resistance_boots"),i);
		sr.shape("SIS","IDI","SIS");
		sr.setIngredient('D', Material.DIAMOND_BOOTS);
		sr.setIngredient('S', Material.SHIELD);
		sr.setIngredient('I', Material.IRON_BLOCK);
		Bukkit.getServer().addRecipe(sr);
	}
	private static void createCombatHelm() {
		ItemStack i = new ItemStack(Material.DIAMOND_HELMET); 
		ItemMeta m = i.getItemMeta();
		m.setDisplayName("§4Combat Helmet");
		List<String> lore = new ArrayList<>();
		lore.add("§6§lFull Set Bonus: ");
		lore.add("§l§4Permanent Strength and Speed");
		m.setLore(lore);
		i.setItemMeta(m);
		CombatHelm = i;
		
		ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("combat_helm"),i);
		sr.shape(" B ","BDB"," B ");
		sr.setIngredient('D', Material.DIAMOND_HELMET);
		sr.setIngredient('B', Material.IRON_SWORD);
		Bukkit.getServer().addRecipe(sr);
	}
	private static void createCombatChestplate() {
		ItemStack i = new ItemStack(Material.DIAMOND_CHESTPLATE); 
		ItemMeta m = i.getItemMeta();
		m.setDisplayName("§4Combat Chestplate");
		List<String> lore = new ArrayList<>();
		lore.add("§6§lFull Set Bonus: ");
		lore.add("§l§4Permanent Strength and Speed");
		m.setLore(lore);
		i.setItemMeta(m);
		CombatChest = i;
		
		ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("combat_chest"),i);
		sr.shape(" B ","BDB"," B ");
		sr.setIngredient('D', Material.DIAMOND_CHESTPLATE);
		sr.setIngredient('B', Material.IRON_SWORD);
		Bukkit.getServer().addRecipe(sr);
	}
	private static void createCombatLeggings() {
		ItemStack i = new ItemStack(Material.DIAMOND_LEGGINGS); 
		ItemMeta m = i.getItemMeta();
		m.setDisplayName("§4Combat Leggings");
		List<String> lore = new ArrayList<>();
		lore.add("§6§lFull Set Bonus: ");
		lore.add("§l§4Permanent Strength and Speed");
		m.setLore(lore);
		i.setItemMeta(m);
		CombatLegs = i;
		
		ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("combat_legs"),i);
		sr.shape(" B ","BDB"," B ");
		sr.setIngredient('D', Material.DIAMOND_LEGGINGS);
		sr.setIngredient('B', Material.IRON_SWORD);
		Bukkit.getServer().addRecipe(sr);
	}
	private static void createCombatBoots() {
		ItemStack i = new ItemStack(Material.DIAMOND_BOOTS); 
		ItemMeta m = i.getItemMeta();
		m.setDisplayName("§4Combat Boots");
		List<String> lore = new ArrayList<>();
		lore.add("§6§lFull Set Bonus: ");
		lore.add("§l§4Permanent Strength and Speed");
		m.setLore(lore);
		i.setItemMeta(m);
		CombatBoots = i;
		
		ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("combat_boots"),i);
		sr.shape(" B ","BDB"," B ");
		sr.setIngredient('D', Material.DIAMOND_BOOTS);
		sr.setIngredient('B', Material.IRON_SWORD);
		Bukkit.getServer().addRecipe(sr);
	}
}
