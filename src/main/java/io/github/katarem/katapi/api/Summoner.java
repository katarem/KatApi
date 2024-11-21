package io.github.katarem.katapi.api;

/***
 * JavaBean to get the Summoner data
 */
public class Summoner {
    String gameName;
    String tagLine;
    String id;
    String puuid;
    String profileIconId;
    String summonerLevel;

    public String getTagLine() {
        return tagLine;
    }

    public void setTagLine(String tagLine) {
        this.tagLine = tagLine;
    }

    public String getName() {
        return gameName;
    }

    public void setName(String name) {
        this.gameName = name;
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
        return "Summoner [gameName=" + gameName + ", tagLine=" + tagLine + ", id=" + id + ", puuid=" + puuid + ", profileIconId=" + profileIconId
                + ", summonerLevel=" + summonerLevel + "]";
    }

}
