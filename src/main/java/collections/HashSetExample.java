package collections;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();

		// add
		hs.add(null);               // no duplicates
		hs.add("Rajvinder");
		hs.add("Nirmal");
		hs.add("Gagan");            // allow null
		hs.add("Rajvinder");
		hs.add("Ankita");

		// read
		System.out.println(hs);    // doesnot maintains order of insertion.

		// read all
		for (String name : hs)     // no direct update operation
			System.out.println(name);

		// delete

		hs.remove("Gagan");
		System.out.println("the updated list is : " + hs);

	}

}
