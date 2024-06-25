package day9.section5;

import java.io.IOException;
import java.util.Scanner;

public class MultidimensionalArrayByNewExample {

  public static void main(String[] args) throws IOException {
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    StringTokenizer st = new StringTokenizer(br.readLine());
//    // 각 반의 학생 수가 3명으로 동일할 경우 점수 저장을 위한 2차원 배열 생성
//    int[][] engScores = new int[2][3];
//    int total = 0;
//    double average = 0.0;
//    int studentNum = 0;
//
//    for (int i = 0; i < engScores.length; i++) {
//      studentNum += engScores[i].length;
//      for (int j = 0; j < engScores[i].length; j++) {
//        // 배열 항목 초기값 출력
////        System.out.println(engScores[i][j]);
//        // 배열 항목 값 변경
////        st = new StringTokenizer(br.readLine());
//        engScores[i][j] = Integer.parseInt(br.readLine());
//        total += engScores[i][j];

    // 전체 학생의 수학 평균 구하기
//    System.out.println((double) total/studentNum);
//    System.out.println(Arrays.toString(engScores));

    // 각 반의 학생 수가 다를 경우 점수 저장을 위한 2차원 배열 생성
//    int[][] mathScore = new int[3][];
//    int total1 = 0;
//    int stuNum = 0;
//    Scanner sc = new Scanner(System.in);
//    for (int i = 0; i < mathScore.length; i++) {
//      stuNum = Integer.parseInt(sc.nextLine());
//
//      mathScore[i] = new int[stuNum];
//      for (int j = 0; j < mathScore[i].length; j++) {
//        //st = new StringTokenizer(br.readLine());
//        mathScore[i][j] = Integer.parseInt(sc.nextLine());
//        System.out.println(mathScore[i][j]);
////        total1 = mathScore[i][stuNum];

//    System.out.println();
    // 배열 항목 값 변경

    // 전체 학생의 영어 평균 구하기
    int[][] mathScore = new int[3][];
    int total1 = 0;
    int stuNum = 0;
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < mathScore.length; i++) {
      stuNum = Integer.parseInt(sc.nextLine());

      mathScore[i] = new int[stuNum];
      for (int j = 0; j < mathScore[i].length; j++) {
//st = new StringTokenizer(br.readLine());
        mathScore[i][j] = Integer.

            parseInt(sc.nextLine());
        System.out.

            println(mathScore[i][j]);

//        total1 = mathScore[i][stuNum];
      }
    }
  }
}