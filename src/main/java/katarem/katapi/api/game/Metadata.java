
package katarem.katapi.api.game;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/***
 * JavaBean to get more specified data from {@link GameInfo}, like the List of
 * {@link Participant} from a game.
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
