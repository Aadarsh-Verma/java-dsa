package Greedy;

import java.util.*;

public class KadaneVariation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        while (testcases-- > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            int best_sum = 0, sum = 0;
            for (int i = 0; i < N - 1; i++) {
                if (arr[i] + sum < 0)
                    sum = 0;
                else if (arr[i] + sum > 0)
                    sum += arr[i];

                best_sum = Math.max(sum, best_sum);
            }

            int sec_best_sum = 0;
            sum = 0;
            for (int i = 1; i <N; i++) {
                if (arr[i] + sum < 0)
                    sum = 0;
                else if (arr[i] + sum > 0)
                    sum += arr[i];

                sec_best_sum = Math.max(sum, best_sum);
            }
            best_sum = Math.max(best_sum,sec_best_sum);


            int array_sum = 0;
            for (int i = 0; i < N; i++) {
                array_sum += arr[i];
            }
            if (array_sum > best_sum)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
