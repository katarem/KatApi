
package katarem.katapi.api.game;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/***
 * JavaBean to get the player's data from a {@link GameInfo}
 */
public class Participant {

    @SerializedName("allInPings")
    @Expose
    private Integer allInPings;
    @SerializedName("assistMePings")
    @Expose
    private Integer assistMePings;
    @SerializedName("assists")
    @Expose
    private Integer assists;
    @SerializedName("baitPings")
    @Expose
    private Integer baitPings;
    @SerializedName("baronKills")
    @Expose
    private Integer baronKills;
    @SerializedName("basicPings")
    @Expose
    private Integer basicPings;
    @SerializedName("bountyLevel")
    @Expose
    private Integer bountyLevel;
    @SerializedName("challenges")
    @Expose
    private Challenges challenges;
    @SerializedName("champExperience")
    @Expose
    private Integer champExperience;
    @SerializedName("champLevel")
    @Expose
    private Integer champLevel;
    @SerializedName("championId")
    @Expose
    private Integer championId;
    @SerializedName("championName")
    @Expose
    private String championName;
    @SerializedName("championTransform")
    @Expose
    private Integer championTransform;
    @SerializedName("commandPings")
    @Expose
    private Integer commandPings;
    @SerializedName("consumablesPurchased")
    @Expose
    private Integer consumablesPurchased;
    @SerializedName("damageDealtToBuildings")
    @Expose
    private Integer damageDealtToBuildings;
    @SerializedName("damageDealtToObjectives")
    @Expose
    private Integer damageDealtToObjectives;
    @SerializedName("damageDealtToTurrets")
    @Expose
    private Integer damageDealtToTurrets;
    @SerializedName("damageSelfMitigated")
    @Expose
    private Integer damageSelfMitigated;
    @SerializedName("dangerPings")
    @Expose
    private Integer dangerPings;
    @SerializedName("deaths")
    @Expose
    private Integer deaths;
    @SerializedName("detectorWardsPlaced")
    @Expose
    private Integer detectorWardsPlaced;
    @SerializedName("doubleKills")
    @Expose
    private Integer doubleKills;
    @SerializedName("dragonKills")
    @Expose
    private Integer dragonKills;
    @SerializedName("eligibleForProgression")
    @Expose
    private Boolean eligibleForProgression;
    @SerializedName("enemyMissingPings")
    @Expose
    private Integer enemyMissingPings;
    @SerializedName("enemyVisionPings")
    @Expose
    private Integer enemyVisionPings;
    @SerializedName("firstBloodAssist")
    @Expose
    private Boolean firstBloodAssist;
    @SerializedName("firstBloodKill")
    @Expose
    private Boolean firstBloodKill;
    @SerializedName("firstTowerAssist")
    @Expose
    private Boolean firstTowerAssist;
    @SerializedName("firstTowerKill")
    @Expose
    private Boolean firstTowerKill;
    @SerializedName("gameEndedInEarlySurrender")
    @Expose
    private Boolean gameEndedInEarlySurrender;
    @SerializedName("gameEndedInSurrender")
    @Expose
    private Boolean gameEndedInSurrender;
    @SerializedName("getBackPings")
    @Expose
    private Integer getBackPings;
    @SerializedName("goldEarned")
    @Expose
    private Integer goldEarned;
    @SerializedName("goldSpent")
    @Expose
    private Integer goldSpent;
    @SerializedName("holdPings")
    @Expose
    private Integer holdPings;
    @SerializedName("individualPosition")
    @Expose
    private String individualPosition;
    @SerializedName("inhibitorKills")
    @Expose
    private Integer inhibitorKills;
    @SerializedName("inhibitorTakedowns")
    @Expose
    private Integer inhibitorTakedowns;
    @SerializedName("inhibitorsLost")
    @Expose
    private Integer inhibitorsLost;
    @SerializedName("item0")
    @Expose
    private Integer item0;
    @SerializedName("item1")
    @Expose
    private Integer item1;
    @SerializedName("item2")
    @Expose
    private Integer item2;
    @SerializedName("item3")
    @Expose
    private Integer item3;
    @SerializedName("item4")
    @Expose
    private Integer item4;
    @SerializedName("item5")
    @Expose
    private Integer item5;
    @SerializedName("item6")
    @Expose
    private Integer item6;
    @SerializedName("itemsPurchased")
    @Expose
    private Integer itemsPurchased;
    @SerializedName("killingSprees")
    @Expose
    private Integer killingSprees;
    @SerializedName("kills")
    @Expose
    private Integer kills;
    @SerializedName("lane")
    @Expose
    private String lane;
    @SerializedName("largestCriticalStrike")
    @Expose
    private Integer largestCriticalStrike;
    @SerializedName("largestKillingSpree")
    @Expose
    private Integer largestKillingSpree;
    @SerializedName("largestMultiKill")
    @Expose
    private Integer largestMultiKill;
    @SerializedName("longestTimeSpentLiving")
    @Expose
    private Integer longestTimeSpentLiving;
    @SerializedName("magicDamageDealt")
    @Expose
    private Integer magicDamageDealt;
    @SerializedName("magicDamageDealtToChampions")
    @Expose
    private Integer magicDamageDealtToChampions;
    @SerializedName("magicDamageTaken")
    @Expose
    private Integer magicDamageTaken;
    @SerializedName("needVisionPings")
    @Expose
    private Integer needVisionPings;
    @SerializedName("neutralMinionsKilled")
    @Expose
    private Integer neutralMinionsKilled;
    @SerializedName("nexusKills")
    @Expose
    private Integer nexusKills;
    @SerializedName("nexusLost")
    @Expose
    private Integer nexusLost;
    @SerializedName("nexusTakedowns")
    @Expose
    private Integer nexusTakedowns;
    @SerializedName("objectivesStolen")
    @Expose
    private Integer objectivesStolen;
    @SerializedName("objectivesStolenAssists")
    @Expose
    private Integer objectivesStolenAssists;
    @SerializedName("onMyWayPings")
    @Expose
    private Integer onMyWayPings;
    @SerializedName("participantId")
    @Expose
    private Integer participantId;
    @SerializedName("pentaKills")
    @Expose
    private Integer pentaKills;
    @SerializedName("perks")
    @Expose
    private Perks perks;
    @SerializedName("physicalDamageDealt")
    @Expose
    private Integer physicalDamageDealt;
    @SerializedName("physicalDamageDealtToChampions")
    @Expose
    private Integer physicalDamageDealtToChampions;
    @SerializedName("physicalDamageTaken")
    @Expose
    private Integer physicalDamageTaken;
    @SerializedName("profileIcon")
    @Expose
    private Integer profileIcon;
    @SerializedName("pushPings")
    @Expose
    private Integer pushPings;
    @SerializedName("puuid")
    @Expose
    private String puuid;
    @SerializedName("quadraKills")
    @Expose
    private Integer quadraKills;
    @SerializedName("riotIdName")
    @Expose
    private String riotIdName;
    @SerializedName("riotIdTagline")
    @Expose
    private String riotIdTagline;
    @SerializedName("role")
    @Expose
    private String role;
    @SerializedName("sightWardsBoughtInGame")
    @Expose
    private Integer sightWardsBoughtInGame;
    @SerializedName("spell1Casts")
    @Expose
    private Integer spell1Casts;
    @SerializedName("spell2Casts")
    @Expose
    private Integer spell2Casts;
    @SerializedName("spell3Casts")
    @Expose
    private Integer spell3Casts;
    @SerializedName("spell4Casts")
    @Expose
    private Integer spell4Casts;
    @SerializedName("summoner1Casts")
    @Expose
    private Integer summoner1Casts;
    @SerializedName("summoner1Id")
    @Expose
    private Integer summoner1Id;
    @SerializedName("summoner2Casts")
    @Expose
    private Integer summoner2Casts;
    @SerializedName("summoner2Id")
    @Expose
    private Integer summoner2Id;
    @SerializedName("summonerId")
    @Expose
    private String summonerId;
    @SerializedName("summonerLevel")
    @Expose
    private Integer summonerLevel;
    @SerializedName("summonerName")
    @Expose
    private String summonerName;
    @SerializedName("teamEarlySurrendered")
    @Expose
    private Boolean teamEarlySurrendered;
    @SerializedName("teamId")
    @Expose
    private Integer teamId;
    @SerializedName("teamPosition")
    @Expose
    private String teamPosition;
    @SerializedName("timeCCingOthers")
    @Expose
    private Integer timeCCingOthers;
    @SerializedName("timePlayed")
    @Expose
    private Integer timePlayed;
    @SerializedName("totalDamageDealt")
    @Expose
    private Integer totalDamageDealt;
    @SerializedName("totalDamageDealtToChampions")
    @Expose
    private Integer totalDamageDealtToChampions;
    @SerializedName("totalDamageShieldedOnTeammates")
    @Expose
    private Integer totalDamageShieldedOnTeammates;
    @SerializedName("totalDamageTaken")
    @Expose
    private Integer totalDamageTaken;
    @SerializedName("totalHeal")
    @Expose
    private Integer totalHeal;
    @SerializedName("totalHealsOnTeammates")
    @Expose
    private Integer totalHealsOnTeammates;
    @SerializedName("totalMinionsKilled")
    @Expose
    private Integer totalMinionsKilled;
    @SerializedName("totalTimeCCDealt")
    @Expose
    private Integer totalTimeCCDealt;
    @SerializedName("totalTimeSpentDead")
    @Expose
    private Integer totalTimeSpentDead;
    @SerializedName("totalUnitsHealed")
    @Expose
    private Integer totalUnitsHealed;
    @SerializedName("tripleKills")
    @Expose
    private Integer tripleKills;
    @SerializedName("trueDamageDealt")
    @Expose
    private Integer trueDamageDealt;
    @SerializedName("trueDamageDealtToChampions")
    @Expose
    private Integer trueDamageDealtToChampions;
    @SerializedName("trueDamageTaken")
    @Expose
    private Integer trueDamageTaken;
    @SerializedName("turretKills")
    @Expose
    private Integer turretKills;
    @SerializedName("turretTakedowns")
    @Expose
    private Integer turretTakedowns;
    @SerializedName("turretsLost")
    @Expose
    private Integer turretsLost;
    @SerializedName("unrealKills")
    @Expose
    private Integer unrealKills;
    @SerializedName("visionClearedPings")
    @Expose
    private Integer visionClearedPings;
    @SerializedName("visionScore")
    @Expose
    private Integer visionScore;
    @SerializedName("visionWardsBoughtInGame")
    @Expose
    private Integer visionWardsBoughtInGame;
    @SerializedName("wardsKilled")
    @Expose
    private Integer wardsKilled;
    @SerializedName("wardsPlaced")
    @Expose
    private Integer wardsPlaced;
    @SerializedName("win")
    @Expose
    private Boolean win;

    public Integer getAllInPings() {
        return allInPings;
    }

    public void setAllInPings(Integer allInPings) {
        this.allInPings = allInPings;
    }

    public Integer getAssistMePings() {
        return assistMePings;
    }

    public void setAssistMePings(Integer assistMePings) {
        this.assistMePings = assistMePings;
    }

    public Integer getAssists() {
        return assists;
    }

    public void setAssists(Integer assists) {
        this.assists = assists;
    }

    public Integer getBaitPings() {
        return baitPings;
    }

    public void setBaitPings(Integer baitPings) {
        this.baitPings = baitPings;
    }

    public Integer getBaronKills() {
        return baronKills;
    }

    public void setBaronKills(Integer baronKills) {
        this.baronKills = baronKills;
    }

    public Integer getBasicPings() {
        return basicPings;
    }

    public void setBasicPings(Integer basicPings) {
        this.basicPings = basicPings;
    }

    public Integer getBountyLevel() {
        return bountyLevel;
    }

    public void setBountyLevel(Integer bountyLevel) {
        this.bountyLevel = bountyLevel;
    }

    public Challenges getChallenges() {
        return challenges;
    }

    public void setChallenges(Challenges challenges) {
        this.challenges = challenges;
    }

    public Integer getChampExperience() {
        return champExperience;
    }

    public void setChampExperience(Integer champExperience) {
        this.champExperience = champExperience;
    }

    public Integer getChampLevel() {
        return champLevel;
    }

    public void setChampLevel(Integer champLevel) {
        this.champLevel = champLevel;
    }

    public Integer getChampionId() {
        return championId;
    }

    public void setChampionId(Integer championId) {
        this.championId = championId;
    }

    public String getChampionName() {
        return championName;
    }

    public void setChampionName(String championName) {
        this.championName = championName;
    }

    public Integer getChampionTransform() {
        return championTransform;
    }

    public void setChampionTransform(Integer championTransform) {
        this.championTransform = championTransform;
    }

    public Integer getCommandPings() {
        return commandPings;
    }

    public void setCommandPings(Integer commandPings) {
        this.commandPings = commandPings;
    }

    public Integer getConsumablesPurchased() {
        return consumablesPurchased;
    }

    public void setConsumablesPurchased(Integer consumablesPurchased) {
        this.consumablesPurchased = consumablesPurchased;
    }

    public Integer getDamageDealtToBuildings() {
        return damageDealtToBuildings;
    }

    public void setDamageDealtToBuildings(Integer damageDealtToBuildings) {
        this.damageDealtToBuildings = damageDealtToBuildings;
    }

    public Integer getDamageDealtToObjectives() {
        return damageDealtToObjectives;
    }

    public void setDamageDealtToObjectives(Integer damageDealtToObjectives) {
        this.damageDealtToObjectives = damageDealtToObjectives;
    }

    public Integer getDamageDealtToTurrets() {
        return damageDealtToTurrets;
    }

    public void setDamageDealtToTurrets(Integer damageDealtToTurrets) {
        this.damageDealtToTurrets = damageDealtToTurrets;
    }

    public Integer getDamageSelfMitigated() {
        return damageSelfMitigated;
    }

    public void setDamageSelfMitigated(Integer damageSelfMitigated) {
        this.damageSelfMitigated = damageSelfMitigated;
    }

    public Integer getDangerPings() {
        return dangerPings;
    }

    public void setDangerPings(Integer dangerPings) {
        this.dangerPings = dangerPings;
    }

    public Integer getDeaths() {
        return deaths;
    }

    public void setDeaths(Integer deaths) {
        this.deaths = deaths;
    }

    public Integer getDetectorWardsPlaced() {
        return detectorWardsPlaced;
    }

    public void setDetectorWardsPlaced(Integer detectorWardsPlaced) {
        this.detectorWardsPlaced = detectorWardsPlaced;
    }

    public Integer getDoubleKills() {
        return doubleKills;
    }

    public void setDoubleKills(Integer doubleKills) {
        this.doubleKills = doubleKills;
    }

    public Integer getDragonKills() {
        return dragonKills;
    }

    public void setDragonKills(Integer dragonKills) {
        this.dragonKills = dragonKills;
    }

    public Boolean getEligibleForProgression() {
        return eligibleForProgression;
    }

    public void setEligibleForProgression(Boolean eligibleForProgression) {
        this.eligibleForProgression = eligibleForProgression;
    }

    public Integer getEnemyMissingPings() {
        return enemyMissingPings;
    }

    public void setEnemyMissingPings(Integer enemyMissingPings) {
        this.enemyMissingPings = enemyMissingPings;
    }

    public Integer getEnemyVisionPings() {
        return enemyVisionPings;
    }

    public void setEnemyVisionPings(Integer enemyVisionPings) {
        this.enemyVisionPings = enemyVisionPings;
    }

    public Boolean getFirstBloodAssist() {
        return firstBloodAssist;
    }

    public void setFirstBloodAssist(Boolean firstBloodAssist) {
        this.firstBloodAssist = firstBloodAssist;
    }

    public Boolean getFirstBloodKill() {
        return firstBloodKill;
    }

    public void setFirstBloodKill(Boolean firstBloodKill) {
        this.firstBloodKill = firstBloodKill;
    }

    public Boolean getFirstTowerAssist() {
        return firstTowerAssist;
    }

    public void setFirstTowerAssist(Boolean firstTowerAssist) {
        this.firstTowerAssist = firstTowerAssist;
    }

    public Boolean getFirstTowerKill() {
        return firstTowerKill;
    }

    public void setFirstTowerKill(Boolean firstTowerKill) {
        this.firstTowerKill = firstTowerKill;
    }

    public Boolean getGameEndedInEarlySurrender() {
        return gameEndedInEarlySurrender;
    }

    public void setGameEndedInEarlySurrender(Boolean gameEndedInEarlySurrender) {
        this.gameEndedInEarlySurrender = gameEndedInEarlySurrender;
    }

    public Boolean getGameEndedInSurrender() {
        return gameEndedInSurrender;
    }

    public void setGameEndedInSurrender(Boolean gameEndedInSurrender) {
        this.gameEndedInSurrender = gameEndedInSurrender;
    }

    public Integer getGetBackPings() {
        return getBackPings;
    }

    public void setGetBackPings(Integer getBackPings) {
        this.getBackPings = getBackPings;
    }

    public Integer getGoldEarned() {
        return goldEarned;
    }

    public void setGoldEarned(Integer goldEarned) {
        this.goldEarned = goldEarned;
    }

    public Integer getGoldSpent() {
        return goldSpent;
    }

    public void setGoldSpent(Integer goldSpent) {
        this.goldSpent = goldSpent;
    }

    public Integer getHoldPings() {
        return holdPings;
    }

    public void setHoldPings(Integer holdPings) {
        this.holdPings = holdPings;
    }

    public String getIndividualPosition() {
        return individualPosition;
    }

    public void setIndividualPosition(String individualPosition) {
        this.individualPosition = individualPosition;
    }

    public Integer getInhibitorKills() {
        return inhibitorKills;
    }

    public void setInhibitorKills(Integer inhibitorKills) {
        this.inhibitorKills = inhibitorKills;
    }

    public Integer getInhibitorTakedowns() {
        return inhibitorTakedowns;
    }

    public void setInhibitorTakedowns(Integer inhibitorTakedowns) {
        this.inhibitorTakedowns = inhibitorTakedowns;
    }

    public Integer getInhibitorsLost() {
        return inhibitorsLost;
    }

    public void setInhibitorsLost(Integer inhibitorsLost) {
        this.inhibitorsLost = inhibitorsLost;
    }

    public Integer getItem0() {
        return item0;
    }

    public void setItem0(Integer item0) {
        this.item0 = item0;
    }

    public Integer getItem1() {
        return item1;
    }

    public void setItem1(Integer item1) {
        this.item1 = item1;
    }

    public Integer getItem2() {
        return item2;
    }

    public void setItem2(Integer item2) {
        this.item2 = item2;
    }

    public Integer getItem3() {
        return item3;
    }

    public void setItem3(Integer item3) {
        this.item3 = item3;
    }

    public Integer getItem4() {
        return item4;
    }

    public void setItem4(Integer item4) {
        this.item4 = item4;
    }

    public Integer getItem5() {
        return item5;
    }

    public void setItem5(Integer item5) {
        this.item5 = item5;
    }

    public Integer getItem6() {
        return item6;
    }

    public void setItem6(Integer item6) {
        this.item6 = item6;
    }

    public Integer getItemsPurchased() {
        return itemsPurchased;
    }

    public void setItemsPurchased(Integer itemsPurchased) {
        this.itemsPurchased = itemsPurchased;
    }

    public Integer getKillingSprees() {
        return killingSprees;
    }

    public void setKillingSprees(Integer killingSprees) {
        this.killingSprees = killingSprees;
    }

    public Integer getKills() {
        return kills;
    }

    public void setKills(Integer kills) {
        this.kills = kills;
    }

    public String getLane() {
        return lane;
    }

    public void setLane(String lane) {
        this.lane = lane;
    }

    public Integer getLargestCriticalStrike() {
        return largestCriticalStrike;
    }

    public void setLargestCriticalStrike(Integer largestCriticalStrike) {
        this.largestCriticalStrike = largestCriticalStrike;
    }

    public Integer getLargestKillingSpree() {
        return largestKillingSpree;
    }

    public void setLargestKillingSpree(Integer largestKillingSpree) {
        this.largestKillingSpree = largestKillingSpree;
    }

    public Integer getLargestMultiKill() {
        return largestMultiKill;
    }

    public void setLargestMultiKill(Integer largestMultiKill) {
        this.largestMultiKill = largestMultiKill;
    }

    public Integer getLongestTimeSpentLiving() {
        return longestTimeSpentLiving;
    }

    public void setLongestTimeSpentLiving(Integer longestTimeSpentLiving) {
        this.longestTimeSpentLiving = longestTimeSpentLiving;
    }

    public Integer getMagicDamageDealt() {
        return magicDamageDealt;
    }

    public void setMagicDamageDealt(Integer magicDamageDealt) {
        this.magicDamageDealt = magicDamageDealt;
    }

    public Integer getMagicDamageDealtToChampions() {
        return magicDamageDealtToChampions;
    }

    public void setMagicDamageDealtToChampions(Integer magicDamageDealtToChampions) {
        this.magicDamageDealtToChampions = magicDamageDealtToChampions;
    }

    public Integer getMagicDamageTaken() {
        return magicDamageTaken;
    }

    public void setMagicDamageTaken(Integer magicDamageTaken) {
        this.magicDamageTaken = magicDamageTaken;
    }

    public Integer getNeedVisionPings() {
        return needVisionPings;
    }

    public void setNeedVisionPings(Integer needVisionPings) {
        this.needVisionPings = needVisionPings;
    }

    public Integer getNeutralMinionsKilled() {
        return neutralMinionsKilled;
    }

    public void setNeutralMinionsKilled(Integer neutralMinionsKilled) {
        this.neutralMinionsKilled = neutralMinionsKilled;
    }

    public Integer getNexusKills() {
        return nexusKills;
    }

    public void setNexusKills(Integer nexusKills) {
        this.nexusKills = nexusKills;
    }

    public Integer getNexusLost() {
        return nexusLost;
    }

    public void setNexusLost(Integer nexusLost) {
        this.nexusLost = nexusLost;
    }

    public Integer getNexusTakedowns() {
        return nexusTakedowns;
    }

    public void setNexusTakedowns(Integer nexusTakedowns) {
        this.nexusTakedowns = nexusTakedowns;
    }

    public Integer getObjectivesStolen() {
        return objectivesStolen;
    }

    public void setObjectivesStolen(Integer objectivesStolen) {
        this.objectivesStolen = objectivesStolen;
    }

    public Integer getObjectivesStolenAssists() {
        return objectivesStolenAssists;
    }

    public void setObjectivesStolenAssists(Integer objectivesStolenAssists) {
        this.objectivesStolenAssists = objectivesStolenAssists;
    }

    public Integer getOnMyWayPings() {
        return onMyWayPings;
    }

    public void setOnMyWayPings(Integer onMyWayPings) {
        this.onMyWayPings = onMyWayPings;
    }

    public Integer getParticipantId() {
        return participantId;
    }

    public void setParticipantId(Integer participantId) {
        this.participantId = participantId;
    }

    public Integer getPentaKills() {
        return pentaKills;
    }

    public void setPentaKills(Integer pentaKills) {
        this.pentaKills = pentaKills;
    }

    public Perks getPerks() {
        return perks;
    }

    public void setPerks(Perks perks) {
        this.perks = perks;
    }

    public Integer getPhysicalDamageDealt() {
        return physicalDamageDealt;
    }

    public void setPhysicalDamageDealt(Integer physicalDamageDealt) {
        this.physicalDamageDealt = physicalDamageDealt;
    }

    public Integer getPhysicalDamageDealtToChampions() {
        return physicalDamageDealtToChampions;
    }

    public void setPhysicalDamageDealtToChampions(Integer physicalDamageDealtToChampions) {
        this.physicalDamageDealtToChampions = physicalDamageDealtToChampions;
    }

    public Integer getPhysicalDamageTaken() {
        return physicalDamageTaken;
    }

    public void setPhysicalDamageTaken(Integer physicalDamageTaken) {
        this.physicalDamageTaken = physicalDamageTaken;
    }

    public Integer getProfileIcon() {
        return profileIcon;
    }

    public void setProfileIcon(Integer profileIcon) {
        this.profileIcon = profileIcon;
    }

    public Integer getPushPings() {
        return pushPings;
    }

    public void setPushPings(Integer pushPings) {
        this.pushPings = pushPings;
    }

    public String getPuuid() {
        return puuid;
    }

    public void setPuuid(String puuid) {
        this.puuid = puuid;
    }

    public Integer getQuadraKills() {
        return quadraKills;
    }

    public void setQuadraKills(Integer quadraKills) {
        this.quadraKills = quadraKills;
    }

    public String getRiotIdName() {
        return riotIdName;
    }

    public void setRiotIdName(String riotIdName) {
        this.riotIdName = riotIdName;
    }

    public String getRiotIdTagline() {
        return riotIdTagline;
    }

    public void setRiotIdTagline(String riotIdTagline) {
        this.riotIdTagline = riotIdTagline;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getSightWardsBoughtInGame() {
        return sightWardsBoughtInGame;
    }

    public void setSightWardsBoughtInGame(Integer sightWardsBoughtInGame) {
        this.sightWardsBoughtInGame = sightWardsBoughtInGame;
    }

    public Integer getSpell1Casts() {
        return spell1Casts;
    }

    public void setSpell1Casts(Integer spell1Casts) {
        this.spell1Casts = spell1Casts;
    }

    public Integer getSpell2Casts() {
        return spell2Casts;
    }

    public void setSpell2Casts(Integer spell2Casts) {
        this.spell2Casts = spell2Casts;
    }

    public Integer getSpell3Casts() {
        return spell3Casts;
    }

    public void setSpell3Casts(Integer spell3Casts) {
        this.spell3Casts = spell3Casts;
    }

    public Integer getSpell4Casts() {
        return spell4Casts;
    }

    public void setSpell4Casts(Integer spell4Casts) {
        this.spell4Casts = spell4Casts;
    }

    public Integer getSummoner1Casts() {
        return summoner1Casts;
    }

    public void setSummoner1Casts(Integer summoner1Casts) {
        this.summoner1Casts = summoner1Casts;
    }

    public Integer getSummoner1Id() {
        return summoner1Id;
    }

    public void setSummoner1Id(Integer summoner1Id) {
        this.summoner1Id = summoner1Id;
    }

    public Integer getSummoner2Casts() {
        return summoner2Casts;
    }

    public void setSummoner2Casts(Integer summoner2Casts) {
        this.summoner2Casts = summoner2Casts;
    }

    public Integer getSummoner2Id() {
        return summoner2Id;
    }

    public void setSummoner2Id(Integer summoner2Id) {
        this.summoner2Id = summoner2Id;
    }

    public String getSummonerId() {
        return summonerId;
    }

    public void setSummonerId(String summonerId) {
        this.summonerId = summonerId;
    }

    public Integer getSummonerLevel() {
        return summonerLevel;
    }

    public void setSummonerLevel(Integer summonerLevel) {
        this.summonerLevel = summonerLevel;
    }

    public String getSummonerName() {
        return summonerName;
    }

    public void setSummonerName(String summonerName) {
        this.summonerName = summonerName;
    }

    public Boolean getTeamEarlySurrendered() {
        return teamEarlySurrendered;
    }

    public void setTeamEarlySurrendered(Boolean teamEarlySurrendered) {
        this.teamEarlySurrendered = teamEarlySurrendered;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public String getTeamPosition() {
        return teamPosition;
    }

    public void setTeamPosition(String teamPosition) {
        this.teamPosition = teamPosition;
    }

    public Integer getTimeCCingOthers() {
        return timeCCingOthers;
    }

    public void setTimeCCingOthers(Integer timeCCingOthers) {
        this.timeCCingOthers = timeCCingOthers;
    }

    public Integer getTimePlayed() {
        return timePlayed;
    }

    public void setTimePlayed(Integer timePlayed) {
        this.timePlayed = timePlayed;
    }

    public Integer getTotalDamageDealt() {
        return totalDamageDealt;
    }

    public void setTotalDamageDealt(Integer totalDamageDealt) {
        this.totalDamageDealt = totalDamageDealt;
    }

    public Integer getTotalDamageDealtToChampions() {
        return totalDamageDealtToChampions;
    }

    public void setTotalDamageDealtToChampions(Integer totalDamageDealtToChampions) {
        this.totalDamageDealtToChampions = totalDamageDealtToChampions;
    }

    public Integer getTotalDamageShieldedOnTeammates() {
        return totalDamageShieldedOnTeammates;
    }

    public void setTotalDamageShieldedOnTeammates(Integer totalDamageShieldedOnTeammates) {
        this.totalDamageShieldedOnTeammates = totalDamageShieldedOnTeammates;
    }

    public Integer getTotalDamageTaken() {
        return totalDamageTaken;
    }

    public void setTotalDamageTaken(Integer totalDamageTaken) {
        this.totalDamageTaken = totalDamageTaken;
    }

    public Integer getTotalHeal() {
        return totalHeal;
    }

    public void setTotalHeal(Integer totalHeal) {
        this.totalHeal = totalHeal;
    }

    public Integer getTotalHealsOnTeammates() {
        return totalHealsOnTeammates;
    }

    public void setTotalHealsOnTeammates(Integer totalHealsOnTeammates) {
        this.totalHealsOnTeammates = totalHealsOnTeammates;
    }

    public Integer getTotalMinionsKilled() {
        return totalMinionsKilled;
    }

    public void setTotalMinionsKilled(Integer totalMinionsKilled) {
        this.totalMinionsKilled = totalMinionsKilled;
    }

    public Integer getTotalTimeCCDealt() {
        return totalTimeCCDealt;
    }

    public void setTotalTimeCCDealt(Integer totalTimeCCDealt) {
        this.totalTimeCCDealt = totalTimeCCDealt;
    }

    public Integer getTotalTimeSpentDead() {
        return totalTimeSpentDead;
    }

    public void setTotalTimeSpentDead(Integer totalTimeSpentDead) {
        this.totalTimeSpentDead = totalTimeSpentDead;
    }

    public Integer getTotalUnitsHealed() {
        return totalUnitsHealed;
    }

    public void setTotalUnitsHealed(Integer totalUnitsHealed) {
        this.totalUnitsHealed = totalUnitsHealed;
    }

    public Integer getTripleKills() {
        return tripleKills;
    }

    public void setTripleKills(Integer tripleKills) {
        this.tripleKills = tripleKills;
    }

    public Integer getTrueDamageDealt() {
        return trueDamageDealt;
    }

    public void setTrueDamageDealt(Integer trueDamageDealt) {
        this.trueDamageDealt = trueDamageDealt;
    }

    public Integer getTrueDamageDealtToChampions() {
        return trueDamageDealtToChampions;
    }

    public void setTrueDamageDealtToChampions(Integer trueDamageDealtToChampions) {
        this.trueDamageDealtToChampions = trueDamageDealtToChampions;
    }

    public Integer getTrueDamageTaken() {
        return trueDamageTaken;
    }

    public void setTrueDamageTaken(Integer trueDamageTaken) {
        this.trueDamageTaken = trueDamageTaken;
    }

    public Integer getTurretKills() {
        return turretKills;
    }

    public void setTurretKills(Integer turretKills) {
        this.turretKills = turretKills;
    }

    public Integer getTurretTakedowns() {
        return turretTakedowns;
    }

    public void setTurretTakedowns(Integer turretTakedowns) {
        this.turretTakedowns = turretTakedowns;
    }

    public Integer getTurretsLost() {
        return turretsLost;
    }

    public void setTurretsLost(Integer turretsLost) {
        this.turretsLost = turretsLost;
    }

    public Integer getUnrealKills() {
        return unrealKills;
    }

    public void setUnrealKills(Integer unrealKills) {
        this.unrealKills = unrealKills;
    }

    public Integer getVisionClearedPings() {
        return visionClearedPings;
    }

    public void setVisionClearedPings(Integer visionClearedPings) {
        this.visionClearedPings = visionClearedPings;
    }

    public Integer getVisionScore() {
        return visionScore;
    }

    public void setVisionScore(Integer visionScore) {
        this.visionScore = visionScore;
    }

    public Integer getVisionWardsBoughtInGame() {
        return visionWardsBoughtInGame;
    }

    public void setVisionWardsBoughtInGame(Integer visionWardsBoughtInGame) {
        this.visionWardsBoughtInGame = visionWardsBoughtInGame;
    }

    public Integer getWardsKilled() {
        return wardsKilled;
    }

    public void setWardsKilled(Integer wardsKilled) {
        this.wardsKilled = wardsKilled;
    }

    public Integer getWardsPlaced() {
        return wardsPlaced;
    }

    public void setWardsPlaced(Integer wardsPlaced) {
        this.wardsPlaced = wardsPlaced;
    }

    public Boolean getWin() {
        return win;
    }

    public void setWin(Boolean win) {
        this.win = win;
    }

}
