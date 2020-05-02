package Greedy;


import java.util.*;

public class MaxMinDiff {
	
	public static void main(String[] args)
	{
		
		int[] arr = {100,200,300,350,400,401,402};
		int k = 3;
		
		System.out.println(maxMin(k,arr));
		
		
	}
	
	 static int maxMin(int k, int[] arr) { 

	        Arrays.sort(arr);
	        int difference = Integer.MAX_VALUE;
            int[] subArray = new int[k];

	        final int n = arr.length;
	        for(int i = 0;i <= n-k; i++)
	        {
	            int localDiff = 0;
	            int m = 0;
	            for(int j = i; j < k+i; j++)
	            {
	            	subArray[m++] = arr[j]; 
	            }
	            
	            localDiff = subArray[subArray.length -1] - subArray[0];

	            if(localDiff < difference)
	            {
	            	difference = localDiff;
	            }
	           
	        

	        }

	        return difference;

	    }

}
