package searching_sorting;

import java.util.*;
import java.io.*;

public class Sort_Array_3_Elements {
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 1, 1, 2, 0, 0, 1, 2, 1};
        int low = 0, mid = 0, high = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (mid > high)
                break;
            if(arr[i]==1)
                mid++;
            if (arr[i] == 0) {
                swap(arr, low, i);
                low++;
                mid++;

            } else if (arr[i] == 2) {
                swap(arr, i, high);
                high--;
                i--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
