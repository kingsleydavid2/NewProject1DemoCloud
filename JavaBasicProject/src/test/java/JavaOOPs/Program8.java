package JavaOOPs;

//Java inheritance Program2

public class Program8 extends Program7 {
	
	String mainsubject = "Physics";
	
	public static void main(String[] args) {
		
		Program8 obj1 = new Program8();
		System.out.println(obj1.collegeName);
		System.out.println(obj1.designation);
		System.out.println(obj1.mainsubject);
		obj1.does();
		
		
	}
	

}
