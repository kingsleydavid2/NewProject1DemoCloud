package JavaOOPs;

//Java - Overloading constructor

public class Program5 {
	
	int id;
	String name;
	int age;
	
	
	//creating two arg constructor
	Program5(int i, String n){
		id=i;
		name=n;
		
	}
	
	
	//creating three arg constructor
	Program5(int i, String n, int a){
		id = i;
		name = n;
		age = a;
	}
	
	
	void display() {System.out.println(id+ " " +name+ " " +age);}
	
	public static void main(String[] args) {
		Program5 obj1 = new Program5(1,"sai",20);
		Program5 obj2 = new Program5(2,"ravi");
		obj1.display();
		obj2.display();
	}
	
	
	
	
	
	

}
