package Questions.Patterns;
import java.util.*;

public class pattern_12 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();  // Read input value n

        int a = 0;  // First Fibonacci number
        int b = 1;  // Second Fibonacci number
        int count = 0;  // To keep track of how many numbers have been printed

        // Start printing the Fibonacci pattern
        for (int i = 1; count < n; i++) {
            // Print 'i' Fibonacci numbers in this row
            for (int j = 1; j <= i; j++) {
                if (count < n) {
                    System.out.print(a + " ");  // Print the current Fibonacci number
                    count++;  // Increment the count of printed numbers
                    // Update Fibonacci sequence for next number
                    int temp = a;
                    a = b;
                    b = temp + b;
                }
            }
            System.out.println();  // Move to the next line after printing one row
        }
    }
}
