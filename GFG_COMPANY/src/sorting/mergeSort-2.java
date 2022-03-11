package sorting;

import java.util.*;
import java.io.*;

public class mergeSort {

    void sort(int[] arr, int l, int mid, int r) {
        int n1 = mid - l + 1, n2 = r - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (int i = 0; i < n1; i++) {
            L[i] = arr[l + i];
        }
        for (int i = 0; i < n2; i++) {
            R[i] = arr[mid + i + 1];
        }

        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i];
                i++;
            } else {
                arr[k++] = R[j];
                j++;
            }
        }

        while (i < n1) {
            arr[k++] = L[i];
            i++;
        }
        while (j < n2) {
            arr[k++] = R[j];
            j++;
        }
    }

    void merge(int[] arr, int l, int r) {
        if (l < r) {
            int mid = l + (r - l) / 2;
            merge(arr, l, mid);
            merge(arr, mid + 1, r);
            sort(arr, l, mid, r);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 9, 8, 4, 5, 6, 5, 9};
        new mergeSort().merge(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
