
package io.github.katarem.katapi.api.game;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Objectives {

    @SerializedName("baron")
    @Expose
    private Baron baron;
    @SerializedName("champion")
    @Expose
    private Champion champion;
    @SerializedName("dragon")
    @Expose
    private Dragon dragon;
    @SerializedName("inhibitor")
    @Expose
    private Inhibitor inhibitor;
    @SerializedName("riftHerald")
    @Expose
    private RiftHerald riftHerald;
    @SerializedName("tower")
    @Expose
    private Tower tower;

    public Baron getBaron() {
        return baron;
    }

    public void setBaron(Baron baron) {
        this.baron = baron;
    }

    public Champion getChampion() {
        return champion;
    }

    public void setChampion(Champion champion) {
        this.champion = champion;
    }

    public Dragon getDragon() {
        return dragon;
    }

    public void setDragon(Dragon dragon) {
        this.dragon = dragon;
    }

    public Inhibitor getInhibitor() {
        return inhibitor;
    }

    public void setInhibitor(Inhibitor inhibitor) {
        this.inhibitor = inhibitor;
    }

    public RiftHerald getRiftHerald() {
        return riftHerald;
    }

    public void setRiftHerald(RiftHerald riftHerald) {
        this.riftHerald = riftHerald;
    }

    public Tower getTower() {
        return tower;
    }

    public void setTower(Tower tower) {
        this.tower = tower;
    }

}
