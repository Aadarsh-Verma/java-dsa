package BinarySearch;

import java.util.*;

public class Asteroids {
    static int lower_bound(int[] arr, int x) {
        int found = Arrays.binarySearch(arr, x);
        while (found < arr.length - 1 && found >= 0) {
            if (arr[found + 1] == arr[found])
                found++;
            else
                break;
        }
        if (found < 0 && found != -1) {
            return -found - 2;
        }
        return found;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int low = 0;
        int high = arr[arr.length-1];
        int mid = 0;
        int ans = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            int index = lower_bound(arr,mid);
            boolean isFeasible = arr.length-index-1>=k;
            System.out.println(low+":"+mid+":"+high);
            if(isFeasible){
                ans = mid;
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        System.out.println(ans);
    }

    }

