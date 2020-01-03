package io.github.InstaTrapCorp.TestPlugin;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class TestPlugin extends JavaPlugin{

	@Override
	public void onEnable() {
		getLogger().info("Plugin has been enabled. Created by instatrapcorp#4225");		
		//this.getCommand("basic").setExecutor(new TestPluginCommandExecutor(this));
		//this.getCommand("basic2").setExecutor(new TestPluginCommandExecutor(this));
	}
	
	@Override
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
	
	@Override
	public void onDisable() {
		getLogger().info("Plugin has been saved and shutdown");
	}
}
