package me.UselessMC.CustomEnchants.enchantEvents;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import me.UselessMC.CustomEnchants.Enchantments.InitializeEnchants;

public class enchantmentCommands implements CommandExecutor{
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			Bukkit.getServer().getConsoleSender().sendMessage("Only players may use this command");
			return false;
		}
		Player p = (Player) sender;
		if (cmd.getName().equalsIgnoreCase("telekinesisbook")) {
			if (p.getInventory().contains(new ItemStack(Material.HOPPER, 1))) {
				if (p.getInventory().contains(new ItemStack(Material.BOOK, 1))) {
					p.getInventory().removeItem(new ItemStack(Material.HOPPER, 1));
					p.getInventory().removeItem(new ItemStack(Material.BOOK, 1));
					if (p.getInventory().firstEmpty() != -1) {
						p.getInventory().addItem(InitializeEnchants.telekinesisBook);
					}
					if (p.getInventory().firstEmpty() == -1) {
						p.getLocation().getWorld().dropItemNaturally(p.getLocation(), InitializeEnchants.telekinesisBook);
					}	
				}
			}
		}
		
		if (cmd.getName().equalsIgnoreCase("autosmeltbook")) {
			if (p.getInventory().contains(new ItemStack(Material.FURNACE, 1))) {
				if (p.getInventory().contains(new ItemStack(Material.BOOK, 1))) {
					p.getInventory().removeItem(new ItemStack(Material.FURNACE, 1));
					p.getInventory().removeItem(new ItemStack(Material.BOOK, 1));
					if (p.getInventory().firstEmpty() != -1) {
						p.getInventory().addItem(InitializeEnchants.autoSmeltBook);
					}
					if (p.getInventory().firstEmpty() == -1) {
						p.getLocation().getWorld().dropItemNaturally(p.getLocation(), InitializeEnchants.autoSmeltBook);
					}	
				}
			}
		}
		return true;
	}
}
