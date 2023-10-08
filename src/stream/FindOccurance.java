package stream;

import java.util.Map;
import java.util.stream.Collectors;

public class FindOccurance {

	public static void main(String[] args) {

		String input = "hello java";

		Map<Object, Long> map = input.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));

		map.forEach((key, value) -> System.out.println(key + " - " + value + "  times"));

	}

}
