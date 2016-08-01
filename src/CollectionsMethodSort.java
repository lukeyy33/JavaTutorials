import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class CollectionsMethodSort {
	
	public static void main(String[] args) {
		String[] string = {"fruit", "veg", "tv", "phone", "list"};
		//Convert the String array to a List
		List<String> list = Arrays.asList(string);
		
		System.out.printf("Original list:\n%s\n ",list );
		//Call methods from the Collection class and apply to
		//a list
		Collections.sort(list);		
		System.out.printf("\nSorted List:\n%s\n", list);
		
		//Method for sorting a list in reverse order
		Collections.sort(list, Collections.reverseOrder());		
		System.out.printf("\nReverse Order List:\n%s\n", list);	
		
	}

}
