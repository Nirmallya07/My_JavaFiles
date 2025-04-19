package Questions;
import java.util.Scanner;
public class is_prime{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n;
        System.out.print("Enter the number of items\nyou wanna check if that's a prime\t: ");
        n = scn.nextInt();
        if(n < 1) System.out.println("Please provide a natural number.");
        for (int i = 1; i <= n; i++){
            System.out.print("Enter the item (Integer)\t: ");
            int item = scn.nextInt();
            if(item < 1){
                System.out.println("Please provide a positive Integer");
                i--;
            }
            else {
                boolean flag = true;
                for (int a = 1; a <= item; a++) {
                    if (a == 1) continue;
                    if (a == item) continue;
                    if ((item % a) == 0) {
                        flag = false;
                    }
                }
                if (flag == true) System.out.println("The number is Prime.");
                else System.out.println(("THe number is not prime."));
            }
        }
    }
}