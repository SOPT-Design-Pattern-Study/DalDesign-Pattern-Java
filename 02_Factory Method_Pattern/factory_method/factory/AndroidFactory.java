package factory_method.factory;

import factory_method.Android;
import factory_method.Sopt;

public class AndroidFactory extends SoptFactory { // 추가
    @Override
    protected Sopt createSopt() {
        return new Android();
    }
}
