package CollectionExample;

import java.util.HashMap;
import java.util.Map;

public class PairGenericTest {
    public static void main(String[] args) {

        Pair<String, Integer> pair = new Pair<>("hello",0);

        System.out.println(pair.getKey()); //hello
        System.out.println(pair.getValue()); // 0

        // 검색을 빠르게 할수있는 자료구조(HashMap, Hashtable)
        Map<String,Integer> maps = new HashMap<>();

        maps.put("kor",50);
        maps.put("math",70);
        maps.put("eng",14);

        System.out.println(maps.get("eng"));
    }
}
