package collections;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args)
	{
		ArrayList<String> aList = new ArrayList<>();
		
		// create
		
		aList.add("Puneet");
		aList.add("Riya");
		aList.add("Minarv");
		aList.add("vitaharya");
		aList.add("Asha");
		
		// Read
		System.out.println(" The name of 3rd member is : " + aList.get(3));
		
		// Update
		
		aList.set(4,"Divya");
		System.out.println(aList);
		
		
		// Delete
		aList.remove(4);
		System.out.println(aList);
		
		// Read all elements
		for ( String name: aList)
			System.out.println(name);
			
	}
}
