package LL_Stack_Queue;

import java.util.*;
import java.io.*;

public class FirstCircularTour {
    public static void main(String[] args) {
        int[] petrol = {50, 10, 60, 100};
        int[] dist = {30, 20, 100, 10};
        int n = petrol.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = petrol[i] - dist[i];
        }
        LinkedList<Integer> ll = new LinkedList<>();
        int left = 0;
        int curr_sum = 0;
        int i = 0;
        for (int k = 0; k < 2 * n; k++) {
            ll.add(arr[i]);
            curr_sum += arr[i];
            while (!ll.isEmpty() && curr_sum < 0) {
                curr_sum -= ll.removeFirst();
            }
            if (ll.isEmpty()) {
                curr_sum = 0;
                left = (i + 1) % n;
            }
            if (ll.size() == n)
                break;
            i = (i + 1) % n;
        }
        System.out.println(ll.isEmpty());
        System.out.println(left);
    }
}
