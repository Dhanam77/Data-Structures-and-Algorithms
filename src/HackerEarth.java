

import java.util.*;
public class HackerEarth {
	
	
	
		 public static void main(String args[] ) throws Exception {
		       
		        //Scanner
		        Scanner sc = new Scanner(System.in);
		        long a = sc.nextLong();
		        long b = sc.nextLong();
		        System.out.println(findDivisibleIntegers(a,b));

		    

		        // Write your code here
		    }
		    static int findDivisibleIntegers(long a, long b)
			{
		    	
				
				int count = 1;
				long min = Math.min(a, b);
				
				for(int i = 2;i <= min/2; i++)
				{
					if(a%i == 0 && b %i == 0)
					{
						count++;
					}
				}
				
				
				
				
				
				return count;
				
			}
		}
