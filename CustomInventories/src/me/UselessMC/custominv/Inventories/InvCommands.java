package me.UselessMC.custominv.Inventories;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class InvCommands implements CommandExecutor {
	private List<TeleportInventory> players = new ArrayList<>();
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) { 
			sender.sendMessage("Only players can use thi command");
			return true;
		}
		
		Player player = (Player) sender;
		TeleportInventory gui = null;
		boolean exists = false;
		if (cmd.getName().equalsIgnoreCase("teleporter")) {
			for (int i = 0; i < players.size(); i++) {
				if (players.get(i).getOwner().equals(player)) {
					exists = true;
					gui = players.get(i);
					return true;
				}
			}
			if (!exists) {
				gui = new TeleportInventory(player);
				
			}
			player.openInventory(gui.getInventory());
		}
		return false;
	}
	
	public TeleportInventory getInventory(Player player) {
		TeleportInventory inv = null;
		for (int i = 0; i < players.size(); i++) {
			if (players.get(i).getOwner().equals(player)) {
				inv = players.get(i);
			}
		}
		return inv;
	}
	
}
