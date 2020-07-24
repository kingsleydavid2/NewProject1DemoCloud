package JavaBasics;

//Use of break in a for loop

public class Program18 {
	
	public static void main(String[] args) {
		
		int var;
		for(var =100;var>=10;var--) {
			
			System.out.println("var: " +var);
			if (var ==98) {
				
				break;
			}
			
				
		}
		
		System.out.println("out of the loop");
		
		
	}
	
}
