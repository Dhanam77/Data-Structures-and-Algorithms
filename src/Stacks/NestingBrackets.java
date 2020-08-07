package Stacks;
import java.util.Stack;
public class NestingBrackets {
	public static void main(String[] args) {
		String s = "(())";
		Stack<Character> stack = new Stack<>();
		int count = 0, max = 0;
		int firstPos = 0;
		for(int i = 0;i < s.length(); i++) {
			if(stack.isEmpty()) {
				stack.push(s.charAt(i));
				count++;
			}
			else {
				if(s.charAt(i) == '(') {
					stack.push(s.charAt(i));
					count++;
					
					max = Math.max(max,  count);
				}
				else {
					stack.pop();
					count--;
				}
			}
		}
		System.out.print(max);
	}

}
