package katarem.lolapi.api.item;

import java.util.Map;

import com.google.gson.annotations.SerializedName;

public class ItemData {
    @SerializedName("type")
    private String type;
    @SerializedName("version")
    private String version;
    @SerializedName("data")
    private Map<String,Item> data;

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
    public Map<String, Item> getData() {
        return data;
    }
    public void setData(Map<String, Item> data) {
        this.data = data;
    }

    
}
