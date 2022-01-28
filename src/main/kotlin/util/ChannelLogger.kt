package util

import net.dv8tion.jda.api.entities.TextChannel
import vzbot.VzBot
import java.awt.Color

class ChannelLogger(channelID: String) {

    private var channel: TextChannel = VzBot.discord.getTextChannelById(channelID) ?: error("Channel for Logging was not found")

    fun sendMessage(message: String) {
        channel.sendMessageEmbeds(defaultEmbed(message)).queue()
    }

    fun sendError(message: String) {
        channel.sendMessageEmbeds(defaultEmbed(message, Color.RED, "Error")).queue()
    }

    fun sendSuccess(message: String) {
        channel.sendMessageEmbeds(defaultEmbed(message, Color.GREEN, "Success")).queue()
    }



}