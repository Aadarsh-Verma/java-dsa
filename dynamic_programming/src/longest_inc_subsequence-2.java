import java.util.*;
import java.io.*;

public class longest_inc_subsequence {
    static int LIS(int[] arr, int n, int parent, int count) {
        if (n == 0)
            return count;
        if (arr[n - 1] < parent) {
            return Math.max(LIS(arr, n - 1, arr[n - 1], count + 1), LIS(arr, n - 1, parent, count));
        } else
            return LIS(arr, n - 1, parent, count);
    }

    public static void main(String[] args) {
        int[] arr = {10, 22, 9, 33, 21, 50, 41, 60, 21, 23, 78, 113, 56, 57, 58};
        System.out.println(LIS(arr, arr.length, Integer.MAX_VALUE, 0));
    }
}
