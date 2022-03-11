package rec_backtracking;

import java.util.*;
import java.io.*;

public class N_Queens {
    static boolean isSafe(boolean board[][], int row, int col) {
        int i, j;

        /* Check this row on left side */
        for (i = 0; i < col; i++)
            if (board[row][i])
                return false;
        int N = board.length;

        for (int k = 0; k < N; k++) {
            if(board[k][col])
                return false;
        }
        /* Check upper diagonal on left side */
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j])
                return false;

        /* Check lower diagonal on left side */
        for (i = row, j = col; j >= 0 && i < N; i++, j--)
            if (board[i][j])
                return false;

        return true;
    }

    static boolean fit(boolean[][] board, int x, int n) {
        if (x == n)
            return true;
        for (int i = 0; i < n; i++) {
            if (isSafe(board, x, i)) {
                board[x][i] = true;
                boolean feasible = fit(board, x + 1, n);
                if (feasible)
                    return true;
                else {
                    board[x][i] = false;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        fit(board,0,n);
        for(boolean[] b:board)
            System.out.println(Arrays.toString(b));
    }
}
