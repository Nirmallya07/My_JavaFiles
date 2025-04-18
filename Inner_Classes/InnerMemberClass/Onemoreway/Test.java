package Inner_Classes.InnerMemberClass.Onemoreway;

public class Test {
    public static void main(String[] args) {
        Car car = new Car("Fronx");
        Engine engine = new Engine(car);
        engine.start();
        engine.start();
    }
}
