package Greedy;

import java.util.*;

public class MinimumProduct {
	
	
	public static void main(String[] args)
	{
		int[] a = {6, 1, 9, 5, 4};
		int[] b = {3,4, 8, 2,4};
		
		System.out.println("The minimum product is " + getMinProduct(a,b));
	}
	
	
	public static int getMinProduct(int[] a,int[] b)
	{
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		
		int minProduct = 0;
		int j = a.length - 1;
		for(int i = 0;i < a.length; i++)
		{
			minProduct += a[i]*b[j--];
		}
		
		return minProduct;
		
	}

}
