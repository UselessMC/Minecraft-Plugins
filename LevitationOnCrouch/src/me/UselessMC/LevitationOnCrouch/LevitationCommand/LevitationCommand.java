package me.UselessMC.LevitationOnCrouch.LevitationCommand;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitScheduler;

import me.UselessMC.LevitationOnCrouch.Main;

public class LevitationCommand implements CommandExecutor{
	private Main plugin;
	
	public LevitationCommand(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("levitationoncrouch").setExecutor(this);
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (sender.isOp()) {
			Player p = (Player) sender;
			BukkitScheduler sched = p.getServer().getScheduler();
			sched.scheduleSyncRepeatingTask(this.plugin, new Runnable() {
	
				@Override
				public void run() {
					for (Player onlinePlayers : Bukkit.getOnlinePlayers()) {
						if (onlinePlayers.isSneaking()) {
							if (onlinePlayers.getName() != p.getName()) {
								onlinePlayers.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION,5,1));
							}	
						}
					}
				}
				
			}, 0L, 2L);
		}
		return true;
	}
}
