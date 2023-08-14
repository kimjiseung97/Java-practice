package CollectionExample;

import java.util.ArrayList;

public class CollectionBasic {
    public static void main(String[] args) {
        // ArrayList 10 20 30 40 50 5개의 정수 (int)를 저장하고 출력해보자
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(150);

        for (Integer integer : list) {
            System.out.println(integer);
        }

    }
}
