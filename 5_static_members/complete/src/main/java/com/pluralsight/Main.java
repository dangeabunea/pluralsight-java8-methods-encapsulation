package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        // Unit conversions
        System.out.println(UnitConverter.fromKgsToLbs(100));
        System.out.println(UnitConverter.fromNmToMeters(2));

        Coordinate c1 = Coordinate.origin();
        Coordinate c2 = Coordinate.of(10, 20);
        Coordinate c3 = Coordinate.fromLatLonString("45 78");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
