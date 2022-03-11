import java.util.*;
import java.io.*;

public class TwoPointers {
    //    Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target.
//    Return the sum of the three integers.
//
//    Assume that there will only be one solution
//
//    Example:
//    given array S = {-1 2 1 -4},
//    and target = 1.
//
//    The sum that is closest to the target is 2. (-1 + 2 + 1 = 2)
    public static void main(String[] args) {
        int[] arr = {-5, 1, 4, -7, 10, -7, 0, 7, 3, 0, -2, -5, -3, -6, 4, -7, -8, 0, 4, 9, 4, 1, -8, -6, -6, 0, -9, 5, 3, -9, -5, -9, 6, 3, 8, -10, 1, -2, 2, 1, -9, 2, -3, 9, 9, -10, 0, -9, -2, 7, 0, -4, -3, 1, 6, -3};
        int k = -1;
        Arrays.sort(arr);
        int three_sum = 0;
        for (int i = 0; i < 3; i++) {
            three_sum += arr[i];
        }
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] + arr[i + 1] + arr[i + 2] == k)
                System.out.println("found " + arr[i] + " " + arr[i + 1] + " " + arr[i + 2]);
        }
        int max_sum = Math.abs(k - three_sum);
        int ans = three_sum;
        System.out.println("three sum " + three_sum + " max sum " + max_sum);
        for (int i = 3; i < arr.length; i++) {

            three_sum += arr[i];
            three_sum -= arr[i - 3];
            System.out.println("three sum " + three_sum + " max sum " + max_sum);
            if (max_sum > Math.abs(k - three_sum)) {
                max_sum = Math.abs(k - three_sum);
                ans = three_sum;
            }
            max_sum = Math.min(max_sum, Math.abs(k - three_sum));

        }
        System.out.println(ans);
//        System.out.println(max_sum);
    }
}
