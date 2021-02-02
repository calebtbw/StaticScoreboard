package me.calebtbw.staticscoreboard;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;

public final class StaticScoreboard extends JavaPlugin {

    @Override
    public void onEnable() {

        Bukkit.getPluginManager().registerEvents(new SidebarListener(this), this);

    }

    public void buildSidebar(Player player) {

        Scoreboard board = Bukkit.getScoreboardManager().getNewScoreboard();

        Objective obj = board.registerNewObjective("test", "test2");
        obj.setDisplayName(ChatColor.AQUA.toString() + ChatColor.BOLD + "SMP by BlazingLights");
        obj.setDisplaySlot(DisplaySlot.SIDEBAR);

        Score website = obj.getScore(ChatColor.GOLD + "BlazingLights.ggs.gg");
        website.setScore(1);

        Score blank = obj.getScore(" ");
        blank.setScore(2);

        Score playerName = obj.getScore("IGN: " + player.getName());
        playerName.setScore(3);

        Score blank2 = obj.getScore("");
        blank2.setScore(4);

        Score host = obj.getScore(ChatColor.BLUE + "by GGServers");
        host.setScore(5);

        player.setScoreboard(board);

    }
}
