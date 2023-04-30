package PromotionExample;

public class KumhoTire extends Tire{
    //필드

    //생성자

    public KumhoTire(int maxRotation, String location) {
        super(maxRotation, location);
    }

    //메서드
    @Override
    public boolean roll() {
        ++accumulatedRotaion;
        if(accumulatedRotaion<maxRotation){
            System.out.println(location + "금호 타이어 수명" + (maxRotation-accumulatedRotaion)+ "회");
            return true;
        }else{
            System.out.println("금호 타이어 펑크");
            return false;
        }
    }

}
