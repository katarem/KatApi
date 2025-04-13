package io.github.katarem.katapi.api.param;

public class GameParam {
    public String matchId;
    public int count = 20;
    public Long startTime = null; //default value
    public Long endTime = null; //default value
    public Integer queue = null; //default value
    public String type = null; //default value
    public Integer start = null; //default value

    public String getMatchId() {
        return matchId;
    }
    public void setMatchId(String matchId) {
        this.matchId = matchId;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public Long getStartTime() {
        return startTime;
    }
    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }
    public Long getEndTime() {
        return endTime;
    }
    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }
    public Integer getQueue() {
        return queue;
    }
    public void setQueue(Integer queue) {
        this.queue = queue;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public Integer getStart() {
        return start;
    }
    public void setStart(Integer start) {
        this.start = start;
    }
    public GameParam(String matchId, int count, Long startTime, Long endTime, Integer queue, String type,
            Integer start) {
        this.matchId = matchId;
        this.count = count;
        this.startTime = startTime;
        this.endTime = endTime;
        this.queue = queue;
        this.type = type;
        this.start = start;
    }

    
    
}
