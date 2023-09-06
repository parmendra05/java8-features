package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo_4 {

	public static void main(String[] args) {

		// concatenation using stream
		List<String> list1 = Arrays.asList("Ram", "Shyam", "Gopal");
		List<String> list2 = Arrays.asList("Naresh", "Suresh", "Hari om");

		Stream<String> concatedList = Stream.concat(list1.stream(), list2.stream());
		// Print the elements
		concatedList.forEach(d -> System.out.print(d + ", "));

	}

}
