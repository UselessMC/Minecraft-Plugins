package me.UselessMC.EnderPickUpHands.runPickUpBlock;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import me.UselessMC.EnderPickUpHands.Main;

public class PickUpBlock implements Listener {
	@EventHandler
	public static void BlockBroken(BlockBreakEvent event) {
		if (event.getPlayer() != null) {
			for (int i = 0; i < Main.addedPlayers.size(); i++) {
				if (event.getPlayer().getName() == Main.addedPlayers.get(i)) {
					if (event.getPlayer().getInventory().getItemInMainHand() == null
							|| event.getPlayer().getInventory().getItemInMainHand().getType() == Material.AIR) {
						Location loc = event.getBlock().getLocation();
						event.setDropItems(false);
						loc.getWorld().dropItemNaturally(loc, new ItemStack(event.getBlock().getType()));
					}
				}
			}
		}
	}
}
