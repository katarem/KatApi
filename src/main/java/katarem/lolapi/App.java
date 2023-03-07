package katarem.lolapi;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import katarem.lolapi.api.mastery.*;
import katarem.lolapi.api.item.*;
import katarem.lolapi.services.*;
import katarem.lolapi.api.Summoner;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
        final String API_KEY = "RGAPI-95244b4a-0316-4135-a607-2fe4251cd59b";
        final String lang = "es_ES";
        SummonerService sService = new SummonerService(API_KEY, "euw1");

        Summoner yo = sService.getSummoner("ęndless pain");

        ArrayList<Mastery> masteries = sService.getMateries(yo.getId());

        LoLService lService = new LoLService();

        Map<String, Item> items;
        try {
            items = lService.getItemsData(API_KEY, lang).getData();
            System.out.println(items.get("1007").getName());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

       



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
