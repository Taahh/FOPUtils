package me.taahanis.foputils.command;

import me.taahanis.foputils.FOPUtils;
import net.md_5.bungee.api.ChatColor;
import net.pravian.aero.command.CommandOptions;
import net.pravian.aero.command.SimpleCommand;
import net.pravian.aero.command.SourceType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;


@CommandOptions(source = SourceType.ANY, permission = "fopu.pl", aliases = "pl", description = "Plugin list", usage = "/<command>")
public class Command_plugins extends SimpleCommand<FOPUtils> {
    
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String args[]) {
        sender.sendMessage(ChatColor.BLUE + "Plugins (1): " + ChatColor.GREEN + "NoneOfYOurBusiness");
        
        return true;
    }
    
}
