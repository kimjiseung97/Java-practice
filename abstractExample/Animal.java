package abstractExample;

public abstract class Animal {
    public String kind;

    public void breath(){
        System.out.println("숨을 쉽니다");
    }

    public abstract void sound();
}
