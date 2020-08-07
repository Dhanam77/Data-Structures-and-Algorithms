package CodeForcesContest;

import java.util.*;

public class gcdlm {

	
	public static void main(String[] args)
	{
		
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10000];
		int[] res = new int[10000];
		int k, l = 0, n=0;
		int t = sc.nextInt();
		
		while(t-- > 0)
		{
			n = sc.nextInt();
			
			
			String[] values = sc.next().split(" ");
				
			res[l++] = find(n,values);
			
			
		}
		
		
		for(int i = 0;i < t; i++)
		{
			System.out.println(res[i]);
		}
		
		
	}

	private static int find(int n, String[] arr) {
		// TODO Auto-generated method stub
		
		

		for(int i = 0;i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		List<String> list = new ArrayList<>();
		
		for(int i = 0;i < arr.length; i++)
		{
			if(!list.contains(arr[i]))
			{
				list.add(arr[i]);
			}
		}
		
		
		return list.size();
	}
	
	
}
