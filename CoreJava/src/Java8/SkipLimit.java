package Java8;

import java.util.Arrays;
import java.util.List;

public class SkipLimit {
	public static void main(String abc[]) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9);
		list.stream().skip(2).limit(8).forEach(System.out::print);
		
	}

}
