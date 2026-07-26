package DP;
import java.util.HashMap;

public class Fib {

    public static int fib(int n, HashMap<Integer, Integer> memo) {
        if (n < 2) {
            return n;
        }

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        int ans = fib(n - 1, memo) + fib(n - 2, memo);
        memo.put(n, ans);

        return ans;
    }

    public static int fib(int n) {
        return fib(n, new HashMap<>());
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci(" + n + ") = " + fib(n));
    }
}