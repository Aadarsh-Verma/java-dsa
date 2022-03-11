package Hashing;

import java.util.*;
import java.io.*;

public class LongestSubarraywithEqual_0_1 {
    public static void main(String[] args) {
        int[] arr = {0,0,1,0, 1,1,0,1};
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int best = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                sum--;
            } else {
                sum++;
            }
            if(sum==0)
                best = Math.max(best,i+1);
            else if (map.containsKey(sum)) {
                best = Math.max(best, i - map.get(sum));
            } else
                map.put(sum, i);
        }
        System.out.println(best);
        System.out.println(map);
    }
}
