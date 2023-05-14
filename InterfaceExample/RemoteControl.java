package InterfaceExample;

public interface RemoteControl {
    public int MAX_VALUE = 10;
    public int MIN_VALUE = 0;

    //추상 메소드
    public void turnOff();
    public void turnOn();
    public void setVolume(int volume);

    //디폴트 메소드
    default void setMute(boolean mute){
        if(mute){
            System.out.println("무음 처리합니다");
        }else{
            System.out.println("무음 해제합니다");
        }
    }

    //정적 메소드
    static void changeBattery(){
        System.out.println("건전지를 교체합니다");
    }
}
