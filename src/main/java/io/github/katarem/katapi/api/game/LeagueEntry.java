package io.github.katarem.katapi.api.game;

import io.github.katarem.katapi.constants.Queue;

public class LeagueEntry {
    private String queueType;
    private String tier;
    private String rank;
    private int leaguePoints;
    private int wins;
    private int losses;

    public String getQueueType() {
        return queueType;
    }

    public void setQueueType(String queueType) {
        this.queueType = queueType;
    }

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getLeaguePoints() {
        return leaguePoints;
    }

    public void setLeaguePoints(int leaguePoints) {
        this.leaguePoints = leaguePoints;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public static LeagueEntry sinElo(){
        LeagueEntry l = new LeagueEntry();
        l.setQueueType(Queue.UNRANKED_ALL.name());
        l.setWins(0);
        l.setLosses(0);
        l.setRank("UNRANKED");
        l.setTier("UNRANKED");
        l.setLeaguePoints(0);
        return l;
    }

    @Override
    public String toString() {
        return "LeagueEntry [queueType=" + queueType + ", tier=" + tier + ", rank=" + rank + ", leaguePoints="
                + leaguePoints + "]";
    }

}
