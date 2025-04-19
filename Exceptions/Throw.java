package Exceptions;
import java.io.FileNotFoundException;
import java.util.*;
public class Throw {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the number\t:");
            int n = scn.nextInt();

            try {
                if (n == 5) {
                    throw new FileNotFoundException("oops");
                }
            }
            catch (FileNotFoundException e) {
                System.out.println("Caught Exception: " + e.getMessage());
                break;
            }
            finally {
                System.out.println("Inside the finally block");
            }
        }
    }
}
