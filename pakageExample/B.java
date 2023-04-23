package pakageExample;

public class B {

    public B() {
        A a = new A();

        a.field1 = 1;
        a.field2 = 1;

        a.method2();  //생성자 제한때문에 private는 접근이 불가능하다
        a.method();
    }
}
