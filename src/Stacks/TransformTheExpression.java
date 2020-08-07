package Stacks;
import java.util.Stack;
import java.util.*;
public class TransformTheExpression {

	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String expression = sc.nextLine();
		
		System.out.println(getPostFix(expression));
		
		
	}

	private static String getPostFix(String s) {
		// TODO Auto-generated method stub
		
		Stack<Character> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i < s.length(); i++) {
			if(s.charAt(i) == '(') {
				continue;
			}
			else if(s.charAt(i) == ')') {
				sb.append(stack.pop());
			}
			else if(s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/' ||s.charAt(i) == '^') {
				stack.push(s.charAt(i));
			}
			else {
				sb.append(s.charAt(i));
			}
		}
		
		
		
		return sb.toString();
	}
	
}
