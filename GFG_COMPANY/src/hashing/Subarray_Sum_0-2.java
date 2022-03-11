package hashing;

import java.util.*;
import java.io.*;

public class Subarray_Sum_0 {
    public static void main(String[] args) {
        long[] arr = {5L, 0L, 5L};
        int n = arr.length;
        long ans = 0L;
        ArrayList<Long> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(arr[i]);
        }
        n = list.size();
        long sum = 0L;
        long[] prefix = new long[n];
        for (int i = 0; i < n; i++) {
            sum += list.get(i);
            prefix[i] = sum;
        }
        HashMap<Long, Long> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(prefix[i])) {
                long cnt = map.get(prefix[i]) + 1L;
                ans += cnt;
                map.put(prefix[i], cnt);
            } else {
                map.put(prefix[i], 0L);
            }
        }
        System.out.println(ans);
    }
}
