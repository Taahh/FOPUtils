package me.taahanis.foputils.listener;

import java.util.Arrays;
import java.util.List;
import me.taahanis.foputils.FOPUtils;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class EmojiListener implements Listener {
    
    private final FOPUtils plugin;
    
    public EmojiListener(FOPUtils plugin)
    {
        this.plugin = plugin;
    }
    
    @EventHandler
    public void onChat(AsyncPlayerChatEvent event) {
        
        String newMessage = event.getMessage().replace("<3", "❤");
        
        event.setMessage(newMessage);
        
    }
}
