package zoho.test;

import java.util.Arrays;

public class DifferentDomination {


		   public static int coinChange(int[] coins, int amount) {
		        if (amount < 0) {
		            return -1;
		        }
		        int[] dp = new int[amount + 1];
		        Arrays.fill(dp, amount + 1);
		        dp[0] = 0;
		        for (int i = 0; i <= amount; i++) {
		            for (int j = 0; j < coins.length; j++) {
		                if (coins[j] <= i) {
		                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
		                }
		            }
		        }
		        return dp[amount] > amount ? -1 : dp[amount];
		    }

		    public static void main(String[] args) {
		        int[] coins = {1, 2, 5};
		        int amount = 11;
		        int result = coinChange(coins, amount);
		        System.out.println(result);
		    }
		

	}


