package Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Sortmap {
	public static void main(String[] abc) {
		Map<String,Integer> map=new HashMap<>();
		map.put("eight", 4);
		map.put("two",3);
		map.put("four", 8);
		map.put("three", 2);
	List<Entry<String,Integer>> entries=new ArrayList<>(map.entrySet());
	//Old format
	/*Collections.sort(entries,new Comparator<Entry<String,Integer>>() {

		@Override
		public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
			
			return o1.getKey().compareTo(o2.getKey());
		}
	});
	for(Entry<String,Integer> entry:entries) {
		System.out.println(entry.getKey()+" "+entry.setValue(null));
	}*/
	/*using LambdaExpression
	 Collections.sort(entries,(o1,o2)->o1.getKey().compareTo(o2.getKey()));
	for(Entry<String,Integer> entry:entries) {
		System.out.println(entry.getKey()+" "+entry.setValue(null));
	
	}*/
	//useing stream()
	map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
	

	
	

}
}
