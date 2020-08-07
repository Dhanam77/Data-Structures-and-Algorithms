	import java.util.Stack;

public class EasyPeasyBinary {

	static Stack<Character> stack = new Stack<>();

	public static void main(String[] args) {
		
		String s = "011010";
		
		System.out.println(getAns(s));
	}

	public static String getAns(String s) {
		
		for(char c : s.toCharArray()) {
			
			if(stack.isEmpty()) {
				stack.push(c);
				continue;
			}
			
			if(c == '1') {
				if(stack.peek() == '0') {
					stack.pop();
				}
				else {
					stack.push(c);
				}
			}
			else {
				stack.push(c);
			}
		
		}

		StringBuilder sb= new StringBuilder();
		
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		
		return sb.reverse().toString();
			
	}
	
}
