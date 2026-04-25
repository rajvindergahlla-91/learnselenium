package collections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashTableExample {

	public static void main(String[] args) {
		// add
		Hashtable<String, Integer> hash = new Hashtable<>();

		hash.put("Raj", 1);
		hash.put("Meera", 12);
		hash.put("chand", 6); // not maintaining order of insertion
		hash.put("vasu", 8);
		hash.put("Raj", 1); // not accepting duplicates
		// hash.put("Sara", null); // doesnot allow null

		System.out.println(hash);
		Integer result = hash.get("vasu");
		System.out.println(result);

		// update

		hash.replace("Meera", 2);
		System.out.println(hash);

		// delete

		hash.remove("chand");
		System.out.println(hash);

		// read using for loop
		for (Entry<String, Integer> name : hash.entrySet()) {
			System.out.println(name);
		}
		// using iterator

		Iterator<Entry<String, Integer>> names = hash.entrySet().iterator();
		while (names.hasNext()) {
			Entry<String, Integer> ex = names.next();
			String key = ex.getKey();
			Integer value = ex.getValue();
			System.out.println("The key is : " + key + "  " + "The value is : " + value);
		}

	}

}
