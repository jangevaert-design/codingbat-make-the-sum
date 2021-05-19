public class MakeTheSum {

  /*
  Given 3 int values, a b c, return their sum.
  However, if one of the values is the same as another of the values, it does not count towards the sum.

  loneSum(1, 2, 3) → 6
  loneSum(3, 2, 3) → 2
  loneSum(3, 3, 3) → 0
   */
  

  public static void main(String[] args) {
    MakeTheSum makeTheSum = new MakeTheSum();

    System.out.printf("the sum of %d, %d and %d is: " + makeTheSum.returnTheSum(1, 2, 3) +"\n\n", 1, 2, 3);
    System.out.printf("the sum of %d, %d and %d is: " + makeTheSum.returnTheSum(3, 2, 3) +"\n\n", 3, 2, 3);
    System.out.printf("the sum of %d, %d and %d is: " + makeTheSum.returnTheSum(3, 3, 3) +"\n\n", 3, 3, 3);

  }

  public static int returnTheSum(int a, int b, int c) {
    if (a == b && a == c) {
      return 0;
    } else if (a == b) {
      return c;
    } else if (a == c) {
      return b;
    } else if (b == c) {
      return a;
    } else {
      return a + b + c;
    }
  }

}
