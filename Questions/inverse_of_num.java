// Input numbers will be like this :-
// 5 digits number : 42513
// Here, the digits should be from 1 to 5 only in random/correct order.
// Any digit can't exceed 5.
// Another example:-
// 6 digits number : 436512 //
// Input shouldn't have digit 0.

// I solved this. Took a lot of time !!

package Questions;
import java.util.*;
public class inverse_of_num {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
//        int temp = n;
//        int nod = 1;
//        while(temp!=0) {
//            temp = temp / 10;
//            nod++;
//        }
        int sum = 0;
        int i = 1;
//        int div = (int)Math.pow(10, nod - 1);
        while(n!=0){
            int rem = n%10;
            n = n/10;
            sum = sum + (i * (int)Math.pow(10, rem - 1));
            i++;
        }
        System.out.print(sum);
    }

}