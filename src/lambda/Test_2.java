package lambda;

import java.util.function.Predicate;

public class Test_2 {

	public static void main(String[] args) {

		// To check the given number is greater than 18
		Predicate<Integer> num = i -> (i > 18);

		// Test
		System.out.println(num.test(20)); // true
		System.out.println(num.test(15)); // false

		// Check the length of given string is greater that 4 or not ?
		Predicate<String> str = s -> (4 < s.length());

		System.out.println(str.test("asdfgh"));
		System.out.println(str.test("ab"));

	}

}
