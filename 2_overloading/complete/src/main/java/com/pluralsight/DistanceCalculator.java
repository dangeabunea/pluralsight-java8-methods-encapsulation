package com.pluralsight;

import static java.lang.Math.sqrt;

public class DistanceCalculator {
    public double calculateHorizontalDistance(double x1,
                                              double y1,
                                              double x2,
                                              double y2) {
        return sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

    public double calculateHorizontalDistance(Coordinate c1, Coordinate c2) {
        return this.calculateHorizontalDistance(c1.getX(),
                c1.getY(),
                c2.getX(),
                c2.getY());
    }
}
