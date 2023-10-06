// https://leetcode.com/problems/reverse-integer/

public class Reverse_Integer {
  public static void main(String[] args) {
    System.out.println(reverse(-253));
  }

  public static int reverse(int num) {
    long reverse = 0;
    int low = (int) Math.pow(-2, 31);
    int high = (int) (Math.pow(2, 31) - 1);

    while (num != 0) {
      int rem = num % 10;
      reverse = reverse * 10 + rem;
      num = num / 10;
    }

    if (reverse < low || reverse > high) {
      reverse = 0;
    }
    return (int) reverse;
  }
}
