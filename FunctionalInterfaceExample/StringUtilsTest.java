package FunctionalInterfaceExample;

public class StringUtilsTest {
    public static void main(String[] args) {
        StringUtils stringUtils = new StringUtils();

        Converter<String ,String> converter = stringUtils::reverse;

        String result = converter.convert("aaaaabbbbbbcccccc");

        System.out.println(result);
    }
}
