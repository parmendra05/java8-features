package stream;

import java.util.List;
import java.util.stream.Collectors;

public class Demo_1 {

	public static void main(String[] args) {
		List<Integer> list1 = List.of(5, 10, 12, 17, 3, 19, 30, 50, 55);

		// without stream, create a list of even numbers
		/*
		 * List<Integer> evenList = new ArrayList<>();
		 * 
		 * for (Integer i : list1) { 
		 * 
		 * if (i % 2 == 0) evenList.add(i); 
		 *  
		 *  }
		 */

		// With Stream, create a list of even numbers
		List<Integer> evenList = list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());

		System.out.println("Given List : "+list1);
		System.out.println("Even Numbers List : "+evenList);

		System.out.println("######################################################");

		// Total Marks
		List<Integer> marks = List.of(85, 90, 25, 55, 32, 26, 71, 19, 62, 29);

		// only passed marks, by filter
		List<Integer> passedMarks = marks.stream().filter(i -> i > 29).collect(Collectors.toList());

		// increase every marks by 5, by map
		List<Integer> incrementedMarks = marks.stream().map(i -> i + 5).collect(Collectors.toList());

		// Grace the 5 marks only for failed student
		List<Integer> gracedMarks = marks.stream().map(i -> i > 29 ? i : i + 5).collect(Collectors.toList());
		
		System.out.println("Total Marks : "+marks);
		System.out.println("Passed Marks : "+passedMarks);
		System.out.println("Incemented Marks : "+incrementedMarks);
		System.out.println("Graced Marks : "+gracedMarks);
	}

}
