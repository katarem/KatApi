package katarem.katapi.api;

import katarem.katapi.api.game.LeagueEntry;
import katarem.katapi.constants.Queue;
import katarem.katapi.services.LoLService;

/***
 * JavaBean to get the Summoner data
 */
public class Summoner {
    String name;
    String id;
    String puuid;
    String profileIconId;
    String summonerLevel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPuuid() {
        return puuid;
    }

    public void setPuuid(String puuid) {
        this.puuid = puuid;
    }

    public String getProfileIconId() {
        return profileIconId;
    }

    public void setProfileIconId(String profileIconId) {
        this.profileIconId = profileIconId;
    }

    public String getSummonerLevel() {
        return summonerLevel;
    }

    public void setSummonerLevel(String summonerLevel) {
        this.summonerLevel = summonerLevel;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Summoner [name=" + name + ", id=" + id + ", puuid=" + puuid + ", profileIconId=" + profileIconId
                + ", summonerLevel=" + summonerLevel + "]";
    }

}
