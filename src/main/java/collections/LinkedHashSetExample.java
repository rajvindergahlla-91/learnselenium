package collections;

//import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
	
	public static void main(String[] args) {
		LinkedHashSet<String> ls = new LinkedHashSet<>();

		// add
		ls.add(null); // no duplicates
		ls.add("Rajvinder");
		ls.add("Nirmal");
		ls.add("Gagan"); // allow null
		ls.add("Rajvinder");
		ls.add("Ankita");

		// read
		System.out.println(ls); //  maintains order of insertion.

		// read all
		for (String name : ls) // no direct update operation
			System.out.println(name);

		// delete

		ls.remove("Gagan");
		System.out.println("the updated list is : " + ls);

	}

}



