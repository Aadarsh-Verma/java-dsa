package DynamicProgramming;

import java.util.*;

public class Frog_Stone {
    static int test(int[] arr,int n,int prev){
        if(n>=arr.length)
            return Integer.MAX_VALUE;
        if(n==arr.length-1)
            return Math.abs(prev-arr[n]);
        int n1 = test(arr,n+1,arr[n]);
        int n2 = test(arr,n+2,arr[n]);
        return Math.min(n1,n2)+Math.abs(prev-arr[n]);
    }
    static int dp(int[] arr){
        int[] dp = new int[arr.length];
        dp[0]=0;
        dp[1]=Math.abs(arr[1]-arr[0]);

        for (int i = 2; i < arr.length; i++) {
            int i1 = dp[i-1]+Math.abs(arr[i]-arr[i-1]);
            int i2 = dp[i-2]+Math.abs(arr[i]-arr[i-2]);
            dp [i] = Math.min(i1,i2);
        }
        return dp[arr.length-1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(dp(arr));
    }
}
