package org.example.decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        Car suv = new FastBrake(new ThickTire(new Suv()));
        System.out.println(suv.addPerformanceRating());
    }
}
