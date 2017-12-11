package me.taahanis.foputils.command;

import me.taahanis.foputils.FOPUtils;
import net.md_5.bungee.api.ChatColor;
import net.pravian.aero.command.CommandOptions;
import net.pravian.aero.command.SimpleCommand;
import net.pravian.aero.command.SourceType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

@CommandOptions(source = SourceType.ANY, permission = "fopu.cc", aliases = "cc", description = "Clear the chat", usage = "/<command>")
public class Command_clearchat extends SimpleCommand<FOPUtils>
{

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String string, String[] args) {
        sender.sendMessage("                                                                              ");
        sender.sendMessage("                                                                              ");
        sender.sendMessage("                                                                              ");
        sender.sendMessage("                                                                              ");
        sender.sendMessage("                                                                              ");
        sender.sendMessage("                                                                              ");
        sender.sendMessage("                                                                              ");
        sender.sendMessage("                                                                              ");
        sender.sendMessage("                                                                              ");
        sender.sendMessage("                                                                              ");
        sender.sendMessage("                                                                              ");
        sender.sendMessage("                                                                              ");
        sender.sendMessage("                                                                              ");
        sender.sendMessage("                                                                              ");
        sender.sendMessage("                                                                              ");
        sender.sendMessage("                                                                              ");
        sender.sendMessage("                                                                              ");
        sender.sendMessage("                                                                              ");
        sender.sendMessage("                                                                              ");
        sender.sendMessage("                                                                              ");
        sender.sendMessage("                                                                              ");
        sender.sendMessage(ChatColor.RED + sender.getName() + " has cleared the chat!");
        
        
        return true;
    }
    
}
