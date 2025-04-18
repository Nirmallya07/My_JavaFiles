package Questions.Patterns;
import java.util.*;
public class pattern_4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 1; i <= n; i++){
            for (int j=1; j<i; j++){
                System.out.print("   ");
            }
            for (int k = n; k>=i; k--){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}

