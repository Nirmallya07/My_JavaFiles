package Questions;
import java.util.*;
public class pythagorean_triplets {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int n3 = scn.nextInt();
        int sq_n1 = (int)Math.pow(n1,2);
        int sq_n2 = (int) Math.pow(n2, 2);
        int sq_n3 = (int)Math.pow(n3,2);
        if ((sq_n1 + sq_n2 == sq_n3 ) | (sq_n2 + sq_n3 == sq_n1) | (sq_n1 + sq_n3 == sq_n2)) System.out.println("They are Triplets.");
        else System.out.println("They are not triplets");
    }
}