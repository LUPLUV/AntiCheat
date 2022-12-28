package one.devsky.boilerplates.commands

import de.moltenKt.unfold.text
import one.devsky.boilerplates.annotations.RegisterCommand
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.permissions.PermissionDefault

@RegisterCommand(
    name = "template",
    description = "Template command",
    permission = "one.devsky.boilerplates.commands.template",
    permissionDefault = PermissionDefault.OP,
    aliases = ["temp"]
)
class TemplateCommand : CommandExecutor {

    /**
     * Executes the given command, returning its success.
     * <br></br>
     * If false is returned, then the "usage" plugin.yml entry for this command
     * (if defined) will be sent to the player.
     *
     * @param sender Source of the command
     * @param command Command which was executed
     * @param label Alias of the command which was used
     * @param args Passed command arguments
     * @return true if a valid command, otherwise false
     */
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {

        sender.sendMessage(
            text("<#74b9ff><bold>Boilerplate »</bold> <hover:show_text:'<#dfe6e9>This is a tooltip'><gradient:#ffeaa7:#74b9ff>Just a cool looking template text.</gradient></hover>")
        )

        return true
    }

}