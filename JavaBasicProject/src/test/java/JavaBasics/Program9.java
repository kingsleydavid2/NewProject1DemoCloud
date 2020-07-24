package JavaBasics;

//Java Control Statements = Nested if Statements
//When there is an if statement inside another if statement then it is called the nested if statement.

public class Program9 {

	public static void main(String[] args) {
		
		int num = 70;
		if (num < 100) {
			
			System.out.println("number is less then 100");
			
				if(num > 50) {
				
					System.out.println("number is greater then 50");
					}
			}
		
	}
	
	
}
