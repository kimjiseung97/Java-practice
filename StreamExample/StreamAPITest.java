package StreamExample;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class StreamAPITest {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};

        int sum = Arrays.stream(numbers).filter(n -> n % 2 == 0).sum();
        int[] array = Arrays.stream(numbers).filter(n -> n % 2 == 0).toArray();
        System.out.println(sum);
        for (int i : array) {
            System.out.println(i);
        }
    }
}
