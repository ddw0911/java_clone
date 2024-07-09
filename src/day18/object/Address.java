package day18.object;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public class Address implements Cloneable{

  private int code;
  @Setter
  private String address;

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return (Address) super.clone();
  }
}
