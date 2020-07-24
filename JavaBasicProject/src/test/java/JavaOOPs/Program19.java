package JavaOOPs;

//Java - Super Keyword 2: and How to use super keyword in case of method overriding

public class Program19 extends Program18 {

	//Overriding method
	void display() {
		System.out.println("Child class method");
	}
	
	
	void printMsg() {
		
		//This would call overriding method
		display();
		
		//This would call overridden method
		super.display();
		
	}
	
	public static void main(String[] args) {
		Program19 obj = new Program19();
		obj.printMsg();
	}
	
	
}
