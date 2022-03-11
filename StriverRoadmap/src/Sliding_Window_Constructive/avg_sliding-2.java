package Sliding_Window_Constructive;

import java.util.*;

public class avg_sliding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
        	int n = sc.nextInt();
        	int b= sc.nextInt();
        	int a = sc.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextLong();
            }

        	double max_avg = Integer.MIN_VALUE;
        	for (int i = 0; i < n; i++) {
            long curr_sum = 0;
                for (int j = i; j < a+i && j<n; j++) {
                    curr_sum+=arr[j];
                }
                max_avg = Math.max(max_avg,(double) curr_sum/a);
                for (int j = i+a; j < i+b && j<n; j++) {
                    curr_sum+=arr[j];
                    max_avg = Math.max(max_avg,(double) curr_sum/(j-i+1));
                }
            }
            System.out.println(max_avg);
        }
    }
}
