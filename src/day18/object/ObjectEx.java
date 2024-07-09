package day18.object;

class MyObject implements Cloneable{

  private String name;
  private int age;

  @Override
  protected MyObject clone() throws CloneNotSupportedException {
    try {
      return (MyObject) super.clone();
    } catch (CloneNotSupportedException e) {
      return null;
    }
  }
}
public class ObjectEx {

  public static void main(String[] args) throws CloneNotSupportedException {
    MyObject myObject = new MyObject();
    System.out.println(myObject.toString());
    MyObject clObject = myObject.clone();
    System.out.println(clObject);
  }
}
