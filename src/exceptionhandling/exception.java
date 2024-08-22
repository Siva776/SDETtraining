package exceptionhandling;

public class exception {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		int c = 3;
	
		
		try {
			System.out.println(a/b);
			
		}
		catch(ArithmeticException e) {
			System.out.println("exception caught:Division by Zero is not allowed");
			
		}
		finally {
			
			System.out.println("this block is executed");
		}
			
			System.out.println(a/c);
			
		}
	}


