package bot.discord;

import sx.blah.discord.api.ClientBuilder;
import sx.blah.discord.api.IDiscordClient;
import sx.blah.discord.util.DiscordException;

public class Main {
	
	public static void main(String[] args) {
		
		IDiscordClient cli = BotUtils.getBuiltDiscordClient(BotUtils.TOKEN);
	}
	
	
	
}
