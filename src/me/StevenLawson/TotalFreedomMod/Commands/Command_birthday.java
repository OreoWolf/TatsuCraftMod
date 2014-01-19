package me.StevenLawson.TotalFreedomMod.Commands;

import me.StevenLawson.TotalFreedomMod.TFM_Util;
import me.StevenLawson.TotalFreedomMod.TFM_PlayerData;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.SUPER, source = SourceType.BOTH)
@CommandParameters(description = "Someones birthday?", usage = "/<command> [playername]")
public class Command_birthday extends TFM_Command
{
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        if (args.length != 1)
        {
            return false;
        }

        Player player;
        try
        {
            player = getPlayer(args[0]);
        }
        catch (PlayerNotFoundException ex)
        {
            playerMsg(ex.getMessage(), ChatColor.RED);
            return true;
        }

        smite(player);

        return true;
    }

    public static void smite(final Player player)
    {
        TFM_Util.bcastMsg" Happy Birthday!" + (player.getName(), ChatColor.aqua);

          for (Player player : server.getOnlinePlayers())
        {
            ItemStack heldItem = new ItemStack(Material.CAKE, 1);
            player.getInventory().setItem(player.getInventory().firstEmpty(), heldItem);
            player.awardAchievement(Achievement.MINE_WOOD);
            player.awardAchievement(Achievement.BUILD_WORKBENCH);
            player.awardAchievement(Achievement.BUILD_HOE);
            player.awardAchievement(Achievement.BAKE_CAKE);
        }
		
		      TFM_Util.bcastMsg(output.toString());
        return true;
    }
}
