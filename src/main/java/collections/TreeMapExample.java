package collections;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapExample {
	
	public static void main(String[] args) {
		// add
		TreeMap<String,Integer> map = new TreeMap<>();


		map.put("Raj", 1);
		map.put("Meera", 12);                     // duplicate values allowed but not duplicate keys
		map.put("Minarv",12 );
		map.put("chand", 6); // not maintaining order of insertion
		map.put("vasu", 8);
		map.put("Raj", 1); // not accepting duplicates
		map.put("Sara", null); // allows null

		System.out.println(map);
		Integer result = map.get("vasu");
		System.out.println(result);

		// update

		map.replace("Meera", 2);
		System.out.println(map);

		// delete

		map.remove("chand");
		System.out.println(map);

		// read using for loop
		for (Entry<String, Integer> name : map.entrySet()) {
			System.out.println(name);
		}
		// using iterator

		Iterator<Entry<String, Integer>> names = map.entrySet().iterator();
		while (names.hasNext()) {
			Entry<String, Integer> ex = names.next();
			String key = ex.getKey();
			Integer value = ex.getValue();
			System.out.println("The key is : " + key + "  " + "The value is : " + value);
		}

	}


}
