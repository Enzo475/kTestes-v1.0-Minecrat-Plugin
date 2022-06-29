package br.com.kaapax.ktestes.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HealCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player)sender;

        if (player.hasPermission("ktestes.heal")) {
            if (command.getName().equalsIgnoreCase("heal")) {
                player.setHealth(20);
                player.sendMessage("§aVocê se curou!");
            }
        }

        return true;
    }
}
