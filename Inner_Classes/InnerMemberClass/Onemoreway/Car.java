package Inner_Classes.InnerMemberClass.Onemoreway;

public class Car {

    private String model;
    public boolean isEngineOn; // Changed from public.

    public Car(String model) {
        this.model = model;
        this.isEngineOn = false;
    }

    public String getModel() {
        return model;
    }

}
