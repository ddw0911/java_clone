package day18.lombokex;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Data // getter setter toString 포함 but 무한 루프 위험
@Getter
@ToString
//@ToString(exclude = "field") // 출력제외필드 설정
@RequiredArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"name"}) // 클래스에 대한 equals(), hashCode() - 2개 객체가 같은 참조값을 갖는지
@Builder
public class StoreInfoDTO {

  @Setter // Setter는 데이터 보안을 위협하기도하므로 선택적으로 사용
  private String name;
  @ToString.Exclude // 특정 필드 toString 제외
  private String fieldCode;
  private String contactNum;
  private String field;
  private String address;

}
