package Array;

public class Solution{
    public static String solution(int a) {
        // Your code here
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 2;i <= 500; i++)
        {
            if(isPrime(i))
            {
                sb.append(String.valueOf(i));
            }
        }
        
        return sb.toString().substring(a,a+4);
        
        
        
    }
    
    public static boolean isPrime(int a)
    {
        for(int i = 2;i <= a/2; i++)
        {
            if(a%i == 0)
            {
                return false;
            }
        }
        
        return true;
    }
}