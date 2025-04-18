package Questions;
import java.util.*;
public class print_to_n_primes {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int item = 1; item <= n; item++){
            boolean flag = true;
            for (int a = 1; a <= item; a++) {
                if (a == 1) continue;
                if (a == item) continue;
                if ((item % a) == 0) {
                    flag = false;
                }
            }
            if (item == 1) flag = false;
            if (flag == true) System.out.println(item);
        }
    }
}