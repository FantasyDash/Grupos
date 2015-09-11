package me.ipo.team.utils;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class Messages {
	public static void TEAM_HELP(Player p)
	{
		p.sendMessage(ChatColor.GRAY + "§l§m---------------------------------");
		p.sendMessage(ChatColor.GOLD + "              §lTEAM               ");
		p.sendMessage(ChatColor.GRAY + "§l§m---------------------------------");
		p.sendMessage("");
		p.sendMessage(ChatColor.GOLD + "/team crear <team> <contraseña> " + "§e§l>>" +" §7Para crear un team");
		p.sendMessage(ChatColor.GOLD + "/team entrar <team> <contraseña> " + "§e§l>>" +" §7Para entrar a un team");
		p.sendMessage(ChatColor.GOLD + "/team leave " + "§e§l>>" +" §7Para dejar al team pertenenciente");
		p.sendMessage(ChatColor.GOLD + "/team info <team> " + "§e§l>>" +" §7Para ver info del Team");
		p.sendMessage(ChatColor.GOLD + "/team version " + "§e§l>>" + " §7Para ver la version del Plug-In");
		p.sendMessage(ChatColor.GRAY + "§l§7§m------------ §r§6Usa /team help 2 §l§m§7---------------");
	}
	public static void TEAM_HELP_2(Player p)
	{
		p.sendMessage(ChatColor.GRAY + "§l§m---------------------------------");
		p.sendMessage(ChatColor.GOLD + "              §lTEAM               ");
		p.sendMessage(ChatColor.GRAY + "§l§m---------------------------------");
		p.sendMessage("");
		p.sendMessage(ChatColor.GOLD + "/team crear <team> <contraseña> " + "§e§l>>" +" §7Para crear un team");
		p.sendMessage(ChatColor.GOLD + "/team entrar <team> <contraseña> " + "§e§l>>" +" §7Para entrar a un team");
		p.sendMessage(ChatColor.GOLD + "/team leave " + "§e§l>>" +" §7Para dejar al team pertenenciente");
		p.sendMessage(ChatColor.GOLD + "/team info <team> " + "§e§l>>" +" §7Para ver info del Team");
		p.sendMessage(ChatColor.GOLD + "/team version " + "§e§l>>" + " §7Para ver la version del Plug-In");
		p.sendMessage(ChatColor.GRAY + "§l§7§m------------ §r§6Usa /team help 2 §l§m§7---------------");
	}
	

}
