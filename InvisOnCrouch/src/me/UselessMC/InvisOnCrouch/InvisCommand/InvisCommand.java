package me.UselessMC.InvisOnCrouch.InvisCommand;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitScheduler;

import me.UselessMC.InvisOnCrouch.Main;

public class InvisCommand implements CommandExecutor{
	private Main plugin;
	
	public InvisCommand(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("invisoncrouch").setExecutor(this);
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		if (p.isOp()) {
			BukkitScheduler sched = p.getServer().getScheduler();
			sched.scheduleSyncRepeatingTask(this.plugin, new Runnable() {
	
				@Override
				public void run() {
						if (p.isSneaking()) {
						p.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY,4,1));
					}
				}
				
			}, 0L, 2L);
		}
		return true;
	}
}
