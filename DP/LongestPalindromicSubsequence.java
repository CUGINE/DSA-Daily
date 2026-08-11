package DP;

import java.util.*;

public class LongestPalindromicSubsequence {

    public int longestPalindromeSubseq(String s) {
        return longestPalindromeSubseq(s, 0, s.length() - 1, new HashMap<>());
    }

    public int longestPalindromeSubseq(String s, int i, int j,
                                       HashMap<String, Integer> memo) {

        if (i > j)
            return 0;

        if (i == j)
            return 1;

        String key = i + "," + j;

        if (memo.containsKey(key))
            return memo.get(key);

        int len;

        if (s.charAt(i) == s.charAt(j)) {
            len = 2 + longestPalindromeSubseq(s, i + 1, j - 1, memo);
        } else {
            int s1 = longestPalindromeSubseq(s, i + 1, j, memo);
            int s2 = longestPalindromeSubseq(s, i, j - 1, memo);

            len = Math.max(s1, s2);
        }

        memo.put(key, len);

        return len;
    }

    public static void main(String[] args) {

        LongestPalindromicSubsequence obj =
                new LongestPalindromicSubsequence();

        String s = "bbbab";

        int ans = obj.longestPalindromeSubseq(s);

        System.out.println("Longest Palindromic Subsequence = " + ans);
    }
}
