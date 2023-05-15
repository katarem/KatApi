
package katarem.katapi.api.spectator;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CurrentGame {

    @SerializedName("gameId")
    @Expose
    private Long gameId;
    @SerializedName("mapId")
    @Expose
    private Integer mapId;
    @SerializedName("gameMode")
    @Expose
    private String gameMode;
    @SerializedName("gameType")
    @Expose
    private String gameType;
    @SerializedName("gameQueueConfigId")
    @Expose
    private Integer gameQueueConfigId;
    @SerializedName("participants")
    @Expose
    private List<Participant> participants;
    @SerializedName("observers")
    @Expose
    private Observers observers;
    @SerializedName("platformId")
    @Expose
    private String platformId;
    @SerializedName("bannedChampions")
    @Expose
    private List<Object> bannedChampions;
    @SerializedName("gameStartTime")
    @Expose
    private Long gameStartTime;
    @SerializedName("gameLength")
    @Expose
    private Integer gameLength;

    public Long getGameId() {
        return gameId;
    }

    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }

    public Integer getMapId() {
        return mapId;
    }

    public void setMapId(Integer mapId) {
        this.mapId = mapId;
    }

    public String getGameMode() {
        return gameMode;
    }

    public void setGameMode(String gameMode) {
        this.gameMode = gameMode;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public Integer getGameQueueConfigId() {
        return gameQueueConfigId;
    }

    public void setGameQueueConfigId(Integer gameQueueConfigId) {
        this.gameQueueConfigId = gameQueueConfigId;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }

    public Observers getObservers() {
        return observers;
    }

    public void setObservers(Observers observers) {
        this.observers = observers;
    }

    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    public List<Object> getBannedChampions() {
        return bannedChampions;
    }

    public void setBannedChampions(List<Object> bannedChampions) {
        this.bannedChampions = bannedChampions;
    }

    public Long getGameStartTime() {
        return gameStartTime;
    }

    public void setGameStartTime(Long gameStartTime) {
        this.gameStartTime = gameStartTime;
    }

    public Integer getGameLength() {
        return gameLength;
    }

    public void setGameLength(Integer gameLength) {
        this.gameLength = gameLength;
    }

}
