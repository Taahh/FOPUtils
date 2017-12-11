package me.taahanis.foputils.command;

import me.taahanis.foputils.FOPUtils;
import net.md_5.bungee.api.ChatColor;
import net.pravian.aero.command.CommandOptions;
import net.pravian.aero.command.SimpleCommand;
import net.pravian.aero.command.SourceType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;


@CommandOptions(source = SourceType.ANY, permission = "fopu.ai", aliases = "ai", description = "Info about how to apply!", usage = "/<command>")
public class Command_admininfo extends SimpleCommand<FOPUtils> {
    
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String args[]) {
        sender.sendMessage(ChatColor.RED + "To apply for admin, go to https://frostedop.net/forums/index.php");
          sender.sendMessage(ChatColor.RED + "Make sure, that you meet the requirements!");
        
        return true;
    }
    
}
