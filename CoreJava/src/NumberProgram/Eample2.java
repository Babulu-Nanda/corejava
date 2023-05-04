package NumberProgram;

public class Eample2 {
	public static void main(String[] abc) {
		/*
		 * int n = 39, i;
		 * 
		 * boolean flag = false;
		 * 
		 * for (i = 2; i <= n / 2; i++) { if (n % i == 0) { flag = true; break; } } if
		 * (!flag) System.out.println(n + " is a prime number."); else
		 * System.out.println(n + " is not a prime number."); }
		 */
		int n = 50, count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("The No is a Prime No");
		} else
			System.out.println("Not a Prime Number");
	}

}
