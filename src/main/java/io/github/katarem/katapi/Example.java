package io.github.katarem.katapi;

import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Properties;

import io.github.katarem.katapi.api.Summoner;
import io.github.katarem.katapi.api.game.GameInfo;
import io.github.katarem.katapi.api.game.LeagueEntry;
import io.github.katarem.katapi.api.mastery.*;
import io.github.katarem.katapi.api.param.GameParam;
import io.github.katarem.katapi.api.spectator.CurrentGame;
import io.github.katarem.katapi.constants.Langs;
import io.github.katarem.katapi.constants.Platform;
import io.github.katarem.katapi.constants.Queue;
import io.github.katarem.katapi.constants.Region;
import io.github.katarem.katapi.services.*;

public class Example {

    public static void main(String[] args) throws Exception {

        Properties p = new Properties();
        InputStreamReader reader = new InputStreamReader(Example.class.getResourceAsStream("/config.properties"), Charset.forName("UTF8"));
        p.load(reader);

        String apiKey = p.getProperty("API_KEY");
        String[] playerName = p.getProperty("ACCOUNT").split("#");
        String version = p.getProperty("VERSION","14.22.1");


        // First we initialize the service with the api key
        LoLService.setApiKey(apiKey);

        LoLService service = new LoLService.Builder()
                .setPlatform(Platform.EUROPE_WEST)
                .setRegion(Region.EUROPE)
                .setLang(Langs.ENGLISH_UK)
                .setVersion(version)
                .forSummoner(playerName[0],playerName[1])
                .build();

        Summoner summoner = service.getSummoner();

        // Obtaining ranked solo elo from the summoner we added:
        
        LeagueEntry elo = service.getElo(Queue.RANKED_SOLO_5x5);
        System.out.println(elo.getTier() + " " + elo.getRank() + " " + elo.getLeaguePoints() + "LP");
    
        // Obtaining masteries from the summoner:
        
        ArrayList<Mastery> masteries = service.getMasteries();
        for (Mastery mastery : masteries) {
            String championName = service.getChampion(mastery.getChampionId().toString()).getName();
            System.out.printf("%s - Mastery [%d] %d points\n",
            championName,
            mastery.getChampionLevel(),
            mastery.getChampionPoints());
        }

        // Obtaining winrate from the last 20 games:
        GameParam param = new GameParam(summoner.getPuuid(), 20, null, null, null, null, null);

        List<GameInfo> games = service.getGames(param)
            .stream().map(gameId -> {
                try {
                    return service.getGame(gameId);
                } catch (Exception e) {
                    e.printStackTrace();
                    return GameInfo.NULL;
                }
            })
            .filter(game -> game != GameInfo.NULL)
            .filter(game -> {
                var player = game.getInfo().getParticipants().stream()
                .filter(part -> part.getSummonerId().equals(service.getSummoner().getId()))
                .findFirst();
            
                return player.isPresent() ? player.get().getWin() : false;
            })
            .toList();
            System.out.printf("%d won games of %s\n",games.size(),service.getGames(param).size());
            
        // Get a specific champion

        Collection<Champion> champs = service.getChampions();

        Optional<Champion> champ = champs.stream().filter(e -> e.getName().equals("Katarina")).findAny();
        System.out.println(champ.get().getBlurb());

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
