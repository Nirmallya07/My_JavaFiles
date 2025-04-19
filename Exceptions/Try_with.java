package Exceptions;

import java.io.*;

public class Try_with {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("example1.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
            System.out.println("Printed e: " + e);
            System.out.println("Printed e.getMessage(): " + e.getMessage());
        }
    }
}
