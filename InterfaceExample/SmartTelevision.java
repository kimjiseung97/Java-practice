package InterfaceExample;

public class SmartTelevision implements RemoteControl, Searchable{

    private int volume;
    @Override
    public void turnOff() {
        System.out.println("Tv를 끕니다");
    }

    @Override
    public void turnOn() {
        System.out.println("Tv를 켭니다");
    }

    @Override
    public void setVolume(int volume) {
        if(volume>RemoteControl.MAX_VALUE){
            this.volume = RemoteControl.MAX_VALUE;
        }else if(volume<RemoteControl.MIN_VALUE){
            this.volume = RemoteControl.MIN_VALUE;
        }else{
        this.volume = volume;
        }
        System.out.println("현재 tv볼륨 : "+this.volume);
    }

    @Override
    public void search(String url) {
        System.out.println(url + "을 검색합니다");
    }
}
