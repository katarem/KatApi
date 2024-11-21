package io.github.katarem.katapi.api.mastery;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 * Represents a Summoner's mastery
 * @see ChampionData
 */
public class Mastery {

    @SerializedName("championId")
    @Expose
    private Long championId;
    @SerializedName("championLevel")
    @Expose
    private Long championLevel;
    @SerializedName("championPoints")
    @Expose
    private Long championPoints;
    @SerializedName("lastPlayTime")
    @Expose
    private Long lastPlayTime;
    @SerializedName("championPointsSinceLastLevel")
    @Expose
    private Long championPointsSinceLastLevel;
    @SerializedName("championPointsUntilNextLevel")
    @Expose
    private Long championPointsUntilNextLevel;
    @SerializedName("chestGranted")
    @Expose
    private Boolean chestGranted = false;
    @SerializedName("tokensEarned")
    @Expose
    private Long tokensEarned;
    @SerializedName("summonerId")
    @Expose
    private String summonerId;

    public Long getChampionId() {
        return championId;
    }

    public void setChampionId(Long championId) {
        this.championId = championId;
    }

    public Long getChampionLevel() {
        return championLevel;
    }

    public void setChampionLevel(Long championLevel) {
        this.championLevel = championLevel;
    }

    public Long getChampionPoints() {
        return championPoints;
    }

    public void setChampionPoints(Long championPoints) {
        this.championPoints = championPoints;
    }

    public Long getLastPlayTime() {
        return lastPlayTime;
    }

    public void setLastPlayTime(Long lastPlayTime) {
        this.lastPlayTime = lastPlayTime;
    }

    public Long getChampionPointsSinceLastLevel() {
        return championPointsSinceLastLevel;
    }

    public void setChampionPointsSinceLastLevel(Long championPointsSinceLastLevel) {
        this.championPointsSinceLastLevel = championPointsSinceLastLevel;
    }

    public Long getChampionPointsUntilNextLevel() {
        return championPointsUntilNextLevel;
    }

    public void setChampionPointsUntilNextLevel(Long championPointsUntilNextLevel) {
        this.championPointsUntilNextLevel = championPointsUntilNextLevel;
    }

    public Boolean getChestGranted() {
        return chestGranted;
    }

    public void setChestGranted(Boolean chestGranted) {
        this.chestGranted = chestGranted;
    }

    public Long getTokensEarned() {
        return tokensEarned;
    }

    public void setTokensEarned(Long tokensEarned) {
        this.tokensEarned = tokensEarned;
    }

    public String getSummonerId() {
        return summonerId;
    }

    public void setSummonerId(String summonerId) {
        this.summonerId = summonerId;
    }

    @Override
    public String toString() {
        return "Mastery [championId=" + championId + ", championLevel=" + championLevel + ", championPoints="
                + championPoints + ", chestGranted=" + chestGranted + ", summonerId=" + summonerId + "]";
    }

}