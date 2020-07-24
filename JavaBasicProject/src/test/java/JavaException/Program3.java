package JavaException;

//Java Exception Finally blocked used

public class Program3 {
	
	public static void main(String[] args) {
		
		try {
			System.out.println("First Statemen of Try and Block");
			int num=45/0;
			System.out.println(num);
		}
		catch(Exception e) {
			System.out.println("Exception has occurred");
		}
		finally {
			System.out.println("finally block");
		}
		System.out.println("Out of try-catch block - finally");
		
	}

}
