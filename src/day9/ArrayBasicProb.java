package day9;

public class ArrayBasicProb {

  public static void main(String[] args) {

    int[] ia = new int[]{3,7,1,8,10,2,15,2,10};
    int[] ib = new int[]{1,2,3,4,5};

    ArrayBasicProb prob1 = new ArrayBasicProb();
    prob1.isOddCalculator(ia);
    prob1.isOddCalculator(ib);
    prob1.RandomPrint();
  }

  void isOddCalculator(int[] arr) {
    int oddSum = 0;
    int evenSum = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 == 1) {
        oddSum += arr[i];
      } else {
        evenSum += arr[i];
      }
    }
    System.out.println("홀수의 합 : " + oddSum);
    System.out.println("짝수의 합 : " + evenSum);
  }

  void RandomPrint() {
    int[] random = new int[5];
    for (int i = 0; i < random.length; i++) {
      random[i] = (int) (Math.random() * 100) + 1;
      System.out.print(random[i] + " ");
    }
  }
}