package Questions.Patterns;
import java.util.*;
public class pattern_9 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                if ((i == j) || ((i+j)==6)) System.out.print("*\t");
                else System.out.print("\t");
            }
            System.out.println();
        }
    }
}