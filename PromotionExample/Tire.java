package PromotionExample;

public class Tire {
    //필드
    public int maxRotation; //최대 회전수(타이어 수명)
    public int accumulatedRotaion; //누적 회전수
    public String location;

    //생성자


    public Tire(int maxRotation, String location) {
        this.maxRotation = maxRotation;
        this.location = location;
    }

    //메소드
    public boolean roll(){
        ++accumulatedRotaion; //누적 회전수 1 증가
        if(accumulatedRotaion < maxRotation) {
            System.out.println(location  +" Tire수명 : " + (maxRotation - accumulatedRotaion) + "회");  //정상회전
            return true;
        }else {
            System.out.println(location +"Tire 펑크"); //펑크(누적 == 최대회전수)일 경우 실행
            return false;
        }
    }
}
