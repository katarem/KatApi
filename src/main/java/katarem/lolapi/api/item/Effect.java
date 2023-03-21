
package katarem.lolapi.api.item;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Effect {

    @SerializedName("Effect1Amount")
    @Expose
    private String effect1Amount;
    @SerializedName("Effect2Amount")
    @Expose
    private String effect2Amount;
    @SerializedName("Effect3Amount")
    @Expose
    private String effect3Amount;
    @SerializedName("Effect4Amount")
    @Expose
    private String effect4Amount;

    public String getEffect1Amount() {
        return effect1Amount;
    }

    public void setEffect1Amount(String effect1Amount) {
        this.effect1Amount = effect1Amount;
    }

    public String getEffect2Amount() {
        return effect2Amount;
    }

    public void setEffect2Amount(String effect2Amount) {
        this.effect2Amount = effect2Amount;
    }

    public String getEffect3Amount() {
        return effect3Amount;
    }

    public void setEffect3Amount(String effect3Amount) {
        this.effect3Amount = effect3Amount;
    }

    public String getEffect4Amount() {
        return effect4Amount;
    }

    public void setEffect4Amount(String effect4Amount) {
        this.effect4Amount = effect4Amount;
    }

}
