package DynamicProgramming;

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class DecodeWays {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] res = new int[t];
		int k = 0;
		for(int i = 0;i < t; i++){
		    int n = sc.nextInt();
		    String s = sc.next();
		    res[k++] = getNoOfWays(n,s);
		    
		} 
		for(int i = 0;i < res.length; i++){
		    System.out.println(res[i]);
		}
		
	}
	
	private static int getNoOfWays(int n, String s){
	    int[] dp = new int[n];
		dp[0] = 1;
		for(int i = 1;i < n; i++) {
			dp[i] = dp[i-1] + way(s.charAt(i-1), s.charAt(i));
		}
		
		return dp[n-1];
		
	}

	private static int way(char charAt, char charAt2) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		sb.append(charAt);
		sb.append(charAt2);
		
		if(Integer.parseInt(sb.toString()) <= 26) return 1;
		return 0;
	}

}