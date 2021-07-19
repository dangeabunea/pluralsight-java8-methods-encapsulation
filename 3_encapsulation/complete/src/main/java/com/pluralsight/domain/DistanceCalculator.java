package com.pluralsight.domain;

import java.util.List;

import static java.lang.Math.sqrt;

class DistanceCalculator {
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

    public double calculateHorizontalDistance(List<Coordinate> coordinates) {
        double distance = 0;
        for (int i = 0; i < coordinates.size() - 1; i++) {
            distance += this.calculateHorizontalDistance(
                    coordinates.get(i),
                    coordinates.get(i + 1));
            coordinates.get(i).setX(41);
        }

        return distance;
    }
}
