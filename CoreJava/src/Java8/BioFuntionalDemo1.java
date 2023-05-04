package Java8;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BioFuntionalDemo1 implements BiFunction<List<Integer>, List<Integer>, List<Integer>> {

	@Override
	public List<Integer> apply(List<Integer> list1, List<Integer> list2) {
		return Stream.of(list1, list2).flatMap(List::stream).distinct().collect(Collectors.toList());
	}

	public static void main(String[] abc) {
		List<Integer> list1 = Stream.of(12, 3, 7, 3, 5, 4).toList();
		List<Integer> list2 = Stream.of(12, 3, 7, 8, 5, 9).toList();

		BiFunction<List<Integer>, List<Integer>, List<Integer>> bifunction1 = new BiFunction<List<Integer>, List<Integer>, List<Integer>>() {

			@Override
			public List<Integer> apply(List<Integer> t, List<Integer> u) {
				return Stream.of(t, u).flatMap(List::stream).distinct().collect(Collectors.toList());
			}
		};

		System.out.println("Annonymous Function IMPL " + bifunction1.apply(list1, list2));

		BiFunction<List<Integer>, List<Integer>, List<Integer>> biofunction = (l1, l2) -> {
			return Stream.of(l1, l2).flatMap(List::stream).distinct().collect(Collectors.toList());
		};
		Function<List<Integer>, List<Integer>> sortedfunction=(list)->list.stream().sorted().collect(Collectors.toList());
		
		System.out.println("LambdaExpression Interface impl" + biofunction.andThen(sortedfunction).apply(list1, list2));
	}
}
