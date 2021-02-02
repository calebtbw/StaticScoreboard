package me.calebtbw.staticscoreboard;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class SidebarListener implements Listener {

    private StaticScoreboard main;

    public SidebarListener(StaticScoreboard main) {
        this.main = main;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {

        Player player = e.getPlayer();

        main.buildSidebar(player);

    }
}
