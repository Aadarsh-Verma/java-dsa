import java.util.*;
import java.io.*;

public class min_diff_squad {
    static int min_diff(int[] arr, int n, int i, int j, int sum1, int sum2, boolean take1) {
        if (i > j) {
            System.out.println(i+" "+j);
            System.out.println(Math.abs(sum1-sum2));
            return Math.abs(sum1 - sum2);
        }
        int case1 = 0, case2 = 0, case3 = 0, case4 = 0;
        if (take1) {
            case1 = min_diff(arr, n, i + 1, j, sum1 + arr[i], sum2, false);
            case2 = min_diff(arr, n, i, j - 1, sum1 + arr[j], sum2, false);
        } else {
            case3 = min_diff(arr, n, i + 1, j, sum2 + arr[i], sum2, true);
            case4 = min_diff(arr, n, i, j - 1, sum2 + arr[j], sum2, true);
        }
        return Math.max(case1, Math.max(case2, Math.max(case3, case4)));
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 100, 5};
        System.out.println(min_diff(arr, arr.length, 0, arr.length - 1, 0, 0,true));
    }
}
