package PromotionExample;

public class HankookTire extends Tire{
    //필드

    //생성자

    public HankookTire(int maxRotation, String location) {
        super(maxRotation, location);
    }

    //메소드

    @Override
    public boolean roll() {
       ++accumulatedRotaion;
       if(accumulatedRotaion<maxRotation){
           System.out.println(location + "한국 타이어 수명" + (maxRotation-accumulatedRotaion)+ "회");
           return true;
       }else{
           System.out.println("한국 타이어 펑크");
           return false;
       }
    }
}
