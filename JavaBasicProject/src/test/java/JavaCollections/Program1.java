package JavaCollections;

//Java ArrayList Collection Program

import java.util.*;

public class Program1 {

	public static void main(String[] args) {
		
		ArrayList<String>alist = new ArrayList<String>();
		alist.add("Sumesh");
		alist.add("krishna");
		alist.add("Ravi");
		alist.add("subha");
		alist.add("Sumesh");
	
		
		//displaying elements
		System.out.println(alist);
		
		alist.remove(2);
		System.out.println(alist);
		
		//Adding "Steve" at the fourth position
		alist.add(3, "Steve");
		
		//displaying elements
		System.out.println(alist);
		
		alist.remove(3);
		//displaying elements
				System.out.println(alist);		
		
	}
	
}
