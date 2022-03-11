package Sliding_Window_Constructive;

import java.util.*;

public class min_max_array_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ArrayList<Long> max_list = new ArrayList<>();
        ArrayList<Long> min_list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
//            int max = Integer.MIN_VALUE;
            for (int j = 0; j <= n - i; j++) {
                long min = arr[j];
                for (int k = j; k <= j + i-1; k++) {
                    if (arr[k] < min)
                        min = arr[k];
                }
                min_list.add(min);

            }
            max_list.add(Collections.max(min_list));
            min_list.clear();
        }
//        System.out.println(max_list);
        long[] results = new long[max_list.size()];
        for (int i = 0; i < max_list.size(); i++) {
            results[i]=max_list.get(i);
        }
    }
}
