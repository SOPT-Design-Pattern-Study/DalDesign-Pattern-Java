package nodecorator;

public class Car {
    boolean fastBrake;
    boolean thickTire;
    boolean goodEngineOil;

    public boolean hasFastBrake() {
        return fastBrake;
    }

    public boolean hasThickTire() {
        return thickTire;
    }

    public boolean hasGoodEngineOil() {
        return goodEngineOil;
    }

    public int addPerformanceRating() {
        int rating = 0;
        if (hasThickTire()) {
            rating += 10;
        }
        if (hasFastBrake()) {
            rating += 20;
        }
        if (hasGoodEngineOil()) {
            rating += 30;
        }
        return rating;
    }
}

