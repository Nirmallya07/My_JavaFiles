package Questions;
import java.util.Scanner;

public class prime_factorization {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i = 2;
        while(n != 1){
            if((n%i) == 0){
                n = n/i;
                System.out.println(i);
                i = 1;
            }
            i++;
        }
    }
}