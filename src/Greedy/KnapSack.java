package Greedy;



import java. util.*;

public class KnapSack {
	
	
	/*
	 * 
	 * Find the maximum profit earned from a specific amount of capacity
	 * 
	 */
	
	public static void main(String[] args)
		{
		
		Scanner sc = new Scanner(System.in);
		int[] val = {10, 40, 60, 40}; 
		int[] wt = {2,4,3,8};
		 
		
		System.out.println("Enter Capacity: ");		//Get capacity
		int cap = sc.nextInt();
		
		System.out.println(getMaxValue(val, wt, cap));	
		}
	
	public static double getMaxValue(int[] val, int[] wt, int cap)
	{
		 
		double totalVal = 0;
		
		costValue[] costs = new costValue[wt.length];		//Create an array of type costValue
		
		for(int i = 0;i < costs.length; i++)
		{
			costs[i] = new costValue(wt[i], val[i]);
		}
		Arrays.sort(costs, new Comparator<costValue>()			//Sort the array based on cost value
		{
			public int compare(costValue ob1, costValue ob2)
			{
				return ob2.cost.compareTo(ob1.cost);
			}
		});
		
		for(costValue cost : costs)			
		{
			if(cap - cost.wt > 0)
			{
				totalVal += cost.val;
				cap -= cost.wt;
			}
			
			else
			{
				double costPerWt = cost.val/cost.wt;
				totalVal += costPerWt*cap;
			}
		}
		
		return totalVal;

		
		
	}
	
	
	//The costvalue class 
	
	public static class costValue
	{
		double wt, val;
		Double cost;
		
		public costValue(double wt, double val)
		{
			this.wt = wt;
			this.val = val;
			cost = (double)val/wt;	
		}
	}

}
