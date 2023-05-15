package io.github.katarem.katapi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;
import java.util.Properties;

import javax.swing.text.html.Option;

import io.github.katarem.katapi.api.Summoner;
import io.github.katarem.katapi.api.game.GameInfo;
import io.github.katarem.katapi.api.game.LeagueEntry;
import io.github.katarem.katapi.api.game.Participant;
import io.github.katarem.katapi.api.mastery.*;
import io.github.katarem.katapi.api.spectator.CurrentGame;
import io.github.katarem.katapi.constants.Langs;
import io.github.katarem.katapi.constants.Platform;
import io.github.katarem.katapi.constants.Queue;
import io.github.katarem.katapi.constants.Region;
import io.github.katarem.katapi.services.*;

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
                .setVersion("13.9.1")
                .forSummoner("SHAC0 CLONE")
                .build();

        Summoner summoner = service.getSummoner();

        // Obtaining ranked solo elo from the summoner we added:

        LeagueEntry elo = service.getElo(Queue.RANKED_SOLO_5x5);
        System.out.println(elo.getTier() + " " + elo.getRank() + " " + elo.getLeaguePoints() + "LP");

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

        // Get the current game (if the summoner is playing a game) and the champ the
        // summoner is playing
        Optional<CurrentGame> currentGame = service.getCurrentGame();
        if (currentGame.isPresent()) {
            Optional<io.github.katarem.katapi.api.spectator.Participant> par = currentGame
                    .get()
                    .getParticipants()
                    .stream()
                    .filter(e -> e.getSummonerId().equals(summoner.getId())).findFirst();
            String currentChamp = champs.stream()
                    .filter(e -> e.getKey().equals(par.get().getChampionId().toString()))
                    .findFirst()
                    .get()
                    .getName();
            System.out.println("Current game: " + currentGame.get().getGameMode() + " playing " + currentChamp);
        } else
            System.out.println("This summoner isn't inside a game right now");

    }

}
