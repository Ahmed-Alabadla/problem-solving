// https://leetcode.com/problems/majority-element-ii/description/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Majority_Element {

  public static void main(String[] args) {
    int[] x = new int[3];
    x[0] = 3;
    x[1] = 2;
    x[2] = 3;
    List<Integer> majorityElement = majorityElement(x);
    System.out.println(majorityElement.toString());
  }

  public static List<Integer> majorityElement(int[] nums) {
    HashMap<Integer, Integer> map = new HashMap<>();
    ArrayList<Integer> res = new ArrayList<>();

    int n = nums.length;
    int maj = (int) Math.floor(n / 3);
    for (int i = 0; i < n; i++) {
      map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
    }

    map.keySet().forEach((item) -> {
      int key = item;
      int value = map.get(item);

      if (value > maj) {
        res.add(key);
      }
    });

    return res;

  }
}
