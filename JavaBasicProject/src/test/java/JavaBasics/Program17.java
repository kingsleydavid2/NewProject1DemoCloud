package JavaBasics;

//Continous statement inside for loop

/*As you may have noticed, the value 4 is missing in the output, why? because when the value of variable j is 4, the program 
encountered a continue statement, which makes it to jump at the beginning of for loop for next iteration, 
skipping the statements for current iteration (that’s the reason print didn’t execute when the value of j was 4).*/

public class Program17 {

	public static void main(String[] args) {
		
		for(int j=0;j<=6;j++) {
			
			if(j==3) {
				continue;
			}
			
			System.out.print(j+"");
			
			
		}
		
		
	}
	
	
	
}
