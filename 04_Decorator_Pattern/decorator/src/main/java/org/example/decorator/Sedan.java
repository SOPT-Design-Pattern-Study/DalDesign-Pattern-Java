package org.example.decorator;

public class Sedan extends Car{
    int performanceRating = 30;

    @Override
    public int addPerformanceRating() {
        return performanceRating;
    }
}
