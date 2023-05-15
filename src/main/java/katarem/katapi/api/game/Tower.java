
package katarem.katapi.api.game;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Tower {

    @SerializedName("first")
    @Expose
    private Boolean first;
    @SerializedName("kills")
    @Expose
    private Integer kills;

    public Boolean getFirst() {
        return first;
    }

    public void setFirst(Boolean first) {
        this.first = first;
    }

    public Integer getKills() {
        return kills;
    }

    public void setKills(Integer kills) {
        this.kills = kills;
    }

}
