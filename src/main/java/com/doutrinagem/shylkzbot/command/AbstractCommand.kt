package com.doutrinagem.shylkzbot.commands

import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent

abstract class AbstractCommand (val label: String) {
    fun handle(event: GuildMessageReceivedEvent): Boolean {
        val mensagem = event.message.contentRaw

        if (mensagem.startsWith("s!" + label)) {
            run(event)
            return true
        } else {
            return false
        }

    }
    abstract fun run(event: GuildMessageReceivedEvent)
}
