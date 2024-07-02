package day12_inheritance.morningquiz;

public class ShopService {

  private static ShopService singleton = new ShopService();

  // 싱글톤 패턴
  // 특정 클래스의 인스턴스를 1개만 생성되는 것을 보장하는 디자인패턴
  // 최초 한번 new로 객체생성 - static으로 공유
  // 인스턴스를 재활용할 때 - 메모리낭비 방지
  // but
  // 의존성 (strong coupling) - 유연성(수정,확장)이 떨어짐
  // private 생성자 - 상속불가 (다형성 적용이 어려움)
  // 테스트가 어려움 - 공유된 인스턴스의 상태를 변경해줘야
  // -> 스프링으로 보완, 장점만 사용하도록

  private ShopService() {
  }

  static ShopService getInstance() {
    return singleton;
  }
}
