package uc26;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMaxDemo {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(11,4,7,2,18,6);

        Optional<Integer> min = numbers.stream()
                .filter(n -> n % 2 == 0)
                .min(Integer::compareTo);

        Optional<Integer> max = numbers.stream()
                .filter(n -> n % 2 == 0)
                .max(Integer::compareTo);

        System.out.println("UC2.6 Output:");
        System.out.println("Min Even: " + min.orElse(null));
        System.out.println("Max Even: " + max.orElse(null));
    }
}
