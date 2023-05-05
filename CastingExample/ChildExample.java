package CastingExample;

public class ChildExample {
    public static void main(String[] args) {
        Parent parent = new Child();
        parent.field1 = "data1";
        parent.method1();
        parent.method2();



        Child child = (Child) parent;
        child.field2= "yyy"; //가능
        child.method2(); // 가능
    }
}
