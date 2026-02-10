package uc28;

import java.util.Arrays;
import java.util.List;

public class StreamMatchDemo {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2,4,6,7);

        boolean allEven = numbers.stream()
                .allMatch(n -> n % 2 == 0);

        boolean anyEven = numbers.stream()
                .anyMatch(n -> n % 2 == 0);

        System.out.println("UC2.8 Output:");
        System.out.println("All Even: " + allEven);
        System.out.println("Any Even: " + anyEven);
    }
}
