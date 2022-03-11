package PrefixSum;

import java.util.*;

public class EquilibriumPoint {
    /*Equilibrium Point in an array is a position such that the sum of elements before it is
     equal to the sum of elements after it.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int[] pre = new int[n];
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
            pre[i]=sum;
        }
        sum=0;
        for (int i = n-1; i >-1 ; i--) {
            sum+=arr[i];
            if(pre[i]==sum)
                System.out.println(i+1);
        }
    }
}
