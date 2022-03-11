import java.util.*;
import java.io.*;

public class Frog_Jump {
    static int jump(int[] arr, int n, int k) {
        if (n == 1)
            return arr[0];
        if (n == 2)
            return Math.abs(arr[n - 1] - arr[n - 2]);
        int res = Integer.MAX_VALUE;
        int j = 1;
        for (int i = n - 1; i >= n - k && i > 0; i--) {
            int subres = jump(arr, n - j, k);
            if(subres!=Integer.MAX_VALUE)
                subres += Math.abs(arr[n - 1] - arr[i - 1]);
            res = Math.min(res, subres);
            j++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {10, 30, 40, 50, 20};
        System.out.println(jump(arr,arr.length,3));
    }
}
