package me.UselessMC.EnderPickUpHands.AddUser;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.UselessMC.EnderPickUpHands.Main;

public class AddUser implements CommandExecutor{
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("addenderhands")) {
			if (sender instanceof Player){
				Player p = (Player) sender;
				Main.addedPlayers.add(p.getName());		
			}
			Bukkit.getConsoleSender().sendMessage(Main.addedPlayers.toString());
		}
		return true;
	}

}
