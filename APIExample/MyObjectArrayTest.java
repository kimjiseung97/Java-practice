package APIExample;

public class MyObjectArrayTest {
    public static void main(String[] args) {
        // A , B , C객체를 배열에 저장하고 출력하세요.

        ObjectArray objectArray = new ObjectArray();

        A a = new A();
        B b = new B();
        C c = new C();

        objectArray.add(a);
        objectArray.add(b);

        A a1 = (A)objectArray.get(0);
        B b1 = (B)objectArray.get(1);


        a1.display();
        b1.display();
    }
}
