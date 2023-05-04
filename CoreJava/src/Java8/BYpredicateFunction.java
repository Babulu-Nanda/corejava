package Java8;

import java.util.function.BiPredicate;

public class BYpredicateFunction implements BiPredicate<String, String> {

	// it is used two object are equal/not
	@Override
	public boolean test(String t, String u) {
		return t.equals(u);
	}

	public static void main(String[] abc) {
		BiPredicate<String, String> bipredicate = new BiPredicate<String, String>() {

			@Override
			public boolean test(String t, String u) {

				return t.equals(u);
			}
		};
		System.out.println(bipredicate.test("madam", "madam"));
		BiPredicate<String, String> bipredicate1=(s1,s2)-> s1.equals(s2);
		
		System.out.println(bipredicate1.test("abc", "ABC"));
		
		
	}
	

}
