import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class Collections {
	
	static ArrayList<String> list = new ArrayList<String>();
	static ArrayList<String> list2 = new ArrayList<String>();

	public static void main (String[] args) {
		arrayList();
		editList();

	}
	
	public static void arrayList() {
		String[] things = {"eggs", "lasers", "hats", "pie"};
		String[] morethings = {"lasers", "hats"};
		
		//add array items to list
		for (String x: things)
			list.add(x);		
		
		for (String y: morethings)
			list2.add(y);
		
		for (int i = 0; i < list.size(); i ++) {
			System.out.printf("%s ", list.get(i));			
		}
	}

	public static void editList() {
		
		editTheList(list,list2);
		System.out.println();
		
		for (int i = 0; i < list.size(); i ++) {
			System.out.printf("%s ", list.get(i));			
		}
	}

	public static void editTheList(Collection<String> l1, Collection<String> l2) {
		Iterator<String> it = l1.iterator();
		//Loop through the list item by item
		while(it.hasNext()) {
			//if item from l1 is in l2, it's removed
			if (l2.contains(it.next()))
					it.remove();
		}
		
	}



}
