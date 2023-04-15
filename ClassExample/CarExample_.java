package ClassExample;

public class CarExample_ {
    public static void main(String[] args) {

        Car_ car1 = new Car_();
        System.out.println("car1.comany : "+ car1.company);
        System.out.println();


        Car_ car2 = new Car_("자가용");
        System.out.println("car2.comany : "+ car2.company);
        System.out.println("car2.model"+ car2.model);
        System.out.println();


        Car_ car3 = new Car_("자가용","빨강");
        System.out.println("car3.company : "+car3.company);
        System.out.println("car3.model : "+car3.model);
        System.out.println("car3.color : "+car3.color);
        System.out.println();



        Car_ car4 = new Car_("택시","검정",200);
        System.out.println("car4.company : "+car4.company);
        System.out.println("car4.model : "+car4.model);
        System.out.println("car4.color : "+car4.color);
        System.out.println("car4.maxSpeed : "+car4.maxSpeed);
        System.out.println();


    }
}
