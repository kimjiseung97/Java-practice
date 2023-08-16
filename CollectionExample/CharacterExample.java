package CollectionExample;

import java.util.HashMap;
import java.util.Map;

public class CharacterExample {
    public static void main(String[] args) {
        String str = "Hello, World";

        Map<Character,Integer> charCountMap = new HashMap<>();

        char [] strArray = str.toCharArray(); //{'H','e','l','l','o',','......}

        for (char c : strArray) {
            if (charCountMap.containsKey(c)){
                charCountMap.put(c,charCountMap.get(c)+1);
            }else{
                charCountMap.put(c,1);
            }
        }

        for (Character character : charCountMap.keySet()) {
            System.out.println(charCountMap.get(character));
        }

    }
}
