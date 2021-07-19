package com.pluralsight.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RadarAircraft {
    private String callSign;
    private int altitudeFL;
    private List<Coordinate> pastRoute;

    public RadarAircraft(String callSign, int altitudeFL, Coordinate... pastRoute){
        this.setCallSign(callSign);
        this.setAltitudeFL(altitudeFL);
        this.pastRoute = Arrays.asList(pastRoute);
    }

    public String getCallSign() {
        return callSign;
    }

    public List<Coordinate> getPastRoute() {
        List<Coordinate> routeCopy = new ArrayList<>();
        this.pastRoute.forEach(c -> routeCopy.add(new Coordinate(c.getX(), c.getY())));
        return routeCopy;
    }

    public int getAltitudeFL() {
        return altitudeFL;
    }

    public void setAltitudeFL(int altitudeFL) {
        if (altitudeFL < 0 || altitudeFL > 350) {
            throw new IllegalArgumentException("Altitude must be positive");
        }
        this.altitudeFL = altitudeFL;
    }

    private void setCallSign(String callSign) {
        if (callSign == null || callSign.equals("")) {
            throw new IllegalArgumentException("CallSign must have value");
        }
        this.callSign = callSign;
    }

    public double calculateDistance(){
        DistanceCalculator distanceCalculator = new DistanceCalculator();
        return distanceCalculator.calculateHorizontalDistance(this.getPastRoute());
    }
}
