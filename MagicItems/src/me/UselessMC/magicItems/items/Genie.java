package me.UselessMC.magicItems.items;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.entity.Player;

public class Genie {
	public static List<Player> players = new ArrayList<>();
	public static List<Wish> wishes = new ArrayList<>();
	
	public static boolean checkPlayer(Player p) {
		if (players.indexOf(p) != -1) {
			return true;
		}
		return false;
	}
	
	public static void addPlayer(Player p) {
		players.add(p);
		wishes.add(new Wish(p));
	}
	public static Wish getWish(Player p) {
		return wishes.get(players.indexOf(p));
	}
	public static void removePlayer(Player p) {
		int i = players.indexOf(p);
		players.remove(i);
		wishes.remove(i);
	}
}
