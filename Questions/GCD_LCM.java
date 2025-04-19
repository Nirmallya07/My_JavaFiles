package Questions;
import com.sun.source.tree.WhileLoopTree;

import java.util.*;
public class GCD_LCM {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int GCD = 0;
        int small_num = 0;
        if (num1 > num2) small_num = num2;
        else small_num = num1;
        int i = 1;
        while(i <= small_num){
            if (((num1 % i) == 0) & ((num2 % i) == 0)){
                GCD = i;
            }
            i++;
        }
        System.out.println("GCD is\t: " + GCD);
        int LCM = (num1 * num2)/GCD;
        System.out.println("LCM is\t: " + LCM);
    }
}