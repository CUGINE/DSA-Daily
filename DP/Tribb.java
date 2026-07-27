package DP;

import java.util.HashMap;

public class Tribb {

    public static int tribonacci(int n) {
        return tribonacci(n, new HashMap<>());
    }

    public static int tribonacci(int n, HashMap<Integer, Integer> memo) {

        if (n == 0)
            return 0;

        if (n == 1 || n == 2)
            return 1;

        if (memo.containsKey(n))
            return memo.get(n);

        int ans = tribonacci(n - 1, memo)
                + tribonacci(n - 2, memo)
                + tribonacci(n - 3, memo);

        memo.put(n, ans);

        return ans;
    }

    public static void main(String[] args) {
        int n = 25;
        System.out.println("Tribonacci(" + n + ") = " + tribonacci(n));
    }
}