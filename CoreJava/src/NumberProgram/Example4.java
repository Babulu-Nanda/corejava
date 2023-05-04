package NumberProgram;

public class Example4 {
	public static void main(String[] abc) {
		//print 10-100 prime number
		int n1=10,n2=100, i,j ;
		for( i=n1;i<=n2;i++) {
			for( j=2;j<=i;j++) {
				if(i%j==0) {
					break;
				}
			}
			
				if(i==j) {
					System.out.println(j);
				}
			}
		}
	}

