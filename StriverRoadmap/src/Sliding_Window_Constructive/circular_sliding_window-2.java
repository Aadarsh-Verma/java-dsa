package Sliding_Window_Constructive;

import java.util.*;

public class circular_sliding_window {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 0;
        if (sc.hasNextInt())
            t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int sum = 0;
            for (int i = 0; i < k; i++) {
                sum += arr[i];
            }
            int max_score = 0;
            for (int i = 1; i < n; i++) {
                int index = (i + k - 1) % n;
                sum -= arr[i - 1];
                sum += arr[(i+ k -1)%n];
                max_score = Math.max(max_score, sum);
            }
            System.out.println(max_score);
        }
    }
}
