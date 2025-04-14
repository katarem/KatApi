package io.github.katarem.katapi.services;

import java.util.ArrayList;

import io.github.katarem.katapi.api.RiotAccount;
import io.github.katarem.katapi.api.Summoner;
import io.github.katarem.katapi.api.game.GameInfo;
import io.github.katarem.katapi.api.game.LeagueEntry;
import io.github.katarem.katapi.api.item.ItemData;
import io.github.katarem.katapi.api.mastery.ChampionData;
import io.github.katarem.katapi.api.mastery.Mastery;
import io.github.katarem.katapi.api.spectator.CurrentGame;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/***
 * Interface for Services.
 * Communicates the {@link SummonerService} & {@link MatchService} with the Riot
 * API's calls.
 * 
 * @author katarem
 * @version 1.0 March 3rd 2023
 */
interface LoLInterface {

        // summ names to riot ids -.-
        @GET("riot/account/v1/accounts/by-riot-id/{summonerName}/{tagLine}")
        public Call<RiotAccount> getAccount(@Path("summonerName") String summonerName, @Path("tagLine") String tagLine,
                        @Query("api_key") String API_KEY);

        @GET("lol/summoner/v4/summoners/by-puuid/{summonerPUUID}")
        public Call<Summoner> getSummoner(@Path("summonerPUUID") String summonerPUUID,
                        @Query("api_key") String API_KEY);

        @GET("lol/match/v5/matches/by-puuid/{puuid}/ids")
        public Call<ArrayList<String>> getGames(@Path("puuid") String puuid, @Query("api_key") String API_KEY,
                        @Query("count") Integer count,
                        @Query("startTime") Long startTime,
                        @Query("endTime") Long endTime,
                        @Query("queue") Integer queue,
                        @Query("type") String type,
                        @Query("start") Integer start);

        @GET("lol/match/v5/matches/{matchId}")
        public Call<GameInfo> getGame(
                        @Path("matchId") String matchId,
                        @Query("api_key") String API_KEY);

        @GET("lol/league/v4/entries/by-summoner/{encryptedSummonerId}")
        public Call<ArrayList<LeagueEntry>> getElos(@Path("encryptedSummonerId") String summonerId,
                        @Query("api_key") String API_KEY);

        @GET("lol/champion-mastery/v4/champion-masteries/by-puuid/{encryptedSummonerPUUID}")
        public Call<ArrayList<Mastery>> getMasteries(@Path("encryptedSummonerPUUID") String summonerPUUID,
                        @Query("api_key") String API_KEY);

        @GET("api/versions.json")
        public Call<ArrayList<String>> getVersions();

        @GET("cdn/{version}/data/{lang}/champion.json")
        public Call<ChampionData> getChampionsData(@Path("version") String version, @Path("lang") String lang);

        @GET("cdn/{version}/data/{lang}/item.json")
        public Call<ItemData> getItemsData(@Path("version") String version, @Path("lang") String lang);

        @GET("lol/spectator/v5/active-games/by-summoner/{encryptedSummonerId}")
        public Call<CurrentGame> getCurrentGame(@Path("encryptedSummonerId") String summonerId,
                        @Query("api_key") String API_KEY);

}
