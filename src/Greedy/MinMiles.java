package Greedy;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



		/*
		 * 
		 * Mimimum miles to burn n calories
		 * using Greedy!
		 * 
		 */

public class MinMiles {

    static long marcsCakewalk(int[] calorie) {

        Arrays.sort(calorie);		//O(nlogn)

        long sum = 0;
        int n = calorie.length;
        for(int i = 0;i < n; i++)
        	
        {
        	sum += (Math.pow(2, i)*(calorie[n-i-1]));	//2^j * c
        }

        return sum;

    }


    public static void main(String[] args) throws IOException {
 
        int[] calorie = {1,3,2};

        long result = marcsCakewalk(calorie);

        System.out.print(result);
    }
}
