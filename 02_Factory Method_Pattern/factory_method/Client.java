package factory_method;

import factory_method.factory.AndroidFactory;
import factory_method.factory.IosFactory;
import factory_method.factory.ServerFactory;
import factory_method.factory.SoptFactory;

public class Client {
    public static void main(String[] args) {
        // 각 타입의 팩토리 인스턴스 생성
        SoptFactory serverFactory = new ServerFactory();
        SoptFactory iosFactory = new IosFactory();
        SoptFactory androidFactory = new AndroidFactory();

        // 서버 객체 생성 및 사용
        Sopt server = serverFactory.createOperation();
        server.printLanguage();

        // iOS 객체 생성 및 사용
        Sopt ios = iosFactory.createOperation();
        ios.printLanguage();

        // Andorid 객체 생성 및 사용
        Sopt android = androidFactory.createOperation();
        android.printLanguage();
    }
}


