package me.taahanis.foputils.command;

import me.taahanis.foputils.FOPUtils;
import net.md_5.bungee.api.ChatColor;
import net.pravian.aero.command.CommandOptions;
import net.pravian.aero.command.SimpleCommand;
import net.pravian.aero.command.SourceType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

@CommandOptions(source = SourceType.ANY, permission = "fopu.dl", aliases = "dl", description = "Gives the discord link", usage = "/<command>")
public class Command_discordlink extends SimpleCommand<FOPUtils> {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String string, String[] args) {
        sender.sendMessage(ChatColor.AQUA + "You can join our discord at https://discord.gg/Hh9QgJ6");
        return true;
    }
    
}
