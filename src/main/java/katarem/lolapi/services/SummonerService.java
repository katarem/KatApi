package katarem.lolapi.services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import katarem.lolapi.api.game.LeagueEntry;
import katarem.lolapi.api.mastery.Mastery;
import katarem.lolapi.api.Summoner;
import retrofit2.Response;

import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/***
 * Service for Summoner & LeagueEntry obtaining through the Riot's Summoner v4 API and League v4 API.
 * Collects the Summoner  that a {@link Summoner} has played and the corresponding {@link LeagueEntry}.  
 * @author katarem
 * @version 1.0 March 3rd 2023
 */
public class SummonerService {
    
    private String BASE_URL = "https://euw1.api.riotgames.com/lol/";
    private LoLInterface service;
    private String API_KEY;
    

    public SummonerService(String API_KEY, String region){
        //Adapting the URL to the region
        BASE_URL = String.format("https://%s.api.riotgames.com/lol/", region);
        this.API_KEY = API_KEY;

        //Creating the service
        ConnectionPool pool = new ConnectionPool(1,5,TimeUnit.SECONDS);

        OkHttpClient client = new OkHttpClient.Builder()
                    .connectionPool(pool)
                    .build();

        Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(client)
                    .build();

        service = retrofit.create(LoLInterface.class);
    }

    /***
     * Gets a Summoner from the given name
     * @param summonerName  Summoner Name needed for the search
     * @return summoner if the call fails it will just throw an IOException
     * @throws IOException
     */
    public Summoner getSummoner(String summonerName) throws IOException{
        Response<Summoner> response = service
                .getSummoner(summonerName, API_KEY)
                .execute();
        Summoner summoner = response.body();
        return summoner;
    }

    /***
     * Gets a List of {@link LeagueEntry} from a given SummonerID
     * @param summonerId Summoner ID obtained from the {@link Summoner#getId()} method
     * @return List of LeagueEntries used in the app
     * @throws IOException
     */
    public ArrayList<LeagueEntry> getElos(String summonerId) throws IOException{
        Response<ArrayList<LeagueEntry>> response = service
                .getElos(summonerId, API_KEY)
                .execute();
        ArrayList<LeagueEntry> elos = response.body();
        return elos;
    }

    public ArrayList<Mastery> getMateries(String summonerId) throws IOException{
        Response<ArrayList<Mastery>> response = service
                .getMasteries(summonerId, API_KEY)
                .execute();
        ArrayList<Mastery> masteries = response.body();
        return masteries;
    }
  
	}


