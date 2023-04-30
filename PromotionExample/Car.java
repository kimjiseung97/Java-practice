package PromotionExample;

public class Car {

    //필드
//    Tire frontLeftTire = new Tire(6,"앞 왼쪽");
//    Tire frontRightTire = new Tire(2,"앞 오른쪽");
//    Tire backLeftTire = new Tire(3,"뒤왼쪽");
//    Tire backRightTire = new Tire(4,"뒤 오른쪽");

    Tire[] tires = {
            new Tire(6,"앞 왼쪽"),
            new Tire(2,"앞 오른쪽"),
            new Tire(3,"뒤왼쪽"),
            new Tire(4,"뒤 오른쪽")
    };
    //생성자

    //메소드
    int run(){
        System.out.println("자동차가 달립니다");
//        if(frontLeftTire.roll()==false){stop(); return 1;}
//        if(frontRightTire.roll()==false){stop(); return 2;}
//        if(backLeftTire.roll()==false){stop(); return 3;}
//        if(backRightTire.roll()==false){stop(); return 4;}
        for (int i = 0; i <tires.length ; i++) {
            if(tires[i].roll()==false){
                stop();
                return (i+1);
            }
        }
        return 0;
    }

    private void stop() {
        System.out.println("자동차가 멈춥니다");
    }
}
