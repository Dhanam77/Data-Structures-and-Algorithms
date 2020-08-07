package Mathematical;

public class GameOfDigits {

	public static void main(String[] args) {
		long n = 100;
		
		StringBuilder sb = new StringBuilder();
		
		for(long i = 9;i >= 2; i--) {
			while(n%i == 0) {
				sb.append(i);
				n /= i;
			}
		}
		
		if(n == 1) {
			System.out.println(sb.reverse().toString());
		}
		else {
			System.out.println("-1");

		}
	}
	
	
}
	