package CollectionExample;

import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        //중복이 가능하면서 순서가 있다

        list.add("사과"); // new String("apple")
        list.add("사과");
        list.add("바나나");
        list.add("복숭아");

        //제거
        list.remove("바나나");

        //수정 인덱스 , 값
        list.set(0,"두리안");

        for (String str : list) {
            System.out.println(str);
        }
    }
}
