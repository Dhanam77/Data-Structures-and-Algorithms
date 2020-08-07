//This is The Coding Area
import java.util.*;

class Solution{
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    
    int[] arr = new int[t];
    int k = 0;
    
    for(int i = 0;i < t; i++){
      int n = sc.nextInt();
      if(n % 5 == 0){
    	  arr[k++] = (n/5)+2;
      }
      else{
      	arr[k++] = (n/5)+3;
      }
    }
    
    for(int i = 0;i < arr.length; i++) {
    	System.out.println(arr[i]);
    }
    
    
    
    
  }
  
  
}