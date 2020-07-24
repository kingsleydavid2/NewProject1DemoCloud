package JavaOOPscontinuation1;

//Java Static binding Program -2 

public class Program7 extends Program6 {
	
	public static void walk() {
		System.out.println("Boy Walks");
	}
	
	public static void main(String[] args) {
		Program6 obj = new Program7();
		Program6 obj1 = new Program6();
		obj.walk();
		obj1.walk();
		
		
	}
	
	

}
