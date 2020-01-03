package io.github.InstaTrapCorp.TestPlugin;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TestPluginCommandExecutor implements CommandExecutor {
	private final TestPlugin plugin;

	public TestPluginCommandExecutor(TestPlugin plugin) {
		this.plugin = plugin; // Store the plugin in situations where you need it.
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		Player player = (Player) sender;

		if (player.hasPermission("TestPlugin.*")) {
			if (args.length > 1) {
				sender.sendMessage("Too many arguments!");
				return false;
			}

			if (cmd.getName().equalsIgnoreCase("basic")) { // If the player typed /basic then do the following...
				Bukkit.broadcastMessage("This plugin is working fine!");
				return true;
			} else if (cmd.getName().equalsIgnoreCase("basic2")) {
				if (!(sender instanceof Player)) {
					sender.sendMessage("This command can only be run by a player.");
				} else {
					Bukkit.broadcastMessage("This part of the plugin also works!");
				}
				return true;
			}
			return false;
		} else {
			sender.sendMessage("You do not have the permission to do so!");
			return false;
		}
	}
}
