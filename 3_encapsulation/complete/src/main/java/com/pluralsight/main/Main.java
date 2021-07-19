package com.pluralsight.main;

import com.pluralsight.domain.Coordinate;
import com.pluralsight.domain.DistanceCalculator;
import com.pluralsight.domain.RadarAircraft;

public class Main {
    public static void main(String[] args) {
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
    }
}
