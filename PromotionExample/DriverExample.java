package PromotionExample;

public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();
        Vehicle vehicle1 = new Bus();
        Vehicle vehicle2 = new Taxi();
        driver.drive(vehicle1);
        driver.drive(vehicle2);

    }
}
