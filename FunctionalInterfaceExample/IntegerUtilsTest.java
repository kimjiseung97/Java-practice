package FunctionalInterfaceExample;


public class IntegerUtilsTest {
    public static void main(String[] args) {
        Converter<String,Integer> converter = IntegerUtils::stringToInt;
        Integer convert = converter.convert("1234");

        System.out.println(convert);
    }
}
