package StreamExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StringExample {

    public static boolean isEven(int number){
        return number%2==0;
    }
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Predicate<Integer> isEven = integer -> integer%2==0;
        int sumOfSquares = numbers
                .stream()
                .filter(isEven)
                .sorted()
                .map(integer -> integer*integer)
                .reduce(0,Integer::sum);

        System.out.println(sumOfSquares);
    }
}
