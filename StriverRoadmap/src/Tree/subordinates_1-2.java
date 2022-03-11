package Tree;

import java.util.*;
import java.io.*;

public class subordinates_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n-1];
        int[] ans = new int[n];
        int[] sub=new int[n];
        Arrays.fill(sub,-1);
        sub[0]=0;
        for (int i = 0; i < n - 1; i++) {
            arr[i]=sc.nextInt();
            sub[i+1]=arr[i]-1;
            int subordinate = arr[i]-1;
            while(sub[subordinate]!=-1){
                if(sub[subordinate]==0){
                    ans[subordinate]++;
                    System.out.println(i+":"+subordinate);
                    break;
                }
                ans[subordinate]++;
                subordinate=sub[subordinate];
            }
        }
        System.out.println(Arrays.toString(sub));
        System.out.println(Arrays.toString(ans));

    }
}
