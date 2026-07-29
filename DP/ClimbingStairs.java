package DP;
import java.util.HashMap;

public class ClimbingStairs {

    public static void main(String[] args) {
        Solution sol = new Solution();

        int n = 5;
        int ways = sol.climbStairs(n);

        System.out.println("Number of ways to climb " + n + " stairs: " + ways);
    }
}

class Solution {

    public int climbStairs(int n) {
        return climbStairs(n, new HashMap<>());
    }

    public int climbStairs(int n, HashMap<Integer, Integer> memo) {
        if (n == 0 || n == 1)
            return 1;

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        int ans = climbStairs(n - 1, memo) + climbStairs(n - 2, memo);

        memo.put(n, ans);

        return ans;
    }
}