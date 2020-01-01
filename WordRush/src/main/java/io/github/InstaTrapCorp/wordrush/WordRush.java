package io.github.InstaTrapCorp.wordrush;

import org.bukkit.plugin.java.JavaPlugin;

public final class WordRush extends JavaPlugin {
	
	@Override
    public void onEnable() {
		getLogger().info("[LightUp] Plugin has been loaded up and ready to set players on fire!");
		getLogger().info("Plugin created by instatrapcorp#4225 or Joe Hezzarry");
		// This will throw a NullPointerException if you don't have the command defined in your plugin.yml file!
		this.getCommand("lightup").setExecutor(new WordRushPluginExecutor(this));
    }
    
    @Override
    public void onDisable() {
    	getLogger().info("[LightUp] Plugin has been disabled and will no longer light players on fire :(");
    }
}
