package arrays;

import java.util.*;
import java.io.*;

public class MaxEvenOddSubarray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 7, 11, 15, 14,13,12,17,22};
        int best = 1, curr_max = 1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]%2==0&&arr[i-1]%2!=0)
                curr_max++;
            else if(arr[i]%2!=0&&arr[i-1]%2==0)
                curr_max++;
            else{
                curr_max = 1;
            }
            best = Math.max(best,curr_max);
        }
        System.out.println(best);

        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(4);
    }
}
