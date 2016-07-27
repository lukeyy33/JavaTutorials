public class Strings {
	
	public static void main(String[] args) {
		stringMethods();	
		subStringAndIndexMethods();	
		concatStrings();
		replaceString();
		upperCase();
		trimString();

	}
	
	public static void stringMethods() {
		System.out.println("stringMethods(): ");	
		String[] words = {"funk", "chunk", "furry"};
		
		//startsWith		
		for(String w : words) {
			if(w.startsWith("fu"))
				System.out.println("\t" + w + "starts with fu");
		}
		
		//ends with
		for (String w: words) {
			if(w.endsWith("unk"))
				System.out.println("\t" + w + "ends with unk");
		}
		System.out.print("\n");
}

	public static void subStringAndIndexMethods() {
		System.out.println("subStringAndIndexMethods(): ");
		String s = "lukelukelukelukeluke";
		//Starts at index 6, with first occurence of 'elu'
		System.out.println("\t" + s.indexOf("elu",6));
		//second param starts from variable index
	}
	
	public static void concatStrings() {
		System.out.println("concatStrings(): ");
		String a = "Bacon ";
		String b = "monster";
		//concat(argument)
		System.out.print("\t" + a.concat(b));
	}

	public static void replaceString() {
		System.out.println("\n\nreplaceString(): ");
		String a = "Bacon";
		//String b = "Monster";
		System.out.println("\t" + a.replace('B', 'F'));
	}

	public static void upperCase() {
		System.out.println("\nupperCase():");
		
		//String a = "Bacon";
		String b = "Monster";
		
		System.out.println("\t" + b.toUpperCase());
	}

	public static void trimString() {
		System.out.println("\n\ntrimString(): ");		
		String b = "      Monster    ";
		System.out.println(b.trim());
	}
}
