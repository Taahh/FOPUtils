package me.taahanis.foputils.command;

import me.taahanis.foputils.FOPUtils;
import net.pravian.aero.command.CommandOptions;
import net.pravian.aero.command.SimpleCommand;
import net.pravian.aero.command.SourceType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

@CommandOptions(source = SourceType.ANY, permission = "fopu.reload", aliases = "fopureload", description = "Reload FOPUtils!", usage = "/<command>")
public class Command_fopurl extends SimpleCommand<FOPUtils> {
    
      @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String args[]) {
        
        FOPUtils.plugin.load();        
        return true;
    }
    
}
