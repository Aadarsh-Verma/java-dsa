package graph;

import java.util.*;
import java.io.*;

public class snake_ladder_2 {
    static int minThrow(int N, int arr[]) {
        // code here
        int[] dp = new int[30];
        Arrays.fill(dp, 1000);
        HashMap<Integer, Integer> lad = new HashMap<>();
        HashMap<Integer, Integer> snake = new HashMap<>();
        for (int i = 0; i < N; i += 2)
            lad.put(arr[i] - 1, arr[i + 1] - 1);
        for (int i = N; i < 2 * N; i += 2)
            snake.put(arr[i] - 1, arr[i + 1] - 1);

        for (int i = 0; i < 6; i++) {
            if (lad.containsKey(i)) {
                dp[lad.get(i)] = 1;
            }
            dp[i] = 1;
        }
//        System.out.println(Arrays.toString(dp));
        for (int i = 6; i < 30; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = i - 1; j >= i - 6; j--) {
                min = Math.min(dp[j], min) + 1;
            }
            System.out.println(min + " " + i);
            if (lad.containsKey(i)) {
                dp[lad.get(i)] = min;
                dp[i] = Math.min(dp[i],min);
            } else if (snake.containsKey(i) && min < dp[snake.get(i)]) {
                dp[snake.get(i)] = min;
                i = snake.get(i);
            } else {
                dp[i] = Math.min(dp[i],min);
            }
        }
        System.out.println(Arrays.toString(dp));
        return dp[29];
    }

    public static void main(String[] args) {
        int[] arr={3 ,22, 5 ,8 ,11 ,26 ,20, 29, 17 ,4, 19, 7, 27 ,1 ,21 ,9};
        System.out.println(minThrow(8,arr));
    }
}
