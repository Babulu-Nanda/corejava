package NumberProgram;

public class Example6 {
	public static void main(String[] abc) {
		int max=0, i, n = 4,m=0;

		/*
		 * int[] a = new int[] { 12, 23, 18, 22 }; max = max_num(a, n);
		 * System.out.println("The Maximum no is="+max); }
		 * 
		 * private static int max_num(int[] a, int n) { int i, m = 0; for (i = 0; i < n;
		 * i++) { if (a[i] > m) m = a[i]; } return m; }
		 */
		int[] array=new int[] {12,23,35,145};
		for(i=0;i< n;i++) {
			if(array[i] >m) {
				m=array[i];
			}
		
		}
		System.out.println(m);
	}
}
