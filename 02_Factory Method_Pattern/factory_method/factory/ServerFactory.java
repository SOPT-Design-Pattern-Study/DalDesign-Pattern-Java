package factory_method.factory;

import factory_method.Server;
import factory_method.Sopt;

public class ServerFactory extends SoptFactory {
    @Override
    public Sopt createSopt() {
        return new Server();
    }
}
