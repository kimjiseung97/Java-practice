package ClassExample;

public class Car_ {
    //필드
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    //생성자


    public Car_() {
    }

    public Car_(String model) {
        this.model = model;
    }

    public Car_(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public Car_(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
