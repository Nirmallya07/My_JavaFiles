package OOPS;

class Lambo extends Car{
    String model = "Gallarado";
}

public class test_car {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.maxSpeed = 200;
        System.out.println("Max Speed :" + obj.maxSpeed);
        System.out.println(obj.getInitial_speed());
        obj.accelerate(30);
        obj.decelerate(10);
        System.out.println(obj.getInitial_speed());
        obj.decelerate(40);
        System.out.println(obj.getInitial_speed());
        obj.accelerate(250);
        System.out.println(obj.getInitial_speed());
        obj.setMin_speed(1);
        System.out.println(obj.getMin_speed());
        obj.setMin_speed(-1);
        System.out.println(obj.getMin_speed());

////////////////////////////////////////////////////////////////////////////

        Lambo obj1 = new Lambo();
        System.out.println(obj1.model);
        System.out.println(obj1.getMin_speed());
        obj1.maxSpeed = 350;
        obj1.accelerate(200);
        System.out.println(obj1.getInitial_speed());
    }
}
