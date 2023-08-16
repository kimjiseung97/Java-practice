package CollectionExample;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        Map<String, Integer> stdScores = new HashMap<>();

        stdScores.put("Kim",95);
        stdScores.put("Lee",87);
        stdScores.put("Park",84);
        stdScores.put("Choi",65);

        stdScores.put("Park",99); //key값으로 접근해서 수정가능

        stdScores.remove("Choi"); //key값으로 접근해 삭제 가능

        System.out.println(stdScores.get("Kim"));
        System.out.println(stdScores.get("Lee"));
        System.out.println(stdScores.get("Park"));
        System.out.println(stdScores.get("Choi"));

        System.out.println(stdScores.size()); //삭제했기때문에 크기는 3이 나온다

        for (Map.Entry<String, Integer> stringIntegerEntry : stdScores.entrySet()) {
            Integer value = stringIntegerEntry.getValue();
            System.out.println(value);
        }
    }
}
