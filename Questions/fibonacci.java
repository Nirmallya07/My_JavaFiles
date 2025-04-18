package Questions;
import java.util.*;
public class fibonacci {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a = 0;
        int b = 1;
//        int sum = 0;
//        System.out.println(a);
//        System.out.println(b);
        for (int i = 1; i <= n; i++){
            System.out.println(a);
            int sum = a + b;
            a = b;
            b = sum;

        }
    }
}