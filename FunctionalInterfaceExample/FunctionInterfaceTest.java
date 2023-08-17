package FunctionalInterfaceExample;

public class FunctionInterfaceTest implements MathOperation{
    public static void main(String[] args) {
        MathOperation mo = new FunctionInterfaceTest();

        System.out.println("mo.operation(1,2) = " + mo.operation(1,2));
    }
    @Override
    public int operation(int x, int y) {
        return x+y;
    }

}
