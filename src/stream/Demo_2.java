package stream;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Demo_2 {

	public static void main(String[] args) {

		List<Integer> list = List.of(85, 90, 25, 55, 32, 26, 71, 19, 62, 29);

		// Sorted Order
		List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());

		// Note : count always return Long Type
		Long count = list.stream().count();

		// count the numbers greater than 50
		Long num = list.stream().filter(i -> i > 50).count();

		// Find Max Value
		// Output : 90
		Integer maxValue = list.stream().max(Integer::compareTo).get();

		// Find Min Value, use to get Optional value by get() method.
		// Output : Optional[19]
		Optional<Integer> minValue = list.stream().min(Integer::compareTo);

		System.out.println("Given List : " + list);
		System.out.println("Sorted List : " + sortedList);
		System.out.println("Total Elements : " + count);
		System.out.println("Total Elements grater than 50 : " + num);
		System.out.println("Max Value : " + maxValue);
		System.out.println("Min Value : " + minValue);

	}

}
