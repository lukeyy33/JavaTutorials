import java.util.Arrays;
import java.util.LinkedList;;

public class ListToArray {	
	public static void main(String[] args) {
		//Create a String array
		String[] stringArray = {"water", "melon", "chocolate"};
		
		//Build a list to contain the array elements		
		LinkedList<String> theList = new java.util.LinkedList<String>(Arrays.asList(stringArray));
		//Algorithm to make the compiler see the Array as a List ^^
		
		//List methods you can do
		theList.add("\nadd() method\n");
		theList.addFirst("addFirst() method\n");
		theList.addLast("addLast method()\n");
		
		//Convert list back to array
		stringArray = theList.toArray(new String[theList.size()]);
		//For each loop to print the array	
		for (String x : stringArray)			
			System.out.printf("%s ", x);
		
	}
}
