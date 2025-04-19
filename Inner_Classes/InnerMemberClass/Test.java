package Inner_Classes.InnerMemberClass;

public class Test {
    public static void main(String[] args) {
        Car car = new Car("Mahindra SUV 800");
        Car.Engine engine = car.new Engine();
        engine.start();
        engine.start();
        engine.stop();
        engine.stop();

    }
}
