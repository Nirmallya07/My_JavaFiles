package user_input;
import java.util.*;
public class string_int {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter any name\t:");
        System.out.print("Enter the first number\t: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the second number\t: ");
        int n2 = sc.nextInt();
//        String name = sc.nextLine();
//        System.out.println("The chosen name is : " + name);
        System.out.print("The sum of both are\t: ");
        System.out.print(n1 + n2);
    }
}