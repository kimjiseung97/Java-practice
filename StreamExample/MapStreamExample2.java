package StreamExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapStreamExample2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple","banana","cherry","orange");

        List<String> collect = words.stream().map(String::toUpperCase).toList();

        for (String s : collect) {
            System.out.println(s);
        }
    }

}
