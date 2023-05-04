package NumberProgram;

public class Exxample11 {
	public static void main(String[] abc) {
		int n=305,rem,res=0;
		int orgn=n;
		while(0<n) {
			rem=n%10;
			res=(res*10)+rem;
			n=n/10;
		}
		if(orgn==res)
			System.out.println("the no is palliandrome");
		else 
			System.out.println("the no is not palliandrome");
	}

}
