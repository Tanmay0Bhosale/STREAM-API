package uc23;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollectDemo {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5,10,15,20);

        List<Integer> result = numbers.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());

        System.out.println("UC2.3 Output:");
        result.forEach(System.out::println);
    }
}
