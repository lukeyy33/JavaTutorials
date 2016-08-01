import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class ReverseAndCopy {
	
	public static void main(String[] args) {
		//Create an array and convert to a list
		Character[] ray = {'p', 'w', 'n'};
		List<Character> list = Arrays.asList(ray);
		System.out.println("List is : ");
		output(list);
		
		//Reverse then print out the list
		Collections.reverse(list);
		System.out.println("After Reverse : ");
		output(list);
		
		//Create a new array and list
		Character[] newRay = new Character[3];
		List<Character> listCopy = Arrays.asList(newRay);
		
		//Copy contents of list into listCopy
		Collections.copy(listCopy, list);
		System.out.println("Copy of list : ");
		output(listCopy);
		
		//fill the collection
		Collections.fill(list, 'X');
		System.out.println("After filling the list : ");
		output(list);
	}

	//output method
	private static void output(List<Character> theList) {
		
		for (Character thing : theList)
			System.out.printf("%s ", thing );
		
		System.out.println();
	}
	
}
