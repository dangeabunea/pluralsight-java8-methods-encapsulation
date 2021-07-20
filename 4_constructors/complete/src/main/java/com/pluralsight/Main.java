package com.pluralsight;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Partial flight plan
        FlightPlan berlinToBucharest = new FlightPlan(
                "BER",
                "OTP"
        );
        berlinToBucharest.print();

        System.out.println();

        // Complete flight plan
        FlightPlan londonToParis = new FlightPlan(
                "LHR",
                "CDG",
                LocalDateTime.of(2021, 11, 10, 22, 10),
                Arrays.asList("LHR", "FARAR", "BAYKA", "DUDES", "CDG")
        );
        londonToParis.print();
    }
}
