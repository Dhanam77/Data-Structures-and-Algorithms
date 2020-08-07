//This is The Coding Area
package DynamicProgramming;

import java.util.*;

public class ABoardGame {
	
	static int res = 0;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
      	int k = sc.nextInt();
      	int[][] board = new int[k][k];
      	for(int i = 0;i < k; i++){
          for(int j = 0;j < k; j++){
            
            board[i][j] = sc.nextInt();
          }
        }
		
		int m = k;
		int n = k;
		
		int[][] dp = new int[m+1][n+1];
		
		
		for(int i = 1;i <= m; i++) {
			dp[i][0] = board[i-1][0];
		}
		for(int i = 1;i <= n; i++) {
			dp[0][i] = board[0][i-1];
		}
		
		
		for(int i = 1;i <= m;i++) {
			for(int j = 1;j <= n; j++) {
				dp[i][j] = (int)Math.min(dp[i-1][j], dp[i][j-1])/2 + board[i-1][j-1];
			}
		}
		
		System.out.println(dp[m][n]);
		
		
	}

}
