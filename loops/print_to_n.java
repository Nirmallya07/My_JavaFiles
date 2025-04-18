package loops;
import java.util.*;
public class print_to_n{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print(("Enter any number\t: "));
        int n = scn.nextInt();
        for(int i = 0; i <= n; i++){
            System.out.println(i);
        }
    }
}