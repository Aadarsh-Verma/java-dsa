package BinarySearch;

import java.util.*;


public class painter_partition_problem {
    static boolean IsFeasible(int[] arr, int k, int time) {
        int interval = 0;
        for (int i = 0; i < arr.length; i++) {
            if (k == 0)
                return false;
            if (interval + arr[i] <= time) {
                interval += arr[i];
            } else {
                k--;
                interval = 0;
                i--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        System.out.println(IsFeasible(new int[]{2,6,7,8,9},2,9));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int painters = sc.nextInt();
        int timefactor = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] time = new int[n];
        for (int i = 0; i < time.length; i++) {
            time[i] = arr[i] * timefactor;
        }
        Arrays.sort(time);
        System.out.println(Arrays.toString(time));
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += time[i];
        }
        int low = arr[0];
        int high = sum;
        int mid;
        int ans = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            boolean isFeasible = IsFeasible(time, painters, mid);
                System.out.println(low+":"+mid+":"+high+":"+isFeasible);
            if (isFeasible) {
                ans = mid;
                high = mid-1 ;
            } else {
                low = mid + 1;
            }
        }
        System.out.println(((ans)));
    }
}

