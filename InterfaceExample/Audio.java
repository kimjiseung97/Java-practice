package InterfaceExample;

public class Audio implements RemoteControl {

    private int volume;

    @Override
    public void turnOff() {
        System.out.println("오디오를 끕니다");
    }

    @Override
    public void turnOn() {
        System.out.println("오디오를 켭니다");
    }

    @Override
    public void setVolume(int volume) {
        if(volume>RemoteControl.MAX_VALUE){
            this.volume = RemoteControl.MAX_VALUE;
        }else if(volume<RemoteControl.MIN_VALUE){
            this.volume = RemoteControl.MIN_VALUE;
        }else {
            this.volume = volume;
        }
        System.out.println("현재 Audio 볼륨  :" + this.volume);
    }
}
