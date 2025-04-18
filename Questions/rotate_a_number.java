package Questions;
// Solved this on first try. With thinking from root.
// Not from memory.
import java.util.*;
public class rotate_a_number{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number you want to rotate\t: ");
        int n = scn.nextInt();
        System.out.print("Enter the number of time you want to rotate\t: ");
        int k = scn.nextInt();
        int temp, nod;
        temp = n; nod = 0;
        while(temp!=0){
            temp = temp/10;
            nod++;
        }
        while(k!=0){
            int rem = n%10;
            n = n/10;
            rem = rem * (int)Math.pow(10, nod-1);
            n = n + rem;
            k--;
        }
        System.out.print(n);
    }
}