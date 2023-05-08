package katarem.lolapi;

import katarem.lolapi.api.mastery.*;
import katarem.lolapi.constants.Langs;
import katarem.lolapi.constants.Platform;
import katarem.lolapi.constants.Queue;
import katarem.lolapi.constants.Region;
import katarem.lolapi.services.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;
import java.util.Properties;

import katarem.lolapi.api.game.GameInfo;
import katarem.lolapi.api.game.LeagueEntry;
import katarem.lolapi.api.game.Participant;

public class Example {
    static Integer wins = 0;

    public static void main(String[] args) throws Exception {

        // LoLservice creation:
        Properties p = new Properties();
        p.load(Example.class.getResourceAsStream("/config.properties"));

        LoLService.setApiKey(p.getProperty("API_KEY"));

        LoLService service = new LoLService.Builder()
                .setPlatform(Platform.EUROPE_WEST)
                .setRegion(Region.EUROPE)
                .setLang(Langs.ENGLISH_UK)
                .setVersion("GAME_VERSION_YOU_WANT")
                .forSummoner("YOUR_SUMMONER_ID")
                .build();

        // Obtaining ranked solo elo from the summoner we added:

        LeagueEntry elo = service.getElo(Queue.RANKED_SOLO_5x5);
        System.out.println(elo.getTier());

        // Obtaining masteries from the summoner:

        ArrayList<Mastery> masteries = service.getMasteries();
        System.out.println(masteries.get(0).getChampionPoints() + " points");

        // Obtaining winrate from the last 20 games:

        ArrayList<String> games = service.getGames();
        for (String gameId : games) {
            GameInfo game = service.getGame(gameId);
            // do whatever you want with the game, for example obtaining info from our
            // summoner
            Optional<Participant> player = game.getInfo().getParticipants().stream()
                    .filter(e -> e.getSummonerId().equals(service.getSummoner().getId())).findFirst();
            if (player.isPresent() && player.get().getWin()) {
                System.out.println("you won this game");
            }
        }

        // Get a specific champion

        Collection<Champion> champs = service.getChampions();
        Optional<Champion> champ = champs.stream().filter(e -> e.getName().equals("Katarina")).findAny();
        System.out.println(champ.get().getBlurb());

        // Print the masteries
        for (Mastery mastery : masteries) {
            for (Champion champion : champs) {
                if (mastery.getChampionId().toString().equals(champion.getKey())) {
                    System.out.println("Mastery " + mastery.getChampionLevel() + " with " + champion.getName() + " and "
                            + mastery.getChampionPoints() + " points");
                }
            }
        }

    }

}
