package BASIC;

import java.util.*;

public class F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextInt();
        while (t-- > 0) {
        	int n = sc.nextInt();
        	long k =sc.nextInt();
        	long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            HashSet<Long> hash = new HashSet<>();
            for (int i = 0; i < n; i++) {
                hash.add(arr[i]%k);
//                hash.add(arr[i]*2%k);
            }
            for (int i = 0; i < n; i++) {
                arr[i]=arr[i]%k;
            }
            boolean isTrue =true;
            for (int i = 0; i < n; i++) {
                if(arr[i]!=0&&!hash.contains(k-arr[i])) {
                    isTrue = false;
                    break;
                }
            }
            if(isTrue)
                System.out.println("YES");
            else{
                System.out.println("NO");
            }
        }
    }
}
