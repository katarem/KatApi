
package io.github.katarem.katapi.api.game;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Style {

    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("selections")
    @Expose
    private List<Selection> selections;
    @SerializedName("style")
    @Expose
    private Integer style;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Selection> getSelections() {
        return selections;
    }

    public void setSelections(List<Selection> selections) {
        this.selections = selections;
    }

    public Integer getStyle() {
        return style;
    }

    public void setStyle(Integer style) {
        this.style = style;
    }

}
