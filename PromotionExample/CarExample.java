package PromotionExample;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();

        for(int i =1; i<=5; i++){
            int problemLocation = car.run();

//            switch (problemLocation){
//                case 1:
//                    System.out.println("앞왼쪽 한국타이어로 교체");
//                    car.frontLeftTire = new HankookTire(15,"앞 왼쪽");
//                    break;
//                case 2:
//                    System.out.println("앞 오른쪽 금호 타이어로 교체");
//                    car.frontRightTire = new KumhoTire(13,"앞 오른쪽");
//                    break;
//                case 3:
//                    System.out.println("뒤 왼쪽 한국 타이어로 교체");
//                    car.backLeftTire = new HankookTire(14,"뒤 왼쪽");
//                    break;
//                case 4:
//                    System.out.println("뒤 오른쪽 타이어 금호 타이어로 교체");
//                    car.backRightTire = new KumhoTire(17, "뒤 오른쪽");
//                    break;
//            }
            if(problemLocation!=0){
                System.out.println(car.tires[problemLocation-1].location + "한국타이어로 교체");
                car.tires[problemLocation-1] = new HankookTire(15,car.tires[problemLocation-1].location);
            }
            System.out.println("------------------------------------------"); // 1회전시 출력되는 내용 구분
        }
    }
}
