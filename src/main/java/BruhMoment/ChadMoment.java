package BruhMoment;
import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;
import org.javacord.api.entity.message.embed.EmbedBuilder;

public class ChadMoment{
    public static void main(String[] args) {
        AbstractCommandHandler commandHandler = new AbstractCommandHandler();
        Rules rules = new Rules();
        Token token = new Token();
        DiscordApi api = new DiscordApiBuilder().setToken(token.token).login().join();
        EmbedBuilder embedBuilder = new EmbedBuilder();
        EmbedBuilder embed = embedBuilder.setTitle("All commands")
                 .addField("gm0: ", "http://gm0.copr.cc/compressed")
                .addField("gm1", "https://www.firstinspires.org/sites/default/files/uploads/resource_library/ftc/game-manual-part-1.pdf")
                .addField("gm2", "https://firstinspiresst01.blob.core.windows.net/ftc/2020/gbrm-pt-2.pdf")
                .addField("email", "pellarobotics@gmail.com")
                .addField("forums", "https://ftcforum.usfirst.org/").setDescription("All Commands in our Database. Use !(command)");
        commandHandler.api = api;
        api.addMessageCreateListener(event -> {
            commandHandler.event = event;
            commandHandler.command("!gm2", "https://firstinspiresst01.blob.core.windows.net/ftc/2020/gbrm-pt-2.pdf");
            commandHandler.command("!gm1", "https://www.firstinspires.org/sites/default/files/uploads/resource_library/ftc/game-manual-part-1.pdf");
            commandHandler.command("!gm0", "http://gm0.copr.cc/compressed");
            commandHandler.command("!gm0big", "https://gm0.copperforge.cc/");
            commandHandler.command("!email", "pellarobotics@gmail.com");
            commandHandler.command("!forums","https://ftcforum.usfirst.org/");
            if (event.getMessage().getContent().equalsIgnoreCase("!dumpall") || event.getMessage().getContent().equalsIgnoreCase("!commands")) {
                event.getChannel().sendMessage(embed);
            }
            commandHandler.command("g1",rules.g1);
            commandHandler.command("g2",rules.g2);
            commandHandler.command("g3",rules.g3);
            commandHandler.command("g4",rules.g4);
            commandHandler.command("g5",rules.g5);
            commandHandler.command("g6",rules.g6);
            commandHandler.command("g7",rules.g7);
            commandHandler.command("g8",rules.g8);
            commandHandler.command("g9",rules.g9);
            commandHandler.command("g10",rules.g10);
            commandHandler.command("g12",rules.g11);
            commandHandler.command("g12",rules.g12);
            commandHandler.command("g13",rules.g13);
            commandHandler.command("g14",rules.g14);
            commandHandler.command("g15",rules.g15);
            commandHandler.command("g16",rules.g16);
            commandHandler.command("g17",rules.g17);
            commandHandler.command("g18",rules.g18);
            commandHandler.command("g19",rules.g19);
            commandHandler.command("g20",rules.g20);
            commandHandler.command("g21",rules.g21);
            commandHandler.command("g22",rules.g22);
            commandHandler.command("g23",rules.g23);
            commandHandler.command("g24",rules.g24);
            commandHandler.command("g25",rules.g25);
            commandHandler.command("g26",rules.g26);
            commandHandler.command("g27",rules.g27);
            commandHandler.command("g28",rules.g28);
            commandHandler.command("g29",rules.g29);
            commandHandler.command("g30",rules.g30);

            commandHandler.command("gs1",rules.gs1);
            commandHandler.command("gs2",rules.gs2);
            commandHandler.command("gs3",rules.gs3);
            commandHandler.command("gs4",rules.gs4);
            commandHandler.command("gs5",rules.gs5);
            commandHandler.command("gs6",rules.gs6);
            commandHandler.command("gs7",rules.gs7);
            commandHandler.command("gs8",rules.gs8);
            commandHandler.command("gs9",rules.gs9);
            commandHandler.command("gs10",rules.gs10);
            commandHandler.command("gs11",rules.gs11);
            commandHandler.command("gs12",rules.gs12);
        });
    }
}
