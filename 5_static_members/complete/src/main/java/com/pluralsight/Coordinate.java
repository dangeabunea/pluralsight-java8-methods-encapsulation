package com.pluralsight;

public class Coordinate {
    private double lat;
    private double lon;

    // Used to instantiate origin coordinate
    private Coordinate() {

    }

    private Coordinate(double lat, double lon) {
        this.lat = lat;
        this.lon = lon;
    }

    private Coordinate(String coordinate) {
        this.lat = Double.parseDouble(coordinate.split(" ")[0]);
        this.lon = Double.parseDouble(coordinate.split(" ")[1]);
    }

    public static Coordinate origin(){
        return new Coordinate();
    }

    public static Coordinate of(double lat, double lon){
        return new Coordinate(lat, lon);
    }

    public static Coordinate fromLatLonString(String coordinate){
        return new Coordinate(coordinate);
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "lat=" + lat +
                ", y=lon=" + lon +
                '}';
    }
}
