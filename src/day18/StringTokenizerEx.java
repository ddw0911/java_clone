package day18;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenizerEx {

  public static void main(String[] args) {
    String data1 = "나&너&우리";

    StringTokenizer st = new StringTokenizer(data1, "&");
    int count = 0;

    while (st.hasMoreTokens()) {
      String token = st.nextToken();
      count++;
      System.out.println(count + " " + token);
    }

//    System.out.println(Arrays.toString(data1.split("&")));
    String[] result = data1.split("&");
    int count2 = 0;
    for (String s : result) {
      count2++;
      System.out.println(count2 + " " + s);
    }
  }
}
