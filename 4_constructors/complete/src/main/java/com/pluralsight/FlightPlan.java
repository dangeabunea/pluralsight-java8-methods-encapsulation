package com.pluralsight;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class FlightPlan {
    String id;
    String departure;
    String destination;
    LocalDateTime departureTime;
    List<String> route;

    private FlightPlan() {
        System.out.println("FlightPlan() Constructor");
        this.id = UUID.randomUUID().toString();
    }

    FlightPlan(String departure, String destination) {
        this();

        if (departure == null || destination == null) {
            throw new IllegalArgumentException();
        }

        System.out.printf("FlightPlan( %s, %s) Constructor%n", departure, destination);

        this.departure = departure;
        this.destination = destination;
    }

    FlightPlan(String departure, String destination, LocalDateTime departureTime, List<String> route) {
        this(departure, destination);

        if (departureTime == null || route == null) {
            throw new IllegalArgumentException();
        }

        System.out.printf("FlightPlan( %s, %s, %s, %s) Constructor%n",
                departure,
                destination,
                departureTime.toLocalTime(),
                route.toString());

        this.route = route;
        this.departureTime = departureTime;
    }

    public void print() {
        String msg = "{" +
                "id='" + this.id + '\'' +
                "departure='" + this.departure + '\'' +
                ", destination='" + this.destination + '\'' +
                ", departureDateTime=" + this.departureTime +
                ", route=" + this.route +
                '}';
        System.out.println(msg);
    }
}
