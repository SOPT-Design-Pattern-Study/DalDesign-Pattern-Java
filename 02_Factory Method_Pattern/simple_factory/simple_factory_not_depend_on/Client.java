package simple_factory.simple_factory_not_depend_on;

import simple_factory.simple_factory_not_depend_on.factory.SoptFactory;

public class Client {
    public static void main(String[] args) {
        SoptFactory soptFactory = new SoptFactory();
        Sopt server = soptFactory.createSopt(Sopt.Part.SERVER);
        Sopt ios = soptFactory.createSopt(Sopt.Part.IOS);
        Sopt android = soptFactory.createSopt(Sopt.Part.ANDROID); // 추가


        server.printLanguage();
        ios.printLanguage();
        android.printLanguage(); // 추가
    }
}
