package Greedy;

import java.util.*;

public class NeighbourGrid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int[][] arr = new int[x][y];
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }


            boolean isGrid = true;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    int neighbour = 0;
                    if (i - 1 >= 0) neighbour++;
                    if (i + 1 < arr.length) neighbour++;
                    if (j - 1 >= 0) neighbour++;
                    if (j + 1 < arr[i].length) neighbour++;
                    if (arr[i][j] > neighbour) {
                        isGrid = false;
                        break;
                    }
                    arr[i][j] = neighbour;
                }
                if (!isGrid)
                    break;
            }
            if (isGrid) {
                System.out.println("YES");
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr[0].length; j++) {
                        System.out.print(arr[i][j]+" ");
                    }
                    System.out.println();
                }
            }
            else
                System.out.println("NO");
        }
    }
}
