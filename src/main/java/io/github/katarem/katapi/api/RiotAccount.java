package io.github.katarem.katapi.api;

/***
 * @author katarem
 * <p>
 * Corresponding to Summoner names change to Riot ID's we need to store the Riot ID's data
 * </p>
 */
public class RiotAccount {

    private String puuid;
    private String gameName;
    private String tagLine;

    public String getPuuid() {
        return puuid;
    }

    public void setPuuid(String puuid) {
        this.puuid = puuid;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getTagLine() {
        return tagLine;
    }

    public void setTagLine(String tagLine) {
        this.tagLine = tagLine;
    }

    @Override
    public String toString() {
        return "RiotAccount{" +
                "puuid='" + puuid + '\'' +
                ", gameName='" + gameName + '\'' +
                ", tagLine='" + tagLine + '\'' +
                '}';
    }
}
