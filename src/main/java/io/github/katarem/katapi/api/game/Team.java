
package io.github.katarem.katapi.api.game;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Represents a team inside a League Match
 * @see Participant
 */
public class Team {

    @SerializedName("bans")
    @Expose
    private List<Ban> bans;
    @SerializedName("objectives")
    @Expose
    private Objectives objectives;
    @SerializedName("teamId")
    @Expose
    private Integer teamId;
    @SerializedName("win")
    @Expose
    private Boolean win;

    public List<Ban> getBans() {
        return bans;
    }

    public void setBans(List<Ban> bans) {
        this.bans = bans;
    }

    public Objectives getObjectives() {
        return objectives;
    }

    public void setObjectives(Objectives objectives) {
        this.objectives = objectives;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public Boolean getWin() {
        return win;
    }

    public void setWin(Boolean win) {
        this.win = win;
    }

}
