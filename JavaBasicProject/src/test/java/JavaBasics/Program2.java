package JavaBasics;

//Local Variable : age is a local variable. This is defined inside pupAge() method and its scope is limited to only this method.

public class Program2 {
	
	public void puppyage() {
		int age = 0;
		age = 0+7;
		System.out.println("Puppy age is " + age);
	}
	
	public static void main(String[] args) {
		
		Program2 Program = new Program2();
		Program.puppyage();
		
	}
	

}
