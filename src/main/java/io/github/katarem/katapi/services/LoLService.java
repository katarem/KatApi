package io.github.katarem.katapi.services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

import com.google.gson.Gson;

import io.github.katarem.katapi.api.Summoner;
import io.github.katarem.katapi.api.game.GameInfo;
import io.github.katarem.katapi.api.game.LeagueEntry;
import io.github.katarem.katapi.api.item.ItemData;
import io.github.katarem.katapi.api.mastery.Champion;
import io.github.katarem.katapi.api.mastery.ChampionData;
import io.github.katarem.katapi.api.mastery.Mastery;
import io.github.katarem.katapi.api.param.GameParam;
import io.github.katarem.katapi.api.spectator.CurrentGame;
import io.github.katarem.katapi.constants.Langs;
import io.github.katarem.katapi.constants.Platform;
import io.github.katarem.katapi.constants.Queue;
import io.github.katarem.katapi.constants.Region;
import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/***
 * Service to get the different calls you have from the API.
 * 
 * @author katarem
 * @version 1.0 16th may 2023
 */

public class LoLService {

    private Gson gson = new Gson();
    private String BASE_URL = "https://ddragon.leagueoflegends.com/";
    private static String API_KEY;
    private LoLInterface service;
    private String version;
    private String lang;
    private Platform platform;
    private Region region;
    private Summoner summoner;

    public static class Builder {
        private String version;
        private String lang;
        private Summoner summoner;
        private Platform platform;
        private Region region;

        /***
         * Set game target version. If you don't know which version is the last, you can
         * use the getLastVersion when the object is built.
         * 
         * @param version
         */
        public Builder setVersion(String version) {
            this.version = version;
            return this;
        }

        /**
         * Set the language used for the received data. All of them are available on
         * {@link Langs}
         * 
         * @param lang
         */
        public Builder setLang(Langs lang) {
            this.lang = lang.lang;
            return this;
        }

        /***
         * Set the platform used for the search. All platforms are available on
         * {@link Platform}
         * 
         * @param platform
         */
        public Builder setPlatform(Platform platform) {
            this.platform = platform;
            return this;
        }

        /***
         * Set the desired game region to use. All regions are available on
         * {@link Region}
         * 
         * @param region
         * @return
         */
        public Builder setRegion(Region region) {
            this.region = region;
            return this;
        }

        /**
         * Sets up the service to point at a summoner. It needs to have a selected
         * {@link Platform}
         * BEFORE calling this part of the builder.
         * 
         * @param summName - Summoner Name
         * @throws Exception
         */
        public Builder forSummoner(String summName, String tagLine) throws Exception {
            if (platform == null)
                throw new Exception("You have to set up the platform before!");
            summoner = new SummonerService.Builder(LoLService.API_KEY)
                    .setPlatform(platform)
                    .build()
                    .getSummoner(summName, tagLine);
            summoner.setName(summName);
            summoner.setTagLine(tagLine);
            return this;
        }

        /**
         * Builds the service for its use.
         * 
         * @throws IOException
         */
        public LoLService build() throws IOException {
            return new LoLService(this);
        }
    }

    private LoLService(Builder builder) throws IOException {
        ConnectionPool pool = new ConnectionPool(1, 5, TimeUnit.SECONDS);

        OkHttpClient client = new OkHttpClient.Builder()
                .connectionPool(pool)
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();
        service = retrofit.create(LoLInterface.class);

        if (builder.lang != null)
            lang = builder.lang;
        if (builder.version != null)
            version = builder.version;
        if (builder.summoner != null)
            summoner = builder.summoner;
        if (builder.region != null)
            region = builder.region;
        if (builder.platform != null)
            platform = builder.platform;
    }

    public static void setApiKey(String API_KEY) {
        LoLService.API_KEY = API_KEY;
    }

    /**
     * Returns the pointed Summoner.
     * 
     * @return Summoner
     */
    public Summoner getSummoner() {
        return summoner;
    }

    /**
     * Returns a summoner by its name and tag line. It needs to have a selected
     * {@link Platform} BEFORE calling this part of the builder.
     * 
     * @return Summoner
     * @throws IOException
     */
    public Summoner getSummoner(String summName, String tagLine, Platform platform) throws IOException {
        if (platform == null && this.platform == null)
            throw new IOException("You have to set the platform first!");
        if (platform == null)
            platform = this.platform;
        Summoner summoner = new SummonerService.Builder(API_KEY)
                .setPlatform(platform)
                .build()
                .getSummoner(summName, tagLine);
        return summoner;
    }

    /**
     * Returns a List of the different elos that the pointed Summoner has
     * 
     * @return ArrayList of elos
     * @throws Exception
     */
    public ArrayList<LeagueEntry> getElos(Platform platform) throws Exception {
        if (platform == null && this.platform == null)
            throw new Exception("You have to set the platform first!");
        if (platform == null)
            platform = this.platform;
        ArrayList<LeagueEntry> elos = new SummonerService.Builder(API_KEY)
                .setPlatform(platform)
                .build()
                .getElos(summoner.getId());
        return elos;
    }

    public LeagueEntry getElo(Queue queue, Platform platform) throws Exception {
        if (platform == null && this.platform == null)
            throw new Exception("You have to set the platform first!");
        if (platform == null)
            platform = this.platform;
        ArrayList<LeagueEntry> elos = getElos(platform);
        LeagueEntry elo = elos.stream().filter(e -> e.getQueueType().equals(queue.name())).findFirst()
                .orElseGet(LeagueEntry::sinElo);
        return elo;
    }

    public ArrayList<String> getVersions() throws Exception {
        Response<ArrayList<String>> response = service
                .getVersions()
                .execute();
        assertResponse(response);
        ArrayList<String> versions = response.body();
        return versions;
    }

    public String getLastVersion() throws Exception {
        ArrayList<String> versions = getVersions();
        return versions.getFirst();
    }

    public Optional<Champion> getChampion(String id, Langs lang) throws Exception {
        if (lang == null && this.lang == null)
            throw new Exception("You have to set the lang first!");
        if (lang == null)
            lang = Langs.ENGLISH_UK;
        Optional<Champion> champ = getChampions(lang).stream().filter(e -> e.getKey().equals(id)).findFirst();
        return champ;
    }

    public Collection<Champion> getChampions(Langs lang) throws Exception {
        if (this.version == null)
            this.version = getLastVersion();
        else if (lang == null && this.lang == null)
            throw new Exception("You have to set the lang first!");
        else if (lang == null)
            lang = Langs.ENGLISH_UK;
        Response<ChampionData> response = service
                .getChampionsData(version, lang.lang)
                .execute();
        assertResponse(response);
        ChampionData champions = response.body();
        Collection<Champion> champs = champions.getChampions().values();
        return champs;
    }

    public ItemData getItemsData(Langs lang, String version) throws Exception {
        if (version == null && this.version == null)
            throw new Exception("You have to set the version first!");
        if (version == null)
            version = this.version;
        else if (lang == null && this.lang == null)
            throw new Exception("You have to set the lang first!");
        else if (lang == null)
            lang = Langs.ENGLISH_UK;
        Response<ItemData> response = service
                .getItemsData(version, lang.lang)
                .execute();
        assertResponse(response);
        ItemData items = response.body();
        return items;
    }

    public ArrayList<String> getGames(GameParam params) throws Exception {
        ArrayList<String> history = new MatchService.Builder()
                .setRegion(region)
                .setApiKey(API_KEY)
                .build()
                .getGames(params);
        return history;
    }

    public GameInfo getGame(String matchId) throws Exception {

        GameInfo match = new MatchService.Builder()
                .setRegion(region)
                .setApiKey(API_KEY)
                .build()
                .getGame(matchId);

        return match;
    }

    public ArrayList<Mastery> getMasteries(Platform platform) throws Exception {
        if (platform == null && this.platform == null)
            throw new Exception("You have to set the platform first!");
        if (platform == null)
            platform = this.platform;
        ArrayList<Mastery> masteries = new SummonerService.Builder(API_KEY)
                .setPlatform(platform)
                .build()
                .getMasteries(summoner.getPuuid());
        masteries.stream().forEach(m -> m.setSummonerId(summoner.getId()));
        return masteries;
    }

    public Optional<CurrentGame> getCurrentGame(Platform platform) throws Exception {
        if (platform == null && this.platform == null)
            throw new Exception("You have to set the platform first!");
        if (platform == null)
            platform = this.platform;
        Optional<CurrentGame> currentGame = Optional.ofNullable(new SummonerService.Builder(API_KEY)
                .setPlatform(platform)
                .build()
                .getCurrentGame(summoner.getPuuid()));
        return currentGame;
    }

    public void setSummoner(Summoner summoner) {
        this.summoner = summoner;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    private void assertResponse(Response<?> response) throws Exception {
        if (!response.isSuccessful()) {
            ErrorMessage error = gson.fromJson(response.errorBody().string(), ErrorMessage.class);
            throw new Exception(error.getMessage());
        }
    }

}
