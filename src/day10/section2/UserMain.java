package day10.section2;

public class UserMain {

  public static void main(String[] args) {
//    User user = new User();
//    System.out.println("user = " + user.country);
//    System.out.println("user = " + user.id);
//    System.out.println("user = " + user.name);
//
    User user1 = new User("Jenny", "991213-2231024");
    String s = user1.getName();
    String n = user1.getId();

    user1.setName("홍길동");
    user1.setId("1111111111111");
    System.out.println(s + n);
    System.out.println(user1.getName() + user1.getId());
  }
}
