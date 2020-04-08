package exerciseBook;

public class Calc {

	public int add (int a, int b) {
		int ans = a+b;
		return ans;
	}
	
	public int sub (int a, int b) {
		int ans = a-b;
		return ans;
	}
	
	public int mult (int a, int b) {
		int ans = a*b;
		return ans;
	}
	
	public int div (int a, int b) {
		int ans = a/b;
		return ans;
	}
	
	
	public float calc(int a, int b, String c) {
		
		float ans = 0;
		
		switch (c) {
		case "+":
			ans = a+b;
		break;
		case "-":
			ans = a-b;
		break;
		case "*":
			ans = a*b;
		break;
		case "/":
			ans = a/b;
		break;
		default:
			System.out.println("Nothing to print");		
			
		}
		
		
		return ans;
		
	}
}
