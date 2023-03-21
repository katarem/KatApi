package katarem.lolapi.api.item;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Item {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("colloq")
    @Expose
    private String colloq;
    @SerializedName("plaintext")
    @Expose
    private String plaintext;
    @SerializedName("into")
    @Expose
    private List<String> into;
    @SerializedName("image")
    @Expose
    private Image image;
    @SerializedName("gold")
    @Expose
    private Gold gold;
    @SerializedName("tags")
    @Expose
    private List<String> tags;
    @SerializedName("maps")
    @Expose
    private Map<String, Boolean> maps;
    @SerializedName("stats")
    @Expose
    private Stats stats;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getColloq() {
        return colloq;
    }

    public void setColloq(String colloq) {
        this.colloq = colloq;
    }

    public String getPlaintext() {
        return plaintext;
    }

    public void setPlaintext(String plaintext) {
        this.plaintext = plaintext;
    }

    public List<String> getInto() {
        return into;
    }

    public void setInto(List<String> into) {
        this.into = into;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Gold getGold() {
        return gold;
    }

    public void setGold(Gold gold) {
        this.gold = gold;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Map<String, Boolean> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Boolean> maps){
        this.maps = maps;
    }

    public void setMaps(String key, Boolean value) {
        maps.put(key, value);
    }
}