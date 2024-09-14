//https://leetcode.com/problems/xor-queries-of-a-subarray

public class XOR_Queries_Of_Subarray {

    public static void main(String[] args) {
        int[] arr = new int[4];
        arr[0] = 4;
        arr[1] = 8;
        arr[2] = 2;
        arr[3] = 10;

        int[][] queries = new int[4][2];
        queries[0][0] = 2;
        queries[0][1] = 3;

        queries[1][0] = 1;
        queries[1][1] = 3;

        queries[2][0] = 0;
        queries[2][1] = 0;

        queries[3][0] = 0;
        queries[3][1] = 3;

        System.out.println("");
        int[] res = xorQueries(arr, queries);
        for (int x : res) {
            System.out.print(x + " - ");
        }
        System.out.println("");
    }

    public static int[] xorQueries(int[] arr, int[][] queries) {
        // the solution take 552ms in runtime

        int[] result = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            if (queries[i][0] == queries[i][1]) {
                result[i] = arr[queries[i][0]];
            } else {
                int x = 0;
                for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                    x = arr[j] ^ x;
                }
                result[i] = x;
            }

        }

        // ===================================
        // the solution take 2 ms in runtime

        int[] arrXOR = new int[arr.length];
        arrXOR[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arrXOR[i] = arrXOR[i - 1] ^ arr[i];
        }

        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            if (l == 0) {
                res[i] = arrXOR[r];
            } else {
                res[i] = arrXOR[r] ^ arrXOR[l - 1];
            }
        }

        return res;

    }
}
