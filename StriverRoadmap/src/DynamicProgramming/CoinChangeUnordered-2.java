package DynamicProgramming;

import java.util.*;

public class CoinChangeUnordered {
    static int coinChange(int[] arr,int n,int sum){
        if(sum==0)
            return 1;
        if(n==0&&sum!=0)
            return 0;
        int c1=0,c3=0;
        if(sum>=arr[n-1]) {
             c1 = coinChange(arr, n, sum - arr[n - 1]);
//             c3 = coinChange(arr, arr.length, sum - arr[n - 1]);
        }
        int c2 = coinChange(arr,n-1,sum);
        return c1+c2+c3;

    }
    static int unordered(int[] arr,int n,int sum){
        if(sum==0)
            return 1;
        if(n==0&&sum!=0)
            return 0;
        int c1=0,c2=0;
        for (int i = n; i >= 1; i--) {
            if(sum>=arr[i-1])
            c1=unordered(arr,i,sum-arr[i-1]);
            c2=unordered(arr,i-1,sum);
            return c1+c2;
        }
        return c1+c2;
    }
    public static void main(String[] args) {
        int[] arr={2,3,5};
        int sum =9;
        System.out.println(coinChange(arr,arr.length,sum));
        System.out.println(unordered(arr,arr.length,sum));
    }
}
