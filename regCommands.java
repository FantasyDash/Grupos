package me.ipo.team.cmds;

import me.ipo.team.Core;
import me.ipo.team.utils.Messages;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TeamCommand implements CommandExecutor {
	Core main;
	public TeamCommand(Core instance){
		main = instance;
	}
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    	if(!(sender instanceof Player)) {
    		sender.sendMessage(ChatColor.YELLOW + "Ejecuta el comando dentro del juego.");
    		return false;
    	}
    	Player p = (Player) sender;
    	if(label.equalsIgnoreCase("team"))
    	{
    		if(args.length == 0)
    		{
    			Messages.TEAM_HELP(p);
    		}
    	}
    	if(args[0].equalsIgnoreCase("help")
    	{
    		if(args.length == 1)
    		{
    			Messages.TEAM_HELP_2(p);
    		}
    	}
    	return true;
    }
}


