package io.github.katarem.katapi.services;

import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

class AccountService {

    static String getPUUID(String summName, String tagLine, String API_KEY) throws IOException {
        var service = initializeService();
        var call = service.getAccount(summName, tagLine, API_KEY);
        return call.execute().body().getPuuid();
    }



    private static LoLInterface initializeService(){
        String BASE_URL = "https://europe.api.riotgames.com/";
        ConnectionPool pool = new ConnectionPool(1, 5, TimeUnit.SECONDS);

        OkHttpClient client = new OkHttpClient.Builder()
                .connectionPool(pool)
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();
        return retrofit.create(LoLInterface.class);
    }



}
