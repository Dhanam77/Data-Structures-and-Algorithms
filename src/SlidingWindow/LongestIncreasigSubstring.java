package SlidingWindow;

import java.util.*;

public class LongestIncreasigSubstring {

	public static void main(String[] args) {
		
		String s = "PWWKEW";
		
		char[] arr = s.toCharArray();
		Set<Character> set = new HashSet<>();
		int i = 0, j = 0, max = 0;
		while(i < arr.length && j < arr.length) {
			while(set.contains(arr[j])) {
				set.remove(arr[i]);
				i++;
			}
			 
				max = Math.max(j-i+1, max);
				set.add(arr[j]);
				j++;
			
		}
		System.out.println(max);
	}
	
	
}
