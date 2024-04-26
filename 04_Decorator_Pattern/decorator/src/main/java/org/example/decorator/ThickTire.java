package org.example.decorator;

public class ThickTire extends CarDecorator{

    public ThickTire(Car car) {
        super(car);
    }

    @Override
    public int addPerformanceRating() {
        return car.addPerformanceRating() + 20;
    }
}
