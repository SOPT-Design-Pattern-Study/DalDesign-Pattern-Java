package factory_method.factory;

import factory_method.Ios;
import factory_method.Sopt;

public class IosFactory extends SoptFactory {
    @Override
    public Sopt createSopt() {
        return new Ios();
    }
}
