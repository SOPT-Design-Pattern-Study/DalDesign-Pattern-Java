package org.example.decorator;

public class GoodEngineOil extends CarDecorator{

    public GoodEngineOil(Car car) {
        super(car);
    }

    @Override
    public int addPerformanceRating() {
        return car.addPerformanceRating() + 30;
    }
}
