package day10.prob.q1;

public class Movie {

  String title;
  String genre;

  void play() {
    System.out.println(title + "(" + genre + ") 상영중입니다.");
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }
}
