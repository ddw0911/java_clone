package day18.lombokex;

public class StoreMain {

  public static void main(String[] args) {
    StoreInfoDTO shop1 = new StoreInfoDTO();
    shop1.setName("현대");
    StoreInfoDTO shop2 = new StoreInfoDTO("기아", "12304024", "070-4313-4424", "automobile",
        "Seoul");
    StoreInfoDTO shop3 = new StoreInfoDTO("기아", "231435124", "070-4313-4424", "automobile",
        "Seoul");
    System.out.println(shop1.toString());
    System.out.println(shop2.toString());

    if (shop1.equals(shop2)) {
      System.out.println("같은 가게");
    } else {
      System.out.println("다른 가게");
    }
    if (shop2.equals(shop3)) { // name이 같으므로 같은 참조값으로 간주 by of =
      System.out.println("같은 가게");
    } else {
      System.out.println("다른 가게");
    }

    StoreInfoDTO shop4 = StoreInfoDTO.builder().name("빵빵").build();
    System.out.println(shop4);

  }
}
