package collections;

//import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// List<String> list = new LinkedList<>();
		LinkedList<String> lList = new LinkedList<>();

		// create

		lList.add("Puneet");
		lList.add("Riya");
		lList.add("Minarv");                // takes duplicate
		lList.add("vitaharya");
		lList.add("Asha");                  // maintains order
		lList.add("Minarv");

		// Read
		System.out.println(" The name of 3rd member is : " + lList.get(3));

		// Update

		lList.set(4, "Divya");
		System.out.println(lList);

		// Delete
		lList.remove(3);
		System.out.println(lList.get(3));

		// Read all elements                    // allows null value
		for (String name : lList)
			System.out.println(name);

	}
}
