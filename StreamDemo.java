package uc27;

import java.util.Arrays;
import java.util.List;

public class StreamSumAvgDemo {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10,20,30,40);

        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();

        double avg = numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);

        System.out.println("UC2.7 Output:");
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
    }
}
