package katarem.lolapi;

import katarem.lolapi.api.mastery.*;
import katarem.lolapi.constants.Langs;
import katarem.lolapi.constants.Platform;
import katarem.lolapi.constants.Region;
import katarem.lolapi.services.*;
import katarem.lolapi.api.Summoner;
import katarem.lolapi.api.game.GameInfo;
import katarem.lolapi.api.game.Participant;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
        final String API_KEY = "RGAPI-06f766a9-f075-4247-bf56-748a040f80d4";
        SummonerService sService = new SummonerService(API_KEY, Platform.EUROPE_WEST); 
        Summoner summ = sService.getSummoner("Tuernø");
        System.out.println(summ.getSummonerLevel());
        MatchService m = new MatchService(API_KEY, Region.EUROPE);
        GameInfo lastGame = m.getGame(m.getGames(summ.getPuuid(), API_KEY).get(0));
        LoLService lService = new LoLService();
        try {
            Participant player = new Participant();
            for (Participant p : lastGame.getInfo().getParticipants()) {
                if(p.getSummonerId().equals(summ.getId())){
                    player = p;
                    break;
                }
            }
        System.out.println(player.getChampionId());;

        Champion champ = lService.getChampionsData(lService.getLastVersion(), Langs.GERMAN).getChampions().get(player.getChampionName());
        System.out.println(champ.getBlurb());
        
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    
}
