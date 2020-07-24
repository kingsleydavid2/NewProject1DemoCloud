package JavaOOPscontinuation1;

//Java - Dynamic Binding - Program - 2

public class Program9 extends Program8 {
	
	//Overriding method
	public void walk() {
		System.out.println("Boy Walks");
			
	}

	public static void main(String[] args) {
		
		 /* Reference is of Human type and object is
	        * Boy type
	        */
		
		Program8 obj1 = new Program9();
		Program8 obj2 = new Program8();
		obj1.walk();
		obj2.walk();
		
		
	}
	
	
}
