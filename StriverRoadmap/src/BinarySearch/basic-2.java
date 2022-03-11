package BinarySearch;

import java.util.*;

public class basic {
    static void binary_search(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            System.out.println("low=>"+arr[low]+"high=>"+arr[high]+"=>"+arr[mid]);
            if (arr[mid] == x) {
                System.out.println(mid);
                break;
            }
            if (arr[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println("NOT FOUND");
        System.out.println(mid);
    }
    static int lower_bound(int[] arr,int x){
        int found = Arrays.binarySearch(arr,x);
        while(found>0){
            if(arr[found-1]==arr[found])
                found--;
            else
                break;
        }

        if(found<0&&found!=-1){
            return -found-2;
        }

        return found;
    }
    static int higher_bound(int[] arr,int x){
        if(x>arr[arr.length-1])
            return arr.length;
        int found = Arrays.binarySearch(arr,x);
        while(found>0&&found<arr.length-2){
            if(arr[found+1]==arr[found])
                found++;
            else
                break;
        }
        if(found<0&&found!=-1){
            return -found-1;
        }
        return found;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3,4, 5,5, 7, 9, 11};
        int x = 12;
        System.out.println(lower_bound(arr,x));
//        System.out.println(higher_bound(arr,x));
    }
}
