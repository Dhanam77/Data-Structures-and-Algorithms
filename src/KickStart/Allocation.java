package KickStart;

import java.util.*;

public class Allocation
{
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] res = new int[t];
        int  k = 0;
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int budget = sc.nextInt();
            int[] arr = new int[n];

            for(int i = 0;i < n; i++)
            {
            	arr[i] = sc.nextInt();
            }
            
            
            res[k++] = getNoOfItems(arr, budget);
            
        }
        
        for(int i = 0;i < res.length; i++)
        {
            System.out.println(res[i]);
        }
        
        
        
        
        
    }
    public static int getNoOfItems(int[] arr, int budget)
        {
    	
            Arrays.sort(arr);
            int i = 0;
            int sum = 0;
            int count = 0;
            while(i < arr.length &&  sum + arr[i] <= budget)
            {
                sum += arr[i];
                i++;
                count++;
            }
            
            return count;
        }
    
}