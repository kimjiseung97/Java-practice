package InterfaceExample;

public class Television implements RemoteControl{

    //필드
    private int volume;

    @Override
    public void turnOff() {
        System.out.println("티비를 끕니다");
    }

    @Override
    public void turnOn() {
        System.out.println("티비를 켭니다");
    }

    //추상메서드의 실제 메서드
    @Override
    public void setVolume(int volume) {
        if(volume>RemoteControl.MAX_VALUE){
            this.volume = RemoteControl.MAX_VALUE;
        }else if(volume<RemoteControl.MIN_VALUE){
            this.volume = RemoteControl.MIN_VALUE;
        }else {
            this.volume = volume;
        }
        System.out.println("현재 tv 볼륨  :" + this.volume);
    }
}
