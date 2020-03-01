import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the minimumNumber function below.
    static int minimumNumber(int n, String password) {

        // Return the minimum number of characters to make the password strong
        String numbers = "0123456789";
        String lower_case = "abcdefghijklmnopqrstuvwxyz";
        String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String special_characters = "!@#$%^&*()-+";

        int added = 0;

        boolean requiresDigit = true;
        boolean requiresLower = true;
        boolean requiresUpper = true;
        boolean requiresSpecial = true;

        int length = 6 - password.length();

        char[] arr = password.toCharArray();

        for(int i = 0;i < arr.length; i++)
        {
            if(numbers.indexOf(arr[i]) > 0)
            {
                requiresDigit = false;
            }
            else if(lower_case.indexOf(arr[i]) > 0)
            {
                requiresLower = false;
            }
            else if(upper_case.indexOf(arr[i]) > 0)
            {
                requiresUpper = false;
            }
            else if(special_characters.indexOf(arr[i]) > 0)
            {
                requiresSpecial = false;
            }
        }

        if(requiresDigit)
        {
            added++;
        }
        if(requiresLower)
        {
            added++;
        }
        if(requiresUpper)
        {
            added++;
        }
        if(requiresSpecial)
        {
            added++;
        }

        if(length == added)
        {
            return length;
        }
        
        return Math.max(length, added);



    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String password = scanner.nextLine();

        int answer = minimumNumber(n, password);

        System.out.println(String.valueOf(answer));
     

        scanner.close();
    }
}
