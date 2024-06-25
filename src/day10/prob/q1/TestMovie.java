package day10.prob.q1;

public class TestMovie {

  public static void main(String[] args) {
    Movie testMovie = new Movie();
    testMovie.setTitle("어거스트 러쉬");
    testMovie.setGenre("Drama");
    testMovie.play();
    System.out.println("---------------");

    Movie testMovie2 = new Movie();
    testMovie2.setTitle("나는 전설이다");
    testMovie2.setGenre("SF");
    testMovie2.play();
  }
}
