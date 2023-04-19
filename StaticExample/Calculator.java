package StaticExample;

public class Calculator {

    //객체마다 필요한 공용적인 데이터인경우 static을 선언하는것이 좋다
    static double pi = 3.14149;

    static int plus(int x, int y){
        return x+y;
    }

    static int minus(int x, int y){
        return x - y;
    }

}
