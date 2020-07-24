package JavaCollections;

//HashMap Program in Java

import java.util.*;

public class Program3 {
	
	public static void main(String[] args) {
		
		
		//This how we declare HashMap in Java
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		
		//Adding elements to HashMap
		hmap.put(12, "Sridhar");
		hmap.put(2, "Ravi");
		hmap.put(3, "Singh");
		hmap.put(1, "Ramu");
		
		//Get values based on Key
		String var = hmap.get(1);
		System.out.println("Value at index 1 is: "+var);
		
		//Get size of HashMap
		System.out.println("Size of HashMap : " +hmap.size());
		
		}
	}
