package JavaOOPscontinuation1;

//Java - Final variable, methods and class

/*
 * public class Program15 {
 * 
 * final int MAX_VALUE = 100;
 * 
 * public void set() { int MAX_VALUE = 99; }
 * 
 * public static void main(String[] args) { Program15 obj1 = new Program15();
 * obj1.set(); }
 * 
 * }
 */

public class Program15{
	//Blank final variable
	final int MAX_VALUE;
	
	Program15() {
		this.MAX_VALUE = 99;
		
	}
	
	public void set(){
		System.out.println(MAX_VALUE);
	}
   
	public static void main(String[] args) {
		Program15 obj1 = new Program15();
		obj1.set();
	}
	
	
	
}