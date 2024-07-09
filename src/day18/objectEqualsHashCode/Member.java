package day18.objectEqualsHashCode;

import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Member {

  private int memberCode;
  String name;

  @Override
  public boolean equals(Object o) {
    if (o instanceof Member m) {
      if (this.memberCode == m.getMemberCode() && this.name.equals(m.getName())) {
        return true;
      }
    }
    return false;
  }

  @Override
  public int hashCode() {
//    return Objects.hashCode(name);
    int result = this.name.hashCode(); // name의 해시코드를 검색하기 위해 오버라이드
    return result;
  }
}
