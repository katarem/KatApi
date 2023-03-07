package katarem.lolapi.services;

import java.util.ArrayList;

import katarem.lolapi.api.game.GameInfo;
import katarem.lolapi.api.game.LeagueEntry;
import katarem.lolapi.api.mastery.ChampionData;
import katarem.lolapi.api.mastery.Mastery;
import katarem.lolapi.api.Summoner;
import katarem.lolapi.api.item.ItemData;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/***
 * Interface for Services.
 * Communicates the {@link SummonerService} & {@link MatchService} with the Riot API's calls.
 * @author katarem
 * @version 1.0 March 3rd 2023
 */
interface LoLInterface {
    
    @GET("summoner/v4/summoners/by-name/{summonerName}")
    public Call<Summoner> getSummoner(@Path("summonerName") String summonerName, @Query("api_key") String API_KEY);

    @GET("match/v5/matches/by-puuid/{puuid}/ids")
    public Call<ArrayList<String>> getGames(@Path("puuid") String puuid, @Query("api_key") String API_KEY);

    @GET("match/v5/matches/{matchId}")
    public Call<GameInfo> getGame(@Path("matchId") String matchId, @Query("api_key") String API_KEY);

    @GET("league/v4/entries/by-summoner/{encryptedSummonerId}")
    public Call<ArrayList<LeagueEntry>> getElos(@Path("encryptedSummonerId") String summonerId, @Query("api_key") String API_KEY);

    @GET("champion-mastery/v4/champion-masteries/by-summoner/{encryptedSummonerId}")
    public Call<ArrayList<Mastery>> getMasteries(@Path("encryptedSummonerId") String summonerId, @Query("api_key") String API_KEY);

    @GET("api/versions.json")
    public Call<ArrayList<String>> getVersions();

    @GET("cdn/{version}/data/{lang}/champion.json")
    public Call<ChampionData> getChampionsData(@Path("version") String version, @Path("lang") String lang);

    @GET("cdn/{version}/data/{lang}/item.json")
    public Call<ItemData> getItemsData(@Path("version") String version, @Path("lang") String lang);

}
