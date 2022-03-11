package TwoPointers;

import java.util.*;
import java.io.*;

public class MaximumOnes {
    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1, 0, 1, 0, 1, 0, 1};
        int b = 2;
        int n = arr.length, left = 0, best_window = 0, k = b;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                if (k == 0) {
                    while (arr[left] != 0)
                        left++;
                    left++;

                } else {
                    k--;
                }
            }
            best_window = Math.max(best_window, i - left + 1);
        }
        System.out.println(best_window);
    }
}
