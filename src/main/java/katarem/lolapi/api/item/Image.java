package katarem.lolapi.api.item;

import com.google.gson.annotations.SerializedName;

public class Image {
    @SerializedName("full")
    private String full;
    @SerializedName("sprite")
    private String sprite;
    @SerializedName("group")
    private String group;
    @SerializedName("x")
    private Double x;
    @SerializedName("y")
    private Double y;
    @SerializedName("w")
    private Double w;
    @SerializedName("h")
    private Double h;
    public String getFull() {
        return full;
    }
    public void setFull(String full) {
        this.full = full;
    }
    public String getSprite() {
        return sprite;
    }
    public void setSprite(String sprite) {
        this.sprite = sprite;
    }
    public String getGroup() {
        return group;
    }
    public void setGroup(String group) {
        this.group = group;
    }
    public Double getX() {
        return x;
    }
    public void setX(Double x) {
        this.x = x;
    }
    public Double getY() {
        return y;
    }
    public void setY(Double y) {
        this.y = y;
    }
    public Double getW() {
        return w;
    }
    public void setW(Double w) {
        this.w = w;
    }
    public Double getH() {
        return h;
    }
    public void setH(Double h) {
        this.h = h;
    }
    
}
