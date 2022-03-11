package DynamicProgramming;

import java.util.*;

public class Frog_Stone_2 {
    static int test(int[] arr, int k) {
        int[] dp = new int[arr.length];
        dp[0] = 0;
        dp[1] = Math.abs(arr[0] - arr[1]);
        for (int i = 2; i < arr.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = i-1; j >= i - k && j >= 0; j--) {
                if(dp[j]+Math.abs(arr[i]-arr[j])<min)
                    min = dp[j]+Math.abs(arr[i]-arr[j]);
            }
            dp[i]=min;
        }
        return dp[arr.length-1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(test(arr,k));
    }
}
