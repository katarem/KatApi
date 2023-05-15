package katarem.katapi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;
import java.util.Properties;

import katarem.katapi.api.game.GameInfo;
import katarem.katapi.api.game.LeagueEntry;
import katarem.katapi.api.game.Participant;
import katarem.katapi.api.mastery.*;
import katarem.katapi.api.spectator.CurrentGame;
import katarem.katapi.constants.Langs;
import katarem.katapi.constants.Platform;
import katarem.katapi.constants.Queue;
import katarem.katapi.constants.Region;
import katarem.katapi.services.*;

public class Example {

    public static void main(String[] args) throws Exception {

        // LoLservice creation:
        Properties p = new Properties();
        p.load(Example.class.getResourceAsStream("/config.properties"));

        LoLService.setApiKey(p.getProperty("API_KEY"));

        LoLService service = new LoLService.Builder()
                .setPlatform(Platform.EUROPE_WEST)
                .setRegion(Region.EUROPE)
                .setLang(Langs.ENGLISH_UK)
                .setVersion("LAST_VERSION")
                .forSummoner("SUMMONER_NAME")
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

        // Get the current game (if the summoner is playing a game)
        Optional<CurrentGame> currentGame = service.getCurrentGame();
        if (currentGame.isPresent())
            System.out.println("Current game: " + currentGame.get().getGameMode());
        else
            System.out.println("This summoner isn't inside a game right now");
    }

}
