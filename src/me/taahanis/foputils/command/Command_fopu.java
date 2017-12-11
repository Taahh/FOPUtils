package me.taahanis.foputils.command;

import me.taahanis.foputils.FOPUtils;
import me.totalfreedom.totalfreedommod.TotalFreedomMod;
import net.md_5.bungee.api.ChatColor;
import net.pravian.aero.command.CommandOptions;
import net.pravian.aero.command.SimpleCommand;
import net.pravian.aero.command.SourceType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

@CommandOptions(source = SourceType.ANY, permission = "fopu.main", aliases = "frostedoputils", description = "Information about FrostedOPUtils (FOPU)!", usage = "/<command>")
public class Command_fopu extends SimpleCommand<FOPUtils> {
    
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String args[]) {
        
        if (args.length == 0)
        {
            sender.sendMessage(ChatColor.RED + "FOPUtils, version 0.5");
            sender.sendMessage(ChatColor.RED + "FOPUtils, made by taahanis");
            sender.sendMessage(ChatColor.RED + "FOPUtils, built for FrostedOP as a Utilities plugin");
            return true;
        }
        
        else if (args[0].equalsIgnoreCase("reload")) 
        {
                 if (!TotalFreedomMod.plugin().al.isAdmin(sender))
                {
                    sender.sendMessage(ChatColor.RED + "You aren't admin!");
                } else {
                plugin.config.load();
                 }
                 return true;
            }
        else if (args[0].equalsIgnoreCase("disable")) 
        {
               
                if (!TotalFreedomMod.plugin().al.isAdmin(sender))
                {
                    sender.sendMessage(ChatColor.RED + "You aren't admin!");
                } else {
                plugin.config.save();
                FOPUtils.plugin = null;
                }
                return true;
            }
        return false;
                
            
        }
       
        
    }
