package day18.object;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Member implements Cloneable{

  private String name;
  private int age;
//  private String address;
  private Address addressObj; // copy하려면 해당 객체도 cloneable 구현시켜야

  @Override
  protected Member clone() throws CloneNotSupportedException {
    try {
      Object clAddress = addressObj.clone();
      Address addr = (Address) clAddress;
      Member clMember = (Member) super.clone();
      clMember.setAddressObj(addr);
      return clMember;
    } catch (CloneNotSupportedException e) {
      return null;
    }
  }

  @Override
  public String toString() {
    return "Member{" +
        "name='" + name + '\'' +
        ", age=" + age +'\'' + this.hashCode() +
        '}';
  }
}