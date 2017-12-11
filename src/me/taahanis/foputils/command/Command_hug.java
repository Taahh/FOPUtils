package me.taahanis.foputils.command;

import me.taahanis.foputils.FOPUtils;
import net.md_5.bungee.api.ChatColor;
import net.pravian.aero.command.CommandOptions;
import net.pravian.aero.command.SimpleCommand;
import net.pravian.aero.command.SourceType;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

@CommandOptions(source = SourceType.ANY, permission = "fopu.hug", description = "Hug", usage = "/<command> [player]")
public class Command_hug extends SimpleCommand<FOPUtils> {
    
    public void playerEffect1(Player player){
        new BukkitRunnable(){

            double t = 0; 
            
            @Override
            public void run() {
                Location playerLoc = player.getLocation();    
                t = t + 0.1*Math.PI;
                for(double theta = 0; theta <= 2*Math.PI; theta = theta + Math.PI/8){
                    double x = t*Math.cos(theta);
                    double y = Math.exp(-0.1*t) * Math.sin(t) + 1.5;
                    double z = t*Math.sin(theta);
                    playerLoc.add(x, y, z);
                    
                    for(Player anotherPlayer : plugin.getServer().getOnlinePlayers()){
                        anotherPlayer.spawnParticle(Particle.HEART, playerLoc, 1);
                    }
                    playerLoc.subtract(x, y, z);
                }
                if(t > 20){
                    this.cancel();
                }
            }
            
        }.runTaskTimer(plugin, 1, 1);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String string, String[] args) {
        if (args.length == 0)
        {
            Bukkit.broadcastMessage(ChatColor.RED + sender.getName() + ChatColor.AQUA + " opens their arms!");
            
            if (sender instanceof Player) {
                Player theSender = (Player) sender;
            }
            Player theSender = (Player) sender;
            playerEffect1(theSender);
            return true;
        }
        
        Player player = getPlayer(args[0]);
        if (player == null) {
            sender.sendMessage(ChatColor.RED + "Player not found.");
            return true;
        }
        if (sender instanceof Player) {
                Player theSender = (Player) sender;
            }
            Player theSender = (Player) sender;
        
        if (player.getName().equals(theSender)) {
            sender.sendMessage(ChatColor.RED + "You can't hug yourself! Instead do /hug");
            return true;
        }
        Bukkit.broadcastMessage(ChatColor.RED + sender.getName() + ChatColor.AQUA + " hugs " + player.getName());
        playerEffect1(player);
        playerEffect1(theSender);
        
        return true;
    }
    
}
