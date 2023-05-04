package Java8;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class ByConsumerDemo1 implements BiConsumer<String, Integer> {

	@Override
	public void accept(String t, Integer u) {
		System.out.println(t + "::" + u);

	}

	public static void main(String[] abc) {
		//Annonymous Function
		BiConsumer<String, Integer> biconsumer = new BiConsumer<String, Integer>() {

			@Override
			public void accept(String t, Integer u) {
				System.out.println(t + "::" + u);

			}
		};
     //Biconsumer &BiPredicate are main important thing to use.
		//biconsumer.accept("AAAAA", 11111);
		BiConsumer<String , Integer>  biconsumer1=(i1,i2)->System.out.println(i1+"::"+i2);
	//biconsumer1.accept("BBBBB", 22222);
	Map<String, Integer> map=new HashMap<>();
	map.put("Manish", 12000);
	map.put("mantu", 14000);
	map.put("Lipu", 17000);
	map.forEach(biconsumer1);
	}
	
}