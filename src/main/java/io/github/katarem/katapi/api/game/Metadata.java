
package io.github.katarem.katapi.api.game;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/***
 * Specific data from a Match, like the List of
 * players from a game.
 * @see GameInfo
 * @see Participant
 **/
public class Metadata {

    @SerializedName("dataVersion")
    @Expose
    private String dataVersion;
    @SerializedName("matchId")
    @Expose
    private String matchId;
    @SerializedName("participants")
    @Expose
    private List<String> participants;

    public String getDataVersion() {
        return dataVersion;
    }

    public void setDataVersion(String dataVersion) {
        this.dataVersion = dataVersion;
    }

    public String getMatchId() {
        return matchId;
    }

    public void setMatchId(String matchId) {
        this.matchId = matchId;
    }

    public List<String> getParticipants() {
        return participants;
    }

    public void setParticipants(List<String> participants) {
        this.participants = participants;
    }

}
