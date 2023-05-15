package io.github.katarem.katapi.api.game;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/***
 * JavaBean to get a League of Legends game's data
 */
public class GameInfo {

    @SerializedName("metadata")
    @Expose
    private Metadata metadata;
    @SerializedName("info")
    @Expose
    private Info info;

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

}
