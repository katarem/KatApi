
package katarem.katapi.api.spectator;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Observers {

    @SerializedName("encryptionKey")
    @Expose
    private String encryptionKey;

    public String getEncryptionKey() {
        return encryptionKey;
    }

    public void setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
    }

}
