package me.UselessMC.magicItems.loottables;

import java.util.ArrayList;

import org.bukkit.inventory.ItemStack;

public class LootTable {
	
	private ArrayList<Entry> entries;
	
	public LootTable(ArrayList<Entry> entries) {
		this.entries = entries;
	}
	
	public ItemStack getRandom() {
		double random = Math.random();
		
		for (int i = 0; i < entries.size() - 1; i++) {
			Entry e = entries.get(i + 1);
			if (e.getChance() > random) return entries.get(i).getitem();
		}
		
		return entries.get(entries.size()-1).getitem();
	}
	
	public static class LootTableBuilder {
		private int totalWeight = 0;
		private ArrayList<Entry> entries = new ArrayList<>();
		
		public LootTableBuilder add(ItemStack item, int weight) {
			totalWeight += weight;
			entries.add(new Entry(item, weight));
			return this;
		}
		
		public boolean isBuilt() {
			return entries.size() > 0 && totalWeight > 0;
		}
		
		public LootTable build() {
			if (!isBuilt()) return null;
			
			double base = 0;
			for (Entry e : entries) {
				double chance = getChance(base);
				e.setChance(chance);
				base += e.getWeight();
			}
			
			return new LootTable(entries);
		}
		
		private double getChance(double weight) {
			return weight / totalWeight;
		}
	}
}
