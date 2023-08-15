package CollectionExample;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); //중복을 허용하지않음

        System.out.println(set.size());

        for (String s : set) {
            System.out.println(s);
        }

        boolean contains = set.contains("Cherry"); //포함되어있는가?

        System.out.println(contains);

        set.clear();
        boolean empty = set.isEmpty(); //set이 비어있는가?
        System.out.println(empty);
    }
}
