package me.UselessMC.magicItems.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.UselessMC.magicItems.items.basicItems;

public class itemCommands implements CommandExecutor{

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
		return true;
	}

}
