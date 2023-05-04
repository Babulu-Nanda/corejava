package NumberProgram;

public class Example3 {
	public static void main(String[] abc) {
      int num=153,rem,actualnum,result=0;
      actualnum=num;
     while(num>0) {
    	 rem=num%10;
    	 result=(rem*rem*rem)+result;
    	 num =num/10;
     }
      if(actualnum==result)
    	  System.out.println("the no "+ actualnum +" is armstrong");
      else
  		System.out.println("the no "+actualnum +" is  not armstrong");
	}
	
}
