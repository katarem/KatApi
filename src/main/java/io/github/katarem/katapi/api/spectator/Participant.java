
package io.github.katarem.katapi.api.spectator;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Represents a player inside a League Match
 * @see CurrentGame
 */
public class Participant {

    @SerializedName("teamId")
    @Expose
    private Integer teamId;
    @SerializedName("spell1Id")
    @Expose
    private Integer spell1Id;
    @SerializedName("spell2Id")
    @Expose
    private Integer spell2Id;
    @SerializedName("championId")
    @Expose
    private Integer championId;
    @SerializedName("profileIconId")
    @Expose
    private Integer profileIconId;
    @SerializedName("summonerName")
    @Expose
    private String summonerName;
    @SerializedName("bot")
    @Expose
    private Boolean bot;
    @SerializedName("summonerId")
    @Expose
    private String summonerId;
    @SerializedName("gameCustomizationObjects")
    @Expose
    private List<Object> gameCustomizationObjects;
    @SerializedName("perks")
    @Expose
    private Perks perks;

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public Integer getSpell1Id() {
        return spell1Id;
    }

    public void setSpell1Id(Integer spell1Id) {
        this.spell1Id = spell1Id;
    }

    public Integer getSpell2Id() {
        return spell2Id;
    }

    public void setSpell2Id(Integer spell2Id) {
        this.spell2Id = spell2Id;
    }

    public Integer getChampionId() {
        return championId;
    }

    public void setChampionId(Integer championId) {
        this.championId = championId;
    }

    public Integer getProfileIconId() {
        return profileIconId;
    }

    public void setProfileIconId(Integer profileIconId) {
        this.profileIconId = profileIconId;
    }

    public String getSummonerName() {
        return summonerName;
    }

    public void setSummonerName(String summonerName) {
        this.summonerName = summonerName;
    }

    public Boolean getBot() {
        return bot;
    }

    public void setBot(Boolean bot) {
        this.bot = bot;
    }

    public String getSummonerId() {
        return summonerId;
    }

    public void setSummonerId(String summonerId) {
        this.summonerId = summonerId;
    }

    public List<Object> getGameCustomizationObjects() {
        return gameCustomizationObjects;
    }

    public void setGameCustomizationObjects(List<Object> gameCustomizationObjects) {
        this.gameCustomizationObjects = gameCustomizationObjects;
    }

    public Perks getPerks() {
        return perks;
    }

    public void setPerks(Perks perks) {
        this.perks = perks;
    }

}
