package JavaOOPs;

//Java Program - Smaple Constructor
//This Keyword is used in this Constructor and to call Instance Variable

public class Program1 {
	
	String name;
	
	//Constructor
	Program1(){
		this.name = "BeginnersBook";
	}
	
	
	public static void main(String[] args) {
		
		Program1 Pro = new Program1();
		System.out.println(Pro.name);
		
	}
	

}
