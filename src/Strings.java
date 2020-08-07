import java.util.*;
import java.io.*;

public class Strings {


	public static void main(String[] args) throws IOException {
		/* Your class should be named Main.
 			* Read input as specified in the question.
 			* Print output as specified in the question.
		*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String[] res = new String[t];
        for(int i = 0;i < t; i++) {
    	   String s = br.readLine();
    	   res[i] = getString(s);
       }
        
        for(int i = 0;i < res.length; i++) {
        	System.out.println(res[i]);
        }
        
        
        

	}

	private static String getString(String s) {
		// TODO Auto-generated method stub
		if(s.length() <= 1) return s;
		
		int[] count = new int[26];
		
		for(char c : s.toCharArray()) {
			count[c-'a']++;
		}
		for(int i = 0;i < count.length; i++) {
			//System.out.print(count[i] + " ");
		}
		
		
		int maxVal = Integer.MIN_VALUE, maxElem = -1;
		for(int i = 0;i < count.length; i++) {
			if(count[i] > maxVal) {
				maxVal = count[i];
				maxElem = i;
			}
		}
	//	System.out.print("maxVal and elem " + maxVal + " " + maxElem);

		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0;i < maxVal; i++) {
		//	System.out.println("char is " + count[maxElem]);
			sb.append((char)(maxElem+'a'));
		}
		
		return sb.toString();
	}

}
