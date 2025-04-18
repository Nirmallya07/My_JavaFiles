package user_input;
import java.util.*;
public class user_input {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of numbers you want to print\t:");

        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.println(i);
        }
        System.out.print("Done");
    }
}