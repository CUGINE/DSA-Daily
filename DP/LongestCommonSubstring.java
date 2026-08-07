package DP;

import java.util.*;

public class LongestCommonSubstring {

    public int longestCommonSubstr(String str1, String str2) {
        return longestCommonSubstr(str1, str2, 0, 0, 0, new HashMap<>());
    }

    public int longestCommonSubstr(String str1, String str2,
                                   int i, int j, int count,
                                   HashMap<String, Integer> memo) {

        if (i == str1.length() || j == str2.length())
            return count;

        String key = i + "," + j + "," + count;

        if (memo.containsKey(key))
            return memo.get(key);

        int curr = count;

        if (str1.charAt(i) == str2.charAt(j)) {
            curr = longestCommonSubstr(str1, str2, i + 1, j + 1, count + 1, memo);
        }

        int skip1 = longestCommonSubstr(str1, str2, i + 1, j, 0, memo);
        int skip2 = longestCommonSubstr(str1, str2, i, j + 1, 0, memo);

        count = Math.max(Math.max(skip1, skip2), curr);

        memo.put(key, count);

        return count;
    }

    public static void main(String[] args) {

        LongestCommonSubstring obj = new LongestCommonSubstring();

        String str1 = "abcjklp";
        String str2 = "acjkp";

        int ans = obj.longestCommonSubstr(str1, str2);

        System.out.println("Length of Longest Common Substring = " + ans);
    }
}
