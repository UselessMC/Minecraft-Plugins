package me.UselessMC.CustomEnchants.Enchantments;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.stream.Collectors;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class InitializeEnchants {
	public static ItemStack telekinesisBook;
	public static ItemStack autoSmeltBook;

	public static void createTelekinesis() {
		ItemStack i = new ItemStack(Material.ENCHANTED_BOOK);
		ItemMeta m = i.getItemMeta();
		i.addUnsafeEnchantment(TELEKINESIS, 1);
		m.setDisplayName("Telekinesis Book");
		i.setItemMeta(m);
		telekinesisBook = i;
	}
	public static void createAutoSmelt() {
		ItemStack i = new ItemStack(Material.ENCHANTED_BOOK);
		ItemMeta m = i.getItemMeta();
		i.addUnsafeEnchantment(AUTOSMELT, 1);
		m.setDisplayName("AutoSmelt Book");
		i.setItemMeta(m);
		autoSmeltBook = i;
	}

	public static final Enchantment TELEKINESIS = new EnchantmentWrapper("telekinesis", "Telekinesis", 1);
	
	public static final Enchantment AUTOSMELT = new EnchantmentWrapper("autosmelt", "AutoSmelt", 1);

	public static void register() {
		boolean registered = Arrays.stream(Enchantment.values()).collect(Collectors.toList()).contains(TELEKINESIS);
		boolean registered1 = Arrays.stream(Enchantment.values()).collect(Collectors.toList()).contains(AUTOSMELT);
		if (!registered) {
			registerEnchantment(TELEKINESIS);
		}
		if (!registered1) {
			registerEnchantment(AUTOSMELT);
		}
	}

	public static void registerEnchantment(Enchantment enchantment) {
		boolean registered = true;
		try {
			Field f = Enchantment.class.getDeclaredField("acceptingNew");
			f.setAccessible(true);
			f.set(null, true);
			Enchantment.registerEnchantment(enchantment);
		} catch (Exception e) {
			registered = false;
			e.printStackTrace();
		}
		if (registered) {
			Bukkit.getServer().getConsoleSender().sendMessage("Enchantment: " + enchantment + " successfully registered");
		}
	}
}
