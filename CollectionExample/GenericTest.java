package CollectionExample;

import APIExample.Book;

public class GenericTest {
    public static void main(String[] args) {
//        ObjectArr<String> array = new ObjectArr<>(5);
//        array.set(0,"Hello");
//        array.set(1,"World");
//        array.set(2,"Java");
//        array.set(3,"Python");
//        array.set(4,"C++");
//
//        for (int i = 0; i < array.size() ; i++) {
//            String s = array.get(i);
//            System.out.println(s);
//        }
        ObjectArr<Book> bookObjectArr = new ObjectArr<>(5);
        
        bookObjectArr.set(0,new Book("c++",15000,"한빛출판사","김한빛"));
        bookObjectArr.set(1,new Book("java",15000,"큰빛출판사","김큰빛"));
        bookObjectArr.set(2,new Book("python",15000,"사랑출판사","김사랑"));
        bookObjectArr.set(3,new Book("c++",15000,"한빛출판사","김한빛"));

        for (int i = 0; i < bookObjectArr.size() ; i++) {
            Book book = bookObjectArr.get(i);
            System.out.println("book = " + book);
        }
    }
}
