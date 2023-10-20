package stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Demo_2 {

	public static void main(String[] args) {

		List<Integer> list = List.of(85, 90, 25, 55, 32, 26, 71, 19, 62, 29);

		// Sorted Order By ASC
		List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());

		// Sorted Order By DESC
		List<Integer> descList = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

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
		System.out.println("Sorted List By ASC: " + sortedList);
		System.out.println("Sorted List By DESC: " + descList);
		System.out.println("Total Elements : " + count);
		System.out.println("Total Elements grater than 50 : " + num);
		System.out.println("Max Value : " + maxValue);
		System.out.println("Min Value : " + minValue);

		System.out.println("-----------------------------------------------");

		List<Integer> data = Arrays.asList(5, 1, 9, 7, 2, 8, 1, 5, 7, 15, 2, 1, 2, 1);

		// Sum of all the elements
		Integer sum = data.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Sum of all elements : " + sum);

		// Remove duplicate elements from data
		Set<Integer> set = new HashSet<>(data); // Using Set
		System.out.println(set);

		// Using Stream
		System.out.println("Original Data is - " + data);
		data.stream().collect(Collectors.toSet()).forEach(a -> System.out.print(a + ","));

		// Find only duplicate elements from data
		System.out.println(" \nDuplicate elements");
		Set<Integer> tempset = new HashSet<>();
		Set<Integer> myset = data.stream().filter(a -> !tempset.add(a)).collect(Collectors.toSet());
		System.out.println(myset);
		
		// Remove duplicate elements without using set
		List<Integer> demoList = Arrays.asList(5, 1, 9, 7, 2, 8, 1, 5, 7, 15, 2, 1, 2, 1);
		List<Integer> uniqueDemoList = demoList.stream().distinct().collect(Collectors.toList());
		
		System.out.println("given list : "+demoList);
		System.out.println("updated list"+uniqueDemoList);

	}

}
