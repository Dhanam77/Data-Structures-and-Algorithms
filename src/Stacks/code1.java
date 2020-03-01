package Stacks;

import java.util.Stack;

import java.io.*;
import java.util.*;

public class code1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        
        
        int n = sc.nextInt();
        int k = 0;
        int[] store = new int[n];
        
        int[] arr = new int[n];
        
        for(int i = 0;i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
      
        
        
        for(int i = 0;i < n; i++)
        {
            boolean isMax = true;

            for(int j = i;j < n; j++)
            {
                if(arr[i] < arr[j])
                {
                    isMax = false;
                }
            }
            
            if(!isMax)
            {
              
                
                     System.out.println();
                     store[k++] = arr[i];
                
               
            }
            else
            {
              
            	  if(i == n-1)
                  {
                      store[k++] = arr[i];
                      printRemaining(store);
                      

                  }
               
            	  else
            	  {
                   System.out.println(arr[i]);
            	  }
                
            }
        }
        
    }
    
    public static void printRemaining(int[] store)
    {
       
         Arrays.sort(store);
         
         for(int i = store.length -1; i >= 0; i--)
         {
        	 System.out.print(store[i] + " ");
         }
        
       }
}  
 
