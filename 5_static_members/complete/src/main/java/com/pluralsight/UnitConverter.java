package com.pluralsight;

public class UnitConverter {
    private static final int metersInOneNm = 1852;

    public static double fromNmToMeters(double nm) {
        return nm * metersInOneNm;
    }

    public static double fromMetersToNm(double meters) {
        return meters / metersInOneNm;
    }

    private static final double kilogramsInOneLb = 2.2046226218;

    public static double fromKgsToLbs(int kgs) {
        return kgs * kilogramsInOneLb;
    }

    public static double fromLbsToKgs(int lbs) {
        return lbs / kilogramsInOneLb;
    }
}
