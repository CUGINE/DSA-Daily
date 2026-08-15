package DP;

import java.util.*;

public class DeleteOperation {

    public int minDistance(String word1, String word2) {

        int res = minDistance(word1, word2, 0, 0, new HashMap<>());

        return word1.length() + word2.length() - 2 * res;
    }

    public int minDistance(String word1, String word2,
                           int i, int j,
                           HashMap<String, Integer> memo) {

        if (i == word1.length() || j == word2.length())
            return 0;

        String key = i + "," + j;

        if (memo.containsKey(key))
            return memo.get(key);

        int ans;

        if (word1.charAt(i) == word2.charAt(j)) {

            ans = 1 + minDistance(word1, word2,
                    i + 1, j + 1, memo);

        } else {

            int s1 = minDistance(word1, word2,
                    i + 1, j, memo);

            int s2 = minDistance(word1, word2,
                    i, j + 1, memo);

            ans = Math.max(s1, s2);
        }

        memo.put(key, ans);

        return ans;
    }

    public static void main(String[] args) {

        DeleteOperation obj = new DeleteOperation();

        String word1 = "sea";
        String word2 = "eat";

        int ans = obj.minDistance(word1, word2);

        System.out.println("Minimum Deletions = " + ans);
    }
}
