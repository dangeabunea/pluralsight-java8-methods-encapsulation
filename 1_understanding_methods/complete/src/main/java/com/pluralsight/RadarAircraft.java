package com.pluralsight;

public class RadarAircraft {
    private String callSign;
    private int altitudeFL;
    private int rateClimbDescent;
    private int speedKmh;
    private int remainingFuel;

    RadarAircraft(String callSign,
                  int altitudeFL,
                  int rateClimbDescent,
                  int speedKmh,
                  int remainingFuel) {
        this.callSign = callSign;
        this.altitudeFL = altitudeFL;
        this.rateClimbDescent = rateClimbDescent;
        this.speedKmh = speedKmh;
        this.remainingFuel = remainingFuel;
    }

    public int calculateRange(int fuelConsumptionLitersPerHour)
            throws ArithmeticException {
        int flightHours = remainingFuel / fuelConsumptionLitersPerHour;

        // Just for explaining what happens when we change
        // primitive type arguments passed into method
        fuelConsumptionLitersPerHour = 0;

        return flightHours * speedKmh;
    }

    public void printLabel(RadarLabelOptions displayOptions) {
        StringBuilder sb = new StringBuilder(callSign);
        sb.append(System.lineSeparator());
        sb.append("FL ").append(altitudeFL);

        if (displayOptions.isShowAltitudeTrendArrow()) {
            if (rateClimbDescent > 0) {
                sb.append(" ▲");
            } else if (rateClimbDescent < 0) {
                sb.append(" ▼");
            }
        }
        if (displayOptions.isShowSpeed()) {
            sb.append(System.lineSeparator());
            sb.append(speedKmh).append(" kmh");
        }

        System.out.println(sb);

        // Just for explaining what happens when we change
        // reference type arguments passed into method
        displayOptions.setShowAltitudeTrendArrow(false);
    }
}
