package me.UselessMC.magicItems.items;

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

public class basicItems {
	private static List<Material> materials = new ArrayList<>();
	public static ItemStack transmuter;
	public static ItemStack aimbow;
	public static ItemStack reflector;
	public static ItemStack teleporterOverworld;
	public static ItemStack teleporterNether;
	public static ItemStack teleporterEnd;
	public static ItemStack teleportCore;
	public static ItemStack grapplingHook;
	public static ItemStack invisibleCloak;

	public static void init() {
		materials.add(Material.NETHERITE_INGOT);
		materials.add(Material.DIAMOND);
		materials.add(Material.IRON_INGOT);
		materials.add(Material.GOLD_INGOT);
		materials.add(Material.COBBLESTONE);
		materials.add(Material.OAK_PLANKS);
		materials.add(Material.NETHERITE_SWORD);
		materials.add(Material.DIAMOND_SWORD);
		materials.add(Material.IRON_SWORD);
		materials.add(Material.GOLDEN_SWORD);
		materials.add(Material.STONE_SWORD);
		materials.add(Material.WOODEN_SWORD);
		
		createtransmuter();
		createaimbow();
		createteleportCore();
		createteleporter1();
		createteleporter2();
		createteleporter3();
		createreflector();
		creategrapplingHook();
		createinvisCloak();
	}

	private static void createtransmuter() {
		ItemStack item = new ItemStack(Material.NETHERITE_HOE);
		ItemMeta m = item.getItemMeta();
		m.setDisplayName("Material Transmuter");
		List<String> lore = new ArrayList<>();
		lore.add("Right click a block to change it");
		lore.add("to the item in your off-hand");
		m.setLore(lore);
		item.addEnchantment(Enchantment.MENDING, 1);
		m.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(m);
		transmuter = item;

		ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("transmuter1245675"), item);
		sr.shape("NSN", "IDI", "NIN");
		sr.setIngredient('S', Material.NETHER_STAR);
		sr.setIngredient('D', Material.NETHERITE_HOE);
		sr.setIngredient('I', Material.ENDER_EYE);
		sr.setIngredient('N', Material.REDSTONE_BLOCK);
		Bukkit.getServer().addRecipe(sr);
	}

	private static void createreflector() {
		ItemStack item = new ItemStack(Material.IRON_INGOT);
		ItemMeta m = item.getItemMeta();
		m.setDisplayName("Reflector");
		List<String> lore = new ArrayList<>();
		lore.add("With this, no arrow can ever hit you");
		m.setLore(lore);
		item.addUnsafeEnchantment(Enchantment.LUCK, 1);
		m.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(m);
		reflector = item;

		ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("reflector1245675"), item);
		sr.shape("NSN", "IDI", "NSN");
		sr.setIngredient('S', Material.NETHER_STAR);
		sr.setIngredient('D', Material.TOTEM_OF_UNDYING);
		sr.setIngredient('I', Material.NETHERITE_INGOT);
		sr.setIngredient('N', Material.REDSTONE_BLOCK);
		Bukkit.getServer().addRecipe(sr);
	}

	private static void createaimbow() {
		ItemStack item = new ItemStack(Material.BOW);
		ItemMeta m = item.getItemMeta();
		m.setDisplayName("Aiming Bow");
		List<String> lore = new ArrayList<>();
		lore.add("This mythical bow will make your");
		lore.add("bad aim become great.");
		m.setLore(lore);
		item.setItemMeta(m);
		aimbow = item;

		ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("aimbow124353678967"), item);
		sr.shape(" N ", "NDI", " N ");
		sr.setIngredient('D', Material.BOW);
		sr.setIngredient('I', Material.LODESTONE);
		sr.setIngredient('N', Material.REDSTONE_BLOCK);
		Bukkit.getServer().addRecipe(sr);
	}

	private static void createteleportCore() {
		ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA);
		ItemMeta m = item.getItemMeta();
		m.setDisplayName("Teleport Core");
		List<String> lore = new ArrayList<>();
		lore.add("A rare item used to make a powerful teleporter");
		m.setLore(lore);
		item.setItemMeta(m);
		teleportCore = item;
	}

	private static void createteleporter1() {
		ItemStack item = new ItemStack(Material.NETHER_STAR);
		ItemMeta m = item.getItemMeta();
		m.setDisplayName("Teleporter: ");
		List<String> lore = new ArrayList<>();
		lore.add("Rename me so that the desired coordinates are");
		lore.add("\"Teleporter: x y z\"");
		lore.add("Teleports player to spot in the overworld");
		m.setLore(lore);
		item.addUnsafeEnchantment(Enchantment.LUCK, 2);
		m.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(m);
		teleporterOverworld = item;

		ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("teleporter1453465768"), item);
		sr.shape("NIN", "IDI", "NIN");
		sr.setIngredient('D', new RecipeChoice.ExactChoice(teleportCore));
		sr.setIngredient('I', Material.ENDER_EYE);
		sr.setIngredient('N', Material.DIAMOND);
		Bukkit.getServer().addRecipe(sr);
	}

	private static void createteleporter2() {
		ItemStack item = new ItemStack(Material.NETHER_STAR);
		ItemMeta m = item.getItemMeta();
		m.setDisplayName("Teleporter: ");
		List<String> lore = new ArrayList<>();
		lore.add("Rename me so that the desired coordinates are");
		lore.add("\"Teleporter: x y z\"");
		lore.add("Teleports player to spot in the nether");
		m.setLore(lore);
		item.addUnsafeEnchantment(Enchantment.LUCK, 2);
		m.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(m);
		teleporterNether = item;

		ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("teleporter124354657568781"), item);
		sr.shape("NIN", "IDI", "NIN");
		sr.setIngredient('D', new RecipeChoice.ExactChoice(teleportCore));
		sr.setIngredient('I', Material.ENDER_EYE);
		sr.setIngredient('N', Material.NETHERITE_INGOT);
		Bukkit.getServer().addRecipe(sr);
	}

	private static void createteleporter3() {
		ItemStack item = new ItemStack(Material.NETHER_STAR);
		ItemMeta m = item.getItemMeta();
		m.setDisplayName("Teleporter: ");
		List<String> lore = new ArrayList<>();
		lore.add("Rename me so that the desired coordinates are");
		lore.add("\"Teleporter: x y z\"");
		lore.add("Teleports player to spot in the end");
		m.setLore(lore);
		item.addUnsafeEnchantment(Enchantment.LUCK, 2);
		m.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(m);
		teleporterEnd = item;

		ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("teleporter2124354657"), item);
		sr.shape("NIN", "IDI", "NIN");
		sr.setIngredient('D', new RecipeChoice.ExactChoice(teleportCore));
		sr.setIngredient('I', Material.ENDER_EYE);
		sr.setIngredient('N', Material.END_STONE);
		Bukkit.getServer().addRecipe(sr);
	}

	private static void creategrapplingHook() {
		ItemStack item = new ItemStack(Material.FISHING_ROD);
		ItemMeta m = item.getItemMeta();
		m.setDisplayName("Grappling Hook");
		List<String> lore = new ArrayList<>();
		lore.add("Reel me in for a fun ride");
		m.setLore(lore);
		item.addEnchantment(Enchantment.DURABILITY, 3);
		m.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(m);
		grapplingHook = item;

		ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("grappler12487242354657"), item);
		sr.shape(" II", 
				 " NI", 
				 "D  ");
		sr.setIngredient('D', Material.FISHING_ROD);
		sr.setIngredient('I', Material.IRON_INGOT);
		sr.setIngredient('N', Material.STRING);
		Bukkit.getServer().addRecipe(sr);
	}
	
	private static void createinvisCloak() {
		ItemStack item = new ItemStack(Material.ELYTRA);
		ItemMeta m = item.getItemMeta();
		m.setDisplayName("Invisibility cloak");
		List<String> lore = new ArrayList<>();
		lore.add("With this on, nobody will even know you are there");
		m.setLore(lore);
		item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
		m.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(m);
		invisibleCloak = item;

		ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("invis81029370918274098"), item);
		sr.shape("IDI", 
				 "SNS", 
				 "IFI");
		sr.setIngredient('S', Material.NETHER_STAR);
		sr.setIngredient('D', Material.GOLDEN_CARROT);
		sr.setIngredient('I', Material.TINTED_GLASS);
		sr.setIngredient('N', Material.ELYTRA);
		sr.setIngredient('F', Material.FERMENTED_SPIDER_EYE);
		Bukkit.getServer().addRecipe(sr);
	}
}
