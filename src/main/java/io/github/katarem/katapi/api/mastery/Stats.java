package io.github.katarem.katapi.api.mastery;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Stats {

    @SerializedName("hp")
    @Expose
    private Double hp;
    @SerializedName("hpperlevel")
    @Expose
    private Double hpperlevel;
    @SerializedName("mp")
    @Expose
    private Double mp;
    @SerializedName("mpperlevel")
    @Expose
    private Double mpperlevel;
    @SerializedName("movespeed")
    @Expose
    private Double movespeed;
    @SerializedName("armor")
    @Expose
    private Double armor;
    @SerializedName("armorperlevel")
    @Expose
    private Double armorperlevel;
    @SerializedName("spellblock")
    @Expose
    private Double spellblock;
    @SerializedName("spellblockperlevel")
    @Expose
    private Double spellblockperlevel;
    @SerializedName("attackrange")
    @Expose
    private Double attackrange;
    @SerializedName("hpregen")
    @Expose
    private Double hpregen;
    @SerializedName("hpregenperlevel")
    @Expose
    private Double hpregenperlevel;
    @SerializedName("mpregen")
    @Expose
    private Double mpregen;
    @SerializedName("mpregenperlevel")
    @Expose
    private Double mpregenperlevel;
    @SerializedName("crit")
    @Expose
    private Double crit;
    @SerializedName("critperlevel")
    @Expose
    private Double critperlevel;
    @SerializedName("attackdamage")
    @Expose
    private Double attackdamage;
    @SerializedName("attackdamageperlevel")
    @Expose
    private Double attackdamageperlevel;
    @SerializedName("attackspeedperlevel")
    @Expose
    private Double attackspeedperlevel;
    @SerializedName("attackspeed")
    @Expose
    private Double attackspeed;

    public Double getHp() {
        return hp;
    }

    public void setHp(Double hp) {
        this.hp = hp;
    }

    public Double getHpperlevel() {
        return hpperlevel;
    }

    public void setHpperlevel(Double hpperlevel) {
        this.hpperlevel = hpperlevel;
    }

    public Double getMp() {
        return mp;
    }

    public void setMp(Double mp) {
        this.mp = mp;
    }

    public Double getMpperlevel() {
        return mpperlevel;
    }

    public void setMpperlevel(Double mpperlevel) {
        this.mpperlevel = mpperlevel;
    }

    public Double getMovespeed() {
        return movespeed;
    }

    public void setMovespeed(Double movespeed) {
        this.movespeed = movespeed;
    }

    public Double getArmor() {
        return armor;
    }

    public void setArmor(Double armor) {
        this.armor = armor;
    }

    public Double getArmorperlevel() {
        return armorperlevel;
    }

    public void setArmorperlevel(Double armorperlevel) {
        this.armorperlevel = armorperlevel;
    }

    public Double getSpellblock() {
        return spellblock;
    }

    public void setSpellblock(Double spellblock) {
        this.spellblock = spellblock;
    }

    public Double getSpellblockperlevel() {
        return spellblockperlevel;
    }

    public void setSpellblockperlevel(Double spellblockperlevel) {
        this.spellblockperlevel = spellblockperlevel;
    }

    public Double getAttackrange() {
        return attackrange;
    }

    public void setAttackrange(Double attackrange) {
        this.attackrange = attackrange;
    }

    public Double getHpregen() {
        return hpregen;
    }

    public void setHpregen(Double hpregen) {
        this.hpregen = hpregen;
    }

    public Double getHpregenperlevel() {
        return hpregenperlevel;
    }

    public void setHpregenperlevel(Double hpregenperlevel) {
        this.hpregenperlevel = hpregenperlevel;
    }

    public Double getMpregen() {
        return mpregen;
    }

    public void setMpregen(Double mpregen) {
        this.mpregen = mpregen;
    }

    public Double getMpregenperlevel() {
        return mpregenperlevel;
    }

    public void setMpregenperlevel(Double mpregenperlevel) {
        this.mpregenperlevel = mpregenperlevel;
    }

    public Double getCrit() {
        return crit;
    }

    public void setCrit(Double crit) {
        this.crit = crit;
    }

    public Double getCritperlevel() {
        return critperlevel;
    }

    public void setCritperlevel(Double critperlevel) {
        this.critperlevel = critperlevel;
    }

    public Double getAttackdamage() {
        return attackdamage;
    }

    public void setAttackdamage(Double attackdamage) {
        this.attackdamage = attackdamage;
    }

    public Double getAttackdamageperlevel() {
        return attackdamageperlevel;
    }

    public void setAttackdamageperlevel(Double attackdamageperlevel) {
        this.attackdamageperlevel = attackdamageperlevel;
    }

    public Double getAttackspeedperlevel() {
        return attackspeedperlevel;
    }

    public void setAttackspeedperlevel(Double attackspeedperlevel) {
        this.attackspeedperlevel = attackspeedperlevel;
    }

    public Double getAttackspeed() {
        return attackspeed;
    }

    public void setAttackspeed(Double attackspeed) {
        this.attackspeed = attackspeed;
    }

}
