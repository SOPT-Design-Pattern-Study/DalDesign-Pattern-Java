package org.example.decorator;

public class Suv extends Car {

    private final int performanceRating = 10;

    @Override
    public int addPerformanceRating() {
        return performanceRating;
    }
}
