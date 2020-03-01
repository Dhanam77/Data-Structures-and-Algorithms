package Strings;
import java.util.*;

public class HashMapAnagrams {


	
	
    static boolean isAnagram(String a, String b) {
        // Complete the function


        if(a.length() != b.length())
        {
            return false;
        }


        char[] arrA = a.toCharArray();
        char[] arrB = b.toCharArray();

        Map<Character, Integer> hashMap = new HashMap<>();

        
        for(int i = 0;i < arrA.length; i++)
        {
            hashMap.put(arrA[i], 0);
        }



        


        for(int i = 0;i < arrA.length; i++)
        {
            if(hashMap.containsKey(arrA[i]))
            {
                int val = hashMap.get(arrA[i]);
                hashMap.put(arrA[i], val++);
            }
        }
        for(int i = 0;i < arrB.length; i++)
        {
            if(hashMap.containsKey(arrB[i]))
            {
                int val = hashMap.get(arrB[i]);
                hashMap.put(arrB[i], val--);
            }
        }


        for(int i = 0;i < arrB.length; i++)
        {
            if(hashMap.get(arrB[i]) != 0)
            {
                return false;
            }

            return true;
        }



        

        return true;



    }

  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      String a = scan.next();
      String b = scan.next();
      scan.close();
      boolean ret = isAnagram(a, b);
      System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
  }
}
 