package user_input;
import  java.util.*;
public class parse_int {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = Integer.parseInt(scn.nextLine());
        String name = scn.nextLine(); // If you don't give the parseInt statement than this line will get ignored.
        System.out.print("The number is: " + n );
        System.out.print(" The name is: " + name);
    }
}