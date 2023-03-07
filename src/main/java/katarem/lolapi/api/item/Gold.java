package katarem.lolapi.api.item;

import com.google.gson.annotations.SerializedName;

public class Gold {
    @SerializedName("base")
    private Double base;
    @SerializedName("purchasable")
    private Boolean purchasable;
    @SerializedName("total")
    private Double total;
    @SerializedName("sell")
    private Double sell;
    
    public Double getBase() {
        return base;
    }
    public void setBase(Double base) {
        this.base = base;
    }
    public Boolean getPurchasable() {
        return purchasable;
    }
    public void setPurchasable(Boolean purchasable) {
        this.purchasable = purchasable;
    }
    public Double getTotal() {
        return total;
    }
    public void setTotal(Double total) {
        this.total = total;
    }
    public Double getSell() {
        return sell;
    }
    public void setSell(Double sell) {
        this.sell = sell;
    }

}
