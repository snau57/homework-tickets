package com.train;

public class Tickets {
    int numbers;
    int roundTrip;
    int total = 0;

    public Tickets(int numbers, int roundTrip) {
        this.numbers = numbers;
        this.roundTrip = roundTrip;
    }

    public void print() {
        total = (numbers - roundTrip) * 1000 + (int)(roundTrip * 2000 * 0.9f);
        System.out.println("Total tickets: " + numbers + "\t" +
                "Round-trip: " + roundTrip + "\t" +
                "Total: " + total);
    }

}
