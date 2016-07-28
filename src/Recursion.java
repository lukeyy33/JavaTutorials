
public class Recursion {

	public static void main(String[] args) {
		//5 Factorial is 5 * 4 * 3 * 2 * 1 = 120
		//4 Factorial is 4* 3 * 2 * 1 = 24
		//ETC
		System.out.println(fact(5));
	}
	
	public static long fact(long n) {
	//NEEDS A BASE CASE OR INFINITE LOOP WILL HAPPEN
		if (n <=1) 
			return 1;
		else
			//if n == 5 			
			return n * fact(n-1);
			/* Start -> 5 !
			 * 5 * 4 !
			 * 4 * 3 !
			 * 3 * 2 !
			 * 2 * 1 !
			 * 1 ! <- base factorial
			 */
	}

}
