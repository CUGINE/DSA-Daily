package RECURSION;

import java.util.*;

 class NQueens {

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] arr = new char[n][n];

        for (char[] c : arr) {
            Arrays.fill(c, '.');
        }

        solve(n, ans, arr, 0);
        return ans;
    }

    public void solve(int n, List<List<String>> ans, char[][] arr, int row) {

        if (row == n) {
            List<String> temp = new ArrayList<>();

            for (char[] ch : arr) {
                temp.add(new String(ch));
            }

            ans.add(temp);
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(arr, row, col, n)) {
                arr[row][col] = 'Q';
                solve(n, ans, arr, row + 1);
                arr[row][col] = '.';
            }
        }
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

        NQueens obj = new NQueens();

        List<List<String>> ans = obj.solveNQueens(n);

        for (List<String> board : ans) {
            for (String row : board) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}