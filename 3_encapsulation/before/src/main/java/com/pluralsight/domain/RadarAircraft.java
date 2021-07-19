package com.pluralsight.domain;

import java.util.Arrays;
import java.util.List;

public class RadarAircraft {
    public String callSign;
    public int altitudeFL;
    public List<Coordinate> pastRoute;

    public RadarAircraft(String callSign, int altitudeFL, Coordinate... pastRoute){
        this.callSign = callSign;
        this.altitudeFL = altitudeFL;
        this.pastRoute = Arrays.asList(pastRoute);
    }
}
