package CollectionExample;

public class WrapperTest {

    public static void main(String[] args) {
        // 정수형 변수에 10을 저장하세요
        int a = 10; //기본자료형

        Integer aa = 10; // auto boxing

        System.out.println(aa.intValue());  // unboxing(integer -> int)

        float f = 10.5f;

        Float ff = 16.5f;

        System.out.println(ff.floatValue());
    }
}
