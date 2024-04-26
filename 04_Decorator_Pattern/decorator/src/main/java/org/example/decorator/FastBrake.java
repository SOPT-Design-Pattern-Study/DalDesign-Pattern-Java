package org.example.decorator;

public class FastBrake extends CarDecorator{

    public FastBrake(Car car) {
        super(car);
    }

    @Override
    public int addPerformanceRating() {

        return car.addPerformanceRating() + 10;
    }
}
