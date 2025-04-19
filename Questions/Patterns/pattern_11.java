package Questions.Patterns;
import java.util.Scanner;
public class pattern_11{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number\t:");
        int n = scn.nextInt();
//        int count = 1;
//        for (int i = 1;;i++){
//            for (int j = 1; j <= i; j++){
//                System.out.print(count);
//                count++;
//            }
//            System.out.println();
//            if (count == n) {
//                break;
//            }
//        }
        int count = 1;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}