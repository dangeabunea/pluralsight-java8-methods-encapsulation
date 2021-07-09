package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        RadarAircraft ro123 = new RadarAircraft(
                "RO123",
                280,
                20,
                895,
                20000);

        RadarLabelOptions options = new RadarLabelOptions(
                true,
                false);

        ro123.printLabel(options);
        System.out.println(options.isShowAltitudeTrendArrow());
        System.out.println(options.isShowSpeed());

        int fuelConsumptionLitersPerHour = 2000;
        int ro123Range = ro123.calculateRange(fuelConsumptionLitersPerHour);
        System.out.println();
        System.out.println("Range is " + ro123Range + " km");
        System.out.println(fuelConsumptionLitersPerHour);
    }
}
