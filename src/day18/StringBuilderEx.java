package day18;

public class StringBuilderEx {

  public static void main(String[] args) {
    String data = new StringBuilder().append("ABC")
        .append('K').insert(0, "abc").delete(0, 1).toString();
    System.out.println(data);


  }
}
