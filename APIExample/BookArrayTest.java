package APIExample;

public class BookArrayTest {

    public static void main(String[] args) {
        // 책 3권의 데이터를 배열에 저장하고 출력한다

        BookArray bookArray =new BookArray(); //길이 5

        bookArray.add(new Book("c++",15000,"한빛출판사","김한빛"));
        bookArray.add(new Book("java",15000,"큰빛출판사","김큰빛"));
        bookArray.add(new Book("python",15000,"사랑출판사","김사랑"));
        bookArray.add(new Book("kotlin",15000,"희망출판사","김희망"));

        for (int i = 0; i < bookArray.size() ; i++) {
            System.out.println(bookArray.get(i).toString());
        }

    }
}
