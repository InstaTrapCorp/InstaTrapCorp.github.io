package io.github.InstaTrapCorp.TestPlugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class TestPlugin extends JavaPlugin{

	@Override
	public void onEnable() {
		getLogger().info("Plugin has been enabled. Created by instatrapcorp#4225");		
		this.getCommand("basic").setExecutor(new TestPluginCommandExecutor(this));
		this.getCommand("basic2").setExecutor(new TestPluginCommandExecutor(this));
	}
	
	@Override
	public void onDisable() {
		getLogger().info("Plugin has been saved and shutdown");
	}
}
