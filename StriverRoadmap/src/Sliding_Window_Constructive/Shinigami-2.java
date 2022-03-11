package Sliding_Window_Constructive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Shinigami {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String[] ins = br.readLine().trim().split(" ");
            int n = Integer.parseInt(ins[0]);
            int x = Integer.parseInt(ins[1]);
            int y = Integer.parseInt(ins[2]);
        	int[] arr = new int[n];
            String[] array = br.readLine().trim().split(" ");
        	for (int i = 0; i < n; i++) {
                arr[i]= Integer.parseInt(array[i]);
            }
        	Arrays.sort(arr);
            double avg;
            int sum = 0;
            for (int i = n-1; i >n-1-y ; i--) {
                sum+=arr[i];
            }
//            System.out.println(sum+":"+y);
            avg =(double) sum/(y);
            System.out.println(String.format("%.8f",avg));
        }
    }
}
