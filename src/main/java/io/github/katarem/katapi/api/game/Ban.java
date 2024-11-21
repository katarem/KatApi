
package io.github.katarem.katapi.api.game;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 * Represents a Ban from Champion Select
 */
public class Ban {

    @SerializedName("championId")
    @Expose
    private Integer championId;
    @SerializedName("pickTurn")
    @Expose
    private Integer pickTurn;

    public Integer getChampionId() {
        return championId;
    }

    public void setChampionId(Integer championId) {
        this.championId = championId;
    }

    public Integer getPickTurn() {
        return pickTurn;
    }

    public void setPickTurn(Integer pickTurn) {
        this.pickTurn = pickTurn;
    }

}
