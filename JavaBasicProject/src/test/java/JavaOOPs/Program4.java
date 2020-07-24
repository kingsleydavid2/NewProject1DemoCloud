package JavaOOPs;

//Java using Super keyword

public class Program4 extends Program3 {
	
	
	//Overriding Method
	@Override
	public void display() {
		System.out.println("I am Human");
	}
	
	
	public void printMessage() {
		
		//this call overriding method
		display();
	
		//this call overridden method
		super.display();
		}	
	
	
		public static void main(String[] args) {
			Program4 obj1 = new Program4();
			obj1.printMessage();
			}
		}
		
