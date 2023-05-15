package katarem.katapi.api.item;

import java.util.Map;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ItemData {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("version")
    @Expose
    private String version;
    @SerializedName("basic")
    @Expose
    private Basic basic;
    @SerializedName("data")
    @Expose
    private Map<String, Item> data;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Basic getBasic() {
        return basic;
    }

    public void setBasic(Basic basic) {
        this.basic = basic;
    }

    public Map<String, Item> getData() {
        return data;
    }

    public void setData(String key, Item item) {
        data.put(key, item);
    }

}
