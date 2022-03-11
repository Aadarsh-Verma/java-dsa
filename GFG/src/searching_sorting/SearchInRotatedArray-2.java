package searching_sorting;

import java.util.*;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 8, 9};
        int x = 13;
        int low = 0, high = arr.length - 1, mid = 0;
        int ans = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] > arr[low]) {
                if (arr[low] <= x && arr[mid] >= x) {
                    ans = Arrays.binarySearch(arr, low, mid+1, x);
                    break;
                } else {
                    low = mid + 1;

                }
            } else {
                if (arr[mid] <= x && arr[high] >= x) {
                    ans = Arrays.binarySearch(arr, mid, high+1, x);
                    break;
                } else {
                    high = mid - 1;
                }
            }
        }
        ans = (ans>0)? ans:-1;
        System.out.println(ans);

    }
}
