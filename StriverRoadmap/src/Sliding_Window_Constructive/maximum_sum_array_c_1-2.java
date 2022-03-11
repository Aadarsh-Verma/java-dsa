package Sliding_Window_Constructive;

import java.util.*;

public class maximum_sum_array_c_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int swaps = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }
            Arrays.sort(a);
            Arrays.sort(b);
            for (int i = 0; i <= n / 2 - 1; i++) {
                int temp = b[i];
                b[i] = b[n - i - 1];
                b[n - i - 1] = temp;
            }

            for (int i = 0; i < n && swaps > 0; i++) {
                if (b[i] >= a[i]) {
                    int temp = a[i];
                    a[i] = b[i];
                    b[i] = temp;
                    swaps--;
                } else
                    break;
            }
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += a[i];
            }
            System.out.println(sum);

        }
    }
}
