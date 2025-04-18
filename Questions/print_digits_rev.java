//Renamed from print digits to print in reverse

package Questions;
import java.util.*;
public class print_digits_rev {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        while (n != 0) {
            int rem = n % 10;
            n = n / 10;
            System.out.print(rem);  // I still couldn't print the numbers in correct order.
//            System.out.println("  " + n);
        }
    }
}
// A Failure ..!