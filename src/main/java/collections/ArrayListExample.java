package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// List<String> list = new ArrayList<>();
		ArrayList<String> aList = new ArrayList<>();

		// create

		aList.add("Puneet");
		aList.add("Riya");                     // Takes Duplicates
		aList.add("Minarv");
		aList.add("vitaharya");
		aList.add("Asha");                        // maintains order
		aList.add("Riya");

		// Read
		System.out.println(" The name of 3rd member is : " + aList.get(5));

		// Update

		aList.set(4, "Divya");
		System.out.println(aList);                // doesnot gives Null

		// Delete
		aList.remove(4);
		System.out.println(aList);

		// Read all elements
		for (String name : aList)
			System.out.println(name);

	}
}
