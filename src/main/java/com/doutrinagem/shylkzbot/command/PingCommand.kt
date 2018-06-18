package com.doutrinagem.shylkzbot.commands.misc

import com.doutrinagem.shylkzbot.commands.AbstractCommand
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent

class PingCommand : AbstractCommand ("ping") {
    override fun run(event: GuildMessageReceivedEvent) {
        event.channel.sendMessage("Pong!") .queue ()
    }
}
