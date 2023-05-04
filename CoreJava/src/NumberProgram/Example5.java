package NumberProgram;

public class Example5 {
	
		public static void main(String[] abc) {
			int i,n1=100,n2=1000;
			for(i=n1;i<=n2;i++) {
				if(armStrong(i)) {
					System.out.println(i);
				}
				
			}
		}

		private static boolean armStrong(int i) {
			int actnum,rem ,res=0;
			actnum=i;
			while(i>0) {
				rem=i%i;
				res=res+(rem*rem*rem);
				i =i/10;
			}
			if(actnum==res)
				return true;
			else
			
			return false;
		}

		

}
