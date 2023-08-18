package FunctionalInterfaceExample;

public class FunctionInterfaceTest3 {
    public static void main(String[] args) {

        //Mathoperation 인터페이스를 내부익명클래스로 구현해보자
        MathOperation mo = new MathOperation() {
            @Override
            public int operation(int x, int y) {
                return x+y;
            }
        };
        int result = mo.operation(100, 561);

        System.out.println("result = " + result);
    }
}
