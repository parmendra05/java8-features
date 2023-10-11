package stream;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsMethods {

	public static void main(String[] args) {
		List<String> myList = List.of("apple", "banana", "cherry");
		
		Map<String, Integer> lengthCounterMap = myList.stream()
				.collect(Collectors.toMap(Function.identity(), String::length));
		System.out.println(lengthCounterMap);

	}

}
