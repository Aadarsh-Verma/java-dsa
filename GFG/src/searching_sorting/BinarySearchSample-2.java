package searching_sorting;

import java.util.*;
import java.io.*;

public class BinarySearchSample {
    public static void main(String[] args) {
        int[] arr = {2, 4, 9, 12, 34, 67, 99};
        int low = 0, high = arr.length - 1, x = 6;
        int mid = 0, ans = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == x) {
                break;
            }
            if (arr[mid] < x) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println(arr[ans]);
        System.out.println(arr[mid]);
    }
}
