package BASIC;

import java.util.*;

public class C {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
        	int n = sc.nextInt();
        	int k=sc.nextInt();
        	int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            boolean tooslow=false;
            int one=0,not_solved=0;
            for (int i = 0; i < n; i++) {
                if(arr[i]<=1&&arr[i]>=0)
                    one++;
                if(arr[i]==-1)
                    not_solved++;
                if(arr[i]>k){
                    tooslow=true;

                }
            }
            double num= n;
//            System.out.println(not_solved);

            if(n-not_solved<Math.ceil(num/2)) {
                System.out.println("Rejected");
                continue;
            }
            if(tooslow){
                System.out.println("Too Slow");
                continue;
            }

            if(one==n) {
                System.out.println("Bot");
                continue;
            }
            System.out.println("Accepted");

        }
    }
}
