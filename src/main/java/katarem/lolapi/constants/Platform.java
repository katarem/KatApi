package katarem.lolapi.constants;

public enum Platform {
    
    BRAZIL("br1"),
    EUROPE_NORTH_EAST("eun1"),
    EUROPE_WEST("euw1"),
    JAPAN("jp1"),
    KOREA("kr"),
    LATIN_AMERICA_NORTH("la1"),
    LATIN_AMERICA_SOUTH("la2"),
    NORTH_AMERICA("na1"),
    OCEANIA("oc1"),
    PBE("pbe"),     
    PHILLIPINES("ph2"),
    RUSSIA("ru"),
    SINGAPORE("sg2"),
    TAIWAN("th2"),
    TURKEY("tr1"),
    VIETNAM("vn2");

    public String server;
    Platform(String server){
        this.server = server;
    };
}
