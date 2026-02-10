package uc21;

import java.util.Arrays;
import java.util.List;

public class StreamForEachDemo {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        System.out.println("UC2.1 Output:");

        numbers.stream().forEach(System.out::println);
    }
}
