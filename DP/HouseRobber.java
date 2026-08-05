package DP;

import java.util.HashMap;

public class HouseRobber {

    public int rob(int[] nums) {
        return rob(nums, 0, new HashMap<>());
    }

    public int rob(int[] nums, int idx, HashMap<Integer, Integer> memo) {

        if (idx >= nums.length)
            return 0;

        if (memo.containsKey(idx))
            return memo.get(idx);

        int pick = nums[idx] + rob(nums, idx + 2, memo);

        int skip = rob(nums, idx + 1, memo);

        int ans = Math.max(pick, skip);

        memo.put(idx, ans);

        return ans;
    }

    public static void main(String[] args) {

        HouseRobber obj = new HouseRobber();

        int[] nums = {2, 7, 9, 3, 1};

        int ans = obj.rob(nums);

        System.out.println("Maximum Money Robbed = " + ans);
    }
}
