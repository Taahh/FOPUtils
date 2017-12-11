package me.taahanis.foputils;

import me.taahanis.foputils.command.Command_fopu;
import me.taahanis.foputils.listener.ChatListener;
import me.taahanis.foputils.listener.EmojiListener;
import me.taahanis.foputils.listener.JoinListener;
import net.pravian.aero.command.handler.AeroCommandHandler;
import net.pravian.aero.command.handler.SimpleCommandHandler;
import net.pravian.aero.config.YamlConfig;
import net.pravian.aero.plugin.AeroPlugin;
import net.pravian.aero.util.Loggers;
import org.bukkit.plugin.PluginManager;

/**
 *
 * @author moh_a
 */
public class FOPUtils extends AeroPlugin<FOPUtils> {
    
    public static FOPUtils plugin;
    public AeroCommandHandler handler;
    public YamlConfig config;
    
    
    @Override
    public void load() {
        FOPUtils.plugin = this;
        this.config = new YamlConfig(plugin, "config.yml", true);
        Loggers.info("[FOPU] Loading version BETA, made by taahanis");
    }
    
    @Override
    public void enable() {
        FOPUtils.plugin = this;
        
        config.load();
        plugin.load();
        
        final PluginManager pm = plugin.getServer().getPluginManager();
        pm.registerEvents(new ChatListener(plugin), plugin);
        pm.registerEvents(new JoinListener(plugin), plugin);
        pm.registerEvents(new EmojiListener(plugin), plugin);
        
        
        handler = new SimpleCommandHandler(plugin);
        handler.setCommandClassPrefix("Command_");
        handler.setPermissionMessage("You have no permission to use this command!");
        handler.loadFrom(Command_fopu.class.getPackage());
        handler.registerAll(handler.getCommandClassPrefix(), true);
        
        Loggers.info("[FOPU] Enabled version BETA, made by taahanis");
    }
    
    @Override
    public void disable() {
        FOPUtils.plugin = null;
        Loggers.info("[FOPU] Disabled version BETA, made by taahanis");
    }
    
}
