package JavaOOPscontinuation1;

//Java - abstract class Example - 2

public class Program11 extends Program10 {
	
	public void sound() {
		System.out.println("Woof");
	}
	
	public static void main(String[] args) {
		Program10 obj1 = new Program11();
		obj1.sound();
	}
	

}
