package Sorting;

import java.util.*;

public class InsertionSort {
    static void insertionSort(int arr[], int n)
    {
        int i, key, j;
        for (i = 1; i < n; i++)
        {
            key = arr[i];
            j = i - 1;

        /* Move elements of arr[0..i-1], that are
        greater than key, to one position ahead
        of their current position */
            while (j >= 0 && arr[j] > key)
            {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    public static void main(String[] args) {
        int[] arr={2,4,3,7,8,11,6,5,1,2,11,56,34,21,33};
        for (int i = 1; i < arr.length; i++) {
            int current= i;
            int j=i-1;
//            while (j>=0&&arr[current]<arr[j]){
//                int temp=arr[current];
//                arr[current]=arr[j];
//                arr[j]=temp;
//                current=j;
//                j--;
//            }
            //Better Solution:

        }
        insertionSort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
