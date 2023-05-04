package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiii {
	public static void main(String[] abc) {
		List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
		List<String> s = Arrays.asList("Rohit", "Virat", "Sachin", "MSD");
		List<Integer> number = numbers.stream().filter(x -> x > 3).collect(Collectors.toList());

		s.stream().map(p -> p.toUpperCase()).collect(Collectors.toList());
		List<Integer> distinct = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
		// distinct.forEach(x->System.out.println(x));
		// number.forEach(p->System.out.println(p));
		List<String> sss = Arrays.asList("Rohit", "Virat", "Sachin", "MSD");
		String[] biggies = { "Apple", "Google", "Amazon" };
		String fromArray = String.join(" '' ", sss);
		System.out.println("String joined by comma from array: " + fromArray);
	}

}
