package JavaOOPscontinuation1;

//Java - Final class - 2
//We cannot extend a final class. Consider the below example:

/*
 * public class Program17 extends Program16 {
 * 
 * void demo() { System.out.println("ABC class method"); }
 * 
 * 
 * public static void main(String[] args) { Program16 obj3 = new Program16();
 * Program17 obj4 = new Program17(); obj3.demo(); }
 * 
 * }
 */

public class Program17 extends Program16{
	
	public static void main(String[] args) {
		
		Program16 obj = new Program16();
		obj.demo();
	}
	
}
