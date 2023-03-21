package katarem.lolapi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import katarem.lolapi.api.mastery.*;
import katarem.lolapi.api.item.*;
import katarem.lolapi.services.*;
import katarem.lolapi.api.Summoner;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
        final String API_KEY = "RGAPI-cec537e5-5c13-4c01-8c12-57b2c7d285c7";
        final String lang = "es_ES";
        SummonerService sService = new SummonerService(API_KEY, "euw1");

        Summoner yo = sService.getSummoner("Tuernø");
        MatchService mService = new MatchService(API_KEY, "europe");
        ArrayList<String> gameIds = mService.getGames(yo.getPuuid(), API_KEY);
        // System.out.println(gameIds.get(0));
        ArrayList<Mastery> masteries = sService.getMateries(yo.getId());
        
        LoLService lService = new LoLService();
        Map<String, Champion> campeones = lService.getChampionsData(lService.getLastVersion(), lang).getChampions();
        Map<String, Item> items;
        try {
            items = lService.getItemsData(API_KEY, lang).getData();
            System.out.println(items.get("1007").getName());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // for (Mastery maestria : masteries) {
        //     System.out.println("Maestría " + maestria.getChampionLevel() + " " + getChamp(campeones.values(), maestria.getChampionId().toString()) + ": " + maestria.getChampionPoints() + " puntos");
        // }

       



    }

    private static String getChamp(Collection<Champion> campeones, String id){
        String result = "null";
        for (Champion campeon : campeones) {
            if(campeon.getKey().equals(id)){
                result = campeon.getName();
                break;
            }
        }
        return result;
    }
}
