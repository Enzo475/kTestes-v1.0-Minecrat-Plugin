package br.com.kaapax.ktestes;

import br.com.kaapax.ktestes.commands.FlyCommand;
import br.com.kaapax.ktestes.commands.HealCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class ktestes extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("§aPlugin ativado com sucesso!");

        getCommand("fly").setExecutor(new FlyCommand());
        getCommand("heal").setExecutor(new HealCommand());
    }

    @Override
    public void onDisable() {
        getLogger().info("§cPlugin desativado com sucesso!");
    }

}
