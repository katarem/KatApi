package katarem.lolapi.constants;

public enum Region {
    AMERICAS("americas"),
    ASIA("asia"),
    EUROPE("europe"),
    SEA("sea");

    public String server;
    Region(String server){
        this.server = server;
    }
}
