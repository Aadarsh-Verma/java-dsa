package greedy_BIT;

import java.util.*;
import java.io.*;

public class maximum_and {
    public static void main(String[] args) {
        int[] arr = {4, 8, 16, 2};
        int[][] set = new int[32][arr.length];
        int num = 0;
        boolean start = false;
        for (int i = 31; i > -1; i--) {
            int temp = 1 << i, cnt = 0;
            boolean inner = false;
            for (int j = 0; j < arr.length; j++) {

                if ((temp & arr[j]) != 0) {
                    if (set[i + 1][j] == 1 || !start) {
                        cnt++;
                        set[i][j] = 1;
                    }
                    inner = true;

                }
            }
            if (inner)
                start = true;
            if (cnt >= 2) {
                num += temp;
            }
        }
        System.out.println(num);
//        for (int[] row : set)
//            System.out.println(Arrays.toString(row));
//        System.out.println(start);
    }
}
