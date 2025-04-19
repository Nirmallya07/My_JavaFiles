package Static_Keyword_ImportantFiles;

public class getClassInstance {
    public static void main(String[] args) {
        //School s = new School(); // Error, as constructor is et to private.
        School instance = School.getInstance();
        System.out.println(instance);

        // Needs a good explanation about this from AI
        // Related file : School.java
    }
}
