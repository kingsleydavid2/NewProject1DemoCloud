package JavaBasics;

//Operators = Basic Arithmetic Operators
//Assignment Operators, Auto-increment Operators, Logical Operators, Comparison Operators, Bitwise Operators

public class Program6 {

	
	public static void main(String[] args) {
		
		int num1=100;
		int num2=20;
		
		System.out.println("num1 + num2 = " + (num1+num2));
		System.out.println("num1 - num2 = " + (num1-num2));
		System.out.println("num1 / num2 = " + (num1/num2));
		System.out.println("num1 * num2 = " + (num1*num2));
		
		int num3=300;
		int num4=300;
		num3++;
		num4--;
		System.out.println("num3++ is: " + num3++);
		System.out.println("num4-- is: " + num4--);
		
		
		boolean b1 = true;
		boolean b2 = true;
		
		System.out.println("b1 && b2: " + (b1&&b2));
		System.out.println("b1 || b2: " + (b1||b2));
		System.out.println("!(b1 && b2): " + !(b1&&b2));
		
		
	}
	
	
}
