package Inner_Classes.InnerMemberClass;

public class Car {
    private String model;
    private boolean isEngineOn;

    public Car(String model) {
        this.model = model;
        isEngineOn = false;
    }

    class Engine { // Inner member class of Car.
        void start() {
            if (!isEngineOn) {
                isEngineOn = true;
                System.out.println(model + "engine has started.");
            }
            else {
                System.out.println("Engine for " + model + " is already on.");
            }
        }

        void stop() {
            if(isEngineOn) {
                isEngineOn = false;
                System.out.println(model + " has turned off.");
            }
            else {
                System.out.println("Engine for " + model + " is already off.");
            }
        }
    }

}