package katarem.lolapi.api.item;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

public class Item {
    @SerializedName("name")
    private String name;
    @SerializedName("description")
    private String description;
    @SerializedName("plaintext")
    private String plaintext;
    @SerializedName("into")
    private List<String> into;
    @SerializedName("image")
    private Image image;
    @SerializedName("gold")
    private Gold gold;
    @SerializedName("tags")
    private List<String> tags;
    @SerializedName("maps")
    private Map<String, Boolean> maps;
    @SerializedName("stats")
    private Map<String, Double> stats;
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
    public void setMaps(Map<String, Boolean> maps) {
        this.maps = maps;
    }
    public Map<String, Double> getStats() {
        return stats;
    }
    public void setStats(Map<String, Double> stats) {
        this.stats = stats;
    }
    
}
