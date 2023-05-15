
package katarem.katapi.api.item;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Stats {

    @SerializedName("FlatHPPoolMod")
    @Expose
    private Double flatHPPoolMod;
    @SerializedName("rFlatHPModPerLevel")
    @Expose
    private Double rFlatHPModPerLevel;
    @SerializedName("FlatMPPoolMod")
    @Expose
    private Double flatMPPoolMod;
    @SerializedName("rFlatMPModPerLevel")
    @Expose
    private Double rFlatMPModPerLevel;
    @SerializedName("PercentHPPoolMod")
    @Expose
    private Double percentHPPoolMod;
    @SerializedName("PercentMPPoolMod")
    @Expose
    private Double percentMPPoolMod;
    @SerializedName("FlatHPRegenMod")
    @Expose
    private Double flatHPRegenMod;
    @SerializedName("rFlatHPRegenModPerLevel")
    @Expose
    private Double rFlatHPRegenModPerLevel;
    @SerializedName("PercentHPRegenMod")
    @Expose
    private Double percentHPRegenMod;
    @SerializedName("FlatMPRegenMod")
    @Expose
    private Double flatMPRegenMod;
    @SerializedName("rFlatMPRegenModPerLevel")
    @Expose
    private Double rFlatMPRegenModPerLevel;
    @SerializedName("PercentMPRegenMod")
    @Expose
    private Double percentMPRegenMod;
    @SerializedName("FlatArmorMod")
    @Expose
    private Double flatArmorMod;
    @SerializedName("rFlatArmorModPerLevel")
    @Expose
    private Double rFlatArmorModPerLevel;
    @SerializedName("PercentArmorMod")
    @Expose
    private Double percentArmorMod;
    @SerializedName("rFlatArmorPenetrationMod")
    @Expose
    private Double rFlatArmorPenetrationMod;
    @SerializedName("rFlatArmorPenetrationModPerLevel")
    @Expose
    private Double rFlatArmorPenetrationModPerLevel;
    @SerializedName("rPercentArmorPenetrationMod")
    @Expose
    private Double rPercentArmorPenetrationMod;
    @SerializedName("rPercentArmorPenetrationModPerLevel")
    @Expose
    private Double rPercentArmorPenetrationModPerLevel;
    @SerializedName("FlatPhysicalDamageMod")
    @Expose
    private Double flatPhysicalDamageMod;
    @SerializedName("rFlatPhysicalDamageModPerLevel")
    @Expose
    private Double rFlatPhysicalDamageModPerLevel;
    @SerializedName("PercentPhysicalDamageMod")
    @Expose
    private Double percentPhysicalDamageMod;
    @SerializedName("FlatMagicDamageMod")
    @Expose
    private Double flatMagicDamageMod;
    @SerializedName("rFlatMagicDamageModPerLevel")
    @Expose
    private Double rFlatMagicDamageModPerLevel;
    @SerializedName("PercentMagicDamageMod")
    @Expose
    private Double percentMagicDamageMod;
    @SerializedName("FlatMovementSpeedMod")
    @Expose
    private Double flatMovementSpeedMod;
    @SerializedName("rFlatMovementSpeedModPerLevel")
    @Expose
    private Double rFlatMovementSpeedModPerLevel;
    @SerializedName("PercentMovementSpeedMod")
    @Expose
    private Double percentMovementSpeedMod;
    @SerializedName("rPercentMovementSpeedModPerLevel")
    @Expose
    private Double rPercentMovementSpeedModPerLevel;
    @SerializedName("FlatAttackSpeedMod")
    @Expose
    private Double flatAttackSpeedMod;
    @SerializedName("PercentAttackSpeedMod")
    @Expose
    private Double percentAttackSpeedMod;
    @SerializedName("rPercentAttackSpeedModPerLevel")
    @Expose
    private Double rPercentAttackSpeedModPerLevel;
    @SerializedName("rFlatDodgeMod")
    @Expose
    private Double rFlatDodgeMod;
    @SerializedName("rFlatDodgeModPerLevel")
    @Expose
    private Double rFlatDodgeModPerLevel;
    @SerializedName("PercentDodgeMod")
    @Expose
    private Double percentDodgeMod;
    @SerializedName("FlatCritChanceMod")
    @Expose
    private Double flatCritChanceMod;
    @SerializedName("rFlatCritChanceModPerLevel")
    @Expose
    private Double rFlatCritChanceModPerLevel;
    @SerializedName("PercentCritChanceMod")
    @Expose
    private Double percentCritChanceMod;
    @SerializedName("FlatCritDamageMod")
    @Expose
    private Double flatCritDamageMod;
    @SerializedName("rFlatCritDamageModPerLevel")
    @Expose
    private Double rFlatCritDamageModPerLevel;
    @SerializedName("PercentCritDamageMod")
    @Expose
    private Double percentCritDamageMod;
    @SerializedName("FlatBlockMod")
    @Expose
    private Double flatBlockMod;
    @SerializedName("PercentBlockMod")
    @Expose
    private Double percentBlockMod;
    @SerializedName("FlatSpellBlockMod")
    @Expose
    private Double flatSpellBlockMod;
    @SerializedName("rFlatSpellBlockModPerLevel")
    @Expose
    private Double rFlatSpellBlockModPerLevel;
    @SerializedName("PercentSpellBlockMod")
    @Expose
    private Double percentSpellBlockMod;
    @SerializedName("FlatEXPBonus")
    @Expose
    private Double flatEXPBonus;
    @SerializedName("PercentEXPBonus")
    @Expose
    private Double percentEXPBonus;
    @SerializedName("rPercentCooldownMod")
    @Expose
    private Double rPercentCooldownMod;
    @SerializedName("rPercentCooldownModPerLevel")
    @Expose
    private Double rPercentCooldownModPerLevel;
    @SerializedName("rFlatTimeDeadMod")
    @Expose
    private Double rFlatTimeDeadMod;
    @SerializedName("rFlatTimeDeadModPerLevel")
    @Expose
    private Double rFlatTimeDeadModPerLevel;
    @SerializedName("rPercentTimeDeadMod")
    @Expose
    private Double rPercentTimeDeadMod;
    @SerializedName("rPercentTimeDeadModPerLevel")
    @Expose
    private Double rPercentTimeDeadModPerLevel;
    @SerializedName("rFlatGoldPer10Mod")
    @Expose
    private Double rFlatGoldPer10Mod;
    @SerializedName("rFlatMagicPenetrationMod")
    @Expose
    private Double rFlatMagicPenetrationMod;
    @SerializedName("rFlatMagicPenetrationModPerLevel")
    @Expose
    private Double rFlatMagicPenetrationModPerLevel;
    @SerializedName("rPercentMagicPenetrationMod")
    @Expose
    private Double rPercentMagicPenetrationMod;
    @SerializedName("rPercentMagicPenetrationModPerLevel")
    @Expose
    private Double rPercentMagicPenetrationModPerLevel;
    @SerializedName("FlatEnergyRegenMod")
    @Expose
    private Double flatEnergyRegenMod;
    @SerializedName("rFlatEnergyRegenModPerLevel")
    @Expose
    private Double rFlatEnergyRegenModPerLevel;
    @SerializedName("FlatEnergyPoolMod")
    @Expose
    private Double flatEnergyPoolMod;
    @SerializedName("rFlatEnergyModPerLevel")
    @Expose
    private Double rFlatEnergyModPerLevel;
    @SerializedName("PercentLifeStealMod")
    @Expose
    private Double percentLifeStealMod;
    @SerializedName("PercentSpellVampMod")
    @Expose
    private Double percentSpellVampMod;

    public Double getFlatHPPoolMod() {
        return flatHPPoolMod;
    }

    public void setFlatHPPoolMod(Double flatHPPoolMod) {
        this.flatHPPoolMod = flatHPPoolMod;
    }

    public Double getrFlatHPModPerLevel() {
        return rFlatHPModPerLevel;
    }

    public void setrFlatHPModPerLevel(Double rFlatHPModPerLevel) {
        this.rFlatHPModPerLevel = rFlatHPModPerLevel;
    }

    public Double getFlatMPPoolMod() {
        return flatMPPoolMod;
    }

    public void setFlatMPPoolMod(Double flatMPPoolMod) {
        this.flatMPPoolMod = flatMPPoolMod;
    }

    public Double getrFlatMPModPerLevel() {
        return rFlatMPModPerLevel;
    }

    public void setrFlatMPModPerLevel(Double rFlatMPModPerLevel) {
        this.rFlatMPModPerLevel = rFlatMPModPerLevel;
    }

    public Double getPercentHPPoolMod() {
        return percentHPPoolMod;
    }

    public void setPercentHPPoolMod(Double percentHPPoolMod) {
        this.percentHPPoolMod = percentHPPoolMod;
    }

    public Double getPercentMPPoolMod() {
        return percentMPPoolMod;
    }

    public void setPercentMPPoolMod(Double percentMPPoolMod) {
        this.percentMPPoolMod = percentMPPoolMod;
    }

    public Double getFlatHPRegenMod() {
        return flatHPRegenMod;
    }

    public void setFlatHPRegenMod(Double flatHPRegenMod) {
        this.flatHPRegenMod = flatHPRegenMod;
    }

    public Double getrFlatHPRegenModPerLevel() {
        return rFlatHPRegenModPerLevel;
    }

    public void setrFlatHPRegenModPerLevel(Double rFlatHPRegenModPerLevel) {
        this.rFlatHPRegenModPerLevel = rFlatHPRegenModPerLevel;
    }

    public Double getPercentHPRegenMod() {
        return percentHPRegenMod;
    }

    public void setPercentHPRegenMod(Double percentHPRegenMod) {
        this.percentHPRegenMod = percentHPRegenMod;
    }

    public Double getFlatMPRegenMod() {
        return flatMPRegenMod;
    }

    public void setFlatMPRegenMod(Double flatMPRegenMod) {
        this.flatMPRegenMod = flatMPRegenMod;
    }

    public Double getrFlatMPRegenModPerLevel() {
        return rFlatMPRegenModPerLevel;
    }

    public void setrFlatMPRegenModPerLevel(Double rFlatMPRegenModPerLevel) {
        this.rFlatMPRegenModPerLevel = rFlatMPRegenModPerLevel;
    }

    public Double getPercentMPRegenMod() {
        return percentMPRegenMod;
    }

    public void setPercentMPRegenMod(Double percentMPRegenMod) {
        this.percentMPRegenMod = percentMPRegenMod;
    }

    public Double getFlatArmorMod() {
        return flatArmorMod;
    }

    public void setFlatArmorMod(Double flatArmorMod) {
        this.flatArmorMod = flatArmorMod;
    }

    public Double getrFlatArmorModPerLevel() {
        return rFlatArmorModPerLevel;
    }

    public void setrFlatArmorModPerLevel(Double rFlatArmorModPerLevel) {
        this.rFlatArmorModPerLevel = rFlatArmorModPerLevel;
    }

    public Double getPercentArmorMod() {
        return percentArmorMod;
    }

    public void setPercentArmorMod(Double percentArmorMod) {
        this.percentArmorMod = percentArmorMod;
    }

    public Double getrFlatArmorPenetrationMod() {
        return rFlatArmorPenetrationMod;
    }

    public void setrFlatArmorPenetrationMod(Double rFlatArmorPenetrationMod) {
        this.rFlatArmorPenetrationMod = rFlatArmorPenetrationMod;
    }

    public Double getrFlatArmorPenetrationModPerLevel() {
        return rFlatArmorPenetrationModPerLevel;
    }

    public void setrFlatArmorPenetrationModPerLevel(Double rFlatArmorPenetrationModPerLevel) {
        this.rFlatArmorPenetrationModPerLevel = rFlatArmorPenetrationModPerLevel;
    }

    public Double getrPercentArmorPenetrationMod() {
        return rPercentArmorPenetrationMod;
    }

    public void setrPercentArmorPenetrationMod(Double rPercentArmorPenetrationMod) {
        this.rPercentArmorPenetrationMod = rPercentArmorPenetrationMod;
    }

    public Double getrPercentArmorPenetrationModPerLevel() {
        return rPercentArmorPenetrationModPerLevel;
    }

    public void setrPercentArmorPenetrationModPerLevel(Double rPercentArmorPenetrationModPerLevel) {
        this.rPercentArmorPenetrationModPerLevel = rPercentArmorPenetrationModPerLevel;
    }

    public Double getFlatPhysicalDamageMod() {
        return flatPhysicalDamageMod;
    }

    public void setFlatPhysicalDamageMod(Double flatPhysicalDamageMod) {
        this.flatPhysicalDamageMod = flatPhysicalDamageMod;
    }

    public Double getrFlatPhysicalDamageModPerLevel() {
        return rFlatPhysicalDamageModPerLevel;
    }

    public void setrFlatPhysicalDamageModPerLevel(Double rFlatPhysicalDamageModPerLevel) {
        this.rFlatPhysicalDamageModPerLevel = rFlatPhysicalDamageModPerLevel;
    }

    public Double getPercentPhysicalDamageMod() {
        return percentPhysicalDamageMod;
    }

    public void setPercentPhysicalDamageMod(Double percentPhysicalDamageMod) {
        this.percentPhysicalDamageMod = percentPhysicalDamageMod;
    }

    public Double getFlatMagicDamageMod() {
        return flatMagicDamageMod;
    }

    public void setFlatMagicDamageMod(Double flatMagicDamageMod) {
        this.flatMagicDamageMod = flatMagicDamageMod;
    }

    public Double getrFlatMagicDamageModPerLevel() {
        return rFlatMagicDamageModPerLevel;
    }

    public void setrFlatMagicDamageModPerLevel(Double rFlatMagicDamageModPerLevel) {
        this.rFlatMagicDamageModPerLevel = rFlatMagicDamageModPerLevel;
    }

    public Double getPercentMagicDamageMod() {
        return percentMagicDamageMod;
    }

    public void setPercentMagicDamageMod(Double percentMagicDamageMod) {
        this.percentMagicDamageMod = percentMagicDamageMod;
    }

    public Double getFlatMovementSpeedMod() {
        return flatMovementSpeedMod;
    }

    public void setFlatMovementSpeedMod(Double flatMovementSpeedMod) {
        this.flatMovementSpeedMod = flatMovementSpeedMod;
    }

    public Double getrFlatMovementSpeedModPerLevel() {
        return rFlatMovementSpeedModPerLevel;
    }

    public void setrFlatMovementSpeedModPerLevel(Double rFlatMovementSpeedModPerLevel) {
        this.rFlatMovementSpeedModPerLevel = rFlatMovementSpeedModPerLevel;
    }

    public Double getPercentMovementSpeedMod() {
        return percentMovementSpeedMod;
    }

    public void setPercentMovementSpeedMod(Double percentMovementSpeedMod) {
        this.percentMovementSpeedMod = percentMovementSpeedMod;
    }

    public Double getrPercentMovementSpeedModPerLevel() {
        return rPercentMovementSpeedModPerLevel;
    }

    public void setrPercentMovementSpeedModPerLevel(Double rPercentMovementSpeedModPerLevel) {
        this.rPercentMovementSpeedModPerLevel = rPercentMovementSpeedModPerLevel;
    }

    public Double getFlatAttackSpeedMod() {
        return flatAttackSpeedMod;
    }

    public void setFlatAttackSpeedMod(Double flatAttackSpeedMod) {
        this.flatAttackSpeedMod = flatAttackSpeedMod;
    }

    public Double getPercentAttackSpeedMod() {
        return percentAttackSpeedMod;
    }

    public void setPercentAttackSpeedMod(Double percentAttackSpeedMod) {
        this.percentAttackSpeedMod = percentAttackSpeedMod;
    }

    public Double getrPercentAttackSpeedModPerLevel() {
        return rPercentAttackSpeedModPerLevel;
    }

    public void setrPercentAttackSpeedModPerLevel(Double rPercentAttackSpeedModPerLevel) {
        this.rPercentAttackSpeedModPerLevel = rPercentAttackSpeedModPerLevel;
    }

    public Double getrFlatDodgeMod() {
        return rFlatDodgeMod;
    }

    public void setrFlatDodgeMod(Double rFlatDodgeMod) {
        this.rFlatDodgeMod = rFlatDodgeMod;
    }

    public Double getrFlatDodgeModPerLevel() {
        return rFlatDodgeModPerLevel;
    }

    public void setrFlatDodgeModPerLevel(Double rFlatDodgeModPerLevel) {
        this.rFlatDodgeModPerLevel = rFlatDodgeModPerLevel;
    }

    public Double getPercentDodgeMod() {
        return percentDodgeMod;
    }

    public void setPercentDodgeMod(Double percentDodgeMod) {
        this.percentDodgeMod = percentDodgeMod;
    }

    public Double getFlatCritChanceMod() {
        return flatCritChanceMod;
    }

    public void setFlatCritChanceMod(Double flatCritChanceMod) {
        this.flatCritChanceMod = flatCritChanceMod;
    }

    public Double getrFlatCritChanceModPerLevel() {
        return rFlatCritChanceModPerLevel;
    }

    public void setrFlatCritChanceModPerLevel(Double rFlatCritChanceModPerLevel) {
        this.rFlatCritChanceModPerLevel = rFlatCritChanceModPerLevel;
    }

    public Double getPercentCritChanceMod() {
        return percentCritChanceMod;
    }

    public void setPercentCritChanceMod(Double percentCritChanceMod) {
        this.percentCritChanceMod = percentCritChanceMod;
    }

    public Double getFlatCritDamageMod() {
        return flatCritDamageMod;
    }

    public void setFlatCritDamageMod(Double flatCritDamageMod) {
        this.flatCritDamageMod = flatCritDamageMod;
    }

    public Double getrFlatCritDamageModPerLevel() {
        return rFlatCritDamageModPerLevel;
    }

    public void setrFlatCritDamageModPerLevel(Double rFlatCritDamageModPerLevel) {
        this.rFlatCritDamageModPerLevel = rFlatCritDamageModPerLevel;
    }

    public Double getPercentCritDamageMod() {
        return percentCritDamageMod;
    }

    public void setPercentCritDamageMod(Double percentCritDamageMod) {
        this.percentCritDamageMod = percentCritDamageMod;
    }

    public Double getFlatBlockMod() {
        return flatBlockMod;
    }

    public void setFlatBlockMod(Double flatBlockMod) {
        this.flatBlockMod = flatBlockMod;
    }

    public Double getPercentBlockMod() {
        return percentBlockMod;
    }

    public void setPercentBlockMod(Double percentBlockMod) {
        this.percentBlockMod = percentBlockMod;
    }

    public Double getFlatSpellBlockMod() {
        return flatSpellBlockMod;
    }

    public void setFlatSpellBlockMod(Double flatSpellBlockMod) {
        this.flatSpellBlockMod = flatSpellBlockMod;
    }

    public Double getrFlatSpellBlockModPerLevel() {
        return rFlatSpellBlockModPerLevel;
    }

    public void setrFlatSpellBlockModPerLevel(Double rFlatSpellBlockModPerLevel) {
        this.rFlatSpellBlockModPerLevel = rFlatSpellBlockModPerLevel;
    }

    public Double getPercentSpellBlockMod() {
        return percentSpellBlockMod;
    }

    public void setPercentSpellBlockMod(Double percentSpellBlockMod) {
        this.percentSpellBlockMod = percentSpellBlockMod;
    }

    public Double getFlatEXPBonus() {
        return flatEXPBonus;
    }

    public void setFlatEXPBonus(Double flatEXPBonus) {
        this.flatEXPBonus = flatEXPBonus;
    }

    public Double getPercentEXPBonus() {
        return percentEXPBonus;
    }

    public void setPercentEXPBonus(Double percentEXPBonus) {
        this.percentEXPBonus = percentEXPBonus;
    }

    public Double getrPercentCooldownMod() {
        return rPercentCooldownMod;
    }

    public void setrPercentCooldownMod(Double rPercentCooldownMod) {
        this.rPercentCooldownMod = rPercentCooldownMod;
    }

    public Double getrPercentCooldownModPerLevel() {
        return rPercentCooldownModPerLevel;
    }

    public void setrPercentCooldownModPerLevel(Double rPercentCooldownModPerLevel) {
        this.rPercentCooldownModPerLevel = rPercentCooldownModPerLevel;
    }

    public Double getrFlatTimeDeadMod() {
        return rFlatTimeDeadMod;
    }

    public void setrFlatTimeDeadMod(Double rFlatTimeDeadMod) {
        this.rFlatTimeDeadMod = rFlatTimeDeadMod;
    }

    public Double getrFlatTimeDeadModPerLevel() {
        return rFlatTimeDeadModPerLevel;
    }

    public void setrFlatTimeDeadModPerLevel(Double rFlatTimeDeadModPerLevel) {
        this.rFlatTimeDeadModPerLevel = rFlatTimeDeadModPerLevel;
    }

    public Double getrPercentTimeDeadMod() {
        return rPercentTimeDeadMod;
    }

    public void setrPercentTimeDeadMod(Double rPercentTimeDeadMod) {
        this.rPercentTimeDeadMod = rPercentTimeDeadMod;
    }

    public Double getrPercentTimeDeadModPerLevel() {
        return rPercentTimeDeadModPerLevel;
    }

    public void setrPercentTimeDeadModPerLevel(Double rPercentTimeDeadModPerLevel) {
        this.rPercentTimeDeadModPerLevel = rPercentTimeDeadModPerLevel;
    }

    public Double getrFlatGoldPer10Mod() {
        return rFlatGoldPer10Mod;
    }

    public void setrFlatGoldPer10Mod(Double rFlatGoldPer10Mod) {
        this.rFlatGoldPer10Mod = rFlatGoldPer10Mod;
    }

    public Double getrFlatMagicPenetrationMod() {
        return rFlatMagicPenetrationMod;
    }

    public void setrFlatMagicPenetrationMod(Double rFlatMagicPenetrationMod) {
        this.rFlatMagicPenetrationMod = rFlatMagicPenetrationMod;
    }

    public Double getrFlatMagicPenetrationModPerLevel() {
        return rFlatMagicPenetrationModPerLevel;
    }

    public void setrFlatMagicPenetrationModPerLevel(Double rFlatMagicPenetrationModPerLevel) {
        this.rFlatMagicPenetrationModPerLevel = rFlatMagicPenetrationModPerLevel;
    }

    public Double getrPercentMagicPenetrationMod() {
        return rPercentMagicPenetrationMod;
    }

    public void setrPercentMagicPenetrationMod(Double rPercentMagicPenetrationMod) {
        this.rPercentMagicPenetrationMod = rPercentMagicPenetrationMod;
    }

    public Double getrPercentMagicPenetrationModPerLevel() {
        return rPercentMagicPenetrationModPerLevel;
    }

    public void setrPercentMagicPenetrationModPerLevel(Double rPercentMagicPenetrationModPerLevel) {
        this.rPercentMagicPenetrationModPerLevel = rPercentMagicPenetrationModPerLevel;
    }

    public Double getFlatEnergyRegenMod() {
        return flatEnergyRegenMod;
    }

    public void setFlatEnergyRegenMod(Double flatEnergyRegenMod) {
        this.flatEnergyRegenMod = flatEnergyRegenMod;
    }

    public Double getrFlatEnergyRegenModPerLevel() {
        return rFlatEnergyRegenModPerLevel;
    }

    public void setrFlatEnergyRegenModPerLevel(Double rFlatEnergyRegenModPerLevel) {
        this.rFlatEnergyRegenModPerLevel = rFlatEnergyRegenModPerLevel;
    }

    public Double getFlatEnergyPoolMod() {
        return flatEnergyPoolMod;
    }

    public void setFlatEnergyPoolMod(Double flatEnergyPoolMod) {
        this.flatEnergyPoolMod = flatEnergyPoolMod;
    }

    public Double getrFlatEnergyModPerLevel() {
        return rFlatEnergyModPerLevel;
    }

    public void setrFlatEnergyModPerLevel(Double rFlatEnergyModPerLevel) {
        this.rFlatEnergyModPerLevel = rFlatEnergyModPerLevel;
    }

    public Double getPercentLifeStealMod() {
        return percentLifeStealMod;
    }

    public void setPercentLifeStealMod(Double percentLifeStealMod) {
        this.percentLifeStealMod = percentLifeStealMod;
    }

    public Double getPercentSpellVampMod() {
        return percentSpellVampMod;
    }

    public void setPercentSpellVampMod(Double percentSpellVampMod) {
        this.percentSpellVampMod = percentSpellVampMod;
    }

}
