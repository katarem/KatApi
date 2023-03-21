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

    
}
