package me.UselessMC.magicItems.events;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.BlockState;
import org.bukkit.block.Chest;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.FishHook;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Parrot;
import org.bukkit.entity.Parrot.Variant;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.world.ChunkPopulateEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;

import me.UselessMC.magicItems.Cooldown;
import me.UselessMC.magicItems.Main;
import me.UselessMC.magicItems.items.Genie;
import me.UselessMC.magicItems.items.basicItems;

public class itemEvents implements Listener {
	private static Main plugin;
	private static List<Entity> arrows = new ArrayList<>();
	private static List<Player> players = new ArrayList<>();
	private static List<Player> invisPlayers = new ArrayList<>();

	public itemEvents(Main plugin) {
		itemEvents.plugin = plugin;
		masterTimer();
	}
	
	@EventHandler
	public void inGeneration(ChunkPopulateEvent e) {
		ItemStack lamp = basicItems.genieLamp;
		BlockState[] tileEntities = e.getChunk().getTileEntities();
		
		for (BlockState state: tileEntities) {
			Random r = new Random();
			int random = r.nextInt(1000);
			if (state.getType() == Material.CHEST && random == 5) {
				Chest chest = (Chest) state.getBlock();
				chest.getBlockInventory().addItem(lamp);
				chest.update(true);
			}
		}
	}
	
	@EventHandler
	public static void clickLamp(PlayerInteractEvent e) {
		if (e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) {
			Player p = e.getPlayer();
			if ((p.getInventory().getItemInMainHand().hasItemMeta())) {
				if (p.getInventory().getItemInMainHand().getItemMeta().hasLore()) {
					if (p.getInventory().getItemInMainHand().getItemMeta().getLore()
							.equals(basicItems.genieLamp.getItemMeta().getLore())) {
						p.getInventory().remove(basicItems.genieLamp);
						Genie.addPlayer(p);
						Parrot parrot = (Parrot) p.getWorld().spawnEntity(p.getLocation(), EntityType.PARROT);
						parrot.setVariant(Variant.BLUE);
						parrot.setCustomName("All Powerful Genie");
						parrot.setCustomNameVisible(true);
						Genie.getWish(p).setParrot(parrot);
						parrot.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 9999, 5));
						p.sendMessage("I am a minecraft genie in the form of a parrot.");
						p.sendMessage("You may ask of me three things");
						p.sendMessage("to ask me for a wish, do /wish Item_Name AmountOfItem");
						p.sendMessage("If you want things with a little more power, do /wishEnchant Item_Name AmountOfItem Enchant1 Enchant2...");
						p.sendMessage("And finally, when you use all 3 wishes,");
						p.sendMessage("I will disappear and you cannot wish until you find another lamp.");
					}
				}
			}
		}
	}

	@EventHandler
	public static void clickTeleporter(PlayerInteractEvent e) {
		if (e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) {
			Player p = e.getPlayer();
			if ((p.getInventory().getItemInMainHand().hasItemMeta())) {
				if (p.getInventory().getItemInMainHand().getItemMeta().hasLore()) {
					if (p.getInventory().getItemInMainHand().getItemMeta().getLore()
							.equals(basicItems.teleporterOverworld.getItemMeta().getLore())) {
						p.sendMessage("Overworld");
						String coordinates = p.getInventory().getItemInMainHand().getItemMeta().getDisplayName() + " ";
						coordinates = coordinates.substring(coordinates.indexOf("Teleporter: ") + 12);
						p.sendMessage(coordinates);
						String coordX = coordinates.substring(0, coordinates.indexOf(" "));
						int x = Integer.valueOf(coordX);
						p.sendMessage("x" + x);
						coordinates = coordinates.substring(coordinates.indexOf(" ") + 1);
						String coordY = coordinates.substring(0, coordinates.indexOf(" "));
						int y = Integer.valueOf(coordY);
						p.sendMessage("y" + y);
						coordinates = coordinates.substring(coordinates.indexOf(" ") + 1);
						String coordZ = coordinates.substring(0, coordinates.indexOf(" "));
						int z = Integer.valueOf(coordZ);
						p.sendMessage("z" + z);
						coordinates = coordinates.substring(coordinates.indexOf(" ") + 1);
						Location loc = new Location(Bukkit.getServer().getWorlds().get(0), x, y, z);
						p.teleport(loc);
					} else if (p.getInventory().getItemInMainHand().getItemMeta().getLore()
							.equals(basicItems.teleporterNether.getItemMeta().getLore())) {
						String coordinates = p.getInventory().getItemInMainHand().getItemMeta().getDisplayName() + " ";
						coordinates = coordinates.substring(coordinates.indexOf("Teleporter: ") + 12);
						String coordX = coordinates.substring(0, coordinates.indexOf(" "));
						int x = Integer.valueOf(coordX);
						coordinates = coordinates.substring(coordinates.indexOf(" ") + 1);
						String coordY = coordinates.substring(0, coordinates.indexOf(" "));
						int y = Integer.valueOf(coordY);
						coordinates = coordinates.substring(coordinates.indexOf(" ") + 1);
						String coordZ = coordinates.substring(0, coordinates.indexOf(" "));
						int z = Integer.valueOf(coordZ);
						coordinates = coordinates.substring(coordinates.indexOf(" ") + 1);
						Location loc = new Location(Bukkit.getServer().getWorlds().get(1), x, y, z);
						p.teleport(loc);
					} else if (p.getInventory().getItemInMainHand().getItemMeta().getLore()
							.equals(basicItems.teleporterEnd.getItemMeta().getLore())) {
						String coordinates = p.getInventory().getItemInMainHand().getItemMeta().getDisplayName() + " ";
						coordinates = coordinates.substring(coordinates.indexOf("Teleporter: ") + 12);
						String coordX = coordinates.substring(0, coordinates.indexOf(" "));
						int x = Integer.valueOf(coordX);
						coordinates = coordinates.substring(coordinates.indexOf(" ") + 1);
						String coordY = coordinates.substring(0, coordinates.indexOf(" "));
						int y = Integer.valueOf(coordY);
						coordinates = coordinates.substring(coordinates.indexOf(" ") + 1);
						String coordZ = coordinates.substring(0, coordinates.indexOf(" "));
						int z = Integer.valueOf(coordZ);
						coordinates = coordinates.substring(coordinates.indexOf(" ") + 1);
						Location loc = new Location(Bukkit.getServer().getWorlds().get(2), x, y, z);
						p.teleport(loc);
					}
				}
			}
		}
	}

	@EventHandler
	public static void coreDrop(EntityDeathEvent e) {
		Random r = new Random();
		int chance = r.nextInt(100);
		if (e.getEntityType().equals(EntityType.ENDERMAN)) {
			if (chance == 1 || chance == 51) {
				e.getDrops().add(basicItems.teleportCore);
			}
		}
	}

	@EventHandler
	public static void transmuteBlock(PlayerInteractEvent e) {
		if (e.getAction() == Action.RIGHT_CLICK_BLOCK) {
			Block b = e.getClickedBlock();
			Player p = e.getPlayer();
			Material m = p.getInventory().getItemInOffHand().getType();
			Location loc = b.getLocation();
			if (!(p.getInventory().getItemInMainHand().hasItemMeta()))
				return;
			if (!(p.getInventory().getItemInMainHand().getItemMeta().hasLore()))
				return;
			if ((p.getInventory().getItemInMainHand().hasItemMeta())) {
				if (p.getInventory().getItemInMainHand().getItemMeta().getLore()
						.equals(basicItems.transmuter.getItemMeta().getLore())) {
					e.setCancelled(true);
					if (m.isBlock()) {
						if (!(b.getType().equals(Material.BEDROCK))) {
							if (Cooldown.checkCooldown(p, "Transmute")) {
								Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(),
										"setblock " + (long) loc.getX() + " " + (long) loc.getY() + " "
												+ (long) loc.getZ() + " " + m.name().toLowerCase());
								Main.ACDS.get(1).setCooldown(p, 3);
							} else {
								p.sendMessage("Your cooldown is not over yet!");
							}
						}
					} else {
						e.setCancelled(true);
						p.sendMessage(
								"If you wish to transmute that block, hold a block in your off hand, not a regular item.");
					}
				}
			}
		}
	}

	@EventHandler
	public static void aimbow(EntityShootBowEvent e) {
		if (!(e.getEntity() instanceof Player))
			return;
		if (!(e.getBow().getItemMeta().hasLore()))
			return;
		if (!(e.getBow().getItemMeta().getLore().equals(basicItems.aimbow.getItemMeta().getLore())))
			return;

		arrows.add(e.getProjectile());
		players.add((Player) e.getEntity());
		arrowTimer();
	}

	private static void arrowTimer() {
		new BukkitRunnable() {

			@Override
			public void run() {
				int count = 0;
				for (Iterator<Entity> it = arrows.iterator(); it.hasNext();) {
					Entity e = it.next();
					if (e.isOnGround()) {
						it.remove();
						players.remove(count);
						continue;
					}

					if (e.isDead()) {
						it.remove();
						players.remove(count);
						continue;
					}

					if (e.isInWater()) {
						it.remove();
						players.remove(count);
						continue;
					}

					Entity target = getTarget(e);
					if (target == null)
						continue;
					if (target.equals(players.get(count))) {
						continue;
					}
					double x1 = e.getVelocity().getX();
					double y1 = e.getVelocity().getY();
					double z1 = e.getVelocity().getZ();
					double velocity1 = Math.pow(x1, 2) + Math.pow(y1, 2) + Math.pow(z1, 2);

					double x = target.getLocation().getX() - e.getLocation().getX();
					double y = target.getLocation().getY() - e.getLocation().getY();
					double z = target.getLocation().getZ() - e.getLocation().getZ();
					double velocity = Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2);
					double factor = Math.sqrt(velocity1 / velocity);
					e.setVelocity(new Vector(x * factor, y * factor, z * factor));
					count++;
				}
				if (arrows.isEmpty()) {
					cancel();
				}
			}
		}.runTaskTimer(plugin, 0, 1L);
	}

	private static LivingEntity getTarget(Entity e) {
		int mD = 5;
		if (e.getNearbyEntities(mD, mD, mD).isEmpty()) {
			return null;
		} else {
			for (int i = 0; i < e.getNearbyEntities(mD, mD, mD).size(); i++) {
				Entity n = e.getNearbyEntities(mD, mD, mD).get(i);
				if (n instanceof LivingEntity) {
					LivingEntity nN = (LivingEntity) n;
					if (e.getFacing() == BlockFace.NORTH) {
						if (e.getLocation().getZ() > nN.getLocation().getZ()) {
							return nN;
						}
					}
					if (e.getFacing() == BlockFace.EAST) {
						if (e.getLocation().getX() > nN.getLocation().getX()) {
							return nN;
						}
					}
					if (e.getFacing() == BlockFace.SOUTH) {
						if (e.getLocation().getZ() < nN.getLocation().getZ()) {
							return nN;
						}
					}
					if (e.getFacing() == BlockFace.WEST) {
						if (e.getLocation().getX() < nN.getLocation().getX()) {
							return nN;
						}
					}
				} else {
					continue;
				}
			}
		}
		return null;
	}

	private static void masterTimer() {
		new BukkitRunnable() {
			@Override
			public void run() {
				for (Player p : Bukkit.getServer().getOnlinePlayers()) {
					if (p.getInventory().getItemInMainHand().equals(basicItems.reflector)
							|| p.getInventory().getItemInOffHand().equals(basicItems.reflector)) {
						for (Entity e : p.getNearbyEntities(7, 7, 7)) {
							if (!(e instanceof Player)) {
								List<String> lore = new ArrayList<>();
								lore.add(
										"iagsdkahgfskjhjgkdagskhdgkjsdhgfkhshgdslsigho2837w46q8734760983y1o29uidlghskjdfhak,sdhjxcjhfzsdvbkxa,sukjgbsdgfuayteuew792hfjkdfbsckndcxnbajgbj");
								if (p.getInventory().getItemInMainHand().getItemMeta().hasLore()) {
									lore = new ArrayList<>();
									lore = p.getInventory().getItemInMainHand().getItemMeta().getLore();
								}
								if (!(e instanceof FishHook)
										&& !(lore.equals(basicItems.grapplingHook.getItemMeta().getLore()))) {
									double x = p.getLocation().getX() - e.getLocation().getX();
									double y = p.getLocation().getY() - e.getLocation().getY();
									double z = p.getLocation().getZ() - e.getLocation().getZ();
									double velocity = Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2);
									if (!(velocity == 0)) {
										double factor = Math.sqrt(2 / velocity);
										e.setVelocity(
												new Vector(-1 * (x * factor), -1 * (y * factor), -1 * (z * factor)));
									}
								}
							}
						}
					}
					if (p.getInventory().getChestplate() != null) {
						if (p.getInventory().getChestplate().equals(basicItems.invisibleCloak)) {
							if (!(invisPlayers.contains(p))) {
								for (Player person : Bukkit.getServer().getOnlinePlayers()) {
									person.hidePlayer(plugin, p);
								}
								invisPlayers.add(p);
								p.sendMessage("You are now invisible");
							}
						} else {
							if (invisPlayers.contains(p)) {
								invisPlayers.remove(p);
								for (Player person : Bukkit.getServer().getOnlinePlayers()) {
									person.showPlayer(plugin, p);
								}
							}
						}
					}
				}
			}
		}.runTaskTimer(plugin, 0, 2L);
	}

	@EventHandler
	public static void grapple(PlayerFishEvent e) {
		Player p = e.getPlayer();
		ItemStack i = p.getInventory().getItemInMainHand();
		ItemMeta m = i.getItemMeta();
		List<String> lore = new ArrayList<>();
		lore.add(
				"iagsdkahgfskjhjgkdagskhdgkjsdhgfkhshgdslsigho2837w46q8734760983y1o29uidlghskjdfhak,sdhjxcjhfzsdvbkxa,sukjgbsdgfuayteuew792hfjkdfbsckndcxnbajgbj");
		if (m.hasLore()) {
			lore = m.getLore();
		}
		Bukkit.getConsoleSender().sendMessage("Grappler fired");
		if (lore.equals(basicItems.grapplingHook.getItemMeta().getLore())) {
			if (e.getState().equals(PlayerFishEvent.State.REEL_IN)) {
				if (Cooldown.checkCooldown(p, "Grapple")) {
					Bukkit.getConsoleSender().sendMessage("woohooo");
					Location pLoc = p.getLocation();
					Location hLoc = e.getHook().getLocation();
					Location change = hLoc.subtract(pLoc);
					p.setVelocity(change.toVector().multiply(0.3));
					Main.ACDS.get(0).setCooldown(p, 2);
				} else {
					p.sendMessage("Your cooldown is not over yet!");
				}
			}
		} else {
			Bukkit.getConsoleSender().sendMessage("Wrong hook");
		}
	}

	@EventHandler
	public static void onJoin(PlayerJoinEvent e) {
		for (Player p : invisPlayers) {
			e.getPlayer().hidePlayer(plugin, p);
		}
	}
}
