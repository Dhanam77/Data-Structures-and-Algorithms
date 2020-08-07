/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[][] res = new int[t][2];
		for(int i = 0;i < t; i++){
		   int n = sc.nextInt();
		   int c = 0, m = 0;
		   for(int j = 0;j < n; j++){
		       int a = sc.nextInt();
		       int b = sc.nextInt();
		       if(sum(a) > sum(b)) c++;
		       else if(sum(b) > sum(a)) m++;
		       else{
		           c++;
		           m++;
		       }
		   }
		   if(c > m) {
			   res[i][0] = 0;
			   res[i][1] = c;
		   }
		   else if(m > c) 
			   {
				   res[i][0] = 1;
				   res[i][1] = m;
			   
		   }
		   else {
			   
				   res[i][0] = 2;
				   res[i][1] = c;
			   
			   }
		}
	
	
		for(int[] arr : res) {
			System.out.println(arr[0] + " " + arr[1]);
		}
	}
	
	static int sum(int a) {
		int s = 0;
		while(a > 0) {
			s += (a%10);
			
			a/=10;
		}
		return s;
	}
}