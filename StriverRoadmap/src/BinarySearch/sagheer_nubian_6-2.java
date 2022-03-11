package BinarySearch;

import java.util.*;

public class sagheer_nubian_6 {
    static long IsFeasible(int[] arr, int mid, long money) {
        long sum = 0;
        long[] b = new long[arr.length];
        for (int i = 0; i < arr.length; i++) {
            b[i]= arr[i]+ (long) (i + 1) *mid;
        }
        Arrays.sort(b);
//        System.out.println(Arrays.toString(b));
        for (int i = 0; i < mid; i++) {
            sum+=b[i];
        }
        return sum;

    }

    public static void main(String[] args) {
//        System.out.println(IsFeasible(new int[]{2,3,5},2,4));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long money = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int low = 0;
        int high = arr.length;
        int mid;
        int ans = 0;
        long ans_money=0;
        while (low <= high) {
            mid = (low + high) / 2;
                long sum = IsFeasible(arr,mid,money);
                boolean isFeasible = sum<=money;
//                System.out.println(low + ":" + mid + ":" + high + ":" + isFeasible);
                if (isFeasible) {
                    ans = mid;
                    low = mid+1 ;
                } else {
                    high = mid-1;
                }
        }
        System.out.println(ans+" "+IsFeasible(arr,ans,money));

    }
}
