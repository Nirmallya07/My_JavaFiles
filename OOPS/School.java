package OOPS;

//INTERVIEW important

public class School {
    // I want that only one object to be created for "School" class in the whole application.
    private static School instance;

    private School(){
    }

    public static School getInstance(){
        if(instance == null){
            instance = new School();
        }
        return instance;
    }
}
