package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample {
    /*
    flatmap allows you to transform each element of a stream into a new stream of elements,
    and then combine all those streams into a single stream.
     */

    public static void main(String[] args) {

        // Create a single list from nested list
        List<List<Integer>> nestedList = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5,6),
                Arrays.asList(7,8)
        );
// we are using flatmap for making single list.
        List<Integer> combinedList= nestedList.stream().flatMap( List ::stream).toList();
        System.out.println(combinedList);
        // output : [1, 2, 3, 4, 5, 6, 7, 8]

        // Create a Char Array from list of words
        List<String> words = Arrays.asList("Hello", "World");

        List<String> characters = words.stream().flatMap(word -> word.chars()
                .mapToObj(c -> (char) c) .map(String::valueOf)).toList();
        System.out.println(characters);

    }
}
