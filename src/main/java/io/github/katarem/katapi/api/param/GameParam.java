package io.github.katarem.katapi.api.param;

import io.github.katarem.katapi.constants.Langs;

public class GameParam {
    public String puuid;
    public int count = 20;
    public Long startTime = null; //default value
    public Long endTime = null; //default value
    public Integer queue = null; //default value
    public String type = null; //default value
    public Integer start = null; //default value
    public Langs lang = Langs.ENGLISH_UK;

    public GameParam() {
    }

    public String getPuuid() {
        return puuid;
    }
    public void setPuuid(String matchId) {
        this.puuid = matchId;
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
    public void setLang(Langs lang) {
        this.lang = lang;
    }
    public Langs getLang() {
        return lang;
    }
    public GameParam(String matchId, int count, Long startTime, Long endTime, Integer queue, String type,
            Integer start, Langs lang) {
        this.puuid = matchId;
        this.count = count;
        this.startTime = startTime;
        this.endTime = endTime;
        this.queue = queue;
        this.type = type;
        this.start = start;
        this.lang = lang;
    }

    
    
}
