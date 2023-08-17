package CollectionExample;

public class GenericLimitTest {
    public static void main(String[] args) {
        Integer[] integers = {1,2,3,4,5};
        Double[] doubles = {1.0,2.0,3.0,4.0,5.0};

        AverageCalculator<Integer> integerAverageCalculator = new AverageCalculator<>(integers);
        AverageCalculator<Double> doubleAverageCalculator = new AverageCalculator<>(doubles);

        double avg1 = integerAverageCalculator.calculateAverage();
        double avg2 = doubleAverageCalculator.calculateAverage();

        System.out.println(avg1);
        System.out.println(avg2);
    }
}
