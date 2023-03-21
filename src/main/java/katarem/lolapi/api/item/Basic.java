
package katarem.lolapi.api.item;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Basic {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("rune")
    @Expose
    private Rune rune;
    @SerializedName("gold")
    @Expose
    private Gold gold;
    @SerializedName("group")
    @Expose
    private String group;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("colloq")
    @Expose
    private String colloq;
    @SerializedName("plaintext")
    @Expose
    private String plaintext;
    @SerializedName("consumed")
    @Expose
    private Boolean consumed;
    @SerializedName("stacks")
    @Expose
    private Integer stacks;
    @SerializedName("depth")
    @Expose
    private Integer depth;
    @SerializedName("consumeOnFull")
    @Expose
    private Boolean consumeOnFull;
    @SerializedName("from")
    @Expose
    private List<Object> from;
    @SerializedName("into")
    @Expose
    private List<Object> into;
    @SerializedName("specialRecipe")
    @Expose
    private Integer specialRecipe;
    @SerializedName("inStore")
    @Expose
    private Boolean inStore;
    @SerializedName("hideFromAll")
    @Expose
    private Boolean hideFromAll;
    @SerializedName("requiredChampion")
    @Expose
    private String requiredChampion;
    @SerializedName("requiredAlly")
    @Expose
    private String requiredAlly;
    @SerializedName("stats")
    @Expose
    private Stats stats;
    @SerializedName("tags")
    @Expose
    private List<Object> tags;
    @SerializedName("maps")
    @Expose
    private Map<String, Boolean> maps;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Rune getRune() {
        return rune;
    }

    public void setRune(Rune rune) {
        this.rune = rune;
    }

    public Gold getGold() {
        return gold;
    }

    public void setGold(Gold gold) {
        this.gold = gold;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
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

    public Boolean getConsumed() {
        return consumed;
    }

    public void setConsumed(Boolean consumed) {
        this.consumed = consumed;
    }

    public Integer getStacks() {
        return stacks;
    }

    public void setStacks(Integer stacks) {
        this.stacks = stacks;
    }

    public Integer getDepth() {
        return depth;
    }

    public void setDepth(Integer depth) {
        this.depth = depth;
    }

    public Boolean getConsumeOnFull() {
        return consumeOnFull;
    }

    public void setConsumeOnFull(Boolean consumeOnFull) {
        this.consumeOnFull = consumeOnFull;
    }

    public List<Object> getFrom() {
        return from;
    }

    public void setFrom(List<Object> from) {
        this.from = from;
    }

    public List<Object> getInto() {
        return into;
    }

    public void setInto(List<Object> into) {
        this.into = into;
    }

    public Integer getSpecialRecipe() {
        return specialRecipe;
    }

    public void setSpecialRecipe(Integer specialRecipe) {
        this.specialRecipe = specialRecipe;
    }

    public Boolean getInStore() {
        return inStore;
    }

    public void setInStore(Boolean inStore) {
        this.inStore = inStore;
    }

    public Boolean getHideFromAll() {
        return hideFromAll;
    }

    public void setHideFromAll(Boolean hideFromAll) {
        this.hideFromAll = hideFromAll;
    }

    public String getRequiredChampion() {
        return requiredChampion;
    }

    public void setRequiredChampion(String requiredChampion) {
        this.requiredChampion = requiredChampion;
    }

    public String getRequiredAlly() {
        return requiredAlly;
    }

    public void setRequiredAlly(String requiredAlly) {
        this.requiredAlly = requiredAlly;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public List<Object> getTags() {
        return tags;
    }

    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

    public Map<String, Boolean> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Boolean> maps) {
        this.maps = maps;
    }

}
