package io.github.InstaTrapCorp.TestPlugin;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class TestPlugin extends JavaPlugin{

	@Override
	public void onEnable() {
		getLogger().info("Plugin has been enabled. Created by instatrapcorp#4225");
		
		List<Player> playerList = new ArrayList<Player>();
		for (Player player : Bukkit.getServer().getOnlinePlayers()) {
		    playerList.add(player);
		}
		
		this.getCommand("basic").setExecutor(new TestPluginCommandExecutor(this));
	}
	
	@Override
	public void onDisable() {
		getLogger().info("Plugin has been saved and shutdown");
	}
}
