package stream;

import java.util.*;
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


		//mapping() : Applies a mapping function before collecting
		List<String> fruits = List.of("Apple", "Banana", "Orange", "Kiwi","Mango");
		//List<Integer> lengthOfFruits = fruits.stream().map(String::length).toList();
		List<Integer> lengthOfFruits = fruits.stream().collect(Collectors.mapping(fruit -> fruit.length(), Collectors.toList() ));
		System.out.println("Length of Fruits in a List : "+lengthOfFruits);

		//counting() : Counts the number of elements in a stream.
		//int totalCount=  fruits.size();
		//Long totalCount = fruits.stream().count();
		Long totalCount = fruits.stream().collect(Collectors.counting());

		System.out.println("Total Fruits : "+totalCount);


		//joining() : Concatenates the stream of strings.
		List <String> words = Arrays.asList("Hi", "How", "Are", "You");
		//String output= words.stream().collect(Collectors.joining( " "));
		String output= String.join(" ", words);
		System.out.println(output);


		//summarizingInt() : Provides statistical summary for int values.
		List<Integer> integers = List.of(10,20,30,15,5);
		IntSummaryStatistics summaryStatistics = integers.stream().collect(Collectors.summarizingInt(Integer::intValue));
		System.out.println("Summary  :  "+summaryStatistics);
		// Output : Summary  :  IntSummaryStatistics{count=5, sum=80, min=5, average=16.000000, max=30}


		/*
		groupingBy() method helps you create a map, where:
        The key represents the category (the characteristic you want to group by).
        The value is a list of all the items that fall into that category.
		 */

		List<String> nameLists = List.of("Amanda", "Eliana", "Manjunathan","Alisa", "Anshu","Mangesh");
		// Group names by the first character
		Map<Character,List<String>> namesGroup= nameLists.stream().collect(Collectors.groupingBy(name -> name.charAt(0)));
		System.out.println("namesGroup  : "+namesGroup);
		//output : A=[Amanda, Alisa, Anshu], E=[Eliana], M=[Manjunathan, Mangesh]}


		List<Integer> numbers = List.of(1,2,3,4,5,6,7,12,23,45,50,60);
       // Group numbers by even and odd
		Map<String, List<Integer>> output2 = numbers.stream()
				.collect(Collectors.groupingBy(val -> (val % 2 == 0) ? "Even" : "Odd"));
		System.out.println(output2);
		// {Even=[2, 4, 6, 12, 50, 60], Odd=[1, 3, 5, 7, 23, 45]}


		/*
		 Group employees by department
        Map<String, List<Employee>> employeesByDept = employees.stream()
            .collect(Collectors.groupingBy(e -> e.department));

        System.out.println(employeesByDept);
        // Output: {HR=[Alice, Eve], IT=[Bob, Charlie], Finance=[David]}
		 */

	}

}
