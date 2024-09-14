//https://leetcode.com/problems/longest-subarray-with-maximum-bitwise-and

public class Longest_Subarray {

  public static void main(String[] args) {
    // [311155,311155,311155,311155,311155,311155,311155,311155,201191,311155]
    int[] x = new int[11];
    x[0] = 311155;
    x[1] = 311155;
    x[2] = 311155;
    x[3] = 311155;
    x[4] = 311155;
    x[5] = 311155;
    x[6] = 311155;
    x[7] = 311155;
    x[8] = 201191;
    x[9] = 311155;
    x[10] = 43536;

    int[] y = new int[4];
    y[0] = 1;
    y[1] = 2;
    y[2] = 3;
    y[3] = 4;

    int res = longestSubarray(x);
    System.out.println(res);
  }

  public static int longestSubarray(int[] nums) {

    int max = Integer.MIN_VALUE;
    int count = 0;
    int countMax = 0;

    for (int i = 0; i < nums.length; i++) {
      max = Math.max(max, nums[i]);
    }

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == max) {
        count++;
      } else {
        countMax = Math.max(countMax, count);
        count = 0;
      }
    }
    return Math.max(countMax, count);
  }
}