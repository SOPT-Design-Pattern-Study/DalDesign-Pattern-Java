package simple_factory.simple_factory_not_depend_on.factory;

import simple_factory.simple_factory_not_depend_on.Android;
import simple_factory.simple_factory_not_depend_on.Ios;
import simple_factory.simple_factory_not_depend_on.Server;
import simple_factory.simple_factory_not_depend_on.Sopt;

public class SoptFactory {
    public Sopt createSopt(Sopt.Part soptPart) {
        switch (soptPart) {
            case SERVER:
                return new Server();
            case IOS:
                return new Ios();
            case ANDROID:
                return new Android();
            default:
                throw new IllegalArgumentException("Sopt에 없는 파트입니다");
        }
    }
}


