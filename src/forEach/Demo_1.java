package forEach;

import java.util.List;

public class Demo_1 {

	public static void main(String[] args) {

		List<String> fruits = List.of("Apple", "Orrange", "Mango", "Guava", "Graps");

		System.out.println(" -------   Before Java 8    ---------  ");
		for (String item : fruits) {
			System.out.println(item);
		}

		System.out.println(" -------   After Java 8 with forEach   ---------  ");
		fruits.forEach(item -> System.out.println(item));

	}

}
