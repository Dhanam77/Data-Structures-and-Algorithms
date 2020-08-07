package DynamicProgramming;

public class CoinChange2 {
	
	public static void main(String[] args) {
		int[] coins = {1,2,5};
		int amount = 5;
		System.out.print(get(coins, amount));
	}

	
	public static int get(int[] coins, int amount) {
		
		int[] dp = new int[amount+1];
		dp[0] = 1;
		
		for(int coin: coins) {
			for(int i = coin;i < dp.length; i++) {
				dp[i] += dp[i-coin];
			}
		}
		
		return dp[dp.length-1];
	}
}
