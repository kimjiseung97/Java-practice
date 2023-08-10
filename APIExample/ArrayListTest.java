package APIExample;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        //책  3권을 배열에 저장하고 출력해보자

        ArrayList<Object> list = new ArrayList();

        list.add(new Book("c++",15000,"한빛출판사","김한빛"));
        list.add(new Book("java",15000,"큰빛출판사","김큰빛"));
        list.add(new Book("python",15000,"사랑출판사","김사랑"));
        list.add(new Book("kotlin",15000,"희망출판사","김희망"));



        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
