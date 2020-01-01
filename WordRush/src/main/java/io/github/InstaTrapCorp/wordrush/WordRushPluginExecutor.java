package io.github.InstaTrapCorp.wordrush;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class WordRushPluginExecutor implements CommandExecutor {
	private final WordRush plugin;

	public WordRushPluginExecutor(WordRush plugin) {
		this.plugin = plugin; // Store the plugin in situations where you need it.
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (args.length > 4) {
			sender.sendMessage("Too many arguments!");
			return false;
		} 
		if (args.length < 2) {
			sender.sendMessage("Not enough arguments!");
			return false;
		}
		if (sender instanceof Player) {
			Player player = (Player) sender;
			PlayerInventory inventory = player.getInventory(); // The player's inventory
			ItemStack itemstack = new ItemStack(Material.DIAMOND, 64); // A stack of diamonds

			if (inventory.contains(itemstack)) {
				inventory.addItem(itemstack); // Adds a stack of diamonds to the player's inventory
				player.sendMessage("Welcome! You seem to be reeeally rich, so we gave you some more diamonds!");
			}
		} else {
			sender.sendMessage("You must be a player!");
			return false;
		}
		if (cmd.getName().equalsIgnoreCase("basic")) { // If the player typed /basic then do the following...
			Player player = (Player) sender;
			PlayerInventory inventory = player.getInventory(); // The player's inventory
			ItemStack itemstack = new ItemStack(Material.DIAMOND, 64); // A stack of diamonds

			if (inventory.contains(itemstack)) {
				inventory.addItem(itemstack); // Adds a stack of diamonds to the player's inventory
				player.sendMessage("Welcome! You seem to be reeeally rich, so we gave you some more diamonds!");
			}
			return true;
		} else if (cmd.getName().equalsIgnoreCase("basic2")) {
			if (!(sender instanceof Player)) {
				sender.sendMessage("This command can only be run by a player.");
			} else {
				Player player = (Player) sender;
				PlayerInventory inventory = player.getInventory(); // The player's inventory
				ItemStack itemstack = new ItemStack(Material.DIAMOND, 64); // A stack of diamonds

				if (inventory.contains(itemstack)) {
					inventory.addItem(itemstack); // Adds a stack of diamonds to the player's inventory
					player.sendMessage("Welcome! You seem to be reeeally rich, so we gave you some more diamonds!");
				}
			}
			return true;
		}
		return false;
	}


}