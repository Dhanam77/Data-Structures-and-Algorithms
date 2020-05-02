package Stacks;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.Stack;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class MorganAndString {

	
	    // Complete the morganAndString function below.
	    static String morganAndString(String a, String b) {

	        StringBuilder sb = new StringBuilder();

	        Stack<Character> stack1 = new Stack<>();
	        Stack<Character> stack2 = new Stack<>();
	        Queue<Character> queue1 = new LinkedList<>();
	        Queue<Character> queue2 = new LinkedList<>();


	        for(int i = a.length() - 1; i >= 0; i--)
	        {
	            stack1.push(a.charAt(i));
	        }
	        for(int i = b.length() - 1; i >= 0; i--)
	        {
	            stack2.push(b.charAt(i));
	        }

	        while(!stack1.isEmpty() && !stack2.isEmpty())
	        {
	            if(stack1.peek() > stack2.peek())
	            {
	                while(!queue2.isEmpty())
	                {
	                    sb.append(queue2.remove());
	                }
	                sb.append(stack2.pop());
	            }

	            else if(stack1.peek() == stack2.peek())
	            {

	                queue1.add(stack1.pop());
	                queue2.add(stack2.pop());
	                
	                

	            }
	            else
	            	
	            
	            {
	                 while(!queue1.isEmpty())
	                {
	                    sb.append(queue1.remove());
	                }
	                sb.append(stack1.pop());
	            }

	        }

	        while(!stack1.isEmpty())
	        {
	            sb.append(stack1.pop());
	        }

	        while(!stack2.isEmpty())
	        {
	            sb.append(stack2.pop());
	        }


	       


	        return sb.toString();




	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	 
	            String a = scanner.nextLine();

	            String b = scanner.nextLine();

	            String result = morganAndString(a, b);

	      System.out.print(result);

	        scanner.close();
	    }
	}

