
package katarem.katapi.api.game;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StatPerks {

    @SerializedName("defense")
    @Expose
    private Integer defense;
    @SerializedName("flex")
    @Expose
    private Integer flex;
    @SerializedName("offense")
    @Expose
    private Integer offense;

    public Integer getDefense() {
        return defense;
    }

    public void setDefense(Integer defense) {
        this.defense = defense;
    }

    public Integer getFlex() {
        return flex;
    }

    public void setFlex(Integer flex) {
        this.flex = flex;
    }

    public Integer getOffense() {
        return offense;
    }

    public void setOffense(Integer offense) {
        this.offense = offense;
    }

}
