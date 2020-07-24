package JavaCollections;

import java.util.ArrayList;
import java.util.LinkedList;

//Linked List Collection Program - Java

public class Program2 {
	
	public static void main(String[] args) {
		
		LinkedList<String> alist = new LinkedList<String>();
		alist.add("india");
		alist.add("canada");
				
		System.out.println(alist);
		
		alist.remove(0);
		System.out.println(alist);
		
	}
	
	

}
