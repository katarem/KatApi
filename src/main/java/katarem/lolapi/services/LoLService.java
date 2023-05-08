package katarem.lolapi.services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

import com.google.gson.Gson;

import katarem.lolapi.api.Summoner;
import katarem.lolapi.api.game.GameInfo;
import katarem.lolapi.api.game.LeagueEntry;
import katarem.lolapi.api.item.ItemData;
import katarem.lolapi.api.mastery.Champion;
import katarem.lolapi.api.mastery.ChampionData;
import katarem.lolapi.api.mastery.Mastery;
import katarem.lolapi.constants.Langs;
import katarem.lolapi.constants.Platform;
import katarem.lolapi.constants.Queue;
import katarem.lolapi.constants.Region;
import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

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
        private String API_KEY;
        private Summoner summoner;
        private Platform platform;
        private Region region;

        public Builder() {
            API_KEY = LoLService.API_KEY;
        }

        public Builder setVersion(String version) {
            this.version = version;
            return this;
        }

        public Builder setLang(Langs lang) {
            this.lang = lang.lang;
            return this;
        }

        public Builder setPlatform(Platform platform) {
            this.platform = platform;
            return this;
        }

        public Builder setRegion(Region region) {
            this.region = region;
            return this;
        }

        public Builder forSummoner(String summName) throws IOException {
            summoner = new SummonerService.Builder(LoLService.API_KEY)
                    .setPlatform(platform)
                    .build()
                    .getSummoner(summName);
            return this;
        }

        public LoLService build() throws IOException {
            if (lang == null)
                throw new NullPointerException();
            else if (version == null)
                throw new NullPointerException();
            LoLService l = new LoLService(this);
            return l;
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

        lang = builder.lang;
        version = builder.version;
        summoner = builder.summoner;
        region = builder.region;
        platform = builder.platform;
    }

    public static void setApiKey(String API_KEY) {
        LoLService.API_KEY = API_KEY;
    }

    public Summoner getSummoner() {
        return summoner;
    }

    public ArrayList<LeagueEntry> getElos() throws IOException {
        ArrayList<LeagueEntry> elos = new SummonerService.Builder(API_KEY)
                .setPlatform(platform)
                .build()
                .getElos(summoner.getId());
        return elos;
    }

    public LeagueEntry getElo(Queue queue) throws IOException {
        ArrayList<LeagueEntry> elos = getElos();
        LeagueEntry outElo = null;
        for (LeagueEntry leagueEntry : elos) {
            if (leagueEntry.getQueueType().equals(queue.name())) {
                outElo = leagueEntry;
                break;
            }
        }
        return outElo;
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
        return versions.get(0);
    }

    public Collection<Champion> getChampions() throws Exception {
        Response<ChampionData> response = service
                .getChampionsData(version, lang)
                .execute();
        assertResponse(response);
        ChampionData champions = response.body();
        Collection<Champion> champs = champions.getChampions().values();
        return champs;
    }

    public ItemData getItemsData() throws Exception {
        Response<ItemData> response = service
                .getItemsData(version, lang)
                .execute();
        assertResponse(response);
        ItemData items = response.body();
        return items;
    }

    public ArrayList<String> getGames() throws Exception {
        ArrayList<String> history = new MatchService.Builder()
                .setRegion(region)
                .setApiKey(API_KEY)
                .forSummoner(summoner)
                .build()
                .getGames();

        return history;
    }

    public GameInfo getGame(String matchID) throws Exception {

        GameInfo match = new MatchService.Builder()
                .setRegion(region)
                .setApiKey(API_KEY)
                .forSummoner(summoner)
                .build()
                .getGame(matchID);

        return match;
    }

    public ArrayList<Mastery> getMasteries() throws Exception {
        ArrayList<Mastery> masteries = new SummonerService.Builder(API_KEY)
                .setPlatform(platform)
                .build()
                .getMasteries(summoner.getId());
        return masteries;
    }

    public void setSummoner(Summoner summoner) {
        this.summoner = summoner;
    }

    private void assertResponse(Response<?> response) throws Exception {
        if (!response.isSuccessful()) {
            ErrorMessage error = gson.fromJson(response.errorBody().string(), ErrorMessage.class);
            throw new Exception(error.getMessage());
        }
    }

}
