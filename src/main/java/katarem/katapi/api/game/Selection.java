
package katarem.katapi.api.game;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Selection {

    @SerializedName("perk")
    @Expose
    private Integer perk;
    @SerializedName("var1")
    @Expose
    private Integer var1;
    @SerializedName("var2")
    @Expose
    private Integer var2;
    @SerializedName("var3")
    @Expose
    private Integer var3;

    public Integer getPerk() {
        return perk;
    }

    public void setPerk(Integer perk) {
        this.perk = perk;
    }

    public Integer getVar1() {
        return var1;
    }

    public void setVar1(Integer var1) {
        this.var1 = var1;
    }

    public Integer getVar2() {
        return var2;
    }

    public void setVar2(Integer var2) {
        this.var2 = var2;
    }

    public Integer getVar3() {
        return var3;
    }

    public void setVar3(Integer var3) {
        this.var3 = var3;
    }

}
