package DP;

import java.util.HashMap;

public class LongestCommonSubsequence {

    public int longestCommonSubsequence(String text1, String text2) {
        return longestCommonSubsequence(text1, text2, 0, 0, new HashMap<>());
    }

    public int longestCommonSubsequence(String text1, String text2,
                                        int i, int j,
                                        HashMap<String, Integer> memo) {

        if (i == text1.length() || j == text2.length())
            return 0;

        String key = i + "," + j;

        if (memo.containsKey(key))
            return memo.get(key);

        if (text1.charAt(i) == text2.charAt(j)) {
            int ans = 1 + longestCommonSubsequence(text1, text2, i + 1, j + 1, memo);
            memo.put(key, ans);
            return ans;
        }

        int one = longestCommonSubsequence(text1, text2, i + 1, j, memo);
        int two = longestCommonSubsequence(text1, text2, i, j + 1, memo);

        int ans = Math.max(one, two);

        memo.put(key, ans);

        return ans;
    }

    public static void main(String[] args) {

        LongestCommonSubsequence obj = new LongestCommonSubsequence();

        String text1 = "abcde";
        String text2 = "ace";

        int ans = obj.longestCommonSubsequence(text1, text2);

        System.out.println("Length of LCS = " + ans);
    }
}
