package io.github.katarem.katapi.constants;

/**
 * Contains all the regions to query to
 */
public enum Region {
    AMERICAS("americas"),
    ASIA("asia"),
    EUROPE("europe"),
    SEA("sea");

    public String server;

    Region(String server) {
        this.server = server;
    }
}
