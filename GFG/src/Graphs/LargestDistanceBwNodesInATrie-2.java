package Graphs;

import java.util.*;
import java.io.*;

public class LargestDistanceBwNodesInATrie {
    static int res = -1;

    static int dfs(ArrayList<ArrayList<Integer>> list, boolean[] visited, int node) {
        visited[node] = true;
        int count = 1, max_count = 1;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int x : list.get(node)) {
            if (!visited[x]) {

                count = dfs(list, visited, x) + 1;
                max_count = Math.max(max_count, count);
                System.out.println("visiting node "+node+" count:"+count);
                pq.add(count);
            }
            if (pq.size() >= 2) {
                int a = pq.remove(), b = pq.remove();
                System.out.println("node is " + node + ":" + a + ":" + b);
                res = Math.max(res, a + b + 1);
            } else if (pq.size() == 1)
                res = Math.max(res, pq.remove() + 1);
        }
        return max_count;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 0, 1, 2, 1, 5};
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        list.add(temp);
        for (int i = 1; i < arr.length; i++) {
            ArrayList<Integer> curr = new ArrayList<>();
            list.get(arr[i]).add(i);
            list.add(curr);
        }
        System.out.println(list);
        boolean[] visited = new boolean[arr.length];
        int ans = dfs(list, visited, 0);
        System.out.println(res);
//        System.out.println(Arrays.toString(visited));
    }
}
