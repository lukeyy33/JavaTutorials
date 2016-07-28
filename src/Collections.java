import java.util.ArrayList;

public class Collections {
	public static void main (String[] args) {
		
		String[] things = {"eggs", "lasers", "hats", "pie"};
		ArrayList<String> list = new ArrayList<String>();
		
		//add array items to list
		for (String x: things)
			list.add(x);
		
		String[] morethings = {"lasers", "hats"};
		ArrayList<String> list2 = new ArrayList<String>();
		
		for (String y: morethings)
			list2.add(y);
		
		for (int i = 0; i < list.size(); i ++) {
			System.out.printf("%s ", list.get(i));			
		}
	}
}
