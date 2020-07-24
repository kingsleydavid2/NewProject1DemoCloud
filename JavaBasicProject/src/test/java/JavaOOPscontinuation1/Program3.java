package JavaOOPscontinuation1;

//Java - Method overloading, we can add many parameters with same method names that is method overloading

public class Program3 {
	
	int add(int n1, int n2) {
		return n1+n2;
	}
	
	int add(int n1, int n2, int n3) {
		return n1+n2+n3;
	}
	
	int add(int n1, int n2, int n3, int n4) {
		return n1+n2+n3+n4;
	}
	
	public static void main(String[] args) {
		Program3 obj = new Program3();
		System.out.println(obj.add(10, 20));
		System.out.println(obj.add(10, 20, 30));
		System.out.println(obj.add(10, 20, 30, 40));
	}
	
	

}
