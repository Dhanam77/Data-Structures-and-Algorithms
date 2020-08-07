package DynamicProgramming;

public class Knapsack {

	
	public static void main(String[] args)
	{
		
		
		int[] val = { 20, 5, 10, 60, 15, 25 };
		int[] wt = {  1, 2,  3,  8,  7, 4 };
		
		int cap = 10;
		
		System.out.print(find(wt,val,wt.length, cap));
		
		
	}
	
	
	static int find(int[] wt, int[] val,int n, int cap)
	{
		
		if(n == 0 || cap == 0)	
		{
			return 0;
		}
		
		if(cap < 0)
		{
			return Integer.MIN_VALUE;
		}
		
		
		else
		{
			return Math.max(find(wt, val, n-1,cap - wt[n-1]) + val[n-1],(find(wt,val,n-1,cap)));
		}
		
		
		
		
	}
	
	
}
