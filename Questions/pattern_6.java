package Questions;
import java.util.*;
public class pattern_6 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<i; j++){
                System.out.print("\t");
            }
            System.out.print("*\t\n");
        }
    }
}