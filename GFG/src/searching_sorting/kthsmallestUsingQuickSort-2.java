package searching_sorting;

import java.util.*;
import java.io.*;

public class kthsmallestUsingQuickSort {
    public static void main(String[] args) {
        int[] arr = {10, 4, 5, 8, 11, 6, 26};
        int k = 7;
        int low = 0 , high = arr.length-1;
        int correct_pivot;
        int ans;
        while(true){

            correct_pivot = partition_sort(arr,low,high);
            if(correct_pivot==k-1) {
                ans = arr[correct_pivot];
                break;
            }
            if(correct_pivot<k-1){
                low = correct_pivot+1;
            }
            else{
                high = correct_pivot-1;
            }
        }
        System.out.println(correct_pivot);
        System.out.println(ans);

    }

    private static int partition_sort(int[] arr, int low, int high) {
        int pivot = arr[high];
        for (int i = low; i < high; i++) {
            if(arr[i]<=pivot){
                int temp = arr[i];
                arr[i]=arr[low];
                arr[low]=temp;
                low++;
            }
        }
        int temp = arr[low];
        arr[low] = pivot;
        arr[high] = temp;
        return low;
    }
}
