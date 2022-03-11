package ll_stack_queue;

import java.util.*;
import java.io.*;

public class StockSpan {
    static class Pair {
        int x, y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        Stack<Pair> st = new Stack<>();
        int[] arr = {10, 4, 5, 90, 120, 80};
        int n = arr.length;
        int[] ans = new int[n];
        st.push(new Pair(n - 1, arr[n - 1]));
        for (int i = n - 2; i > -1; i--) {
            if (arr[i] < st.peek().y) {
                st.push(new Pair(i, arr[i]));
            } else {
                while (!st.isEmpty() && arr[i] > st.peek().y) {
                    Pair curr = st.pop();
                    ans[curr.x] = curr.x - i;
                }
                st.push(new Pair(i, arr[i]));
            }
        }
        while (!st.isEmpty()) {
            Pair temp = st.pop();
            ans[temp.x] = n;
        }
        ans[0] = 1;
        System.out.println(Arrays.toString(ans));
    }
}
