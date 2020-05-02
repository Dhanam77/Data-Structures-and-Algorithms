package Array;

import java.util.*;

public class XSquareAnd2Arrays {
	
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k= 0;
		
		int[] A = new int[n];
		int[] B = new int[n];
		
		int[] arr = new int[m];
		for(int i = 0;i < n; i++)
		{
			A[i] = sc.nextInt();
		}
		for(int i = 0;i < n; i++)
		{
			B[i] = sc.nextInt();
		}
		
		for(int i = 0;i < m; i++)
		{
			
			int p = sc.nextInt();
			int q = sc.nextInt();
			int r = sc.nextInt();
			
			arr[k++] = getOutput(A,B,p,q,r);
		}
		
		for(int i = 0;i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		
		
		
		
	}

	private static int getOutput(int[] a, int[] b, int p, int q, int r) {
		
		if(p == 1)
		{
			return getFirstQuery(a,b,q,r);
		}
		
		return getSecondQuery(a,b,q,r);
		
		
		
	}

	private static int getSecondQuery(int[] a, int[] b, int q, int r) {
		// TODO Auto-generated method stub
		int sum = 0;
		
		for(int i = q-1;i < r; i+=2)
		{
			
			sum += b[i];
		}
		for(int i = q;i < r; i+=2)
		{
			
			sum += a[i];
		}
		
		
		
		return sum;
	}	

	private static int getFirstQuery(int[] a, int[] b, int q, int r) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		
		for(int i = q-1;i < r; i+=2)
		{
			
			sum += a[i];
		}
		for(int i = q;i < r; i+=2)
		{
			
			sum += b[i];
		}
		
		
		
		return sum;
	}

}
