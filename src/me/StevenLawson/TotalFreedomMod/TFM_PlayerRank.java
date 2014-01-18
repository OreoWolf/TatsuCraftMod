package me.StevenLawson.TotalFreedomMod;

import static me.StevenLawson.TotalFreedomMod.TFM_Util.DEVELOPERS;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public enum TFM_PlayerRank
{
    DEVELOPER("a " + ChatColor.DARK_PURPLE + "Developer", ChatColor.DARK_PURPLE + "[Dev]"),
    DEVELOPER_SA("a " + ChatColor.GOLD + "Super Admin " + ChatColor.AQUA + "and " + ChatColor.DARK_PURPLE + "Developer", ChatColor.DARK_PURPLE + "[Dev]"), //Currently unused
    DEVELOPER_STA("a " + ChatColor.DARK_GREEN + "Super Telnet Admin " + ChatColor.AQUA + "and " + ChatColor.DARK_PURPLE + "Developer", ChatColor.DARK_PURPLE + "[Dev]"), //Currently unused
    DEVELOPER_SRA("a " + ChatColor.LIGHT_PURPLE + "Senior Admin " + ChatColor.AQUA + "and " + ChatColor.DARK_PURPLE + "Developer", ChatColor.DARK_PURPLE + "[Dev]"),
    MB_SA("a " + ChatColor.GOLD + "Super Admin " + ChatColor.AQUA + "and " + ChatColor.RED + "Master Builder", ChatColor.GOLD + "[SA]"), //Currently unused
    MB_STA("a " + ChatColor.DARK_GREEN + "Super Telnet Admin " + ChatColor.AQUA + "and " + ChatColor.RED + "Master Builder", ChatColor.DARK_GREEN + "[STA]"), //Currently unused
    MB_SRA("a " + ChatColor.LIGHT_PURPLE + "Senior Admin " + ChatColor.AQUA + "and " + ChatColor.RED + "Master Builder", ChatColor.LIGHT_PURPLE + "[SrA]"), //Currently unused
    NUB(ChatColor.LIGHT_PURPLE + "Charter Senior Admin", ChatColor.DARK_RED + "[CSrA]"),
    EXECUTIVE("an " + ChatColor.DARK_RED + "Executive Senior Admin", ChatColor.DARK_RED + "[Exec]"),
    IMPOSTOR("an " + ChatColor.YELLOW + ChatColor.UNDERLINE + "Impostor", ChatColor.YELLOW.toString() + ChatColor.UNDERLINE + "[IMP]"),
    NON_OP("a " + ChatColor.GREEN + "Non-OP", ChatColor.GREEN.toString()),
    OP("an " + ChatColor.RED + "OP", ChatColor.RED + "[OP]"),
    BOT("a " + ChatColor.DARK_GREEN + "Bot", ChatColor.RED + "[Bot]"),
    SUPER("a " + ChatColor.GOLD + "Super Admin", ChatColor.GOLD + "[SA]"),
    TELNET("a " + ChatColor.DARK_GREEN + "Super Telnet Admin", ChatColor.DARK_GREEN + "[STA]"),
    SENIOR("a " + ChatColor.LIGHT_PURPLE + "Senior Admin", ChatColor.LIGHT_PURPLE + "[SrA]"),
    NEKO("a " + ChatColor.GREEN + "Neko", ChatColor.GREEN + "[Neko]"),
    OWNER("the " + ChatColor.BLUE + "Owner", ChatColor.BLUE + "[Owner]"),
    NOT_OWNER("not the " + ChatColor.BLUE + "Owner", ChatColor.BLUE + "[Not Owner]"),
    CONSOLE("The " + ChatColor.DARK_PURPLE + "Console", ChatColor.DARK_PURPLE + "[Console]");
    private String loginMessage;
    private String prefix;

    private TFM_PlayerRank(String loginMessage, String prefix)
    {
        this.loginMessage = loginMessage;
        this.prefix = prefix;
    }

    public static String getLoginMessage(CommandSender sender)
    {
        if (!(sender instanceof Player))
        {
            return fromSender(sender).getLoginMessage();
        }

        final TFM_Superadmin entry = TFM_SuperadminList.getAdminEntry((Player) sender);

        if (entry == null)
        {
            return fromSender(sender).getLoginMessage();
        }

        final String loginMessage = entry.getCustomLoginMessage();

        if (loginMessage != null && !loginMessage.isEmpty())
        {
            return ChatColor.translateAlternateColorCodes('&', loginMessage);
        }
        else
        {
            return fromSender(sender).getLoginMessage();
        }
    }

    public static TFM_PlayerRank fromSender(CommandSender sender)
    {
        if (!(sender instanceof Player))
        {
            return CONSOLE;
        }

        if (TFM_SuperadminList.isSuperadminImpostor(sender))
        {
            return IMPOSTOR;
        }

        if (DEVELOPERS.contains(sender.getName()))
        {
            return DEVELOPER;
        }


        final TFM_Superadmin entry = TFM_SuperadminList.getAdminEntry((Player) sender);

        final TFM_PlayerRank rank;

        if (entry != null && entry.isActivated())
        {
            if (sender.getName().equals("ImALuckyGuy"))
            {
                return OWNER;
            }
            if (sender.getName().equals("Not_ImALuckyGuy"))
            {
                return NOT_OWNER;
            }
            if (sender.getName().equals("TopCat107"))
            {
                return NUB;
            }
            if (sender.getName().equals("LindsayHai"))
            {
                return NEKO;
            } 
            if (sender.getName().equals("tuni20"))
            {
                return NUB;
            }   
            if (sender.getName().equals("jasoncb805"))
            {
                return NUB;
            }
            if (sender.getName().equals("R1Dz"))
            {
                return BOT;
            }     
            if (sender.getName().equals("Firestar_Drew"))
            {
                return EXECUTIVE;
            }
            if (sender.getName().equals("BuscusFan"))
            {
                return EXECUTIVE;
            }
            if (sender.getName().equals("Yoshi41023"))
            {
                return EXECUTIVE;
            }
            if (sender.getName().equals("SupItsDillon"))
            {
                return DEVELOPER_SRA;
            }
            if (entry.isSeniorAdmin())
            {
                rank = SENIOR;
            }
            else if (entry.isTelnetAdmin())
            {
                rank = TELNET;
            }
            else
            {
                rank = SUPER;
            }
        }
        else
        {
            if (sender.isOp())
            {
                rank = OP;
            }
            else
            {
                rank = NON_OP;
            }

        }
        return rank;
    }

    public String getPrefix()
    {
        return prefix;
    }

    public String getLoginMessage()
    {
        return loginMessage;
    }
}
