package InterfaceExample;

public class interfaceAPI {

    public static void main(String[] args) {

        CC c = new AA(); //AA 클래스에 실제로 구현되어있는 메서드가 동작한다.


        c.x();
        c.y();
        c.z();

        System.out.println(c.getClass());

    }
}
