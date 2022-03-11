package PrefixSum;

import java.util.*;

public class KJandStreetLight_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[][] arr=new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }
        int[] points = new int[x+1];
        for (int i = 0; i < n; i++) {
            int loc = arr[i][0];
            int range = arr[i][1];
            if(loc-range<0)
                points[0]+=1;
            if(loc-range>=0)
            points[loc-range]+=1;
            if(loc+range<=n)
            points[loc+range+1]-=1;
        }
        int[] cum_point = new int[x+1];
        int sum=0;
        for (int i = 0; i < points.length; i++) {
            sum+=points[i];
            cum_point[i]=sum;
        }
//        System.out.println(Arrays.toString(cum_point));
        int dark=0,max_dark=0;
        for (int i = 0; i < cum_point.length; i++) {
            if(cum_point[i]==0||cum_point[i]>1) {
                dark++;
                max_dark=Math.max(max_dark,dark);
            }
            else
                dark=0;
        }
        System.out.println(max_dark);
    }
}
