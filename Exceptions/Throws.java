package Exceptions;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Throws {
    public static void main(String[] args) { //throws FileNotFoundException { kahi tho handle karlo re bhai
        try {
            method2();
            System.out.println("Hello1");
        }
        catch (FileNotFoundException e) {
            System.out.println(e);
            System.out.println("FILE NOT FOUND!");
        }
        System.out.println("Hello2");
    }

    public static void method2() throws FileNotFoundException {
        method1();
    }
    
    public static void method1() throws FileNotFoundException {
        FileReader fileReader = new FileReader("a.txt");
    }
}
