package com.despegar.screenplay.model;

public class Package {
    private final String departure;
    private final String destination;

    public Package(String departure, String destination) {
        this.departure = departure;
        this.destination = destination;
    }

    public String getDeparture() {
        return departure;
    }

    public String getDestination() {
        return destination;
    }
}
