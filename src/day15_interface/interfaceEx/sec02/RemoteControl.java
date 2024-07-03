package day15_interface.interfaceEx.sec02;

public interface RemoteControl {

  // 필드에 상수(public static final)만을 갖는다
  public static final int MAX_VOLUME = 30; // 상수는 대문자로 , 공백은 _
  int MIN_VOLUME = 0; // 키워드 생략가능 (자동 컴파일)
}