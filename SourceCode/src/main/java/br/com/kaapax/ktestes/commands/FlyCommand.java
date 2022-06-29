package br.com.kaapax.ktestes.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        if (player.hasPermission("ktestes.fly")) {
            if (command.getName().equalsIgnoreCase("fly")) {
                if (player.isFlying()) {
                    player.setAllowFlight(false);
                    player.setFlying(false);
                    player.sendMessage("§cFly desabilitado com sucesso!");
                } else {
                    player.setAllowFlight(true);
                    player.setFlying(true);
                    player.sendMessage("§aFly habiitado com sucesso!");
                }
            }
        }
        return true;
        }
    }