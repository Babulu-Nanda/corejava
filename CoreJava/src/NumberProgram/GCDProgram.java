package NumberProgram;

public class GCDProgram {
	public static void main(String[] abc) {
		System.out.println(gcd(24, 60));
	}

	private static int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}

}
