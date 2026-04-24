package collections;

import java.util.TreeSet;

public class TreeSetExamples {

	public static void main(String[] args)
	{
		TreeSet<String> ts = new TreeSet<>();
		
		// add
		ts.add("Sunday");             // no null allowed
		ts.add("Monday");
		ts.add("Tuesday");
		ts.add("Wednesday");                  // sorted, have nothing to do with insertion order
		ts.add("Thursday");
		                               // no duplicates
		// read
		System.out.println("The last element is :" + ts.last());
		System.out.println(ts);
		
		// read all
		
		for(String names : ts)
			System.out.println("the list is :" + names);
		
		// delete
		
		ts.remove("Tuesday");
		System.out.println(ts);
		
		
	}
}
