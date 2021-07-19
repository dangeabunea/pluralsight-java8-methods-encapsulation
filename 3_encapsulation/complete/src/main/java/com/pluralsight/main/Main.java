package com.pluralsight.main;

import com.pluralsight.domain.Coordinate;
import com.pluralsight.domain.RadarAircraft;

class Main {
    public static void main(String[] args) {
        /* BEFORE

        // Define aircraft
        RadarAircraft ro123 = new RadarAircraft(
                "ro123",
                280, new Coordinate(0, 0),
                new Coordinate(2, 3),
                new Coordinate(5, 6));

        // Calculate distance
        DistanceCalculator distanceCalculator = new DistanceCalculator();
        double ro123TotalDistance = distanceCalculator
                .calculateHorizontalDistance(ro123.pastRoute);
        System.out.println("Total distance is " + ro123TotalDistance);

        // Change altitude
        ro123.altitudeFL = 200;

         */

        // Define aircraft
        RadarAircraft ro123 = new RadarAircraft(
                "ro123",
                280, new Coordinate(0, 0),
                new Coordinate(2, 3),
                new Coordinate(5, 6));

        // Calculate distance
        System.out.println("Total distance is " + ro123.calculateDistance());

        // Change altitude
        ro123.setAltitudeFL(200);

        // Print aircraft coordinates
        System.out.println("Aircraft coordinates");
        ro123.getPastRoute().forEach(System.out::println);
    }
}
