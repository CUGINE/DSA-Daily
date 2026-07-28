package RECURSION;
import java.util.*;

public class NQueensII {

    public int totalNQueens(int n) {

        char[][] arr = new char[n][n];

        for (char[] c : arr) {
            Arrays.fill(c, '.');
        }

        return solve(n, arr, 0);
    }

    public int solve(int n, char[][] arr, int row) {

        if (row == n) {
            return 1;
        }

        int count = 0;

        for (int col = 0; col < n; col++) {
            if (isSafe(arr, row, col, n)) {
                arr[row][col] = 'Q';
                count += solve(n, arr, row + 1);
                arr[row][col] = '.';
            }
        }

        return count;
    }

    public boolean isSafe(char[][] arr, int row, int col, int n) {

        // Check column
        for (int i = 0; i < n; i++) {
            if (arr[i][col] == 'Q')
                return false;
        }

        // Upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (arr[i][j] == 'Q')
                return false;
        }

        // Upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (arr[i][j] == 'Q')
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        int n = 4;

        NQueensII obj = new NQueensII();

        int ans = obj.totalNQueens(n);

        System.out.println("Total Solutions for " + n + "-Queens = " + ans);
    }
}