package BASIC;

import java.util.*;

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
        	int n = sc.nextInt();
        	int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            int sum=0;
            for (int i = 0; i < n; i++) {
                sum+=arr[i];
            }
            if(sum%2==0)
                System.out.println(1);
            else
                System.out.println(2);
        }
    }
}
