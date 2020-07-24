package JavaOOPs;

//Java Constructor - 
//Types of Constructor - Default, No-Org, Parameterized


//Parameterized Constructor below
public class Program2 {
	
	int empId;
	String empName;
	
	//Parameterized Constructor with two parameters
	Program2(int id, String name){
		this.empId = id;
		this.empName = name;
	}
	
	void info() {
		System.out.println(" Id: "+empId+  " Name: "+empName);
	}
	
	public static void main(String[] args) {
		Program2 obj1 = new Program2(106217,"SaiKrishna" );
		Program2 obj2 = new Program2(25689, "Ravi");
			obj1.info();
			obj2.info();
	}
	
	
	
	

}
