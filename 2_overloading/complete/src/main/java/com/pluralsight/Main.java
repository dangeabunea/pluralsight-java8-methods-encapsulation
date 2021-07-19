package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        double x1 = 0.0;
        double y1 = 0.0;
        double x2 = 2.0;
        double y2 = 2.0;

        DistanceCalculator calc = new DistanceCalculator();
        double distance = calc.calculateHorizontalDistance(x1, y1, x2,y2);

        System.out.println("Distance from method 1 is " + distance);

        Coordinate c1 = new Coordinate(x1, y1);
        Coordinate c2 = new Coordinate(x2, y2);
        distance = calc.calculateHorizontalDistance(c1, c2);

        System.out.println("Distance from method 2 is " + distance);
    }
}
