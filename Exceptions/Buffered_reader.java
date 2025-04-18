package Exceptions;
import java.io.*;

public class Buffered_reader {
    public static void main(String[] args) {
        BufferedReader reader = null; // nullPointer.
        try {
            reader = new BufferedReader(new FileReader("example.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        } finally {
            try {
                if(reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing reader: " + e.getMessage());
            }
        }
    }
}