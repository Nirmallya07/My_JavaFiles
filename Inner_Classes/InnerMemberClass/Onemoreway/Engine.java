package Inner_Classes.InnerMemberClass.Onemoreway;

public class Engine {
    private Car car; // Variable that will go to the constructor.
    public Engine(Car car) {
        this.car = car;
    }
    public void start(){
        if(!car.isEngineOn) {
            car.isEngineOn = true;
            System.out.println(car.getModel() + " has turned on.");
        }
        else {
            System.out.println(car.getModel() + " is already on.");
        }
    }
}
