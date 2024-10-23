package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsMethods {

	public static void main(String[] args) {
		List<String> myList = List.of("apple", "banana", "cherry");
		
		Map<String, Integer> lengthCounterMap = myList.stream()
				.collect(Collectors.toMap(Function.identity(), String::length));
		System.out.println(lengthCounterMap);

		// toList()
		//Collects elements into a List.
		List<String> nameList= Arrays.asList("Glenn", "Brown", "Alison", "Alisa","Mukesh");

		//List<String> nameStartedByA = nameList.stream().filter(names -> names.startsWith("A")).collect(Collectors.toList());
		List<String> nameStartedByA = nameList.stream().filter(names -> names.startsWith("A")).toList();
		System.out.println(nameStartedByA);


		//toSet()
		//Collects elements into a Set.
		Set<Integer> set = Stream.of(1,2,3,2,5,2,1).collect(Collectors.toSet());
		System.out.println(set);

		//toMap()
		//Collects elements into a Map.
		List<String> items = List.of("Apple", "Banana", "Orange", "kiwi");

		//Map<String,Integer> result = items.stream().collect(Collectors.toMap(a -> a , String::length));

		Map<String,Integer> result = items.stream().collect(Collectors.toMap(a -> a , a -> a.length()));
		System.out.println(result); // {Apple=5, kiwi=4, Orange=6, Banana=6}

	}

}
