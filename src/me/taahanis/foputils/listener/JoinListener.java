package me.taahanis.foputils.listener;

import me.taahanis.foputils.FOPUtils;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener {
    
    private final FOPUtils plugin;
    
    public JoinListener(FOPUtils plugin)
    {
        this.plugin = plugin;
    }
    
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        
        Player player = event.getPlayer();
        
        if (player.getName().equals("taahanis"))
                {
                    player.setDisplayName(ChatColor.BLUE + "" + ChatColor.BOLD + "taahanis");
                    player.setGameMode(GameMode.CREATIVE);
                    player.sendMessage(ChatColor.RED + "Gamemode set to creative!");
                }
        
    }
}
