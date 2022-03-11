package graph;

import java.util.*;
import java.io.*;

public class CovidSpread {
    static class Pair {
        int x, y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    boolean isSafe(int n, int m, int i, int j) {
        return i > -1 && j > -1 && i < n && j < m;
    }

    int bfs(int[][] grid, boolean[][] visited, int x, int y) {
        int n = grid.length, m = grid[0].length;
        int count = 0;
        LinkedList<Pair> ll = new LinkedList<>();
        // ll.add(new Pair(x,y));
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    ll.add(new Pair(i, j));
                    visited[i][j] = true;
                }
            }
        }
//        for(Pair p:ll){
//            System.out.println(p.x + " " + p.y);
//        }

        int[][] dxdy = new int[][]{{-1, -1}, {-1, 1}, {-1, 0}, {1, -1},
                {1, 0}, {1, 1}, {0, -1}, {0, 1}};
        while (!ll.isEmpty()) {
            int size = ll.size();
            count++;
            for (int j = 0; j < size; j++) {
                Pair p = ll.removeFirst();
                int a = p.x, b = p.y;
                for (int i = 0; i < 8; i++) {
                    int dx = a + dxdy[i][0];
                    int dy = b + dxdy[i][1];
                    if (isSafe(n, m, dx, dy) && !visited[dx][dy] && grid[dx][dy] == 1) {
                        visited[dx][dy] = true;
                        grid[dx][dy] = 2;

                        ll.add(new Pair(dx, dy));
                    }
                }
            }
        }
        for (int[] row : grid)
            System.out.println(Arrays.toString(row));
        return count;

    }

    public int helpaterp(int[][] hospital) {
        // code here
        int n = hospital.length, m = hospital[0].length, max_time = 0;
        boolean[][] visited = new boolean[n][m];
        max_time = bfs(hospital, visited, 0, 0);


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (hospital[i][j] == 1)
                    return -1;
            }
        }


        return max_time;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {2, 1, 0, 2, 1},
                {1, 0, 1, 2, 1},
                {1, 0, 0, 2, 1},

        };
        System.out.println(new CovidSpread().helpaterp(arr));
    }
}
