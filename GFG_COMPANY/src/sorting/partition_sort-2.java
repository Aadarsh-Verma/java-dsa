package sorting;

import java.util.*;
import java.io.*;

public class partition_sort {
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int Partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int left = low;
        for (int i = low; i < high; i++) {
            if (arr[i] < pivot) {
                swap(arr, left, i);
                left++;
            }
        }
        swap(arr, left, high);
        return left;
    }

    static void divide(int[] arr, int low, int high) {
        if (low < high) {
            int partition = Partition(arr, low, high);
            divide(arr, low, partition - 1);
            divide(arr, partition + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 1, 9, 5, 5, 6, 11, 54, 23, 11, 98};
        divide(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
