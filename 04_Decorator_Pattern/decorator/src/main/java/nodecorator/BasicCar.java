package nodecorator;

public class BasicCar extends Car{

    int performanceRating = 10;

    public BasicCar() {
        fastBrake = true;
        goodEngineOil = true;
        thickTire = false;
    }

    @Override
    public int addPerformanceRating() {
        return this.performanceRating + super.addPerformanceRating();
    }
}
