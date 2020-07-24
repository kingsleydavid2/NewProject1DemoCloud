package JavaOOPs;

//Parent class Program 1 - still little bit checking need to be done

public class Program12 extends Program11 {

	Program12(){
		System.out.println("Constructor of Child");
	}
	
	void disp() {
		
		System.out.println("Child method");
		
		//Calling the disp() method of parent class
		super.display();
	}
	
	public static void main(String[] args) {
		//Creating the object of Main class
		Program12 obj = new Program12();
		obj.display();
		}
	
}
