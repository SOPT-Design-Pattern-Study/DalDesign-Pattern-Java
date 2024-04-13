package factory_method.factory;

import factory_method.Sopt;

public abstract class SoptFactory {

    // 객체 생성 처리 메서드(final로 오버라이딩 방지)
    public final Sopt createOperation() {
        Sopt sopt = createSopt(); // 서브 클래스에서 구체화한 팩토리 메서드 실행
//        sopt.setup();  // .. 이밖의 객체 생성에 가미할 로직 실행
        return sopt;  // 완성된 객체 반환
    }

    // 팩토리 메소드 : 구체적인 객체 생성 종류는 각 서브 클래스에 위임
    // protected 이기 때문에 같은 패키지 내의 클래스거나, 해당 클래스를 상속받은 자식클래스에서만 접근 가능
    protected abstract Sopt createSopt();
}
