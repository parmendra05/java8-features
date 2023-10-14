package stream;

import java.util.ArrayList;
import java.util.List;

public class FindMatchingElements {

	public static void main(String[] args) {

		List<Integer> list1 = List.of(1, 2, 3, 4, 5, 6, 7, 8);
		List<Integer> list2 = List.of(1, 2, 3, 11, 15, 16);

		List<Integer> commonElements = new ArrayList<>();

		for (int a : list2) {
			if (list1.contains(a))
				commonElements.add(a);
		}
		System.out.println(commonElements);

		// Using Stream
		List<Integer> commonObjects = list1.stream().filter(list2::contains).toList();
		System.out.println(commonObjects);
	}

}
