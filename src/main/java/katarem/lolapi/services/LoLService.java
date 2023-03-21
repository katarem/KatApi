package katarem.lolapi.services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import com.google.gson.Gson;

import katarem.lolapi.api.item.ItemData;
import katarem.lolapi.api.mastery.ChampionData;
import katarem.lolapi.constants.Langs;
import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class LoLService {

    private Gson gson = new Gson();
    private String BASE_URL = "https://ddragon.leagueoflegends.com/";
    private LoLInterface service;
    public LoLService() throws IOException{
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


    public ArrayList<String> getVersions() throws Exception{

        Response<ArrayList<String>> response = service
                .getVersions()
                .execute();
        assertResponse(response);
        ArrayList<String> versions = response.body();
        return versions;
    }


    public String getLastVersion() throws Exception{
        ArrayList<String> versions = getVersions();
        return versions.get(0);
    }

    public ChampionData getChampionsData(String version, Langs lang) throws Exception{
        Response<ChampionData> response = service
                .getChampionsData(version,lang.lang)
                .execute();
        assertResponse(response);
        ChampionData champions = response.body();
        return champions;
    }

    public ItemData getItemsData(String version, Langs lang) throws Exception{
        Response<ItemData> response = service
                .getItemsData(version, lang.lang)
                .execute();
        assertResponse(response);
        ItemData items = response.body();
        return items;
    }

    private void assertResponse(Response<?> response) throws Exception {
		if (!response.isSuccessful()) {
		ErrorMessage error = gson.fromJson(response.errorBody().string(), ErrorMessage.class);
			throw new Exception(error.getMessage());
		}
	}

}
