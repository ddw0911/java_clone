package day18.object;

public class MemberCloneTest {

  public static void main(String[] args) {
    Member member = new Member("ssg",30, new Address(10101,"Incheon"));
    try {
      // deep copy : 틀 + 내용까지 새로운 객체로 복사
      Member member2 = member.clone();
      Address address1 = member.getAddressObj();
      Address address2 = member2.getAddressObj();

      System.out.printf("member hashcode : %s, addressObj : %s%n", member, member.getAddressObj());
      System.out.printf("member2 hashcode : %s, addressObj : %s%n", member2, member2.getAddressObj());

      System.out.printf("address1 hashcode : %s, addressObj : %s%n", address1, address1.getAddress());
      System.out.printf("address2 hashcode : %s, addressObj : %s%n", address2, address2.getAddress());

      // address 값 변경
      address2.setAddress("Kyeonggi");
      System.out.printf("address2 hashcode : %s, addressObj : %s%n", address2, address2.getAddress());

//      System.out.println(member);
//      System.out.println(member2);
//
//      Address address1 = new Address(10002, "서울시 동대문구");
//      String address = address1.getAddress(); // address
//      member2.setAddressObj(address1);
//      System.out.println(member2);
    } catch (CloneNotSupportedException e) {
      throw new RuntimeException(e);
    }
  }
}
