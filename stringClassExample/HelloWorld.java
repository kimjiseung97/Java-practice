package stringClassExample;

public class HelloWorld {
    public static void main(String[] args) {
        String str1 = new String("HelloWorld");
        String str2 = new String("HelloWorld");
        //서로다른 객체이기 때문에 다른 주소값을 보는 객체다

        String str3 = "HelloWorld";
        String str4 = "HelloWorld";
        //재활용하는 메모리를 바라보기때문에 같은 객체


        System.out.println(str3==str4);

    }
}
