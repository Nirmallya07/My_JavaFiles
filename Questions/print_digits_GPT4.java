package Questions;
import java.util.Scanner;

public class print_digits_GPT4 {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask for input number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Convert the number to a string to easily access each digit
        String numberString = Integer.toString(number);

        // Print each digit in the number
        for (int i = 0; i < numberString.length(); i++) {
            System.out.println(numberString.charAt(i));
        }

        // Close the scanner to avoid memory leak
        scanner.close();
    }
}