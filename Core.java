package me.ipo.team;

import me.ipo.team.cmds.TeamCommand;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Core extends JavaPlugin {
  
  public static Core plugin;
  public static PluginManager pm;
  @Override
  public void onEnable() {
	 plugin = this;
	 pm = Bukkit.getPluginManager();
	 regListeners();
	 regCommands();
}
  @Override
  public void onDisable() {
	
}
  private void regListeners() {
	
}
  private void regCommands() {
	getCommand("team help").setExecutor(new TeamCommand(this));
}
}
