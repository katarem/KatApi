package io.github.katarem.katapi.api.item;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 * Represents the item's gold costs
 * @see Item
 */
public class Gold {

    @SerializedName("base")
    @Expose
    private Integer base;
    @SerializedName("total")
    @Expose
    private Integer total;
    @SerializedName("sell")
    @Expose
    private Integer sell;
    @SerializedName("purchasable")
    @Expose
    private Boolean purchasable;

    public Integer getBase() {
        return base;
    }

    public void setBase(Integer base) {
        this.base = base;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getSell() {
        return sell;
    }

    public void setSell(Integer sell) {
        this.sell = sell;
    }

    public Boolean getPurchasable() {
        return purchasable;
    }

    public void setPurchasable(Boolean purchasable) {
        this.purchasable = purchasable;
    }

}
