package JavaBasics;

//Static variable : Class variables also known as static variables  -
// - are declared with the static keyword in a class, but outside a method, constructor or a block

public class Program4 {
	
	//Salary variable is private static variable
	private static long salary;
	
	//DEPARTMENT is a constant
	public static final String DEPARTMENT = "Dev Team = One Developer :";
	
	public static void main(String[] args) {
		
		salary = 100000;
		System.out.println(DEPARTMENT + " average salary =  " + salary);
		
	}

}
