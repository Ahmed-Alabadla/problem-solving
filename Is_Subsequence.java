// https://leetcode.com/problems/is-subsequence/description/

public class Is_Subsequence {

  public static void main(String[] args) {
    System.out.println(isSubsequence("acb", "ahbgdc"));
  }

  public static boolean isSubsequence(String s, String t) {
    if (s.isEmpty() && t.isEmpty()) {
      return true;
    }

    if (t.length() == 0 && !s.isEmpty()) {
      return false;
    }

    if (t.length() == s.length() && s.charAt(0) != t.charAt(0)) {
      return false;
    }

    boolean isEqual = false;
    char[] sArray = s.toCharArray();
    char[] tArray = t.toCharArray();

    int index = 0;
    int count = 0;
    for (int i = 0; i < sArray.length; i++) {

      if (index > tArray.length) {
        break;
      }
      for (int j = index; j < tArray.length; j++) {
        if (s.charAt(i) == t.charAt(j)) {
          count++;
          index = j + 1;
          break;
        }
      }
    }

    if (count == s.length()) {
      isEqual = true;
    }

    return isEqual;
  }
}