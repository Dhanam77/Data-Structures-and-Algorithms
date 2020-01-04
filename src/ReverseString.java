import java.util.*;

public class ReverseString {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		ReverseString rs = new ReverseString();
		rs.ReversesString(string);
		
	}
	
	public void ReversesString(String s)
	{
		StringBuilder sb = new StringBuilder();
		char[] a = s.toCharArray();
		char[] b = new char[s.length()];
		
		for(int i = 0; i < s.length(); i++)
		{
			b[i] = a[s.length()-i-1];
			sb.append(b[i]);
		}
		justAnotherMethod(String.valueOf(sb));
	}
	
	public void justAnotherMethod(String s)
	{
		System.out.println(s);
	}

}
