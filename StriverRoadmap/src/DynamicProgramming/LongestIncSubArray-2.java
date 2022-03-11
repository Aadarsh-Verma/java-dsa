package DynamicProgramming;

import java.util.*;

public class LongestIncSubArray {
    //Input: arr[] = {3, 10, 2, 1, 20}
//Output: Length of LIS = 3
//The longest increasing subsequence is 3, 10, 20
    static int max_ans = 0;
    static int test(int[] arr, int n, int prev) {
        if (n == arr.length)
            return 0;
        int ans=0;
        if (arr[n] > prev) {

             ans= 1+test(arr, n + 1, arr[n]);
        }
        if(arr[n]<prev){
            return Math.max(test(arr,n+1,prev),test(arr,n+1,arr[n]));
        }

        return max_ans = Math.max(max_ans,ans);
    }

    public static void main(String[] args) {
        int[] arr = {3, 10, 2, 1, 20};
        System.out.println(test(arr,0,0));
    }
}
