package day10.section1;

public class UserMain {

  public static void main(String[] args) {
    User user = new User();
    System.out.println("user = " + user.country);
    System.out.println("user = " + user.id);
    System.out.println("user = " + user.name);

    User user1 = new User("Jenny", "991213-2231024");
    System.out.println(user1.country);
  }
}
