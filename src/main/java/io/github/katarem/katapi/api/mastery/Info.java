package io.github.katarem.katapi.api.mastery;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Champion Info
 * @see Champion
 */
public class Info {

    @SerializedName("attack")
    @Expose
    private Integer attack;
    @SerializedName("defense")
    @Expose
    private Integer defense;
    @SerializedName("magic")
    @Expose
    private Integer magic;
    @SerializedName("difficulty")
    @Expose
    private Integer difficulty;

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public Integer getDefense() {
        return defense;
    }

    public void setDefense(Integer defense) {
        this.defense = defense;
    }

    public Integer getMagic() {
        return magic;
    }

    public void setMagic(Integer magic) {
        this.magic = magic;
    }

    public Integer getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Integer difficulty) {
        this.difficulty = difficulty;
    }

}
