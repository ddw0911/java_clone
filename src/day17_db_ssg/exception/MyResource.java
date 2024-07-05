package day17_db_ssg.exception;

public class MyResource implements AutoCloseable{

  private String name;

  public MyResource(String name) {
    this.name = name;
    System.out.println("MyResource( " + this.name + ") 열기");
  }

  public String readOne() {
    System.out.println("MyResource( " + this.name + ") 읽기");
    return "100";
  }

  public String readTwo() {
    System.out.println("MyResource( " + this.name + ") 열기");
    return "readTwo";
  }

  @Override
  public void close() throws Exception { // AutoCloseable을 구현했기때문에 자동으로 close() 메서드를 호출
    System.out.println("MyResource( " + this.name + ") 닫기");

  }
}
