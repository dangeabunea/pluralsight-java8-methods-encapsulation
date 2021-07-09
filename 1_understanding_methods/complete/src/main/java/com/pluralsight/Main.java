package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        // Create radar target
        RadarAircraft ro123 = new RadarAircraft(
                "RO123",
                280,
                20,
                895,
                20000);

        // Calculate range and see effect of changing
        // primitive type parameter within method
        int fuelConsumptionLitersPerHour = 2000;
        int ro123Range = ro123.calculateRange(fuelConsumptionLitersPerHour);

        System.out.println("Range is " + ro123Range + " km");
        System.out.println(fuelConsumptionLitersPerHour);

        // Print radar label and see effect of changing
        // reference type parameter within method
        RadarLabelOptions options = new RadarLabelOptions(
                true,
                false);

        System.out.println();
        ro123.printLabel(options);
        System.out.println(options.isShowAltitudeTrendArrow());
        System.out.println(options.isShowSpeed());
    }
}
