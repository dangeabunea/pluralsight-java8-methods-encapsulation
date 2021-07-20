package com.pluralsight;

public class Coordinate {
    private double lat;
    private double lon;

    // Used to instantiate origin coordinate
    Coordinate() {

    }

    Coordinate(double lat, double lon) {
        this.lat = lat;
        this.lon = lon;
    }

    Coordinate(String coordinate) {
        this.lat = Double.parseDouble(coordinate.split(" ")[0]);
        this.lon = Double.parseDouble(coordinate.split(" ")[1]);
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "lat=" + lat +
                ", y=lon=" + lon +
                '}';
    }
}
