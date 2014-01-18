package me.StevenLawson.TotalFreedomMod.Commands;

import me.StevenLawson.TotalFreedomMod.TFM_ServerInterface;
import me.StevenLawson.TotalFreedomMod.TFM_SuperadminList;
import me.StevenLawson.TotalFreedomMod.TFM_Util;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

@CommandPermissions(level = AdminLevel.ALL, source = SourceType.BOTH)
@CommandParameters(description = "For the bad Superadmins.", usage = "/<command> <playername>")
public class Command_superdoom extends TFM_Command
{
    @Override
    public boolean run(final CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        if (!TFM_Util.EXECS.contains(sender.getName()))
        {
            sender.sendMessage(ChatColor.DARK_RED + "Did you seriously plan on superdooming someone?");
            TFM_Util.adminAction("WARNING: " + sender.getName(), "has attempted to superdoom someone! They're probably up to something...", true);
            sender.setOp(false);

            return true;
        }
        
        if (args.length != 1)
        {
            return false;
        }

        final Player player;
        try
        {
            player = getPlayer(args[0]);
        }
        catch (PlayerNotFoundException ex)
        {
            sender.sendMessage(ex.getMessage());
            return true;
        }

        TFM_Util.adminAction(sender.getName(), "Casting an " + ChatColor.ITALIC + "extremely " + ChatColor.RESET + "" + ChatColor.RED + "dark shadow of oblivion over " + player.getName(), true);
        TFM_Util.bcastMsg(player.getName() + " will be SCREWED OVER!", ChatColor.RED);

        final String IP = player.getAddress().getAddress().getHostAddress().trim();

        // remove from superadmin
        if (TFM_SuperadminList.isUserSuperadmin(player))
        {
            TFM_Util.adminAction(sender.getName(), "Removing " + player.getName() + "'s abusive ass from the superadmin list.", true);
            TFM_SuperadminList.removeSuperadmin(player);
        }

        // remove from whitelist
        player.setWhitelisted(false);

        // deop
        player.setOp(false);

        // ban IP
        TFM_ServerInterface.banIP(IP, null, null, null);

        // ban name
        TFM_ServerInterface.banUsername(player.getName(), null, null, null);

        // set gamemode to survival
        player.setGameMode(GameMode.SURVIVAL);

        // clear inventory
        player.closeInventory();
        player.getInventory().clear();

        // ignite player
        player.setFireTicks(100000);

        // generate explosion
        player.getWorld().createExplosion(player.getLocation(), 4F);
        player.getWorld().createExplosion(player.getLocation(), 4F);
        player.getWorld().createExplosion(player.getLocation(), 4F);
        player.getWorld().createExplosion(player.getLocation(), 4F);
        player.getWorld().createExplosion(player.getLocation(), 4F);
        player.getWorld().createExplosion(player.getLocation(), 4F);
player.getWorld().createExplosion(player.getLocation(), 4F);
player.getWorld().createExplosion(player.getLocation(), 4F);
player.getWorld().createExplosion(player.getLocation(), 4F);
player.getWorld().createExplosion(player.getLocation(), 4F);
player.getWorld().createExplosion(player.getLocation(), 4F);
player.getWorld().createExplosion(player.getLocation(), 4F);
player.getWorld().createExplosion(player.getLocation(), 4F);
        player.getWorld().createExplosion(player.getLocation(), 4F);
        player.getWorld().createExplosion(player.getLocation(), 4F);
        player.getWorld().createExplosion(player.getLocation(), 4F);
        player.getWorld().createExplosion(player.getLocation(), 4F);
        player.getWorld().createExplosion(player.getLocation(), 4F);
        player.getWorld().createExplosion(player.getLocation(), 4F);
player.getWorld().createExplosion(player.getLocation(), 4F);
player.getWorld().createExplosion(player.getLocation(), 4F);
player.getWorld().createExplosion(player.getLocation(), 4F);
player.getWorld().createExplosion(player.getLocation(), 4F);
player.getWorld().createExplosion(player.getLocation(), 4F);
player.getWorld().createExplosion(player.getLocation(), 4F);
player.getWorld().createExplosion(player.getLocation(), 4F);
        player.getWorld().createExplosion(player.getLocation(), 4F);
        player.getWorld().createExplosion(player.getLocation(), 4F);
        player.getWorld().createExplosion(player.getLocation(), 4F);
        player.getWorld().createExplosion(player.getLocation(), 4F);
        player.getWorld().createExplosion(player.getLocation(), 4F);
player.getWorld().createExplosion(player.getLocation(), 4F);
player.getWorld().createExplosion(player.getLocation(), 4F);
player.getWorld().createExplosion(player.getLocation(), 4F);
player.getWorld().createExplosion(player.getLocation(), 4F);
player.getWorld().createExplosion(player.getLocation(), 4F);
player.getWorld().createExplosion(player.getLocation(), 4F);
player.getWorld().createExplosion(player.getLocation(), 4F);
        player.getWorld().createExplosion(player.getLocation(), 4F);
        player.getWorld().createExplosion(player.getLocation(), 4F);
        player.getWorld().createExplosion(player.getLocation(), 4F);
        player.getWorld().createExplosion(player.getLocation(), 4F);
        player.getWorld().createExplosion(player.getLocation(), 4F);
player.getWorld().createExplosion(player.getLocation(), 4F);
player.getWorld().createExplosion(player.getLocation(), 4F);
player.getWorld().createExplosion(player.getLocation(), 4F);
player.getWorld().createExplosion(player.getLocation(), 4F);
player.getWorld().createExplosion(player.getLocation(), 4F);
player.getWorld().createExplosion(player.getLocation(), 4F);
player.getWorld().createExplosion(player.getLocation(), 4F);
        player.getWorld().createExplosion(player.getLocation(), 4F);
        player.getWorld().createExplosion(player.getLocation(), 4F);
        player.getWorld().createExplosion(player.getLocation(), 4F);
        player.getWorld().createExplosion(player.getLocation(), 4F);
        player.getWorld().createExplosion(player.getLocation(), 4F);
        player.getWorld().createExplosion(player.getLocation(), 4F);
player.getWorld().createExplosion(player.getLocation(), 4F);
player.getWorld().createExplosion(player.getLocation(), 4F);
player.getWorld().createExplosion(player.getLocation(), 4F);
player.getWorld().createExplosion(player.getLocation(), 4F);
player.getWorld().createExplosion(player.getLocation(), 4F);
player.getWorld().createExplosion(player.getLocation(), 4F);
player.getWorld().createExplosion(player.getLocation(), 4F);
        player.getWorld().createExplosion(player.getLocation(), 4F);
        player.getWorld().createExplosion(player.getLocation(), 4F);
        player.getWorld().createExplosion(player.getLocation(), 4F);
        player.getWorld().createExplosion(player.getLocation(), 4F);
        player.getWorld().createExplosion(player.getLocation(), 4F);
        player.getWorld().createExplosion(player.getLocation(), 4F);
player.getWorld().createExplosion(player.getLocation(), 4F);
player.getWorld().createExplosion(player.getLocation(), 4F);
player.getWorld().createExplosion(player.getLocation(), 4F);
player.getWorld().createExplosion(player.getLocation(), 4F);
player.getWorld().createExplosion(player.getLocation(), 4F);
player.getWorld().createExplosion(player.getLocation(), 4F);
player.getWorld().createExplosion(player.getLocation(), 4F);


        new BukkitRunnable()
        {
            @Override
            public void run()
            {
                // strike lightning
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
                

                // kill (if not done already)
                player.setHealth(0.0);
            }
        }.runTaskLater(plugin, 20L * 2L);

        new BukkitRunnable()
        {
            @Override
            public void run()
            {
                // message
                TFM_Util.adminAction(sender.getName(), "Banning " + player.getName() + " and IP " + IP + " with no regrets", true);
                

                // generate explosion
                player.getWorld().createExplosion(player.getLocation(), 4F);

                // kick player
                player.kickPlayer(ChatColor.RED + "FUCKOFF, and get your shit together you super doomed bitch!");
            }
        }.runTaskLater(plugin, 20L * 3L);

        return true;
    }
}
