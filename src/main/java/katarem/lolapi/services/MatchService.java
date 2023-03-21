package katarem.lolapi.services;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import com.google.gson.Gson;

import katarem.lolapi.api.game.GameInfo;
import katarem.lolapi.constants.Region;
import katarem.lolapi.api.Summoner;
import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/***
 * Service for match obtaining through the Riot's Match V5 API.
 * Collects the last 20 games that a {@link Summoner} has played.  
 * @author katarem
 * @version 1.0 March 3rd 2023
 */
public class MatchService {
    private String BASE_URL;
    private Gson gson = new Gson();
    private LoLInterface service;
    private String API_KEY;
    private Summoner s;

    public static class Builder{

        private String BASE_URL;
        private String API_KEY;
        private Summoner s;

        public Builder(){

        }

        public Builder setRegion(Region r){
            this.BASE_URL = String.format("https://%S.api.riotgames.com/lol/", r.server);
            return this;
        }

        public Builder setApiKey(String API_KEY){
            this.API_KEY = API_KEY;
            return this;
        }

        public Builder forSummoner(Summoner s){
            this.s = s;
            return this;
        }

        public MatchService build(){
            return new MatchService(this);
        }

    }

    private MatchService(Builder builder){

        //Adapting the url to the region

        this.API_KEY = builder.API_KEY;
        this.BASE_URL = builder.BASE_URL;
        this.s = builder.s;

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
     * Gets a List of gameIds for the desired Summoner
     * @param puuid -> {@link Summoner#getPuuid()} Specifies the Summoner used for the search
     * @return history List of gameIds
     */
    public ArrayList<String> getGames() throws Exception{
        Response<ArrayList<String>> response = service
                .getGames(s.getPuuid(), API_KEY)
                .execute();
        assertResponse(response);
        ArrayList<String> history = response.body();
        return history;
    }
    /***
     * Gets a List of {@link GameInfo} from the gameId we passed through
     * @param matchID this is the gameId, it can be obtained through the {@link MatchService#getGames(String, String)} method
     * @return List of {@link GameInfo}
     * @throws Exception
     */
    public GameInfo getGame(String matchID) throws Exception{
        Response<GameInfo> response = service
                .getGame(matchID, API_KEY)
                .execute();
        assertResponse(response);
        GameInfo match = response.body();
        return match;
    }
    /***
     * Checks if the calls work as expected
     * @param response if it's not successful, {@link ErrorMessage} will handle it
     * @throws Exception
     */
    private void assertResponse(Response<?> response) throws Exception {
		if (!response.isSuccessful()) {
		ErrorMessage error = gson.fromJson(response.errorBody().string(), ErrorMessage.class);
			throw new Exception(error.getMessage());
		}
	}
}
