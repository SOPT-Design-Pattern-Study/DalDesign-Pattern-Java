package org.example.decorator;

public class Truck extends Car{
    int performanceRating = 10;

    @Override
    public int addPerformanceRating() {
        return performanceRating;
    }
}
