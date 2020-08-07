package Stacks;

import java.io.*;
import java.util.*;

public class SimpleTextEditor {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
/*
        java.util.Stack<String> stack = new java.util.Stack<>();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        stack.push("");
        while(n-- > 0){
            int a = sc.nextInt();
            System.out.println("a is " + a);


            switch(a){
                case 1: {
                    String s = sc.nextLine().trim();
                    System.out.println("s is " + s);
                    System.out.println("pushing case 1 " + stack.peek() + s);

                    stack.push(stack.peek() + s);
                    break;

                }
                case 2:{
                    int b = sc.nextInt();
                    System.out.println("b is " + b);

                    String s = stack.peek();
                    System.out.println("String is" + s);
                    System.out.println("s.length is " + s.length());

                    System.out.println("s length - b is " + (s.length() - b));

                    if(b >= s.length()){
                        stack.push("");
                        System.out.println("pushing " + stack.peek());
                    } 
                    else {
                        stack.push(s.substring(0,s.length() - b));
                        System.out.println("pushing " + stack.peek());

                    }
                    break;

                }
                case 3:{
                    int b = sc.nextInt();
                    if(!stack.isEmpty()){
                        System.out.println(stack.peek().charAt(b-1));

                    }
                    break;
                }
                case 4:{
                    System.out.println("Popping " + stack.pop());
                    if(!stack.isEmpty()){
                        stack.pop();
                    } 
                    break;
                }
            }


        }


*/

    	       BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
    	        int n=Integer.parseInt(reader.readLine());
    	        String present=new String();
    	        java.util.Stack<String> s=new java.util.Stack<>();
    	        for(int i=0;i<n;i++)
    	        {
    	            String input[]=reader.readLine().split(" ");
    	            int operation=Integer.parseInt(input[0].trim());
    	            switch(operation){
    	            case 1:
    	                String sub=input[1].trim();
    	                s.push(present);
    	                present=present.concat(sub);
    	                break;
    	            
    	            case 2:
    	                int pos1=Integer.parseInt(input[1]);
    	             s.push(present);
    	                present=present.substring(0,present.length()-pos1);
    	                break;
    	            case 3:
    	                int pos=Integer.parseInt(input[1]);
    	                System.out.println(present.charAt(pos-1));
    	              break;
    	            case 4:
    	                present=String.valueOf(s.peek());
    	                s.pop();
    	            break;
    	    default:
    	    break;
    	        }
    	        }
    	    }
    	}

    }
}
