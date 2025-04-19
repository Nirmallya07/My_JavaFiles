package Questions.Patterns;
import java.util.*;
public class pattern_10 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int space_out = n/2; //3 for 7 as input
        int space_in = 1;
        for (int i = 1; i<=(n/2+1); i++) System.out.print("\t");
        System.out.println("*\t");
        for (int i = 1; i<=n-2; i++){
            for (int j = 1; j<space_out; j++) System.out.print("\t");
            System.out.print("*\t");
            for (int j = 1; j<=space_in;j++) System.out.print("\t");
            System.out.print("*\t");
            if (i<((n-2)/2)){
                space_out--;
                space_in+=2;
            } else {
                space_out++;
                space_in-=2;
            }
            System.out.println();
        }
        for (int i = 1; i<=(n/2); i++) System.out.print("\t");
        System.out.println("*\t");
    }
}
