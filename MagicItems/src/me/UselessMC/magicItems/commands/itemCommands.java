package me.UselessMC.magicItems.commands;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentWrapper;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import me.UselessMC.magicItems.Main;
import me.UselessMC.magicItems.items.Genie;
import me.UselessMC.magicItems.items.basicItems;

public class itemCommands implements CommandExecutor {
	
	private static Main plugin;
	
	public itemCommands(Main plugin) {
		itemCommands.plugin = plugin;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("giveteleporter")) {
			if (!(sender instanceof Player)) {
				return false;
			}
			if (!(sender.isOp())) {
				return false;
			}
			Player p = (Player) sender;
			p.getInventory().addItem(basicItems.teleporterOverworld);
		}
		if (cmd.getName().equalsIgnoreCase("givelamp")) {
			if (!(sender instanceof Player)) {
				return false;
			}
			if (!(sender.isOp())) {
				return false;
			}
			Player p = (Player) sender;
			p.getInventory().addItem(basicItems.genieLamp);
			p.sendMessage("Enchantment: "+Enchantment.getByKey(NamespacedKey.minecraft("unbreaking")).toString());
		}
		if (cmd.getName().equalsIgnoreCase("wish")) {
			if (!(sender instanceof Player)) {
				return false;
			}
			Player p = (Player) sender;
			if (!(Genie.checkPlayer(p))) {
				return false;
			}
			if (args.length != 2) {
				p.sendMessage("Invalid Wish, needs only an item name and an item amount");
				return false;
			}
			String arg1 = args[0].toUpperCase();
			int arg2 = Integer.valueOf(args[1]);
			if (arg1.equals("GENIE_LAMP") || arg1.equals("GENIE")) {
				p.sendMessage("Sneaky Sneaky, but you cannot wish for another genie, try a different wish.");
			}
			else if (arg1.equals("TELEPORTER_OVERWORLD")) {
				for (int i = 0; i < arg2; i++) {
					p.getWorld().dropItemNaturally(p.getLocation(), basicItems.teleporterOverworld);
				}
			}
			else if (arg1.equals("TELEPORTER_NETHER")) {
				for (int i = 0; i < arg2; i++) {
				p.getWorld().dropItemNaturally(p.getLocation(), basicItems.teleporterNether);
				}
			}
			else if (arg1.equals("TELEPORTER_END")) {
				for (int i = 0; i < arg2; i++) {
				p.getWorld().dropItemNaturally(p.getLocation(), basicItems.teleporterEnd);
				}
			}
			else if (arg1.equals("TRANSMUTER")) {
				for (int i = 0; i < arg2; i++) {
				p.getWorld().dropItemNaturally(p.getLocation(), basicItems.transmuter);
				}
			}
			else if (arg1.equals("AIMBOW") || arg1.equals("AIMBOT_BOW")) {
				for (int i = 0; i < arg2; i++) {
				p.getWorld().dropItemNaturally(p.getLocation(), basicItems.aimbow);
				}
			}
			else if (arg1.equals("REFLECTOR")) {
				for (int i = 0; i < arg2; i++) {
				p.getWorld().dropItemNaturally(p.getLocation(), basicItems.reflector);
				}
			}
			else if (arg1.equals("GRAPPLING_HOOK")|| arg1.equals("GRAPPLING_GUN")) {
				for (int i = 0; i < arg2; i++) {
				p.getWorld().dropItemNaturally(p.getLocation(), basicItems.grapplingHook);
				}
			}
			else if (arg1.equals("INVISIBILITY_CLOAK")||arg1.equals("INVISIBLE_CLOAK")) {
				for (int i = 0; i < arg2; i++) {
				p.getWorld().dropItemNaturally(p.getLocation(), basicItems.invisibleCloak);
				}
			}
			else if (Material.matchMaterial(arg1) != null) {
				p.getWorld().dropItemNaturally(p.getLocation(), new ItemStack(Material.matchMaterial(arg1), arg2));
				Genie.getWish(p).useWish();
			}
			else {
				p.sendMessage("Invalid Wish, that item does not exist");
			}
		}
		if (cmd.getName().equalsIgnoreCase("wishenchant")) {
			if (!(sender instanceof Player)) {
				return false;
			}
			Player p = (Player) sender;
			if (!(Genie.checkPlayer(p))) {
				return false;
			}
			if (args.length < 3) {
				p.sendMessage("Invalid Wish, needs an item name, an item amount, and item enchantments");
				return false;
			}
			String arg1 = args[0].toUpperCase();
			int arg2 = Integer.valueOf(args[1]);
			if (arg1.equals("GENIE_LAMP") || arg1.equals("GENIE")) {
				p.sendMessage("Sneaky Sneaky, but you cannot wish for another genie, try a different wish.");
			}
			else if (arg1.equals("TELEPORTER_OVERWORLD")) {
				for (int i = 0; i < arg2; i++) {
					p.sendMessage("You cannot add an enchantment to this item, use /wish instead");
				}
			}
			else if (arg1.equals("TELEPORTER_NETHER")) {
				for (int i = 0; i < arg2; i++) {
					p.sendMessage("You cannot add an enchantment to this item, use /wish instead");
				}
			}
			else if (arg1.equals("TELEPORTER_END")) {
				for (int i = 0; i < arg2; i++) {
					p.sendMessage("You cannot add an enchantment to this item, use /wish instead");
				}
			}
			else if (arg1.equals("TRANSMUTER")) {
				for (int i = 0; i < arg2; i++) {
					p.sendMessage("You cannot add an enchantment to this item, use /wish instead");
				}
			}
			else if (arg1.equals("AIMBOW") || arg1.equals("AIMBOT_BOW")) {
				for (int i = 0; i < arg2; i++) {
					p.sendMessage("You cannot add an enchantment to this item, use /wish instead");
				}
			}
			else if (arg1.equals("REFLECTOR")) {
				for (int i = 0; i < arg2; i++) {
					p.sendMessage("You cannot add an enchantment to this item, use /wish instead");
				}
			}
			else if (arg1.equals("GRAPPLING_HOOK")|| arg1.equals("GRAPPLING_GUN")) {
				for (int i = 0; i < arg2; i++) {
					p.sendMessage("You cannot add an enchantment to this item, use /wish instead");
				}
			}
			else if (arg1.equals("INVISIBILITY_CLOAK")||arg1.equals("INVISIBLE_CLOAK")) {
				for (int i = 0; i < arg2; i++) {
					p.sendMessage("You cannot add an enchantment to this item, use /wish instead");
				}
			}
			else if (Material.matchMaterial(arg1) != null) {
				List<Enchantment> enchantments = new ArrayList<>();
				Material m = Material.matchMaterial(arg1);
				ItemStack i = new ItemStack(Material.matchMaterial(arg1), arg2);
				for (int j = 2; j < args.length; j++) {
					Enchantment e = Enchantment.getByKey(NamespacedKey.minecraft(args[j].toLowerCase()));
					enchantments.add(e);
				}
				for (Enchantment e : enchantments) {
					i.addUnsafeEnchantment(e, 5);
				}
				p.getWorld().dropItemNaturally(p.getLocation(), i);
				Genie.getWish(p).useWish();
			}
			else {
				p.sendMessage("Invalid Wish, that item does not exist");
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Bukkit.getConsoleSender().sendMessage(Enchantment.getByKey(NamespacedKey.minecraft("unbreaking")).toString());
	}
}
