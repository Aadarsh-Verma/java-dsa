package graph;

import java.util.*;
import java.io.*;

public class LoopInDirected {

    static boolean isLoopUtil(int[][] graph, int node, boolean[] visited, boolean[] stack) {
        stack[node] = true;

        for (int j = 0; j < graph[node].length; j++) {
            if (graph[node][j] == 1) {
                if (stack[j])
                    return true;
                visited[j] = true;
                isLoopUtil(graph, j, visited, stack);
            }
        }
        stack[node] = false;
        return false;

    }

    static boolean isLoop(int[][] graph, int n) {
        boolean[] visited = new boolean[n];
        boolean[] stack = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                if (isLoopUtil(graph, i, visited, stack))
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] graph = new int[][]{
                {0, 0, 1, 1},
                {1, 0, 1, 0},
                {0, 0, 0, 1},
                {0, 0, 0, 0},
        };
        int n = graph.length;
        System.out.println(isLoop(graph, n));
    }
}
