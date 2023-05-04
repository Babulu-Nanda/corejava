package Java8;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class BioFunctionalMap implements BiFunction<String, Integer,Integer> {
	
	public static void main(String []abc){
		Map<String,Integer> map=new HashMap<>();
		map.put("Manish", 12000);
		map.put("mantu", 14000);
		map.put("Lipu", 17000);
		BiFunction<String, Integer,Integer> bifunction=new BiFunction<String, Integer, Integer>() {
			
			@Override
			public Integer apply(String t, Integer u) {
				return u+1000	;
			}
		};
		map.replaceAll(bifunction);
		System.out.println("Annonymous Function="+map);
		BiFunction<String, Integer,Integer> bifunction1=(s,i)->{
			return i+50;};
		map.replaceAll(bifunction1);
		System.out.println("Lambda Expression="+map);
	}

	@Override
	public Integer apply(String key, Integer value) {
		return value+1000;
}
	
	
}
