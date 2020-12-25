package ua.lviv.lgs.t3;

import java.util.ArrayList;
import java.util.List;

public class ArrayListApp {	
	
	public static void main(String[] args) {
		
		List myList = new ArrayList();
		
		myList.add("Element1");
			System.out.println(myList + ", size: " + myList.size());
		myList.add("Element2");
			System.out.println(myList + ", size: " + myList.size());
		myList.add("Element3");
			System.out.println(myList + ", size: " + myList.size());
		myList.add("Element4");
			System.out.println(myList + ", size: " + myList.size());
		myList.add("Element5");
			System.out.println(myList + ", size: " + myList.size());
		myList.add("Element6");
			System.out.println(myList + ", size: " + myList.size());
			
		myList.add(1.01);
			System.out.println(myList + ", size: " + myList.size());
		myList.add(1.02);
			System.out.println(myList + ", size: " + myList.size());
		myList.add(1.03);
			System.out.println(myList + ", size: " + myList.size());
		myList.add(1.04);
			System.out.println(myList + ", size: " + myList.size());
		myList.add(1.05);
			System.out.println(myList + ", size: " + myList.size());
		myList.add(1.06);
			System.out.println(myList + ", size: " + myList.size());
			
			myList.remove(5);
				System.out.println(myList + ", size: " + myList.size());
			myList.remove(2);
				System.out.println(myList + ", size: " + myList.size());
			myList.remove(3);
				System.out.println(myList + ", size: " + myList.size());
			myList.remove(1);
				System.out.println(myList + ", size: " + myList.size());
			myList.remove(1);
				System.out.println(myList + ", size: " + myList.size());
			myList.remove(0);
				System.out.println(myList + ", size: " + myList.size());
			myList.remove(4);
				System.out.println(myList + ", size: " + myList.size());
			myList.remove(0);
				System.out.println(myList + ", size: " + myList.size());
			myList.remove(0);
				System.out.println(myList + ", size: " + myList.size());
			myList.remove(0);
				System.out.println(myList + ", size: " + myList.size());
			myList.remove(1);
				System.out.println(myList + ", size: " + myList.size());
			myList.remove(0);
				System.out.println(myList + ", size: " + myList.size());
				
		
		
	}
	

}
