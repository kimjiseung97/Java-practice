package FunctionalInterfaceExample;

public class FunctionInterfaceTest2{
    public static void main(String[] args) {
        MathOperationImpl operation = new MathOperationImpl();

        int operation1 = operation.operation(1, 2);

        System.out.println("operation1 = " + operation1);
    }
   
    
}
