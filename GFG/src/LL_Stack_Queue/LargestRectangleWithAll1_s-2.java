package LL_Stack_Queue;

import java.util.*;
import java.io.*;

public class LargestRectangleWithAll1_s {
    static int[] NSL(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];
        ans[0] = -1;
        st.push(0);
        for (int i = 1; i < arr.length; i++) {
            while (!st.isEmpty() && arr[i] <= arr[st.peek()]) {
                st.pop();
            }
            if (st.isEmpty())
                ans[i] = -1;
            else
                ans[i] = st.peek();
            st.push(i);
        }
        return ans;
    }

    static int[] NSR(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];
        ans[arr.length - 1] = -1;
        st.push(arr.length - 1);
        for (int i = arr.length - 2; i > -1; i--) {
            while (!st.isEmpty() && arr[i] <= arr[st.peek()]) {
                st.pop();
            }
            if (st.isEmpty())
                ans[i] = arr.length;
            else
                ans[i] = st.peek();
            st.push(i);
        }
        return ans;
    }

    static int largestAreaHistogram(int[] arr) {
        int[] nsl = NSL(arr);
        int[] nsr = NSR(arr);
        int max_area = 0;
        for (int i = 0; i < arr.length; i++) {
            max_area = Math.max(max_area, arr[i] * (nsr[i] - nsl[i] - 1));
        }
        return max_area;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 1, 1, 0},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 0, 0},
        };
        int[][] brr = new int[arr.length][arr[0].length];
        int max_area = 0;
        System.arraycopy(arr[0], 0, brr[0], 0, arr.length);
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1)
                    brr[i][j] = brr[i - 1][j] + 1;
            }
            max_area = Math.max(max_area, largestAreaHistogram(brr[i]));
        }
        System.out.println(max_area);

    }
}
