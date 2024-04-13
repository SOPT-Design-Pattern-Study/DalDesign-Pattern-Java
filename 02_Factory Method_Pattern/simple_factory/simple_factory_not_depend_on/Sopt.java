package simple_factory.simple_factory_not_depend_on;

public interface Sopt {
    enum Part { // 추가
        SERVER, IOS, ANDROID
    }

    void printLanguage();
}

