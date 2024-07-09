package day18.objectEqualsHashCode;

public class MemberMain {

  public static void main(String[] args) {
    Member m1 = new Member(1111, "SSG");
    Member m2 = new Member(1111, "SSG");

    System.out.println(m1 == m2); // 주소값 비교
    System.out.println(m1.equals(m2));
    System.out.println(m1.hashCode() + " " + m2.hashCode());
  }
}
