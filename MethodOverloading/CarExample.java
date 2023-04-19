package MethodOverloading;

public class CarExample {

    public static void main(String[] args) {
        Car myCar = new Car("포르쉐");
        Car YourCar = new Car("벤츠");

        myCar.run();
        YourCar.run();
    }
}
