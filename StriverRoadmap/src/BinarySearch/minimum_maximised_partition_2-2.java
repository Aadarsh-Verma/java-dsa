package BinarySearch;

import java.util.ArrayList;
import java.util.Collections;

public class minimum_maximised_partition_2 {
    static ArrayList<Integer> list = new ArrayList<>();
    static boolean IsFeasible(int[] arr, int k, int mid) {

        int sum = 0;
        int max_partition_sum=0;
        for (int i = 0; i <= arr.length && k > 0; i++) {
            if(i==arr.length&&k>0) {
                list.add(max_partition_sum);
                return true;
            }
            else if(i==arr.length&&k<=0)
                return false;
            if (sum + arr[i] > mid) {
                k--;
                max_partition_sum = Math.max(max_partition_sum,sum);
                sum = 0;
            }
            sum += arr[i];
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {12, 34, 67, 90,112,114,119};
        int k = 3;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int low = 40;
        int high = sum;
        int mid = 0;
        while (low < high) {
            mid = (low + high) / 2;
            boolean isFeasible = IsFeasible(arr, k, mid);
            if(isFeasible){
            System.out.println(low+":"+mid+":"+high);
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        System.out.println(list);
        System.out.println(Collections.max(list));
    }
}

/*
Given number of pages in n different books and m students. The books are arranged in ascending
 order of number of pages. Every student is assigned to read some consecutive books.
 The task is to assign books in such a way that the maximum number of pages
 assigned to a student is minimum.
 INPUT:
 {10,20,30,40} k=2
 OUTPUT:  60    //{10,20,30}  and {40}
  */