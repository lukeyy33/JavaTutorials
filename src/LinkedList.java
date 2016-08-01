import java.util.*;

public class LinkedList {

	public static void main (String[] args) {
		method();
		
	}
	
	public static void method() {
		String[] things = {"apples", "noobs", "pwnage", "bacon", "goATS"};
		List<String> list1 = new java.util.LinkedList<String>();
		
		for (String x: things)
			list1.add(x);
		
		String[] things2 = {"sausage", "bacon", "goats", "harrypotter"};
		List<String> list2 = new java.util.LinkedList<String>();
		
		for (String y: things2)
			list2.add(y);
		
		list1.addAll(list2);
		list2 = null;
		
		System.out.println("\t printMe Method: ");
		printMe(list1);
		
		removeStuff(list1, 2 ,5);
		printMe(list1);
		reverseMe(list1);
	}

	
	//Reversing a String method	 
	private static void reverseMe(List<String> list1) {
		System.out.println("\n\t Reverse Method: ");
		//Declare a ListIterator to go through the list
		//list1.size() automatically gets the last element
		ListIterator<String> luke = list1.listIterator(list1.size());
		
		//While the list has an element before the current one,
		//loop through and print each previous element 1 by 1.
		while (luke.hasPrevious())
			System.out.printf("%s ", luke.previous());
		//While loop is true until it reaches the last element
				
	}
	
	/*
	 * Method for removing items
	 * @param list1 is the String
	 * @param from is the starting element
	 * @param to is the last element
	 */
	private static void removeStuff(List<String> list1, int from, int to) {
		System.out.println("\n\t removeStuff Method: ");

		//Using built-in Java method to get the
		//element and delete using defined params
		list1.subList(from, to).clear();
		
	}

	/*
	 * Method for printing string using an enhanced for-loop
	 */
	private static void printMe(List<String> list1) {
		for (String b : list1)
			//%s is the string, b is the 
			//item in the list
			System.out.printf("%s ", b);
		System.out.println();
		
	}
}
