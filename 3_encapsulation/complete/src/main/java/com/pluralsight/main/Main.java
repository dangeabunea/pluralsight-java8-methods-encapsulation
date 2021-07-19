package com.pluralsight.main;

import com.pluralsight.domain.Coordinate;
import com.pluralsight.domain.RadarAircraft;

class Main {
    public static void main(String[] args) {
        // Define aircraft
        RadarAircraft ro123 = new RadarAircraft(
                "RO123",
                280, new Coordinate(0, 0),
                new Coordinate(2, 3),
                new Coordinate(5, 6));

        // Calculate distance
        double ro123TotalDistance = ro123.calculateDistance();
        System.out.println("Total distance is " + ro123TotalDistance);
        System.out.println(ro123.getPastRoute());

        // Change altitude
        ro123.setAltitudeFL(200);
    }
}
