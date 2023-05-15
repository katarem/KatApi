
package io.github.katarem.katapi.api.spectator;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Perks {

    @SerializedName("perkIds")
    @Expose
    private List<Integer> perkIds;
    @SerializedName("perkStyle")
    @Expose
    private Integer perkStyle;
    @SerializedName("perkSubStyle")
    @Expose
    private Integer perkSubStyle;

    public List<Integer> getPerkIds() {
        return perkIds;
    }

    public void setPerkIds(List<Integer> perkIds) {
        this.perkIds = perkIds;
    }

    public Integer getPerkStyle() {
        return perkStyle;
    }

    public void setPerkStyle(Integer perkStyle) {
        this.perkStyle = perkStyle;
    }

    public Integer getPerkSubStyle() {
        return perkSubStyle;
    }

    public void setPerkSubStyle(Integer perkSubStyle) {
        this.perkSubStyle = perkSubStyle;
    }

}
