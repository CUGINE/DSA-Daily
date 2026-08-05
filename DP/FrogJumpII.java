package DP;

import java.util.HashMap;

public class FrogJumpII {

    public int frogJump(int[] heights) {
        return min_a(heights, 0, new HashMap<>());
    }

    public int min_a(int[] heights, int idx, HashMap<Integer, Integer> memo) {

        if (idx == heights.length - 1) {
            return 0; // no more energy needed because it's the last step
        }

        if (memo.containsKey(idx)) {
            return memo.get(idx); // avoid duplicate recursive calls
        }

        int one = Math.abs(heights[idx] - heights[idx + 1])
                + min_a(heights, idx + 1, memo);

        int two = Integer.MAX_VALUE;

        if (idx + 2 < heights.length) {
            two = Math.abs(heights[idx] - heights[idx + 2])
                    + min_a(heights, idx + 2, memo);
        }

        int result = Math.min(one, two);
        memo.put(idx, result);

        return result;
    }

    public static void main(String[] args) {

        FrogJump obj = new FrogJump();

        int[] heights = {2, 1, 3, 5, 4};

        int ans = obj.frogJump(heights);

        System.out.println("Minimum Energy Required = " + ans);
    }
}
