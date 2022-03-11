package Sliding_Window_Constructive;

import java.util.*;

public class fence_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for (int i = 0; i < k; i++) {
            sum+=arr[i];
        }
        int min_sum=sum;
        int index=0;
        for (int i = 1; i <= n-k; i++) {
            sum-=arr[i-1];
            sum+=arr[i+k-1];
            if(sum<min_sum){
                min_sum=sum;
                index=i;
            }
        }
        System.out.println(index+1);
    }
}
