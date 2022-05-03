package me.UselessMC.CobbleGenChange.GenEvent;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockFormEvent;

public class ChangeBlock implements Listener {
	@EventHandler
	public void CobbleGenEvent(BlockFormEvent e) {
		Bukkit.broadcastMessage("Block: " + e.getBlock().getType().toString());
		if (e.getBlock().getType() == Material.LAVA) {
			Bukkit.broadcastMessage(
					"Block Coords: " + e.getBlock().getX() + ", " + e.getBlock().getY() + ", " + e.getBlock().getZ());
			Random r = new Random();
			int chance = r.nextInt(100);
			String cmd = "/setblock " + e.getBlock().getX() + " " + e.getBlock().getY()
					+ " " + e.getBlock().getZ() + "";
			if (chance == 0) {
				Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), cmd + "diamond_ore");
				Bukkit.broadcastMessage("<!> Lucky Drop, Diamond Ore Generated!");
			} else if (chance <= 5) {
				Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), cmd + "gold_ore");
				Bukkit.broadcastMessage(cmd + "gold_ore");
			} else if (chance <= 15) {
				Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), cmd + "iron_ore");
				Bukkit.broadcastMessage(cmd + "iron_ore");
			} else if (chance <= 30) {
				Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), cmd + "coal_ore");
				Bukkit.broadcastMessage(cmd + "coal_ore");
			}
		}
	}
}
