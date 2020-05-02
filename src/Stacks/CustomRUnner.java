package Stacks;

public class CustomRUnner {
	
	
	public static void main(String[] args)
	{
		
		
		CustomStack st = new CustomStack(3);
		st.push(1);
		st.push(2);
		st.push(3);
		
	
		
		
		st.increment(2, 5);
		
		
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		
	}
	

}
