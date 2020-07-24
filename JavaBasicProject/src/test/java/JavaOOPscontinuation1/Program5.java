package JavaOOPscontinuation1;

//Java Polymorphism - 2

public class Program5 extends Program4 {
	
	  @Override 
	  public void sound() { System.out.println("Neigh"); }
	 
	
	public static void main(String[] args) {
		
		Program5 obj = new Program5();
		obj.sound();
		
	}
	

}
