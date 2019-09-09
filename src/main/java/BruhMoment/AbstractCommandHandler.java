package BruhMoment;

import org.javacord.api.DiscordApi;
import org.javacord.api.entity.message.embed.EmbedBuilder;
import org.javacord.api.event.message.MessageCreateEvent;

public class AbstractCommandHandler {
    MessageCreateEvent event;
    DiscordApi api;
    public void command(String command, String output) {
        String mes = event.getMessage().getContent();
        if(mes.equalsIgnoreCase(command)) {
            event.getChannel().sendMessage(output);
        }
    }
    public void command(String command, EmbedBuilder embedBuilder){
        String mes = event.getMessage().getContent();
        if(mes.equalsIgnoreCase(command)) {
            event.getChannel().sendMessage(embedBuilder);
        }
    }
}
