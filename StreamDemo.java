package uc29;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortDemo {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(9,3,6,1,8,2);

        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("UC2.9 Output:");
        System.out.println(sortedNumbers);
    }
}
