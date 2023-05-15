package io.github.katarem.katapi.api.game;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/***
 * JavaBean to get general information of a {@link GameInfo}
 */

public class Info {

    @SerializedName("gameCreation")
    @Expose
    private Long gameCreation;
    @SerializedName("gameDuration")
    @Expose
    private Long gameDuration;
    @SerializedName("gameEndTimestamp")
    @Expose
    private Long gameEndTimestamp;
    @SerializedName("gameId")
    @Expose
    private Long gameId;
    @SerializedName("gameMode")
    @Expose
    private String gameMode;
    @SerializedName("gameName")
    @Expose
    private String gameName;
    @SerializedName("gameStartTimestamp")
    @Expose
    private Long gameStartTimestamp;
    @SerializedName("gameType")
    @Expose
    private String gameType;
    @SerializedName("gameVersion")
    @Expose
    private String gameVersion;
    @SerializedName("mapId")
    @Expose
    private Integer mapId;
    @SerializedName("participants")
    @Expose
    private List<Participant> participants;
    @SerializedName("platformId")
    @Expose
    private String platformId;
    @SerializedName("queueId")
    @Expose
    private Integer queueId;
    @SerializedName("teams")
    @Expose
    private List<Team> teams;
    @SerializedName("tournamentCode")
    @Expose
    private String tournamentCode;

    public Long getGameCreation() {
        return gameCreation;
    }

    public void setGameCreation(Long gameCreation) {
        this.gameCreation = gameCreation;
    }

    public Long getGameDuration() {
        return gameDuration;
    }

    public void setGameDuration(Long gameDuration) {
        this.gameDuration = gameDuration;
    }

    public Long getGameEndTimestamp() {
        return gameEndTimestamp;
    }

    public void setGameEndTimestamp(Long gameEndTimestamp) {
        this.gameEndTimestamp = gameEndTimestamp;
    }

    public Long getGameId() {
        return gameId;
    }

    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }

    public String getGameMode() {
        return gameMode;
    }

    public void setGameMode(String gameMode) {
        this.gameMode = gameMode;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public Long getGameStartTimestamp() {
        return gameStartTimestamp;
    }

    public void setGameStartTimestamp(Long gameStartTimestamp) {
        this.gameStartTimestamp = gameStartTimestamp;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public String getGameVersion() {
        return gameVersion;
    }

    public void setGameVersion(String gameVersion) {
        this.gameVersion = gameVersion;
    }

    public Integer getMapId() {
        return mapId;
    }

    public void setMapId(Integer mapId) {
        this.mapId = mapId;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }

    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    public Integer getQueueId() {
        return queueId;
    }

    public void setQueueId(Integer queueId) {
        this.queueId = queueId;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    public String getTournamentCode() {
        return tournamentCode;
    }

    public void setTournamentCode(String tournamentCode) {
        this.tournamentCode = tournamentCode;
    }

}
