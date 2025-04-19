package Static_Keyword_ImportantFiles;

// This is called Singleton design pattern.
public class School {

    private static School school = new School();

    private School(){

    }

    public static School getInstance(){
        return school;
    }
}
