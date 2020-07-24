package JavaException;

//Java Try and Catch block Exception

public class Program1 {

	public static void main(String[] args) {
		
		int num1, num2;
		
		try {
			
			
			num1=0;
			num2=62/num1;
			System.out.println("Hey, I am end of my block");
					
		}
		catch(NullPointerException e) {
			
			System.out.println("You should not divide a number by zero");
			
		}
		catch(ArithmeticException e) {
			
			System.out.println("You should not divide a number by zero");
			
		}
		catch(Exception e) {
			System.out.println("Exception occurred");
		}
		System.out.println("I am out of Try and Catch block in Java");
	}
}
		
		
		
	
	
	
	
	

