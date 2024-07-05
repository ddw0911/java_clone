package day17_db_ssg.dbEx;

public class User {

  private String userId;
  private String userName;
  private int userAge;
  private String userEmail;

  public User() {
  }

  public User(String userId, String userName, int userAge, String userEmail) {
    this.userId = userId;
    this.userName = userName;
    this.userAge = userAge;
    this.userEmail = userEmail;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public void setUserAge(int userAge) {
    this.userAge = userAge;
  }

  public String getUserId() {
    return userId;
  }

  public String getUserName() {
    return userName;
  }

  public int getUserAge() {
    return userAge;
  }

  public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }

  @Override
  public String toString() {
    return "User{" +
        "userId='" + userId + '\'' +
        ", userName='" + userName + '\'' +
        ", userAge=" + userAge +
        ", userEmail='" + userEmail + '\'' +
        '}';
  }
}
