package JavaOOPs;

//Aggregation Program - Continuation...

public class Program14 {
	
	int rollNum;
	String studentName;
	
	//Creating HAS-A relationship with Address class
	
	Program13 studentAddr;
	Program14(int roll, String name, Program13 addr){
		this.rollNum = roll;
		this.studentName = name;
		this.studentAddr = addr;
			
	}
	
	public static void main(String[] args) {
		Program13 obj1 = new Program13(55, "Agra", "UP", "India");
		Program14 obj2 = new Program14(56, "Chaitnaya", obj1);
		System.out.println(obj2.rollNum);
		System.out.println(obj2.studentName);
		System.out.println(obj2.studentAddr.streetNum);
		System.out.println(obj2.studentAddr.city);
		System.out.println(obj2.studentAddr.state);
		System.out.println(obj2.studentAddr.country);
		
		
	}
	
	
	
	
	
	

}
