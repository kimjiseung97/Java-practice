package StreamExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapStreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        List<Integer> collect = numbers.stream().map(integer -> integer * integer).collect(Collectors.toList());

        System.out.println(collect);
    }
}
