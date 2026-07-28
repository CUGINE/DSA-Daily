package DP;

 import java.util.HashMap;

public class Coin {

    public int coinChange(int[] coins, int amount) {
        return coinChange(coins, amount, new HashMap<>());
    }

    public int coinChange(int[] coins, int amount, HashMap<Integer, Integer> memo) {

        if (amount == 0)
            return 0;

        if (amount < 0)
            return -1;

        if (memo.containsKey(amount))
            return memo.get(amount);

        int min = -1;

        for (int c : coins) {

            int subAmount = coinChange(coins, amount - c, memo);

            if (subAmount != -1) {

                int numCoins = subAmount + 1;

                if (min == -1 || numCoins < min) {
                    min = numCoins;
                }
            }
        }

        memo.put(amount, min);
        return min;
    }

    public static void main(String[] args) {

        Coin obj = new Coin();

        int[] coins = {1, 2, 5};
        int amount = 11;

        int ans = obj.coinChange(coins, amount);

        System.out.println("Minimum coins required = " + ans);
    }
} 
    

