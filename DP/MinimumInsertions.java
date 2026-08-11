package DP;

import java.util.HashMap;

public class MinimumInsertions {

    public int minInsertions(String s) {
        return minInsertions(s, 0, s.length() - 1, new HashMap<>());
    }

    public int minInsertions(String s, int i, int j,
                             HashMap<String, Integer> memo) {

        if (i >= j)
            return 0;

        String key = i + "," + j;

        if (memo.containsKey(key))
            return memo.get(key);

        int len;

        if (s.charAt(i) == s.charAt(j)) {
            len = minInsertions(s, i + 1, j - 1, memo);
        } else {
            int s1 = minInsertions(s, i + 1, j, memo);
            int s2 = minInsertions(s, i, j - 1, memo);

            len = 1 + Math.min(s1, s2);
        }

        memo.put(key, len);

        return len;
    }

    public static void main(String[] args) {

        MinimumInsertions obj = new MinimumInsertions();

        String s = "mbadm";

        int ans = obj.minInsertions(s);

        System.out.println("Minimum Insertions = " + ans);
    }
}
