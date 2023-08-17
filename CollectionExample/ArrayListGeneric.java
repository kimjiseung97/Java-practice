package CollectionExample;

import java.util.ArrayList;
import java.util.List;

public class ArrayListGeneric {
    public static void main(String[] args) {

        //제네릭 타입을 지정해주지않으면 데이터의 안정성이 보장되지않는다
        List list = new ArrayList<>(5);

        list.add(new Movie("괴물","봉준호","2006","한국"));
        list.add("Hello");

        System.out.println(list.get(0));
        System.out.println(list.get(1));

    }
}
