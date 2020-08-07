package Mathematical;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class KaprekarNumber {

    // Complete the kaprekarNumbers function below.
    static void kaprekarNumbers(int p, int q) {

        boolean hasKaprekar = false, hasOne = false;
        for(int i = p;i <= q; i++){
        	
            int sq = (int)Math.pow(i,2);
            String r = String.valueOf(sq);
            int n = r.length();
            if(n == 1){
                if(i == 1){
                System.out.print(i + " ");

                }

            }
            else{
                String l = r.substring(0,n/2);
                r = r.substring(n/2,n);

                if(Integer.parseInt(l) + Integer.parseInt(r) == i){
                    hasKaprekar = true;
                    System.out.print(i + " ");
                }
            }
            
        }
        if(!hasKaprekar){
            System.out.println("INVALID RANGE");
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        kaprekarNumbers(p, q);

        scanner.close();
    }
}
