package org.example.decorator;

public abstract class CarDecorator extends Car{

    protected Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    public abstract int addPerformanceRating();
}
