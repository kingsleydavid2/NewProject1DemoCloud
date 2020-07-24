package JavaBasics;

//Instance Variables : Instance variables are declared in a class, but outside a method, constructor or any block

public class Program3 {

	//this Instance variable is visible for any child class
	public String name;

	//The name variable is assigned in constructor
	public Program3 (String empName) {
		name = empName;
	}
	
	//This method print emp details
	public void empdetails() {
		System.out.println("name  : "+ name);
	}
	
	public static void main(String[] args) {
		
		Program3 Program = new Program3("David");
		Program.empdetails();
		
		
	}
	
	
	
}
