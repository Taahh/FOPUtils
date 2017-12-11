package me.taahanis.foputils.listener;

import java.util.Arrays;
import java.util.List;
import me.taahanis.foputils.FOPUtils;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatListener implements Listener {
    
    private final FOPUtils plugin;
    
    public ChatListener(FOPUtils plugin)
    {
        this.plugin = plugin;
    }
    
    public static List<String> FORBIDDEN_WORDS = Arrays.asList(new String[]
    {
        "nigger", "taahanus", "taahanal", "taahan.us", "jew", "jewish", "Nigger"
    });
    
    @EventHandler
    public void onChat(AsyncPlayerChatEvent event) {
        
        String newMessage = event.getMessage();
        for (String bannedWord : FORBIDDEN_WORDS) newMessage = newMessage.replace(bannedWord, "*BEEP*");
        event.setMessage(newMessage);
        
    }
}
