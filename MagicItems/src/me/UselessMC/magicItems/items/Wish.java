package me.UselessMC.magicItems.items;

import org.bukkit.entity.Parrot;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffectType;

public class Wish {
	public Player player;
	private int wishesLeft;
	private Parrot parrot;
	
	public Wish(Player p) {
		this.player = p;
		wishesLeft = 3;
	}
	
	public void useWish() {
		wishesLeft--;
		parrot.teleport(player);
		if (wishesLeft == 0) {
			Genie.removePlayer(player);
			parrot.removePotionEffect(PotionEffectType.DAMAGE_RESISTANCE);
			parrot.remove();
		}
	}
	
	public void setParrot(Parrot parrot) {
		this.parrot = parrot;
	}
}
