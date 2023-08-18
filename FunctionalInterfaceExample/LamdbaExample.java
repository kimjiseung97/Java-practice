package FunctionalInterfaceExample;

public class LamdbaExample {
    public static void main(String[] args) {
        MathOperation add = (x, y) -> x+y;
        MathOperation mul = (x,y) -> x*y;

        int result = add.operation(10, 3);
        int result2= mul.operation(4, 1);

        System.out.println("add = " + result);
        System.out.println("mul = " + result2);
    }
}
