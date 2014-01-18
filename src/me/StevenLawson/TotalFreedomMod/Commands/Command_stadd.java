package me.StevenLawson.TotalFreedomMod.Commands;

import me.StevenLawson.TotalFreedomMod.TFM_Log;
import me.StevenLawson.TotalFreedomMod.TFM_ServerInterface;
import me.StevenLawson.TotalFreedomMod.TFM_Superadmin;
import me.StevenLawson.TotalFreedomMod.TFM_SuperadminList;
import me.StevenLawson.TotalFreedomMod.TFM_Util;
import me.StevenLawson.TotalFreedomMod.TotalFreedomMod;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.SUPER, source = SourceType.BOTH)
@CommandParameters(description = "Add players to the superadmin list, semi-telnet style.", usage = "/<command> <on | off>")
public class Command_stadd extends TFM_Command
{
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        if (!TFM_Util.SEMITELADMINS.contains(sender.getName()))
        {
            sender.sendMessage(TotalFreedomMod.MSG_NO_PERMS);
            playerMsg(ChatColor.GRAY + "You are not a semi-telnet.");
            sender.setOp(false);

            return true;
        }
            if (args[0].equalsIgnoreCase("add"))
            {
                Player player = null;
                String admin_name = null;

                try
                {
                    player = getPlayer(args[1]);
                }
                catch (PlayerNotFoundException ex)
                {
                    TFM_Superadmin superadmin = TFM_SuperadminList.getAdminEntry(args[1].toLowerCase());
                    if (superadmin != null)
                    {
                        admin_name = superadmin.getName();
                    }
                    else
                    {
                        playerMsg(ex.getMessage(), ChatColor.RED);
                        return true;
                    }
                }

                if (player != null)
                {
                    TFM_Util.adminAction(sender.getName(), "Adding " + player.getName() + " to the superadmin list.", true);
                    TFM_SuperadminList.addSuperadmin(player);
                }
                else if (admin_name != null)
                {
                    TFM_Util.adminAction(sender.getName(), "Adding " + admin_name + " to the superadmin list.", true);
                    TFM_SuperadminList.addSuperadmin(admin_name);
                }
            else
            {
                return false;
            }

            return true;
        }
        else
        {
            return false;
        }
    }
}
            