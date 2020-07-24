package JavaException;

//Java Throw Exception
//Example of Checked exception(compile time exception) example: Thread.sleep(3000) during compile time , it has to be handled
//Example of UnChecked exception(run time exception) example: int a=10, b=0, System.out.println(a/b), now the exception will be
//displayed during run time.

public class Program4 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		Thread.sleep(3000);
		System.out.println("Hello Geeks");
		
	}

}
